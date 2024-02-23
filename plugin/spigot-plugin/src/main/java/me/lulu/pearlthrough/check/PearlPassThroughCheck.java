package me.lulu.pearlthrough.check;

import org.bukkit.Location;
import org.bukkit.block.Block;

public interface PearlPassThroughCheck {
    boolean shouldPassThrough(Location location, Block block);
}