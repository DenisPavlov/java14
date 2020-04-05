package example1;

public record Person(String name, int age, Mood mood) {
    public Person {
        if (age < 0) throw new IllegalArgumentException("Invalid age " + age);
    }

    public enum Mood {
        HAPPY, SAD, BAD, OK
    }
}