package example1;

import java.util.Arrays;

public class Java14Application {

    /* language=SQL */
    public static final String HI_MESSAGE_PATTERN = """
            Hello %s. \
            How are you?
            I'm "happy" to see you.""";

    public static void main(String[] args) {
        Person pavlov = new Person("Denis Pavlov", 31, Person.Mood.OK);

        System.out.println(pavlov.age());
        System.out.println(pavlov.name());
        System.out.println(pavlov);

        System.out.println(pavlov.getClass().isRecord());
        System.out.println(Arrays.toString(pavlov.getClass().getRecordComponents()));

        Person nullPerson = new Person(null, 25, Person.Mood.SAD);
        //System.out.println(nullPerson.name().isBlank());

        Person[] people = new Person[2];
//        people[0] = pavlov;
//        people[1] = nullPerson;
//        for (Person person : people) {
//            System.out.println(person.name().isBlank());
//        }

        sayHello(pavlov);

    }

    private static void sayHello(Object somebody) {
        String message = null;
        if (somebody instanceof Person person && person.mood() != null) {
            message = switch (person.mood()) {
                case BAD -> "111";
                case SAD -> "222";
                case HAPPY -> "333";
                case OK -> {
                    String name = person.name().toUpperCase();
                    yield "Hi " + HI_MESSAGE_PATTERN.formatted(name);
                }
            };
        }
        System.out.println(message);
    }
}
