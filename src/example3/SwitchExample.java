package example3;

public class SwitchExample {
    public static void main(String[] args) {

        Car car = Car.KIA;

        switch (car) {
            case NIVA -> System.out.println("Niva");
            case NEXIA -> System.out.println("Nexia");
        }
    }

    // 'switch' expression does not cover all possible input values

    /*private static Car getCar(Car car) {
        return switch (car) {
            case NIVA -> System.out.println("Niva");
            case NEXIA -> System.out.println("Nexia");
        };
    }*/
}
