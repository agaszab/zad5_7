import java.sql.SQLOutput;
import java.util.Scanner;

public class zad5_7 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String [] imiona=new String [5];

        for (int i = 0; i < imiona.length; i++) {
           System.out.println("Podaj imię:");
           imiona[i]=scan.nextLine();
        }

        for ( int i=imiona.length-1; i >= 0; i--) {
            String imie=imiona[i];
            System.out.println("Cześć "+imie);
        }

    }

}
