package me.lulu.pearlthrough;

import com.google.common.collect.Lists;
import me.lulu.pearlthrough.check.PearlPassThroughCheckGate;
import me.lulu.pearlthrough.check.PearlPassThroughCheckSpecialBlocks;
import me.lulu.pearlthrough.entity.CustomEnderPearl;
import me.lulu.pearlthrough.listener.EnderpearlListener;
import me.lulu.pearlthrough.nms.v1_7_R4.CustomEnderPearl_1_7_R4;
import me.lulu.pearlthrough.nms.v1_8_R3.CustomEnderPearl_1_8_R3;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

public class PearlPlugin extends JavaPlugin {

    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(
                new EnderpearlListener(
                        getCustomEnderpearl(),
                        Lists.newArrayList(
                                new PearlPassThroughCheckSpecialBlocks(Lists.newArrayList(
                                        Material.GLASS
                                )),
                                new PearlPassThroughCheckGate()
                        )
                ),
                this
        );
    }

    private CustomEnderPearl getCustomEnderpearl() {
        switch (getServerVersion()) {
            case "v1_7_R4":
                return new CustomEnderPearl_1_7_R4();
            case "v1_8_R3":
                return new CustomEnderPearl_1_8_R3();
            default:
                throw new RuntimeException("Unsupported server version");
        }
    }

    private String getServerVersion() {
        String a = Bukkit.getServer().getClass().getPackage().getName();
        return a.substring(a.lastIndexOf('.') + 1);
    }
}