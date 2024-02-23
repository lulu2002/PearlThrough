package me.lulu.pearlthrough.event;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class PearlHitEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    private final Entity pearl;
    private final Location location;
    private final Block block;
    private final Entity hitEntity;

    @Setter
    private boolean shouldPassThrough = false;


    public PearlHitEvent(Entity pearl, Location location, Entity hitEntity) {
        this.pearl = pearl;
        this.location = location;
        this.block = location.getBlock();
        this.hitEntity = hitEntity;
    }


    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }


}
