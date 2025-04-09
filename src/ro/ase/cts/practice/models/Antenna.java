package ro.ase.cts.practice.models;

public class Antenna extends AFeature{
    public Antenna(String name, int price){
        this.name = name;
        this.price = price;

    }

    @Override
    public void activate() {
        System.out.println("Antenna searching for signal");
    }
}
