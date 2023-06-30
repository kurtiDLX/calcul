import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        while (true) {
            System.out.print("num 1: ");
            num1 = scanner.nextInt();
            System.out.print("num 2: ");
            num2 = scanner.nextInt();
            System.out.print("1. +\n2. -\n3. *\n4. /\n enter: ");
            scanner.nextLine();
            String vib = scanner.nextLine();
            if (vib.equals("1") || vib.equals("+")) {
                plus(num1, num2);
            } else if (vib.equals("2") || vib.equals("-")) {
                minus(num1, num2);
            } else if (vib.equals("3") || vib.equals("*")) {
                multiply(num1, num2);
            } else if (vib.equals("4") || vib.equals("/")) {
                if (num2 != 0)
                    dl(num1, num2);
                else {
                    System.out.println("error");
                }
            }
        }
    }


    public static void plus(int num1, int num2){
        int res = num1 + num2;
        System.out.println(res);
    }
    public static void minus(int num1, int num2){
        int res = num1 - num2;
        System.out.println(res);
    }
    public static void multiply(int num1, int num2){
        int res = num1 * num2;
        System.out.println(res);
    }
    public static void dl(int num1, int num2){
        int res = num1 / num2;
        System.out.println(res);
    }

}