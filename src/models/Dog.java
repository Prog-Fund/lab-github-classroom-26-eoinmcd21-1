
package models;

public class Dog extends Mammal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public String getType() {
        return "Dog";
    }
}
