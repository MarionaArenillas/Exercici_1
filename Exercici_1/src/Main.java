//llibreria que utilitzarem per llegir el numero demanat a l'usuari
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declarar la variable número
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Benvingut al programa!");
        //demanar un número fins que vagi del 0 al 10
        do {
            System.out.println("Introdueix un numero positiu");
            num = input.nextInt();
        } while ((num < 0) || (num > 10)); //repetir si el número és <0 o >10

        //mostrar per pantalla el número correcte que ha introduït
        System.out.println("Has introduït el número correcte: "+num);

    }
}