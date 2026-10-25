package com.onlysole.avaritia_integration.module.mekanismgenerators.common.registry;

import com.onlysole.avaritia_integration.module.mekanism.common.content.blocktype.MekIntegrationBlockShapes;
import com.onlysole.avaritia_integration.module.mekanismgenerators.common.tile.TileEntityInfinityAdvancedSolarGenerator;
import com.onlysole.avaritia_integration.module.mekanismgenerators.common.tile.TileEntityInfinitySolarGenerator;
import com.onlysole.avaritia_integration.module.mekanismgenerators.common.tile.TileEntityNeutronAdvancedSolarGenerator;
import com.onlysole.avaritia_integration.module.mekanismgenerators.common.tile.TileEntityNeutronSolarGenerator;
import mekanism.api.Upgrade;
import mekanism.api.math.FloatingLong;
import mekanism.common.block.attribute.Attributes;
import mekanism.generators.common.GeneratorsLang;
import mekanism.generators.common.content.blocktype.BlockShapes;
import mekanism.generators.common.content.blocktype.Generator;
import mekanism.generators.common.content.blocktype.Generator.GeneratorBuilder;
import mekanism.generators.common.registries.GeneratorsSounds;

import java.util.EnumSet;

public class GenIntegrationBlockTypes {
    private GenIntegrationBlockTypes() {

    }

    // Infinity Solar Generator
    public static final Generator<TileEntityInfinitySolarGenerator> INFINITY_SOLAR_GENERATOR = GeneratorBuilder
            .createGenerator(() -> GenIntegrationTileEntityTypes.INFINITY_SOLAR_GENERATOR, GeneratorsLang.DESCRIPTION_SOLAR_GENERATOR)
            .withGui(() -> GenIntegrationContainerTypes.INFINITY_SOLAR_GENERATOR)
            .withEnergyConfig(() -> FloatingLong.create(68719476736L))
            .withCustomShape(MekIntegrationBlockShapes.SOLAR_GENERATOR)
            .withSound(GeneratorsSounds.SOLAR_GENERATOR)
            .withSupportedUpgrades(EnumSet.of(Upgrade.MUFFLING))
            .withComputerSupport("solarGenerator")
            .replace(Attributes.ACTIVE)
            .build();

    // Neutron Solar Generator
    public static final Generator<TileEntityNeutronSolarGenerator> NEUTRON_SOLAR_GENERATOR = GeneratorBuilder
            .createGenerator(() -> GenIntegrationTileEntityTypes.NEUTRON_SOLAR_GENERATOR, GeneratorsLang.DESCRIPTION_SOLAR_GENERATOR)
            .withGui(() -> GenIntegrationContainerTypes.NEUTRON_SOLAR_GENERATOR)
            .withEnergyConfig(() -> FloatingLong.create(671088640L))
            .withCustomShape(MekIntegrationBlockShapes.SOLAR_GENERATOR)
            .withSound(GeneratorsSounds.SOLAR_GENERATOR)
            .withSupportedUpgrades(EnumSet.of(Upgrade.MUFFLING))
            .withComputerSupport("solarGenerator")
            .replace(Attributes.ACTIVE)
            .build();

    // Infinity Advanced Solar Generator
    public static final Generator<TileEntityInfinityAdvancedSolarGenerator> INFINITY_ADVANCED_SOLAR_GENERATOR = GeneratorBuilder
            .createGenerator(() -> GenIntegrationTileEntityTypes.INFINITY_ADVANCED_SOLAR_GENERATOR, GeneratorsLang.DESCRIPTION_ADVANCED_SOLAR_GENERATOR)
            .withGui(() -> GenIntegrationContainerTypes.INFINITY_ADVANCED_SOLAR_GENERATOR)
            .withEnergyConfig(() -> FloatingLong.create(588800000000L))
            .withCustomShape(BlockShapes.ADVANCED_SOLAR_GENERATOR)
            .withSound(GeneratorsSounds.SOLAR_GENERATOR)
            .withSupportedUpgrades(EnumSet.of(Upgrade.MUFFLING))
            .withBounding((pos, state, builder) -> {
                builder.add(pos.above());
                for (int x = -1; x <= 1; x++) {
                    for (int z = -1; z <= 1; z++) {
                        builder.add(pos.offset(x, 2, z));
                    }
                }
            })
            .withComputerSupport("advancedSolarGenerator")
            .replace(Attributes.ACTIVE)
            .build();

    // Neutron Advanced Solar Generator
    public static final Generator<TileEntityNeutronAdvancedSolarGenerator> NEUTRON_ADVANCED_SOLAR_GENERATOR = GeneratorBuilder
            .createGenerator(() -> GenIntegrationTileEntityTypes.NEUTRON_ADVANCED_SOLAR_GENERATOR, GeneratorsLang.DESCRIPTION_ADVANCED_SOLAR_GENERATOR)
            .withGui(() -> GenIntegrationContainerTypes.NEUTRON_ADVANCED_SOLAR_GENERATOR)
            .withEnergyConfig(() -> FloatingLong.create(2684354560L))
            .withCustomShape(BlockShapes.ADVANCED_SOLAR_GENERATOR)
            .withSound(GeneratorsSounds.SOLAR_GENERATOR)
            .withSupportedUpgrades(EnumSet.of(Upgrade.MUFFLING))
            .withBounding((pos, state, builder) -> {
                builder.add(pos.above());
                for (int x = -1; x <= 1; x++) {
                    for (int z = -1; z <= 1; z++) {
                        builder.add(pos.offset(x, 2, z));
                    }
                }
            })
            .withComputerSupport("advancedSolarGenerator")
            .replace(Attributes.ACTIVE)
            .build();
}