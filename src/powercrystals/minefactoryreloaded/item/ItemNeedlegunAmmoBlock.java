package powercrystals.minefactoryreloaded.item;

import powercrystals.core.position.BlockPosition;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public class ItemNeedlegunAmmoBlock extends ItemNeedlegunAmmo
{
	protected int _blockId;
	protected int _blockMeta;

	public ItemNeedlegunAmmoBlock(int id, int blockId, int blockMeta)
	{
		super(id);
		setMaxDamage(3);
		setHasSubtypes(false);
		_blockId = blockId;
		_blockMeta = blockMeta;
	}

	@Override
	public void onHitBlock(EntityPlayer owner, World world, int x, int y, int z, int side,
			double distance)
	{
		BlockPosition bp = new BlockPosition(x, y, z, ForgeDirection.getOrientation(side));
		bp.moveForwards(1);
		placeBlockAt(world, bp.x, bp.y, bp.z, distance);
	}

	protected Vec3 calculatePlacement(Entity hit)
	{
		AxisAlignedBB bb = hit.boundingBox;
		int i = MathHelper.floor_double(bb.minX + 0.001D);
		int k = MathHelper.floor_double(bb.minZ + 0.001D);
		int l = MathHelper.floor_double(bb.maxX - 0.001D);
		int j1 = MathHelper.floor_double(bb.maxZ - 0.001D);
		return hit.worldObj.getWorldVec3Pool().getVecFromPool((i + l) / 2, bb.minY + 0.25, (k + j1) / 2);
	}

	@Override
	public boolean onHitEntity(EntityPlayer owner, Entity hit, double distance)
	{
		hit.attackEntityFrom(DamageSource.causePlayerDamage(owner), 2);
		Vec3 placement = calculatePlacement(hit);
		placeBlockAt(hit.worldObj, (int)placement.xCoord, (int)placement.yCoord, (int)placement.zCoord,
				distance);
		return true;
	}

	@Override
	public float getSpread()
	{
		return 1.5F;
	}

	protected void placeBlockAt(World world, int x, int y, int z, double distance)
	{
		Block block = Block.blocksList[world.getBlockId(x, y, z)];
		if(!world.isRemote && (block == null || block.isAirBlock(world, x, y, z) ||
				(block.isBlockReplaceable(world, x, y, z) && !block.blockMaterial.isLiquid())))
		{
			world.setBlock(x, y, z, _blockId, _blockMeta, 3);
		}
	}
}
