package me.kale.blockpotions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.Random;

public final class BlockPotions extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){
        Random num = new Random();
        int n = num.nextInt(28);
        if (n == 0) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 300, 0));
        } else if (n == 1) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 300, 0));
        } else if (n == 2) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 300, 0));
        } else if (n == 3) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 300, 0));
        } else if (n == 4) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 300, 0));
        } else if (n == 5) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0));
        } else if (n == 6) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 300, 0));
        } else if (n == 7) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HARM, 50, 0));
        } else if (n == 8) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 50, 0));
        } else if (n == 9) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 300, 0));
        } else if (n == 10) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 300, 0));
        } else if (n == 11) {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 300, 0));
        } else if (n == 12) {
           event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 300, 0));
        } else if (n == 13) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 300, 0));
        } else if (n == 14) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 300, 0));
        } else if (n == 15) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 300, 0));
        } else if (n == 16) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 300, 0));
        } else if (n == 17) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 300, 0));
        } else if (n == 18) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 300, 0));
        } else if (n == 19) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 300, 0));
        } else if (n == 20) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, 300, 0));
        } else if (n == 21) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 300, 0));
        } else if (n == 22) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 300, 0));
        } else if (n == 23) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 300, 0));
        } else if (n == 24) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 300, 0));
        } else if (n == 25) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 300, 0));
        } else if (n == 26) {
        event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.POISON, 300, 0));
        } else {
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 300, 0));
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
