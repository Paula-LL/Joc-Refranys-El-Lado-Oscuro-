package projecterefranys;

import java.util.*;

//PRIMERA MEITAT
class PrimeraMeitat {

    // Identificador de cada refrany de la primera columna
    public int idPMeitat;
    // Resposta que dona l'usuari per emparellar meitats en cada execucio
    public int respostaUsuari;
    // Nr d'ordre aleatori que s'assigna en cada execucio
    public int nrOrdreAleatori;
    // Aqui es guarden tots els inicis de la primera meitat
    public String primeraMeitat;
}
//SEGONA MEITAT

class SegonaMeitat {

    // Identificador de cada refrant de la segona meitat
    public int idSMeitat;
    // Nr d'ordre aleatori que s'assigna en cada execucio
    public int nrOrdreAleatori;
    //Aqui es guarden tots els finals de la segona meitat
    public String segonaMeitat;
}

public class ProjecteRefranys {

    //------------SCANNER GLOBAL-----------------
    public static Scanner input = new Scanner(System.in);
    //------------CONSTANTS----------------------
    public static int NR_REFRANYS = 5;
    public static int NR_REFRANYS_MOSTRATS = 5;

    /*
    -------------------FASE1--------------------
    OMPLIR ELS 15 REFRANYS DE LA PRIMERA MEITAT
     */
    public static void omplePrimeres(ArrayList<PrimeraMeitat> primers) {
        for (int i = 0; i < NR_REFRANYS; i++) {
            PrimeraMeitat instancia = new PrimeraMeitat();
            instancia.idPMeitat = i;//GENERA UN ID DEL 1 AL 4
            primers.add(instancia);
        }
        primers.get(0).primeraMeitat = "Qui no vulgui pols, ";
        primers.get(1).primeraMeitat = "No diguis blat, ";
        primers.get(2).primeraMeitat = "A la taula i al llit, ";
        primers.get(3).primeraMeitat = "Tal faras, ";
        primers.get(4).primeraMeitat = "Qui dia passa, ";
    }

    /*
    -------------------FASE1--------------------
    OMPLIR ELS 15 REFRANYS DE LA SEGONA MEITAT
     */
    public static void ompleSegones(ArrayList<SegonaMeitat> segons) {
        for (int i = 0; i < NR_REFRANYS; i++) {
            SegonaMeitat instancia = new SegonaMeitat();
            instancia.idSMeitat = i;//GENERA UN ID DEL 1 AL 4
            segons.add(instancia);
        }
        segons.get(0).segonaMeitat = "que no vagi a l'era";
        segons.get(1).segonaMeitat = "fins que no el tinguis al sac i ben lligat.";
        segons.get(2).segonaMeitat = "al primer crit.";
        segons.get(3).segonaMeitat = "tal trobaras.";
        segons.get(4).segonaMeitat = "any empeny.";
    }

    /*
    GENERACIO DE NUMEROS ALEATORIS(nrOrdreAleatori) DE LES DUES MEITATS
    ORDRE ALEATORI PRIMERA MEITAT:
     */
    public static void ordrePrimeres(ArrayList<PrimeraMeitat> primers) {
        // Creen una referencia al objecte aux
        PrimeraMeitat aux;

        for (int i = 0; i < NR_REFRANYS; i++) {
            // Fem que l'auxiliar apunti cap a la direcció de memoria de primers(i)
            aux = primers.get(i);
            /* 
            Modifiquem el valor nrOrdreAleatori generant un nou numero del 0 al (NR_REFRANYS-1) 
            en la posicio de memoria que esta apuntant aux
             */
            aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
            /* 
            La j navega per tot l'array i mira si al numero que es genera es igual que
            el que ha generat la i, si es igual, es genera un altre de nou i es torna a comprovar fins que no siguin diferents.
             */
            for (int j = 0; j < i; j++) {
                if (primers.get(i).nrOrdreAleatori == primers.get(j).nrOrdreAleatori) {
                    aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
                    primers.set(i, aux);
                    j = -1;
                }
            }
        }
    }

