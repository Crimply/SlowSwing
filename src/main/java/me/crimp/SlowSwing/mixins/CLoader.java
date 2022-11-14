package me.crimp.SlowSwing.mixins;

import me.crimp.SlowSwing.SlowSwingMod;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;

import java.util.Map;

public class CLoader implements IFMLLoadingPlugin {
    private static boolean isObfuscatedEnvironment = false;

    public CLoader() {
        SlowSwingMod.LOGGER.info("\n\nLoading mixins by Crimp");
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.SlowSwing.json");
        MixinEnvironment.getDefaultEnvironment().setObfuscationContext("searge");
        SlowSwingMod.LOGGER.info(MixinEnvironment.getDefaultEnvironment().getObfuscationContext());
    }

    public String[] getASMTransformerClass() {
        return new String[0];
    }

    public String getModContainerClass() {
        return null;
    }

    public String getSetupClass() {
        return null;
    }

    public void injectData(Map<String, Object> data) {
        isObfuscatedEnvironment = (Boolean) data.get("runtimeDeobfuscationEnabled");
    }

    public String getAccessTransformerClass() {
        return null;
    }
}

