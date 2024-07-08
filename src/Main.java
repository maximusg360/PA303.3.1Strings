import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        stringsIntro();
        javaSubstring();
        reverse();
        tokens();
        getSmallestAndLargestWithInput();

    }

    static void stringsIntro() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int sumOfTwoStrings = A.length() + B.length();
        System.out.println(sumOfTwoStrings);
        ;

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String firstLetterOfA = A.substring(0, 1).toUpperCase();
        String restOfStringA = A.substring(1);

        String firstLetterOfB = B.substring(0, 1).toUpperCase();
        String restOfStringB = B.substring(1);

        System.out.println(firstLetterOfA + restOfStringA + " " + firstLetterOfB + restOfStringB);

    }
    static void javaSubstring() {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }

    static void reverse() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();


        StringBuffer convertStringAToStringBuffer = new StringBuffer(A);

        String convertStringABackToStringButInReverse = convertStringAToStringBuffer.reverse().toString();
        System.out.println(convertStringABackToStringButInReverse);

        if (convertStringABackToStringButInReverse.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void tokens() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        String[] array = s.split("[ !,?._'@]+");


        int num = 0;

        for (String count : array) {
            if (!count.isEmpty()) {
                num++;
            }
        }
        System.out.println(num);

        for (String string : array) {
            if (!string.isEmpty()) {
                System.out.println(string);
            }

        }

    }

    static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String currentString = s.substring(i, i + k);

            if (smallest.compareTo(currentString) > 0) {
                smallest = currentString;
            }
            if (largest.compareTo(currentString) < 0) {
                largest = currentString;
            }
        }

        return smallest + "\n" + largest;

    }

    static void getSmallestAndLargestWithInput() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
