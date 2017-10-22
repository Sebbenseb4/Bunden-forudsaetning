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

    public static void eksEt() {
        Scanner scan = new Scanner(System.in);

            System.out.println("1: Illustrering af javascanner");
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
         }


        /*
        2. Brug af array
        Et array er en variabel som kan indeholde flere konstanter.
        Det kan eksempelvis bruges til at opbevare tider for en jogger,
        så vedkommende kan se sine tider for at forbedre sig.
        I følgende array, er der indtastet fem tider (int).
        Tiderne bliver tildelt et indeks hver (0-4)
                                                                     */

        public static void eksTo() {
            int tid[] = {50, 48, 47, 44, 39};
            {
                System.out.println("2: Illustrering af array");

                //For at få printet den ønskede tid til konsollen, indtastes indekset for den ønskede tid. (Indeks 0 = Løb nr. 1)
                //Følgende eksempel printer indeks 1, som er løb nr. 2 (48 minutter)
                System.out.println("Løbetider i et array");
                System.out.println("Tiden er " + tid[1] + " minutter.");
                System.out.println();
                System.out.println();
            }
        }

            /*
            3. Brug af if, else if og else)
            Det følgende eksempel, illustrerer et program, der printer en besked, om du har underskud eller overskud.
            Man indtaster det beløb, man har handlet for, i konsollen, og programmet beregner om der er over- eller underskud.
            Den tager udgangspunkt i rådighedsbeløbet (available variabel), som i dette tilfælde er på 500 dkk.
            Hvis man handler inden for rådighedsbeløbet, printer konsollen "overskud",
            og hvis man overskrider grænsen på 500 dkk, printer konsollen "underskud".
            Hvis det går lige op, printer konsollen "Du går i 0"
                                                                                                                        */
            public static void eksTre() {
                Scanner scan2 = new Scanner(System.in);
                System.out.println("3: Illustrering af if");
                System.out.print("Indtast det samlede beløb i dkk: ");

                double price = scan2.nextDouble();
                double available = 500;

                if (available > price)
                    System.out.println("Du har overskud!");
                else if (available == price)
                    System.out.println("Du går i 0");

                else
                    System.out.println("Du har underskud :(");
                System.out.println();
                System.out.println();

                }


                /*
                4. Brug af random og if
                Plat-eller-krone-simulator
                Random skal importeres til at starte med, ligesom scanneren.
                Det gøres ved at indsætte 'import java.util.Random;'.
                Deklarerer min Random variabel - coin.
                                                                                                                */
                public static void eksFire() {
                    Random coin = new Random();
                    System.out.println("4: Plat-eller-krone-simulator.");

                    //Deklarerer og initialiserer "valgmuligheder", som i dette tilfælde er plat eller krone (to muligheder).
                    //Tilføjer +1 for at starte indeks på 1. Indsætter 2 i parentesen, da der er to muligheder
                    int pickSide = 1 + coin.nextInt(2);

                    //Hvis mulighed nr. 1 genereres af Random, vil konsollen printe "Plat" til konsollen.
                    if (pickSide == 1) {
                        System.out.println("Det blev plat.");
                    }
                    //Hvis mulighed nr. 2 genereres af Random, vil konsollen printe "Krone" til konsollen.
                    else if (pickSide == 2) {
                        System.out.println("Det blev krone.");
                        System.out.println();
                        //Man kunne nøjes med at lave en else{sout}, i stedet for else if, da der kun er 2 muligheder
                    }
                }

                /*
                5. Boolean udtryk
                Vha. et Booleansk udtryk bliver en kode kun udført, hvis den evalueres til at være sand eller falsk
                (alt efter ønske).
                En boolean variabel deklareres og initieres: udsagn = 100 >= 50
                Da 100 er enten lig med eller højere end 50, vil udsagnet blive evalueret til true.
                If anvendes og printer en besked til konsollen, hvis udsagnet er sandt.
                Hvis udsagnet ikke er sandt (f.eks. 100 <= 50) vil konsollen printe "Det er falsk."
                                                                                                      */

                public static void eksFem(){
                 System.out.println("5: En Boolean variabel");
                    boolean udsagn = 100 >= 50;
                    if (udsagn == true)
                        System.out.println("Det er sandt.");
                    else
                        System.out.println("Det er falsk.");

    }

}





































