public class StenSaksPapir {
    /** Hvis den første hånd vinder, returneres 1
     *  Hvis den anden hånd vinder, returneres 2
     *  Hvis uafgjort, returneres 0
     *  Hvis der er fejl, returneres -1

     */

    int slaa(Haand a, Haand b) {
        int resultat = -1;

        //første hånd sten
        if (a == Haand.STEN) {

            if (b == Haand.STEN) {
                resultat = 0;
            }
            if (b == Haand.SAKS) {
                resultat = 1;
            }
            if (b == Haand.PAPIR) {
                resultat = 2;
            }

        }
        // første hånd saks
        if (a == Haand.SAKS) {

            if (b == Haand.SAKS) {
                resultat = 0;
            }
            if (b == Haand.PAPIR) {
                resultat = 1;
            }
            if (b == Haand.STEN) {
                resultat = 2;
            }

        }
        // første hånd papir
        if (a == Haand.PAPIR) {

            if (b == Haand.PAPIR) {
                resultat = 0;
            }
            if (b == Haand.STEN) {
                resultat = 1;
            }
            if (b == Haand.SAKS) {
                resultat = 2;
            }
        }
        return resultat;
    }



}
