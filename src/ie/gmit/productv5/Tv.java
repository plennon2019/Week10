package ie.gmit.productv5;

public class Tv extends Product {

    private String manufacturer;
    private String size;

    public Tv() {
        super();
        manufacturer = "";
        size = "";
        count++;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacturer + "\nScreen size is " + size;
    }
}
