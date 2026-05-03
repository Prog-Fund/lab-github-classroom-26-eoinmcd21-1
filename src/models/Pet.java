
package models;

public abstract class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract String getType();

    public String toString() {
        return getType() + " - Name: " + name + ", Age: " + age;
    }
}
