import ro.ase.cts.practice.models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Phone urgentPhone = new Phone("S25", "2.0", new UrgentGSMConnection(), 2);
        urgentPhone.addFeature(new Antenna("6G Antenna", 200));
        urgentPhone.addFeature(new Battery("SuperMegaBattery", 500));

        Phone priorityPhone = new Phone("X-PRIME", "1.0", new PriorityGSMConnection(), 1);
        priorityPhone.addFeature(new Battery("MegaBattery", 300));
        priorityPhone.addFeature(new Speaker("Dolby", 150));


        Phone normalPhone = new Phone("X-ECO", "1.0", new NormalGSMConnection(), 1);
        normalPhone.addFeature(new Antenna("5G Antenna", 120));
        normalPhone.addFeature(new Compass("Gyro Compass", 100));

        urgentPhone.usePhone();
        urgentPhone.makeCall();
        System.out.println("\n");

        priorityPhone.usePhone();
        priorityPhone.makeCall();
        System.out.println("\n");

        normalPhone.usePhone();
        normalPhone.makeCall();
    }
}