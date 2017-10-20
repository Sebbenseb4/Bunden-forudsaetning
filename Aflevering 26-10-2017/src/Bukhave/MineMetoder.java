package Bukhave;
import java.util.Scanner;
import java.util.Random;

public class MineMetoder {


    /*
    1. Brug af java scanner

    En scanner gør det muligt at give input til konsollen.
    I følgende eksempel, laves en mil-til-km beregner

    Først importeres scanneren til klassen, hvilket gøres før klassebetegnelsen

    Scanneren oprettes og typen af data, der indskrives i konsollen, angives - i dette tilfælde mil (cifre)
                                                                                                    */

    Scanner scan = new Scanner(System.in);

    {
        System.out.println("Illustrering af javascanner");
        System.out.println("Mil til km beregner");
        System.out.print("Indtast mil: ");

        //Deklarerer mil. Mil angives i cifre, hvorfor en double variabel benyttes
        double mil = scan.nextDouble();

        //Deklarerer km variabel
        double kilometer;

        //Definerer km variabel - algoritmen for km til mil er således:
        kilometer = mil * 1.6;

        //Printer resultatet til konsollen
        System.out.print(mil + " mil = " + kilometer + " km");
        System.out.println();
        System.out.println();


        /*
        2. Brug af array
        Et array er en variabel som kan indeholde flere konstanter.
        Det kan eksempelvis bruges til at opbevare tider for en jogger,
        så vedkommende kan se sine tider for at forbedre sig.
        I følgende array, er der indtastet fem tider (int).
        Tiderne bliver tildelt et indeks hver (0-4)
                                                                     */

        int tid[] = {50, 48, 47, 44, 39};

        //For at få printet den ønskede tid til konsollen, indtastet indekset for den ønskede tid. (Indeks 0 = Løb nr. 1)
        //Følgende eksempel printer indeks 1, som er løb nr. 2 (48 minutter)
        System.out.println("Løbetider i et array");
        System.out.println("Tiden er " + tid[1] + " minutter.");
        System.out.println();
        System.out.println();
    }






            /*
            3. Brug af If
            Det følgende eksempel, illustrerer et program, der printer en besked, om du har underskud eller overskud.
            Man indtaster beløbet, der er handlet for i konsollen, og programmet beregner om der er over- eller underskud
            ud fra et givet rådighedsbeløb (available variabel) som i dette tilfælde er på 500 dk.
            Hvis man handler inden for rådighedsbeløbet, printer konsollen "overskud",
            og hvis man overskrider grænsen på 500 priner konsollen "underskud".
                                                                                                                        */


            public static void ifStatement() {
                Scanner scan2 = new Scanner(System.in);
                System.out.print("Indtast det samlede beløb i dkk: ");
                double price = scan2.nextDouble();
                double available = 500;
                if (price < available){
                    System.out.println("Du har overskud!");
                    }
                    else{
                    System.out.println("Du har underskud :(");
                }

                /*
                4. Brug af random
                 */
    }


}
























