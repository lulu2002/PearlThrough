package me.lulu.pearlthrough.nms.v1_8_R3;

import me.lulu.pearlthrough.entity.CustomEnderPearl;
import me.lulu.pearlthrough.event.PearlHitEvent;
import net.minecraft.server.v1_8_R3.BlockPosition;
import net.minecraft.server.v1_8_R3.EntityEnderPearl;
import net.minecraft.server.v1_8_R3.MovingObjectPosition;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class CustomEnderPearl_1_8_R3 implements CustomEnderPearl {

    @Override
    public void spawn(Player shooter, Location location) {
        (( CraftWorld ) location.getWorld()).getHandle().addEntity(new PearlEntity(shooter));
    }

    @Override
    public boolean isSimilar(Entity entity) {
        return (( CraftEntity ) entity).getHandle() instanceof PearlEntity;
    }

    private class PearlEntity extends EntityEnderPearl {

        public PearlEntity(Player player) {
            super((( CraftPlayer ) player).getHandle().world, (( CraftPlayer ) player).getHandle());
        }

        protected void a(MovingObjectPosition movingObjectPosition) {
            BlockPosition blockPos = movingObjectPosition.a();
            Location location = new Location(this.getBukkitEntity().getWorld(), blockPos.getX(), blockPos.getY(), blockPos.getZ());
            net.minecraft.server.v1_8_R3.Entity entity = movingObjectPosition.entity;
            Entity hitEntity = entity == null ? null : entity.getBukkitEntity();
            PearlHitEvent e = new PearlHitEvent(this.getBukkitEntity(), location, hitEntity);
            Bukkit.getPluginManager().callEvent(e);

            if (!e.isShouldPassThrough())
                super.a(movingObjectPosition);
        }
    }
}
