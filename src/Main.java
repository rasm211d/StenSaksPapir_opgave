import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sten saks papir 1.0");
        System.out.println("slår du sten, saks eller papir?: ");

        // Her starter spillet
        StenSaksPapir runde1 = new StenSaksPapir();
        int count = 0;

        while (count < 10) {
            int spillerVinder = 0;
            int computerVinder = 0;
            int uafgjort = 0;
            // indlæse spillerens hånd
            Scanner input = new Scanner(System.in);
            Haand spillerensHaand = null;
            String spillerensString = input.next();
            if (spillerensString.equalsIgnoreCase("sten"))
                spillerensHaand = Haand.STEN;
            if (spillerensString.equalsIgnoreCase("saks"))
                spillerensHaand = Haand.SAKS;
            if (spillerensString.equalsIgnoreCase("papir"))
                spillerensHaand = Haand.PAPIR;
            System.out.println("Spiller slår " + spillerensHaand);


            // Computeren genererer en hånd
            Haand computersHaand = null;
            int HaandInt = (int) (Math.random() * 3 + 1);
            if (HaandInt == 1)
                computersHaand = Haand.STEN;
            if (HaandInt == 2)
                computersHaand = Haand.SAKS;
            if (HaandInt == 3)
                computersHaand = Haand.PAPIR;
            System.out.println("Computeren slår " + computersHaand);


            // sammenligne med slaa() metoden og udråbe vinder
            int resulat = runde1.slaa(spillerensHaand, computersHaand);
            if (resulat == 1) {
                System.out.println("Spilleren vinder");
            }
            if (resulat == 2) {
                System.out.println("Computeren vinder");
            }
            if (resulat == 0) {
                System.out.println("Udfaldet er ens");
            }
            if (resulat == -1) {
                System.out.println("FEJL!!!!");
            }


        }
        count++;
    }

}
