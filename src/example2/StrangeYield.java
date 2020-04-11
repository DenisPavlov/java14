package example2;

public class StrangeYield {
    public static void main(String[] args) {
        go(0);
    }

    static void go(int n) {
        System.out.println(
                switch (n) {
                    case 42 -> "Fotry-two";
                    default -> {
                        yield("Oops");
                    }
                }
        );
    }

    static String yield(String s) {
        return s + "Oops!";
    }
}
