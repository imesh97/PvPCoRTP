package xyz.imdafatboss.pvpcortp;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.imdafatboss.pvpcortp.cmd.RTPCmd;
import xyz.imdafatboss.pvpcortp.config.FileManager;

public class Home extends JavaPlugin implements Listener{

    FileManager fm;
    RTPCmd rtp;

    @Override
    public void onEnable(){

        fm = new FileManager(this);
        rtp = new RTPCmd(this);
        getLogger().info("Created by imdafatboss");

        fm.getConfig("config.yml").saveDefaultConfig();
        
        rtp.getCommands();
        rtp.getAliases();

    }

}
