package de.samples.schulung;

public record Person(
        String name
) {

    public String sayHello() {
        return "Hello, my name is " + name + ".";
    }

}
