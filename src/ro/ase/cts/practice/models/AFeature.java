package ro.ase.cts.practice.models;

public abstract class AFeature {
    protected String name;
    protected int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public abstract void activate();
}
