package me.lulu.pearlthrough.check;

import lombok.RequiredArgsConstructor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;

import java.util.List;

@RequiredArgsConstructor
public class PearlPassThroughCheckSpecialBlocks implements PearlPassThroughCheck {

    private final List<Material> whitelistBlocks;

    @Override
    public boolean shouldPassThrough(Location location, Block block) {
        if (whitelistBlocks.contains(block.getType()))
            return true;

        return false;
    }

}
