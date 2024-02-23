package me.lulu.pearlthrough.listener;

import lombok.RequiredArgsConstructor;
import lombok.val;
import me.lulu.pearlthrough.check.PearlPassThroughCheck;
import me.lulu.pearlthrough.entity.CustomEnderPearl;
import me.lulu.pearlthrough.event.PearlHitEvent;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;

import java.util.List;

@RequiredArgsConstructor
public class EnderpearlListener implements Listener {

    private final CustomEnderPearl enderpearl;
    private final List<PearlPassThroughCheck> checks;

    @EventHandler
    public void entitySpawnEvent(ProjectileLaunchEvent e) {
        val entity = e.getEntity();
        val shooter = entity.getShooter();

        if (shooter instanceof Player && entity instanceof EnderPearl && !enderpearl.isSimilar(entity)) {
            entity.remove();
            enderpearl.spawn(( Player ) shooter, entity.getLocation());
        }
    }

    @EventHandler
    public void onPearlUpdate(PearlHitEvent e) {
        for (PearlPassThroughCheck check : checks) {
            if (check.shouldPassThrough(e.getLocation(), e.getBlock())) {
                e.setShouldPassThrough(true);
                return;
            }
        }
    }

}
