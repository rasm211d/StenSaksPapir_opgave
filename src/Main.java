public class Main {
    public static void main(String[] args) {
        System.out.println("Sten saks papir 1.0");

        Haand kelvin = Haand.SAKS;
        Haand henrik = Haand.PAPIR;
        Haand mik = Haand.STEN;
        Haand andras = Haand.STEN;

        // Her starter spillet
        StenSaksPapir runde1 = new StenSaksPapir();
        System.out.println(runde1.slaa(kelvin, henrik));


    }
}
