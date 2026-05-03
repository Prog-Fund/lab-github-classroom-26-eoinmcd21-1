
package models;

public class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    public String getType() {
        return "Parrot";
    }
}