    //ORDRE SEGONA MEITAT
    public static void ordreSegones(ArrayList<SegonaMeitat> segons) {
        // Creen una referencia al objecte aux
        SegonaMeitat aux;

        for (int i = 0; i < NR_REFRANYS; i++) {
            // Fem que l'auxiliar apunti cap a la direcció de memoria de primers(i)
            aux = segons.get(i);
            /* 
            Modifiquem el valor nrOrdreAleatori generant un nou numero del 0 al (NR_REFRANYS-1) 
            en la posicio de memoria que esta apuntant aux
             */
            aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
            /* 
            La j navega per tot l'array i mira si al numero que es genera es igual que
            el que ha generat la i, si es igual, es genera un altre de nou i es torna a comprovar fins que no siguin diferents.
             */
            for (int j = 0; j < i; j++) {
                if (segons.get(i).nrOrdreAleatori == segons.get(j).nrOrdreAleatori) {
                    aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
                    segons.set(i, aux);
                    j = -1;
                }
            }
        }
    }

    //MOSTRAR MEITATS
    public static void mostrarMeitats(ArrayList<PrimeraMeitat> primers, ArrayList<SegonaMeitat> segons) {
        // Fem els prints de les dues columnes.
        int aux;
        int aux2;
        System.out.printf("                              Primera meitat:                                           Segona meitat: \n");
        // Recorre els dos arrays per mostrar les dues parts dels refranys.
        for (int i = 0; i < NR_REFRANYS_MOSTRATS; i++) {
            aux = primers.get(i).nrOrdreAleatori;
            aux2 = segons.get(i).nrOrdreAleatori;
            System.out.printf("%50s -%2d | %50s -%2d \n", primers.get(aux).primeraMeitat, i, segons.get(aux2).segonaMeitat, i);
        }
    }

    public static void demanarJugades(ArrayList<PrimeraMeitat> primers, ArrayList<SegonaMeitat> segons) {
        int contadorIntent = 0;
        int respostaMeitat1, respostaMeitat2;
        int errors = 0;
        int encerts = 0;
        long tempsInicial;
        boolean continuar;

        do {
            System.out.printf("\nObjectiu emparellar les dues meitats\n");
            tempsInicial = tempsInicial();
            //MOSTRAR LES DUES MEITATS JA AMB L'ORDRE ALEATORI
            mostrarMeitats(primers, segons);
            for (int k = 0; k < NR_REFRANYS_MOSTRATS; k++) {
                respostaMeitat1 = preguntarMeitat1();
                respostaMeitat2 = preguntarMeitat2();
                /*GUARDEM EN LA VARIABLE EL NUM ALEATORI QUE TÉ L'INDEX QUE HA SELECCIONAT L'USUARI
                EN LA PRIMERA respostaMeitat1*/
                int ordreAleatoriPrimeraM = primers.get(respostaMeitat1).nrOrdreAleatori;

                // Buscamos en la segunda lista la posición donde está la mitad con el mismo orden aleatorio
                //USAMOS EL -1 porque no puede empezar con 0 ya que este es ya parte del indice del ArrayList;
                int posicioCorrecta = -1;
                int i = 0;
                //SOLO LO HARÁ 1 VEZ EL BUCLE
                while (i < segons.size() && posicioCorrecta == -1) {
                    if (segons.get(i).nrOrdreAleatori == ordreAleatoriPrimeraM) {
                        posicioCorrecta = i;
                    }
                    i++;
                }
                if (respostaMeitat2 == posicioCorrecta) {
                    encerts++;
                } else {
                    errors++;
                }
            }

            //MOSTRAR RESULTATS ERRORS, ENCERTS I TEMPS
            mostrarErrors(errors);
            mostrarEncerts(encerts);
            tempsResultant(tempsInicial);
            //SEGON INTENT
            contadorIntent++;
            continuar = continuar(contadorIntent);
            if (contadorIntent >= 2) {
                continuar = false;
            }
        } while ((continuar == true));

    }

