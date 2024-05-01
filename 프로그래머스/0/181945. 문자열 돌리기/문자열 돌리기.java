import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] temp = a.split("");
        for(String str : temp) {
            System.out.println(str);
        }
        
    }
}