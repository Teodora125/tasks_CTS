package ro.ase.cts.practice.models;

import java.util.HashMap;

public class OSCache {
    private static final HashMap<Integer, OS> cache = new HashMap<>();

    public static OS getOS(int version) throws InterruptedException{
        if(cache.containsKey(version)){
            System.out.println("Folosim OS v"+version+" din cache");
            return cache.get(version);
        }
        OS os = new OS(version);
        cache.put(version, os);
        return os;
    }
}
