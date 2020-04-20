package example3;

public class StringExample {
    public static void main(String[] args) {
        String sql = "SELECT name, age " +
                "FROM PERSON" +
                "WHERE name = \'Igor\'" +
                "AND car = \'Niva\'";

        String java13sql = """
                SELECT name, age
                FROM PERSON 
                WHERE name = 'Igor'
                    AND car = 'Niva'
                """;

        System.out.println(sql);
        System.out.println("\n Java 14 \n");
        System.out.println(java13sql);
    }

}
