package ie.gmit.productv6;

public class Animal implements Printable {
    String breed;
    String vaccination;
    int age;

    public Animal(String breed, String vaccination, int age) {
        this.breed = breed;
        this.vaccination = vaccination;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString()
    {
        return "Animal Type: " + breed + "\n" + "Animal Age: " + age  + "\n" + "Animal Breed: " + breed  + "\n";
    }
}
