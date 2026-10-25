package com.onlysole.avaritia_integration.module.mekanismgenerators.common.tile;

import com.onlysole.avaritia_integration.module.mekanismgenerators.common.registry.GenIntegrationBlocks;
import mekanism.api.math.FloatingLong;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class TileEntityNeutronAdvancedSolarGenerator extends TileEntityAvaritiaAdvancedSolarGenerator {

    public TileEntityNeutronAdvancedSolarGenerator(BlockPos pos, BlockState state) {
        super(GenIntegrationBlocks.NEUTRON_ADVANCED_SOLAR_GENERATOR, pos, state, () -> FloatingLong.create(41943040L));
    }

    @Override
    protected FloatingLong getConfiguredMax() {
        return FloatingLong.create(41943040L);
    }
}