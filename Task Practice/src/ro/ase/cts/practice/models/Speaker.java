package ro.ase.cts.practice.models;

public class Speaker extends AFeature{
    public Speaker(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void activate() {
        System.out.println("Speaker playing sound");
    }
}
