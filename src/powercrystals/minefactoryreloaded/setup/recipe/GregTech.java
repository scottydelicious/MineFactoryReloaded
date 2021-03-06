package powercrystals.minefactoryreloaded.setup.recipe;

import ic2.api.item.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import powercrystals.minefactoryreloaded.MineFactoryReloadedCore;
import powercrystals.minefactoryreloaded.setup.MFRConfig;
import powercrystals.minefactoryreloaded.setup.Machine;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class GregTech extends Vanilla
{
	@Override
	protected void registerMachines()
	{
		if(!Loader.isModLoaded("gregtech_addon") || !Loader.isModLoaded("IC2"))
		{
			return;
		}
		try
		{
			ItemStack generator = Items.getItem("generator");
			ItemStack compressor = Items.getItem("compressor");
			ItemStack luminator = Items.getItem("luminator");
			ItemStack mfsUnit = Items.getItem("mfsUnit");
			ItemStack reactorChamber = Items.getItem("reactorChamber");
			ItemStack reinforcedGlass = Items.getItem("reinforcedGlass");

			registerMachine(Machine.Planter, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', Item.flowerPot,
					'S', Block.pistonBase,
					'F', "craftingRawMachineTier00",
					'O', "plateCopper",
					'C', "craftingCircuitTier02",
			} );
			
			registerMachine(Machine.Fisher, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', Item.fishingRod,
					'S', Item.bucketEmpty,
					'F', "craftingRawMachineTier01",
					'O', "plateSteel",
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.Harvester, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', Item.axeIron,
					'S', Item.shears,
					'F', "craftingRawMachineTier00",
					'O', "plateGold",
					'C', "craftingCircuitTier02"
			} );
			
			registerMachine(Machine.Rancher, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', "craftingPump",
					'S', Item.shears,
					'F', "craftingRawMachineTier01",
					'O', "plateTin",
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.Fertilizer, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', Item.glassBottle,
					'S', Item.leather,
					'F', "craftingRawMachineTier01",
					'O', "plateSilver",
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.Vet, new Object[] {
					"PTP",
					"TFT",
					"OCO",
					'P', "sheetPlastic",
					'T', MineFactoryReloadedCore.syringeEmptyItem,
					'F', "craftingRawMachineTier01",
					'O', "plateZinc",
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.ItemCollector, new Object[] {
					"PVP",
					" F ",
					"PCP",
					'P', "sheetPlastic",
					'F', "craftingRawMachineTier01",
					'C', Block.chest,
					'V', "craftingConveyor"
			} );
			
			registerMachine(Machine.BlockBreaker, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', "craftingItemValve",
					'S', Item.pickaxeIron,
					'F', "craftingRawMachineTier02",
					'O', "plateAluminium",
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.WeatherCollector, new Object[] {
					"PTP",
					"TFT",
					"OCO",
					'P', "sheetPlastic",
					'T', Item.bucketEmpty,
					'F', "craftingRawMachineTier02",
					'O', "plateBrass",
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.SludgeBoiler, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', Item.bucketEmpty,
					'S', Block.furnaceIdle,
					'F', "craftingRawMachineTier02",
					'O', "plateIron",
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.Sewer, new Object[] {
					"PTP",
					"SFS",
					"SSS",
					'P', "sheetPlastic",
					'T', Item.bucketEmpty,
					'S', Block.brick,
					'F', "craftingRawMachineTier01",
			} );
			
			registerMachine(Machine.Composter, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', Block.furnaceIdle,
					'S', Block.pistonBase,
					'F', "craftingRawMachineTier01",
					'O', Block.brick,
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.Breeder, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', Item.appleGold,
					'S', Item.goldenCarrot,
					'F', "craftingRawMachineTier02",
					'O', new ItemStack(Item.dyePowder, 1, 5),
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.Grinder, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'S', "craftingMachineParts",
					'T', "craftingGrinder",
					'F', "craftingRawMachineTier02",
					'O', Item.book,
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.AutoEnchanter, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', "plateAlloyIridium",
					'S', Item.book,
					'F', "craftingRawMachineTier04",
					'O', "craftingCircuitTier06",
					'C', Block.obsidian
			} );
			
			registerMachine(Machine.Chronotyper, new Object[] {
					"PTP",
					"TFT",
					"OCO",
					'P', "sheetPlastic",
					'T', "gemEmerald",
					'F', "craftingRawMachineTier02",
					'O', new ItemStack(Item.dyePowder, 1, 5),
					'C', "craftingCircuitTier06"
			} );
			
			registerMachine(Machine.Ejector, new Object[] {
					"PTP",
					" F ",
					"OOO",
					'P', "sheetPlastic",
					'T', "craftingRedstoneReceiver",
					'F', "craftingRawMachineTier02",
					'O', "dustRedstone"
			} );
			
			registerMachine(Machine.ItemRouter, new Object[] {
					"PTP",
					"SFS",
					"PSP",
					'P', "sheetPlastic",
					'T', Block.chest,
					'S', Item.redstoneRepeater,
					'F', "craftingRawMachineTier02"
			} );
			
			registerMachine(Machine.LiquidRouter, new Object[] {
					"PTP",
					"SFS",
					"PSP",
					'P', "sheetPlastic",
					'T', "craftingPump",
					'S', Item.redstoneRepeater,
					'F', "craftingRawMachineTier02"
			} );
			
			registerMachine(Machine.DeepStorageUnit, new Object[] {
					"PDP",
					"CFC",
					"PEP",
					'P', "sheetPlastic",
					'C', "craftingCircuitTier07",
					'E', Item.eyeOfEnder,
					'D', "craftingCircuitTier08",
					'F', "craftingRawMachineTier04"
			} );
			
			if(MFRConfig.enableCheapDSU.getBoolean(false))
			{
				registerMachine(Machine.DeepStorageUnit, new Object[] {
						"PCP",
						"CFC",
						"PCP",
						'P', "sheetPlastic",
						'C', Block.chest,
						'F', "craftingRawMachineTier01"
				} );
			}
			
			registerMachine(Machine.LiquiCrafter, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', Block.workbench,
					'S', "craftingPump",
					'F', "craftingRawMachineTier01",
					'O', Item.book,
					'C', "craftingLiquidMeter"
			} );
			
			registerMachine(Machine.LavaFabricator, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', "plateSteel",
					'S', Item.magmaCream,
					'F', "craftingRawMachineTier03",
					'O', Item.blazeRod,
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.OilFabricator, new Object[] {
					"PTP",
					"OFO",
					"OCO",
					'P', "sheetPlastic",
					'T', Block.tnt,
					'F', "craftingRawMachineTier03",
					'O', Block.obsidian,
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.AutoJukebox, new Object[] {
					"PJP",
					" F ",
					" P ",
					'P', "sheetPlastic",
					'J', Block.jukebox,
					'F', "craftingRawMachineTier01"
			} );
			
			registerMachine(Machine.Unifier, new Object[] {
					"PTP",
					"SFL",
					"OCO",
					'P', "sheetPlastic",
					'T', "plateCopper",
					'S', "plateSilver",
					'L', "plateGold",
					'F', "craftingRawMachineTier01",
					'O', Item.comparator,
					'C', Item.book
			} );
			
			registerMachine(Machine.AutoSpawner, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', "plateAlloyIridium",
					'S', Item.magmaCream,
					'F', "craftingRawMachineTier02",
					'O', "gemRuby",
					'C', "craftingCircuitTier05"
			} );
			
			registerMachine(Machine.BioReactor, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', Item.fermentedSpiderEye,
					'S', Item.slimeBall,
					'F', "craftingRawMachineTier03",
					'O', "craftingItemValve",
					'C', "craftingPump"
			} );
			
			registerMachine(Machine.BioFuelGenerator, new Object[] {
					"PCP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'S', "plateIron",
					'F', generator,
					'O', Item.blazeRod,
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.AutoDisenchanter, new Object[] {
					"PTP",
					"SFS",
					"OCO",
					'P', "sheetPlastic",
					'T', "plateAlloyIridium",
					'S', Item.book,
					'F', "craftingRawMachineTier03",
					'O', "craftingCircuitTier06",
					'C', Block.netherBrick
			} );
			
			registerMachine(Machine.Slaughterhouse, new Object[] {
					"GIG",
					"SFS",
					"XCX",
					'G', "sheetPlastic",
					'S', "craftingPump",
					'X', "craftingGrinder",
					'I', "craftingDiamondBlade",
					'F', "craftingRawMachineTier02",
					'C', "craftingCircuitTier04"
			} );
			
			registerMachine(Machine.MeatPacker, new Object[] {
					"GSG",
					"BFB",
					"TCT",
					'G', "sheetPlastic",
					'B', "craftingHeatingCoilTier01",
					'S', "craftingPump",
					'F', compressor,
					'C', "craftingMachineParts",
					'T', "craftingPump"
			} );
			
			registerMachine(Machine.EnchantmentRouter, new Object[] {
					"PBP",
					"SFS",
					"PSP",
					'P', "sheetPlastic",
					'B', Item.book,
					'S', Item.redstoneRepeater,
					'F', "craftingRawMachineTier02"
			} );
			
			registerMachine(Machine.LaserDrill, new Object[] {
					"GFG",
					"CRC",
					"DLD",
					'G', "sheetPlastic",
					'D', "gemDiamond",
					'L', reinforcedGlass,
					'R', reactorChamber,
					'F', "craftingRawMachineTier04",
					'C', "craftingSuperconductor"
			} );
			
			registerMachine(Machine.LaserDrillPrecharger, new Object[] {
					"GSG",
					"RFL",
					"DCD",
					'G', "sheetPlastic",
					'D', "gemDiamond",
					'S', MineFactoryReloadedCore.pinkSlimeballItem,
					'L', luminator,
					'F', mfsUnit,
					'C', "craftingCircuitTier07",
					'R', "craftingSuperconductor"
			} );
			
			registerMachine(Machine.AutoAnvil, new Object[] {
					"GIG",
					"SFS",
					"ACA",
					'G', "sheetPlastic",
					'A', Block.anvil,
					'S', "plateSteel",
					'F', "craftingRawMachineTier04",
					'C', "craftingCircuitTier07",
					'I', "plateAlloyIridium"
			} );
			
			registerMachine(Machine.BlockSmasher, new Object[] {
					"GPG",
					"HFH",
					"BCB",
					'G', "sheetPlastic",
					'P', Block.pistonBase,
					'H', MineFactoryReloadedCore.factoryHammerItem,
					'B', "craftingItemValve",
					'F', "craftingRawMachineTier03",
					'C', "craftingCircuitTier06"
			} );
			
			registerMachine(Machine.RedNote, new Object[] {
					"GNG",
					"CFC",
					"GNG",
					'G', "sheetPlastic",
					'C', MineFactoryReloadedCore.rednetCableBlock,
					'N', Block.music,
					'F', "craftingRawMachineTier01"
			} );
			
			registerMachine(Machine.AutoBrewer, new Object[] {
					"GBG",
					"CFC",
					"RCR",
					'G', "sheetPlastic",
					'C', "craftingPump",
					'B', Item.brewingStand,
					'R', "craftingItemValve",
					'F', "craftingRawMachineTier02",
					'C', "craftingCircuitTier05"
			} );
			
			registerMachine(Machine.FruitPicker, new Object[] {
					"GXG",
					"SFS",
					"SCS",
					'G', "sheetPlastic",
					'X', Item.axeGold,
					'S', Item.shears,
					'F', "craftingRawMachineTier03",
					'C', "craftingCircuitTier04"
			} );
		}
		catch (Exception x)
		{
			x.printStackTrace();
		}
	}

	@Override
	protected void registerMachineUpgrades()
	{
		if(!Loader.isModLoaded("gregtech_addon") || !Loader.isModLoaded("IC2"))
		{
			return;
		}
		try
		{
			ItemStack insulatedGoldCableItem = Items.getItem("insulatedGoldCableItem");

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 0), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', "dyeBlue",
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier02",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 1), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', Item.ingotIron,
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier02",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 2), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', "ingotTin",
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier02",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 3), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', "ingotCopper",
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier04",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 4), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', "ingotBronze",
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier04",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 5), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', "ingotSilver",
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier04",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 6), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', "ingotGold",
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier04",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 7), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', Item.netherQuartz,
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier06",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 8), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', "gemDiamond",
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier06",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 9), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', "ingotPlatinum",
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier06",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.upgradeItem, 1, 10), new Object[]
					{
				"III",
				"PPP",
				"RGR",
				'I', Item.emerald,
				'P', "dustPlastic",
				'R', insulatedGoldCableItem,
				'G', "craftingCircuitTier06",
					} ));

			for(int i = 0; i < 16; i++)
			{
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.laserFocusItem, 1, i), new Object[]
						{
					"ENE",
					"NGN",
					"ENE",
					'E', Item.emerald,
					'N', "nuggetChrome",
					'G', new ItemStack(MineFactoryReloadedCore.factoryGlassPaneBlock, 1, i)
						} ));
			}
		}
		catch (Exception x)
		{
			x.printStackTrace();
		}
	}

	@Override
	protected void registerConveyors()
	{
		if(!Loader.isModLoaded("gregtech_addon") || !Loader.isModLoaded("IC2"))
		{
			return;
		}
		try
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.conveyorBlock, 16, 16), new Object[]
					{
				"UUU",
				"RIR",
				'U', "itemRubber",
				'R', "dustRedstone",
				'I', "plateIron",
					} ));

			for(int i = 0; i < 16; i++)
			{
				GameRegistry.addShapelessRecipe(new ItemStack(MineFactoryReloadedCore.conveyorBlock, 1, i), new ItemStack(MineFactoryReloadedCore.conveyorBlock, 1, 16), new ItemStack(MineFactoryReloadedCore.ceramicDyeItem, 1, i));
			}
		}
		catch (Exception x)
		{
			x.printStackTrace();
		}
	}

	@Override
	protected void registerSyringes()
	{
		if(!Loader.isModLoaded("gregtech_addon") || !Loader.isModLoaded("IC2"))
		{
			return;
		}
		try
		{
			ItemStack cell = Items.getItem("cell");

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.syringeEmptyItem, 1), new Object[]
					{
				"PRP",
				"PCP",
				" I ",
				'P', "sheetPlastic",
				'R', "itemRubber",
				'I', Item.ingotIron,
				'C', cell
					} ));

			GameRegistry.addShapelessRecipe(new ItemStack(MineFactoryReloadedCore.syringeHealthItem), new Object[] { MineFactoryReloadedCore.syringeEmptyItem, Item.appleRed });
			GameRegistry.addShapelessRecipe(new ItemStack(MineFactoryReloadedCore.syringeGrowthItem), new Object[] { MineFactoryReloadedCore.syringeEmptyItem, Item.goldenCarrot });

			GameRegistry.addRecipe(new ItemStack(MineFactoryReloadedCore.syringeZombieItem, 1), new Object[]
					{
				"FFF",
				"FSF",
				"FFF",
				'F', Item.rottenFlesh,
				'S', MineFactoryReloadedCore.syringeEmptyItem,
					} );

			GameRegistry.addRecipe(new ItemStack(MineFactoryReloadedCore.syringeSlimeItem, 1), new Object[]
					{
				"   ",
				" S ",
				"BLB",
				'B', Item.slimeBall,
				'L', new ItemStack(Item.dyePowder, 1, 4),
				'S', MineFactoryReloadedCore.syringeEmptyItem,
					} );

			GameRegistry.addShapelessRecipe(new ItemStack(MineFactoryReloadedCore.syringeCureItem), new Object[] { MineFactoryReloadedCore.syringeEmptyItem, Item.appleGold });
		}
		catch (Exception x)
		{
			x.printStackTrace();
		}
	}

	@Override
	protected void registerMiscItems()
	{
		if(!Loader.isModLoaded("gregtech_addon") || !Loader.isModLoaded("IC2"))
		{
			return;
		}
		try
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.plasticSheetItem, 4), new Object[]
					{
				"##",
				"##",
				'#', "dustPlastic",
					} ));

			GameRegistry.addRecipe(new ItemStack(MineFactoryReloadedCore.fertilizerItem, 16), new Object[]
					{
				"WBW",
				"STS",
				"WBW",
				'W', Item.wheat,
				'B', new ItemStack(Item.dyePowder, 1, 15),
				'S', Item.silk,
				'T', Item.stick,
					} );

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.safariNetItem, 1), new Object[]
					{
				" E ",
				"CGC",
				" E ",
				'E', Item.enderPearl,
				'G', Item.ghastTear,
				'C', "craftingCircuitTier04"
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.safariNetSingleItem, 1), new Object[]
					{
				"SLS",
				"CBC",
				"S S",
				'S', Item.silk,
				'L', Item.leather,
				'B', Item.slimeBall,
				'C', "craftingCircuitTier02"
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.safariNetJailerItem, 1), new Object[]
					{
				" P ",
				"ISI",
				" P ",
				'S', MineFactoryReloadedCore.safariNetSingleItem,
				'I', Block.fenceIron,
				'P', "plateIron"
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.safariNetLauncherItem, 1), new Object[]
					{
				"PGP",
				"LGL",
				"IRI",
				'P', "sheetPlastic",
				'L', Item.glowstone,
				'G', Item.gunpowder,
				'I', "plateIron",
				'R', "craftingItemValve"
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.factoryHammerItem, 1), new Object[]
					{
				"PPP",
				" S ",
				" S ",
				'P', "sheetPlastic",
				'S', Item.stick,
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.blankRecordItem, 1), new Object[]
					{
				"RRR",
				"RPR",
				"RRR",
				'R', "dustPlastic",
				'P', Item.paper,
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.spyglassItem), new Object[]
					{
				"GLG",
				"PLP",
				" S ",
				'G', "ingotGold",
				'L', Block.glass,
				'P', "sheetPlastic",
				'S', Item.stick
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.portaSpawnerItem), new Object[]
					{
				"GLG",
				"DND",
				"GLG",
				'G', "plateChrome",
				'L', "plateAlloyIridium",
				'D', "gemDiamond",
				'N', Item.netherStar
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.strawItem), new Object[]
					{
				"PP",
				"P ",
				"P ",
				'P', "sheetPlastic",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.xpExtractorItem), new Object[]
					{
				"PLP",
				"PLP",
				"RPR",
				'R', "itemRubber",
				'L', Block.glass,
				'P', "sheetPlastic",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.rulerItem), new Object[]
					{
				"P",
				"A",
				"P",
				'P', "sheetPlastic",
				'A', Item.paper,
					} ));

			GameRegistry.addRecipe(new ItemStack(MineFactoryReloadedCore.vineScaffoldBlock, 8), new Object[]
					{
				"VV",
				"VV",
				"VV",
				'V', Block.vine,
					} );

			GameRegistry.addShapelessRecipe(new ItemStack(MineFactoryReloadedCore.chocolateMilkBucketItem), Item.bucketMilk, Item.bucketEmpty, new ItemStack(Item.dyePowder, 1, 3));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.plasticCupItem, 16), new Object[]
					{
				" P ",
				"P P",
				'P', "sheetPlastic",
					} ));
		}
		catch (Exception x)
		{
			x.printStackTrace();
		}
	}

	@Override
	protected void registerRails()
	{
		if(!Loader.isModLoaded("gregtech_addon") || !Loader.isModLoaded("IC2"))
		{
			return;
		}
		try
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.railPickupCargoBlock, 1), new Object[]
					{
				" C ",
				"SDS",
				"SSS",
				'C', "craftingConveyor",
				'S', "sheetPlastic",
				'D', Block.railDetector
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.railDropoffCargoBlock, 1), new Object[]
					{
				"SSS",
				"SDS",
				" C ",
				'C', "craftingConveyor",
				'S', "sheetPlastic",
				'D', Block.railDetector
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.railPickupPassengerBlock, 1), new Object[]
					{
				" L ",
				"SDS",
				"SSS",
				'L', Block.blockLapis,
				'S', "sheetPlastic",
				'D', Block.railDetector
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.railDropoffPassengerBlock, 1), new Object[]
					{
				"SSS",
				"SDS",
				" L ",
				'L', Block.blockLapis,
				'S', "sheetPlastic",
				'D', Block.railDetector
					} ));
		}
		catch (Exception x)
		{
			x.printStackTrace();
		}
	}

	@Override
	protected void registerRedNet()
	{
		if(!Loader.isModLoaded("gregtech_addon") || !Loader.isModLoaded("IC2"))
		{
			return;
		}
		try
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.rednetCableBlock, 8), new Object[]
					{
				"PPP",
				"RRR",
				"PPP",
				'R', "dustRedstone",
				'P', "sheetPlastic",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.factoryDecorativeBrickBlock, 1, 11), new Object[]
					{
				"PRP",
				"RGR",
				"PIP",
				'R', "dustRedstone",
				'P', "sheetPlastic",
				'G', Block.glass,
				'I', "plateIron",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.rednetLogicBlock), new Object[]
					{
				"RDR",
				"LGL",
				"PHP",
				'H', new ItemStack(MineFactoryReloadedCore.factoryDecorativeBrickBlock, 1, 11),
				'P', "sheetPlastic",
				'G', "plateGold",
				'L', "craftingCircuitTier04",
				'D', "gemDiamond",
				'R', "dustRedstone",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.logicCardItem, 1, 0), new Object[]
					{
				"RPR",
				"PGP",
				"RPR",
				'P', "sheetPlastic",
				'G', "ingotGold",
				'R', "dustRedstone",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.logicCardItem, 1, 1), new Object[]
					{
				"GPG",
				"PCP",
				"RGR",
				'C', new ItemStack(MineFactoryReloadedCore.logicCardItem, 1, 0),
				'P', "sheetPlastic",
				'G', "plateGold",
				'R', "dustRedstone",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.logicCardItem, 1, 2), new Object[]
					{
				"DPD",
				"RCR",
				"GDG",
				'C', new ItemStack(MineFactoryReloadedCore.logicCardItem, 1, 1),
				'P', "sheetPlastic",
				'G', "plateSteel",
				'D', "gemDiamond",
				'R', "dustRedstone",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.rednetMeterItem, 1, 0), new Object[]
					{
				" G",
				"PR",
				"PP",
				'P', "sheetPlastic",
				'G', "nuggetGold",
				'R', "dustRedstone",
					} ));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.rednetMemoryCardItem, 1, 0), new Object[]
					{
				"GGG",
				"PRP",
				"PPP",
				'P', "sheetPlastic",
				'G', "nuggetGold",
				'R', "dustRedstone",
					} ));

			GameRegistry.addShapelessRecipe(new ItemStack(MineFactoryReloadedCore.rednetMemoryCardItem, 1, 0), new ItemStack(MineFactoryReloadedCore.rednetMemoryCardItem, 1, 0));

			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(MineFactoryReloadedCore.rednetPanelBlock, 1, 0), new Object[]
					{
				"PCP",
				"IBI",
				"KPK",
				'P', "sheetPlastic",
				'C', MineFactoryReloadedCore.rednetCableBlock,
				'B', "craftingMonitorTier02",
				'I', "craftingCircuitTier02",
				'K', new ItemStack(Item.dyePowder, 1, 0)
					} ));
		}
		catch (Exception x)
		{
			x.printStackTrace();
		}
	}
}
