package example2;

public class ClassicSwitchStatement {
    enum Person {
        Mozart, Picasso, Goethe, Dostoevsky, Prokofiev, Dali
    }

    public static void main(String[] args) {
        print(Person.Mozart);
        print(Person.Dali);
        print(Person.Dostoevsky);
    }

    static void print(Person person) {
        switch (person) {
            case Dali:
            case Picasso:
                System.out.printf("%s was a painter%n", person);
                break;
            case Mozart:
            case Prokofiev:
                System.out.printf("%s was a composer%n", person);
                break;
            case Goethe:
            case Dostoevsky:
                System.out.printf("%s was a writer%n", person);
                break;
            default:
                throw new IllegalArgumentException(
                        String.format("Unknown person: %s", person));
        }
    }
}
