package solution;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string");
        String str=scanner.nextLine().trim();
        String str1=str.toLowerCase();
        char[] s=str1.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u') {
                str1=str1.replace(s[i],'*');
            }
        }
        System.out.println(str1);
    }

}
