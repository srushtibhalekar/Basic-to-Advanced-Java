

// 1. Parent Class in Package A
class Parent {
    public String publicVar = "1. PUBLIC: Accessible everywhere";
    protected String protectedVar = "2. PROTECTED: Accessible in package & subclasses";
    String defaultVar = "3. DEFAULT: Accessible only in same package";
    private String privateVar = "4. PRIVATE: Accessible only inside Parent class";

    public void showPrivateAccess() {
        // Private members can be accessed within their own class
        System.out.println("Inside Parent -> " + privateVar);
    }
}

// 2. Subclass (Inheritance test) in Same Package
class Child extends Parent {
    public void testChildAccess() {
        System.out.println("Inside Child -> " + publicVar);     // Allowed
        System.out.println("Inside Child -> " + protectedVar);  // Allowed
        System.out.println("Inside Child -> " + defaultVar);    // Allowed
        // System.out.println(privateVar);                       // ❌ COMPILE ERROR (Private not inherited)
    }
}

// 3. Main Executable Class
public class AccessModifierDemo {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child childObj = new Child();

        System.out.println("--- 1. Accessing from Unrelated Main Class ---");
        System.out.println(parentObj.publicVar);     //  Allowed
        System.out.println(parentObj.protectedVar);  //  Allowed (Same package)
        System.out.println(parentObj.defaultVar);    //  Allowed (Same package)
        // System.out.println(parentObj.privateVar);  // ❌ COMPILE ERROR (Private field)

        System.out.println("\n--- 2. Accessing Private via Public Method ---");
        parentObj.showPrivateAccess();                //  Allowed

        System.out.println("\n--- 3. Accessing via Subclass ---");
        childObj.testChildAccess();
    }
}