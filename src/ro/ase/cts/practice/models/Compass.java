package ro.ase.cts.practice.models;

public class Compass extends AFeature{
    public Compass(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void activate() {
        System.out.println("Compass pointing north");
    }
}
