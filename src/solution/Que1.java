package solution;

import java.util.Scanner;

public class Que1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String stringInput = scan.nextLine();
        int length = stringInput.length();
        System.out.println(stringInput);
        System.out.print("index : ");
        for (int i = 0; i < length ; i++) {
            System.out.printf("%5d",i);
        }
        System.out.print("\nchars : ");
        for (int i = 0; i < length ; i++) {
            System.out.printf("%5s",stringInput.charAt(i));
        }
    }
}
