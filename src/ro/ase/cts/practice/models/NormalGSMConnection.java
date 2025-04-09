package ro.ase.cts.practice.models;

import ro.ase.cts.practice.interfaces.IGSMConnection;

public class NormalGSMConnection implements IGSMConnection {
    @Override
    public void call() {
        System.out.println("Normal call started");
    }
}
