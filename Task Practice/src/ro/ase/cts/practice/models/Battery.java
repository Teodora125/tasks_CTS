package ro.ase.cts.practice.models;

public class Battery extends AFeature{
    public Battery(String name, int price){
        this.name = name;
        this.price = price;
    }


    @Override
    public void activate() {
        System.out.println("Battery powering up the phone");
    }
}
