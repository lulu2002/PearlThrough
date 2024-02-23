package me.lulu.pearlthrough.entity;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public interface CustomEnderPearl {
    void spawn(Player shooter, Location location);
    boolean isSimilar(Entity entity);
}