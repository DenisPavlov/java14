package example2;

public class WhoIsWho {
    enum Person {
        Mozart, Picasso, Goethe, Dostoevsky, Prokofiev, Dali
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
        };
        System.out.printf("%s was a %s%n", person, title);
    }
}
