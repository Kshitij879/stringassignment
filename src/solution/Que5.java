package solution;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine().trim();
        System.out.println("enter substring to be replaced:");
        String str1=scanner.nextLine().trim();
        System.out.println("enter the substring to replace");
        String str11=scanner.nextLine().trim();
        String str2=str.replaceAll(str1,str11);
        System.out.println(str2);
    }
}
