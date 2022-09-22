import java.util.Scanner;

public class EuclidsAlgorithmTheGreatestCommonDivisor {
    static int m, n, r, copyM;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the value of m: ");
        m = scanner.nextInt();
        System.out.println("Please insert the value of n: ");
        n = scanner.nextInt();
        copyM = m;

        if (mIslowerThanN()) {
            exchangeMN();
        }

        findTheGreatestCommonDivisor();
    }

    static boolean mIslowerThanN() { return m < n; }
    static void exchangeMN() {
        m = n;
        n = copyM;
    }
    static void findTheGreatestCommonDivisor() {
        int copyM = m;
        int copyN = n;

        while (true) {
            r = copyM % copyN;
            if (r == 0) break;
            copyM = copyN;
            copyN = r;
        }
        System.out.format("The greatest common divisor of %d and %d is equal to: %d", n, m, copyN);
    }
}

/*
TODO
 Algorithm E (Euclid’s algorithm).
 Given two positive integers m and n, find their greatest common divisor, that is,
 the largest positive integer that evenly divides both m and n.
 E0. [Ensure m >= n.] If m < n, exchange m <-> n.
 E1. [Find remainder.] Divide m by n and let r be the remainder. (We will have 0 <= r < n.)
 E2. [Is it zero?] If r = 0, the algorithm terminates; n is the answer.
 E3. [Reduce.] Set m <- n, n <- r, and go back to step E1.
 */
