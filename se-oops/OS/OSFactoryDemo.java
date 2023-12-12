// Interface OS
interface OS {
    void spec();
}

// Android class implementing OS interface
class Android implements OS {
    public void spec() {
        System.out.println("Android OS - Open Source, Versatile, Customizable");
    }
}

// iOS class implementing OS interface
class iOS implements OS {
    public void spec() {
        System.out.println("iOS - User-Friendly, Secure, Controlled Ecosystem");
    }
}

// BlackBerry class implementing OS interface
class BlackBerry implements OS {
    public void spec() {
        System.out.println("BlackBerry OS - Security, Business Focus, Physical Keyboard");
    }
}

// Factory class to create OS instances based on user input
class OSFactory {
    public OS getInstance(String osType) {
        if (osType.equalsIgnoreCase("Android")) {
            return new Android();
        } else if (osType.equalsIgnoreCase("iOS")) {
            return new iOS();
        } else if (osType.equalsIgnoreCase("BlackBerry")) {
            return new BlackBerry();
        } else {
            return null;
        }
    }
}

// Main class to demonstrate the Factory Design Pattern
public class OSFactoryDemo {
    public static void main(String[] args) {
        OSFactory factory = new OSFactory();

        // Creating OS instances using the factory
        OS android = factory.getInstance("Android");
        OS iOS = factory.getInstance("iOS");
        OS blackBerry = factory.getInstance("BlackBerry");

        // Calling spec() method of the respective OS instances
        android.spec();
        iOS.spec();
        blackBerry.spec();
    }
}
