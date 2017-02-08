package example.foo;
import example.foo.Toy;

public class Dog {
	// Fields:
	private String name;
    private Toy[] toys; // Dog HAS-A toys
    // Setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setToys(Toy[] toys) {
        this.toys = toys;
    }
    // Getters:
    public String getName() {
        return this.name;
    }

    public Toy[] getToys() {
        return this.toys;
    }
}
