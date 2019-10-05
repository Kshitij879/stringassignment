package solution;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        System.out.println("Enter the index");
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println("Substring is: " + str.substring(input));
    }
}
