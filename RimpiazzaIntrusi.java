import java.util.Scanner;

public class RimpiazzaIntrusi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String a=sc.nextLine();
        System.out.println("Enter string:");
        String b=sc.nextLine();
        System.out.println("Enter string:");
        String c=sc.nextLine();
        replaceIntruder(a, b, c);
    }

    private static void replaceIntruder(String a, String b , String c) {
        String split[] = c.split(" ");
        String split1 = split[0];
        String split2 = split[1];
        String split3 = split[2];
        String rep = split2.replaceAll(a, b);
        String output = (split1 + " " + rep + " " + split3);
        System.out.println(output);


    }

}