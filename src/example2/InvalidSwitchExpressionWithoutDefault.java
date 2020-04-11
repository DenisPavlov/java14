package example2;

public class InvalidSwitchExpressionWithoutDefault {
    public static void main(String[] args) {
        System.out.println(print(1));
    }

    static String print(int n) {
        return switch (n) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            default -> "many";
        };
    }
}
