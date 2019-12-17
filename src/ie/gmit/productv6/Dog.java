package ie.gmit.productv6;

public class Dog extends Animal {
    String shedding;
    String neutered;

    public Dog(String breed, String vaccination, int age, String shedding, String neutered) {
        super(breed, vaccination, age);
        this.shedding = shedding;
        this.neutered = neutered;
    }

    public String getShedding() {
        return shedding;
    }

    public void setShedding(String shedding) {
        this.shedding = shedding;
    }

    public String getNeutered() {
        return neutered;
    }

    public void setNeutered(String neutered) {
        this.neutered = neutered;
    }

    public String toString()
    {
        return super.toString() + "Vaccination: " + vaccination + "\n" + "Shedding: " + shedding + "\n";
    }
}
