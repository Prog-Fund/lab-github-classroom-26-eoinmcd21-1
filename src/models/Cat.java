
package models;

public class Cat extends Mammal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public String getType() {
        return "Cat";
    }
}
