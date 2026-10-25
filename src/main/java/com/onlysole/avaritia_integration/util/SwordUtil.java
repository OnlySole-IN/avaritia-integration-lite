package com.onlysole.avaritia_integration.util;

import com.onlysole.avaritia_integration.common.net.ClientEntityRemovePacket;
import com.onlysole.avaritia_integration.init.handler.NetworkHandler;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class SwordUtil {

    public static void killEntity(LivingEntity living, Player player) {
        if (living.level().isClientSide) {
            NetworkHandler.sendToServer(new ClientEntityRemovePacket(living.getId(), player.getId()));
            return;
        }
        if (living instanceof Player target) {
            if (target instanceof ServerPlayer serverPlayer) {
                serverPlayer.setHealth(0f);
            }
            return;
        }
        living.setSecondsOnFire(100);
        living.hurt(living.level().damageSources().playerAttack(player), living.getMaxHealth());
        living.setHealth(0f);
        living.die(living.level().damageSources().playerAttack(player));
        living.getActiveEffects().clear();
    }
}