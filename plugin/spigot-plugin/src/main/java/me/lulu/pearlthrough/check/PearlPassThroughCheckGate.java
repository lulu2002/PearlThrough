package me.lulu.pearlthrough.check;

import lombok.RequiredArgsConstructor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.material.Gate;
import org.bukkit.material.MaterialData;

@RequiredArgsConstructor
public class PearlPassThroughCheckGate implements PearlPassThroughCheck {

    @Override
    public boolean shouldPassThrough(Location location, Block block) {
        MaterialData data = block.getState().getData();

        if (data instanceof Gate)
            return !(( Gate ) data).isOpen();

        return false;
    }

}
