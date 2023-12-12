// Bank class
class Bank {
    // Method to get the rate of interest
    public double getRateOfInterest() {
        return 0.0;
    }
}

// SBI class extending Bank
class SBI extends Bank {
    // Override method to get the rate of interest for SBI
    @Override
    public double getRateOfInterest() {
        return 8.0;
    }
}

// ICICI class extending Bank
class ICICI extends Bank {
    // Override method to get the rate of interest for ICICI
    @Override
    public double getRateOfInterest() {
        return 7.0;
    }
}

// AXIS class extending Bank
class AXIS extends Bank {
    // Override method to get the rate of interest for AXIS
    @Override
    public double getRateOfInterest() {
        return 9.0;
    }
}

// Main class to test bank interest rates
public class BankInterest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        // Display rates of interest for different banks
        System.out.println("Rate of interest in SBI: " + sbi.getRateOfInterest() + "%");
        System.out.println("Rate of interest in ICICI: " + icici.getRateOfInterest() + "%");
        System.out.println("Rate of interest in AXIS: " + axis.getRateOfInterest() + "%");
    }
}
