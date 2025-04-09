package ro.ase.cts.practice.models;

import ro.ase.cts.practice.interfaces.IGSMConnection;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    String identifier;
    String version;
    OS os;
    IGSMConnection connection;
    List<AFeature> features = new ArrayList<>();

    public Phone(String identifier, String version, IGSMConnection connection, int osVersion) throws InterruptedException{
        this.identifier = identifier;
        this.version = version;
        this.connection = connection;
        this.os = OSCache.getOS(osVersion);
    }

    public void addFeature(AFeature feature){
        features.add(feature);
    }

    public void makeCall(){
        connection.call();
    }

    public void usePhone(){
        System.out.println("Phone " + identifier +" - Version"+version);
        System.out.println("Sistem de operare: v"+os.version);
        System.out.println("Features: ");
        for (AFeature f :features){
            System.out.println("- " + f.name+" - "+f.price+" RON");
        }
    }

}
