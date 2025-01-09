import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        class Rettangoli {
            int altezza;
            int  larghezza;
        }
        Scanner rettangoli = new Scanner(System.in);

        Rettangoli rettangolo = new Rettangoli();
        System.out.println("Altezza:");
        rettangolo.altezza = rettangoli.nextInt();
        System.out.println("Larghezza: ");
        rettangolo.larghezza = rettangoli.nextInt();

        int area = rettangolo.altezza*rettangolo.larghezza;
        int perimetro = rettangolo.altezza*2 + rettangolo.larghezza*2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        rettangoli.close();

}

}