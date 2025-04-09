package ro.ase.cts.practice.models;

import ro.ase.cts.practice.interfaces.IGSMConnection;

public class PriorityGSMConnection implements IGSMConnection {
    @Override
    public void call() {
        System.out.println("Priority call started");
    }
}
