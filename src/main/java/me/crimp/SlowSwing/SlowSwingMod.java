package me.crimp.SlowSwing;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = SlowSwingMod.MODID, name = SlowSwingMod.MODNAME, version = SlowSwingMod.MODVER)
public class SlowSwingMod {
    public static final String MODID = "slowswing";
    public static final String MODNAME = "SlowSwing";
    public static final String MODVER = "1.0";
    public static final Logger LOGGER = LogManager.getLogger("SlowSwing");
    public static CapeManager capeManager;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("SlowSwing - Crimp");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        capeManager = new CapeManager();
        LOGGER.info("Loading SlowSwing by Crimp");
        }
}

