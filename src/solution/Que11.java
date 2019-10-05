package solution;

import java.util.Scanner;

public class Que11 {
    public static void main(String[] artgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("char ch = ");
        String ch = scanner.next();
        System.out.println("String inputString = ");
        String inputString = scanner.next();

        for (int i = 0; i <inputString.length() ; i++){
            if (inputString.charAt(i) == ch.charAt(0)){
                System.out.println(i);
            }
        }
    }
}
