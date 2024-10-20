import java.util.Scanner;

class Kaprekar {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number (LOWER BOUND): ");
        int lower = s.nextInt();
        System.out.print("Enter the Number (UPPER BOUND): ");
        int upper = s.nextInt();
        s.close();
        kap(lower, upper);
    }

    static int kap(int lower, int upper) {
        for (int i = lower; i < upper; i++) {
            int sq = i * i;
            String str = Integer.toString(sq);
            int len = str.length();
            int numLen = Integer.toString(i).length();
            int split = len - numLen;

            String part1, part2;
            part1 = (split > 0) ? str.substring(0, split) : "";
            part2 = str.substring(split);

            int sum1;
            if (part1.isEmpty()) {
                sum1 = 0;
            } else {
                sum1 = Integer.parseInt(part1);
            }

            int sum2;
            if (part2.isEmpty()) {
                sum2 = 0;
            } else {
                sum2 = Integer.parseInt(part2);
            }

            int res = sum1 + sum2;

            if (res == i) {
                System.out.println(i);
            }
        }
        return 0;
    }
}
