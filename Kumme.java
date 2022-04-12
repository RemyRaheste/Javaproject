public class Kumme {
    private static final int
        line_length = 5,
        limit = 66;

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        int n = 0;

        for (int i = 1; i <= limit; i++) {
            output.append(i);

            if (++n == line_length) {
                output.append("\r\n");
                n = 0;
            }
        }

        System.out.println(output);
    }
}
