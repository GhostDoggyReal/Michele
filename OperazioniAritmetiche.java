
import java.util.Scanner;

public class OperazioniAritmetiche {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserisci a:");
        double a=sc.nextDouble();
        System.out.print("Inserisci b:");
        double b=sc.nextDouble();
        computeValues(a, b);
    }

    private static void computeValues(double a, double b) {
        double somma;
        double prodotto;
        double divisione;
        double differenza;

        somma = a + b;
        prodotto = a * b;
        divisione = a / b;
        differenza = a - b;

        System.out.println("a + b = "+somma);
        System.out.println("a * b = "+prodotto);
        System.out.println("a / b = "+ divisione);
        System.out.println("a - b = "+differenza);

    }
}







