package com.onlysole.avaritia_integration.module.mekanismgenerators.common.tile;

import com.onlysole.avaritia_integration.module.mekanismgenerators.common.registry.GenIntegrationBlocks;
import mekanism.api.math.FloatingLong;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class TileEntityInfinityAdvancedSolarGenerator extends TileEntityAvaritiaAdvancedSolarGenerator {

    public TileEntityInfinityAdvancedSolarGenerator(BlockPos pos, BlockState state) {
        super(GenIntegrationBlocks.INFINITY_ADVANCED_SOLAR_GENERATOR, pos, state, () -> FloatingLong.create(9200000000L));
    }

    @Override
    protected FloatingLong getConfiguredMax() {
        return FloatingLong.create(9200000000L);
    }
}