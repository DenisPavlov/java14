package example2;

public class InvalidWhoIsWho {
    enum Person {
        Mozart, Picasso, Goethe, Dostoevsky, Prokofiev, Dali,

        // this element is not covered
        // by any case in the switch expression below
        // which results to compilation failure
        Gaudi
    }

    public static void main(String[] args) {
        print(Person.Mozart);
        print(Person.Dali);
        print(Person.Dostoevsky);
    }

    static void print(Person person) {
        String title = switch (person) {
            case Dali, Picasso      -> "painter";
            case Mozart, Prokofiev  -> "composer";
            case Goethe, Dostoevsky -> "writer";
            default -> "...";
        };
        System.out.printf("%s was a %s%n", person, title);
    }
}
