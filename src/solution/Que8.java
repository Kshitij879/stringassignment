package solution;

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        int weight=0;
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine().trim();
        char[] s=str.toCharArray();
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(s[i])){
                weight=weight+(int)s[i];
            }

        }
        System.out.println(weight);
    }
}
