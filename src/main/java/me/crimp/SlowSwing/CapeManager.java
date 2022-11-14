package me.crimp.SlowSwing;

import java.util.*;

public class CapeManager {
    
    private final List<UUID> CrimpCape = new ArrayList<>();

    public CapeManager() {
        try { // og
            CrimpCape.add(UUID.fromString("72874b6d-db90-487a-9676-08096a5077b9"));
        } catch (Exception ignored) {
        }
    }
    
    public boolean isCrimp(UUID uuid) {
        return this.CrimpCape.contains(uuid);
    }

}
