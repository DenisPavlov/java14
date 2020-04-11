package example2;

public class WhoIsWho1 {
    enum Person {
        Mozart, Picasso, Goethe, Dostoevsky, Prokofiev, Dali,

        Gaudi, Bach, Einstein
    }

    public static void main(String[] args) {
        print(Person.Mozart);
        print(Person.Dali);
        print(Person.Einstein);
    }

    static void print(Person person) {
        String title = switch (person) {
            case Dali, Picasso      -> "painter";
            case Mozart, Prokofiev  -> "composer";
            case Goethe, Dostoevsky -> "writer";
            default                 -> {
                System.out.printf("Oops! I don't know about %s%n", person);
                yield "...";
            }
        };
        System.out.printf("%s was a %s%n", person, title);
    }

    static int factorial(int n) {
        return switch (n) {
            case 0, 1 -> 1;
            case 2    -> 2;
            default   -> factorial(n - 1) * n;
        };
    }
}
