
public class ComparaStringhe {

public static void main(String[] args) {
        String a = "ciao come va ?";
        String b = "cIao come vA ?";
        String c = "ciao come va ";
        System.out.println("2".equals(""+compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIaoo come vA ?";
        c = "ciao come va a";
        System.out.println("1".equals(""+compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIao come va ?";
        c = "ciao come vA ?";
        System.out.println("3".equals(""+compareStrings(a, b, c)));
        }

private static int compareStrings(String a, String b, String c) {
        Boolean conf;
        Boolean conf1;
        Boolean conf2;
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        String c1 = c.toLowerCase();
        conf = a1.equals(b1);
        conf1 = a1.equals(c1);
        conf2 = b1.equals(c1);
        int i = 0;
        if(conf == true && conf1 == true && conf2 == true)
                i = 3;
        else if(conf == true && conf1 == false && conf2 == false)
                i = 2;
        else if(conf == false && conf1 == false && conf2 == false)
                i = 1;
        else
                System.out.println("error");

                return (i);











        }
}