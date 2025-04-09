package ro.ase.cts.practice.models;

import ro.ase.cts.practice.interfaces.IGSMConnection;

public class UrgentGSMConnection implements IGSMConnection {
    @Override
    public void call() {
        System.out.println("Urgent call started");
    }
}
