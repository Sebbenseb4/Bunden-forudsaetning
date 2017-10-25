package Bukhave;

public class Studerende {

    /*
    Deklarerer og definerer variabler/data fields
    Varabler er private, så de ikke kan manipuleres
                                                     */

    private int age = 0;
    private double height = 0;
    private String name = "Etnavn";


    /*
    Opretter to construktors
    Constr. nr. 1 opretter en studerende vha. et navn.
    Constr. nr. 2 opretter en sturende vha. navn, alder og højde.
    Construktoren printer en besked til konsollen, når en studerende er oprettet.
                                                                                  */

    //Construktor 1
    Studerende(String studNavn) {
        name = studNavn;
        System.out.println("Ny studerende oprettet: "+name);
    }

    //Construktor 2
    Studerende(String studNavn, int age, double height) {
        name = studNavn;
        age = age;
        height = height;
        System.out.println("Ny studerende oprettet: "+name+" - "+age+" år - "+height+" cm høj.");
    }



    //Methods - handlinger de studerende kan udføre
        public void spis() {
        System.out.println(name + " spiser.");
        }

        public void studer(){
            System.out.println(name+" studerer. Dygtig!");
        }

        public void hvorGammel() {
            System.out.println(age);
        }

}