package cap10;

import java.util.Locale;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vect = new String []{"Maria", "Bob", "Alex"};

        for (int i=0; i<vect.length; i++){
            System.out.println(vect[i]);
        }

        for(String obj : vect){ // PARA CADA OBJETO "OBJ" CONTIDO NO VETOR VECT, FAÇA...
            System.out.println(obj);
        }

        sc.close();
    }
}
