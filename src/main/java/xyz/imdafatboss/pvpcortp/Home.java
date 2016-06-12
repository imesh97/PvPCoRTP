package xyz.imdafatboss.pvpcortp;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.imdafatboss.pvpcortp.cmd.RTPCmd;
import xyz.imdafatboss.pvpcortp.config.FileManager;
import xyz.imdafatboss.pvpcortp.events.RTPEvent;

public class Home extends JavaPlugin implements Listener{

    FileManager fm;
    RTPCmd rtp;
    RTPEvent evt;

    @Override
    public void onEnable(){

        fm = new FileManager(this);
        fm.getConfig("config.yml").saveDefaultConfig();

        rtp = new RTPCmd(this);
        evt = new RTPEvent(this);
        getLogger().info("Created by imdafatboss");
        PluginManager pm = Bukkit.getPluginManager();

        rtp.getCommands();
        rtp.getAliases();

        pm.registerEvents(evt, this);

    }

}
