package introducaoPOO;

import entities.Retangulo;
import java.util.Locale;
import java.util.Scanner;
public class ex01POO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Enter rectangle width and height:");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        retangulo.area();
        retangulo.perimeter();
        retangulo.diagonal();

        sc.close();
    }
}