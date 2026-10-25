package com.onlysole.avaritia_integration.module.mekanism.common.block.prefab;

import com.onlysole.avaritia_integration.module.mekanism.common.content.blocktype.MekIntegrationFactory;
import com.onlysole.avaritia_integration.module.mekanism.common.content.blocktype.MekIntegrationFactoryMachine;
import com.onlysole.avaritia_integration.module.mekanism.common.tile.factory.TileEntityMIFactory;
import mekanism.common.block.prefab.BlockTile;
import mekanism.common.block.states.IStateFluidLoggable;
import mekanism.common.resource.BlockResourceInfo;
import mekanism.common.tile.base.TileEntityMekanism;

import java.util.function.UnaryOperator;

public class BlockMekIntegrationFactoryMachine<TILE extends TileEntityMekanism, MACHINE extends MekIntegrationFactoryMachine<TILE>> extends BlockTile<TILE, MACHINE> {

    public BlockMekIntegrationFactoryMachine(MACHINE machine, UnaryOperator<Properties> propertiesModifier) {
        super(machine, propertiesModifier);
    }

    public static class BlockMekIntegrationFactoryMachineModel<TILE extends TileEntityMekanism, MACHINE extends MekIntegrationFactoryMachine<TILE>> extends BlockMekIntegrationFactoryMachine<TILE, MACHINE> implements IStateFluidLoggable {

        public BlockMekIntegrationFactoryMachineModel(MACHINE machineType, UnaryOperator<Properties> propertiesModifier) {
            super(machineType, propertiesModifier);
        }
    }

    public static class BlockMekIntegrationFactory<TILE extends TileEntityMIFactory<?>> extends BlockMekIntegrationFactoryMachineModel<TILE, MekIntegrationFactory<TILE>> {

        public BlockMekIntegrationFactory(MekIntegrationFactory<TILE> factoryType) {
            super(factoryType, properties -> properties.mapColor(BlockResourceInfo.STEEL.getMapColor()));
        }
    }
}
