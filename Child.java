
// Child class
class Child extends Parent {
    int efg;

    // Constructor to initialize both instance variables
    Child(int abc, int efg) {
        super(abc);
        this.efg= efg;
    }

    // Overloaded constructor with only one parameter
    Child(int abc) {
        super(abc);
        // Initialize childInstanceVariable with a default value or logic
        this.efg = 0;  // Example default value
    }
}

