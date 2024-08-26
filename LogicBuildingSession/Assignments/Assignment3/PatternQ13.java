public class PatternQ13 {
    public static void main(String[] args) {
        int rows = 9;

        for (int i = 1; i <= rows; i++) {
            int count = i;
            if (i > 5) {
                count = 10 - (i-1);
            }

            for (int j = 0; j < count; j++) {
                if (j == 0) {
                    System.out.print(count);
                } else {
                    System.out.print("*" + count);
                }
            }

            System.out.println();
        }
    }
}