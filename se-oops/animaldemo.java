// Animal class


class animal {
    private String eats;
    private int noOfLegs;
    private boolean isVeg;

    // Constructor for Animal class
    public animal(String eats, int noOfLegs, boolean isVeg) {
        this.eats = eats;
        this.noOfLegs = noOfLegs;
        this.isVeg = isVeg;
    }

    // Getter methods
    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public boolean getIsVeg() {
        return isVeg;
    }
}

// Cat class extending Animal
class Cat extends animal {
    private String skinColor;

    // Constructor for Cat class
    public Cat(String eats, int noOfLegs, boolean isVeg, String skinColor) {
        super(eats, noOfLegs, isVeg);
        this.skinColor = skinColor;
    }

    // Method to print all values including skinColor
    public void printDetails() {
        System.out.println("Eats: " + getEats());
        System.out.println("Number of Legs: " + getNoOfLegs());
        System.out.println("Is Vegetarian: " + getIsVeg());
        System.out.println("Skin Color: " + skinColor);
    }
}

// Main class
public class animaldemo {
    public static void main(String[] args) {
        // Creating an instance of Cat
        Cat myCat = new Cat("Meat n daily foods", 4, false, "Skiny whitish");

        // Printing details of the Cat
        myCat.printDetails();
    }
}
