package example.foo;
import example.foo.Dog;

public class Person {
	// Fields:
	private Dog dog; // Person HAS-A Dog
    private String name;
    // Setters:
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Getters:
    public Dog getDog() {
        return this.dog;
    }

    public String getName() {
        return this.name;
    }
}