    public static int preguntarMeitat1() {
        int respostaMeitat1;
        System.out.printf("\nIntrodueix la primera meitat: ");
        respostaMeitat1 = input.nextInt();
        while (respostaMeitat1 < 0 || respostaMeitat1 > 4) {
            System.out.printf("\nFora de rang\n");
            System.out.printf("\nIntrodueix la primera meitat: ");
            respostaMeitat1 = input.nextInt();
        }
        return respostaMeitat1;
    }

    public static int preguntarMeitat2() {
        int respostaMeitat2;
        System.out.printf("\nIntrodueix la segona meitat: ");
        respostaMeitat2 = input.nextInt();
        while (respostaMeitat2 < 0 || respostaMeitat2 > 4) {
            System.out.printf("\nFora de rang\n");
            System.out.printf("\nIntrodueix la primera meitat: ");
            respostaMeitat2 = input.nextInt();
        }
        return respostaMeitat2;
    }

    public static void mostrarErrors(int errors) {
        System.out.printf("\nLa quantitat d'errors que has tingut es: %d \n", errors);
    }

    public static void mostrarEncerts(int encerts) {
        System.out.printf("\nLa quantitat d'encerts que has tingut es: %d \n", encerts);
    }

    //TEMPS EMPRAT
    public static long tempsInicial() {
        long tempsInicial = System.currentTimeMillis();
        return tempsInicial;
    }

    public static void tempsResultant(long tempsInicial) {
        long tempsFinal = System.currentTimeMillis();
        long tempsResultant = (tempsFinal - tempsInicial) / 1000;
        System.out.printf("\nEl temps resultant es de: %d segons\n", tempsResultant);
    }

    public static boolean nouJoc() {
        char lletra;
        boolean nouJoc = false;
        System.out.printf("\nVols jugar una partida nova? Introdueix \"s\", sino introdueix \"n\": ");
        lletra = input.next().charAt(0);
        while (lletra != 's' && lletra != 'n') {
            System.out.println("Opcio no valida");
            System.out.printf("\nVols jugar una partida nova? Introdueix \"s\", sino introdueix \"n\": ");
            lletra = input.next().charAt(0);
        }
        if (lletra == 's') {
            nouJoc = true;
        }
        return nouJoc;
    }

    // PERMET A L'USUARI CONTINUAR
    public static boolean continuar(int contadorIntent) {
        boolean continuar = false;
        char lletra;
        if (contadorIntent < 2) {
            System.out.printf("\nSi vols tornar a intentar, introdueix \"s\" sino introdueix \"n\": ");
            lletra = input.next().charAt(0);
            if (lletra == 's') {
                continuar = true;
            }
            while (lletra != 's' && lletra != 'n') {
                System.out.printf("\nSi vols tornar a intentar, introdueix \"s\" sino introdueix \"n\": ");
                lletra = input.next().charAt(0);
            }
        }
        return continuar;
    }

    public static void main(String[] args) {
        // PRIMERA ARRAYLIST
        ArrayList<PrimeraMeitat> primers = new ArrayList<>();
        // SEGONA ARRAYLIST
        ArrayList<SegonaMeitat> segons = new ArrayList<>();
        do {
            /*
        -------------------FASE1----------------------
        OMPLIR ELS REFRANYS AMB ID I ELS STRINGS
             */
            omplePrimeres(primers);
            ompleSegones(segons);
            /*
        GENERAR ELS NUMEROS ALEATORIS DE LES DUES MEITAT
        PRIMERA MEITAT:
             */
            ordrePrimeres(primers);
            //SEGONA MEITAT:
            ordreSegones(segons);
            //DEMANAR EMPARELLAR
            demanarJugades(primers, segons);
        } while (nouJoc() == true);
        //----------SEGONA FASE---------------------

    }

}
