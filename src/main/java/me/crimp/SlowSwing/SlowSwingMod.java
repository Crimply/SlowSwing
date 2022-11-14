package me.crimp.SlowSwing;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;

@Mod(modid = SlowSwingMod.MODID, name = SlowSwingMod.MODNAME, version = SlowSwingMod.MODVER)
public class SlowSwingMod {
    public static final String MODID = "slowswing";
    public static final String MODNAME = "SlowSwing";
    public static final String MODVER = "1.0";
    public static final Logger LOGGER = LogManager.getLogger("SlowSwing");
    public static CapeManager capeManager;

    public static void load() {
        LOGGER.info("Loading SlowSwing by Crimp");
        capeManager = new CapeManager();
        LOGGER.info("Managers loaded.");
        LOGGER.info("Modules loaded.");
        LOGGER.info("EventManager loaded.");
        LOGGER.info("SlowSwing successfully loaded!\n");
    }


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("SlowSwing - Crimp");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Display.setTitle("Minecraft 1.12.2");
        SlowSwingMod.load();
        }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            Display.setTitle("Minecraft 1.12.2");
    }
}

