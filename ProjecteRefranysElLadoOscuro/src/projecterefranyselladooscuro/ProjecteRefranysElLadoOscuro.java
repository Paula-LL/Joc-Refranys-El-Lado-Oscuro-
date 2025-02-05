package projecterefranyselladooscuro;

//HOLA
import java.util.Scanner;
import java.util.ArrayList;

//PRIMERA COLUMNA
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

// SEGONA COLUMNA
class SegonaMeitat {
    // Identificador de la segona meitat
    public int idSMeitat;
    // Nr d'ordre aleatori que s'assigna en cada execucio
    public int nrOrdreAleatori;

    public int compararRespostaUsuari;
    // Text de la segona meitat
    public String segonaMeitat;
}

class refranyComplet {
    // Identificador del refreany complet
    public int idRefranyComplet;
    // Text del refrany complet
    public String refComplet;
    // Nr d'ordre aleatori que s'assigna en cada execucio
    public int nrOrdreAleatori;
}

class significatRefrany {
    // Identificador del significat del refranys
    public int idSignificat;
    // String on es guarden els significats
    public String significatRef;
    // Resposta que dona l'usuari per emparellar el refrany anb el seu significat
    public int respUsuari;
    // Nr d'ordre aleatori que s'assigna en cada execucio
    public int nrOrdreAleatori;
}

public class ProjecteRefranysElLadoOscuro {

    // SCANNER GLOBAL
    public static Scanner input = new Scanner(System.in);
    public static int NR_REFRANYS = 5;

    public static void omplePrimeres(ArrayList<PrimeraMeitat> primers) {
        // PRIMER REFRANY
        PrimeraMeitat primeraMeitat1 = new PrimeraMeitat();
        primeraMeitat1.idPMeitat = 0;
        primeraMeitat1.primeraMeitat = "Qui no vulgui pols";
        primeraMeitat1.respostaUsuari = 0;
        primers.add(primeraMeitat1);
        // PRIMER REFRANY
        PrimeraMeitat primeraMeitat2 = new PrimeraMeitat();
        primeraMeitat2.idPMeitat = 1;
        primeraMeitat2.primeraMeitat = "No diguis blat";
        primeraMeitat2.respostaUsuari = 0;
        primers.add(primeraMeitat2);
        // PRIMER REFRANY
        PrimeraMeitat primeraMeitat3 = new PrimeraMeitat();
        primeraMeitat3.idPMeitat = 2;
        primeraMeitat3.primeraMeitat = "A la taula i al llit";
        primeraMeitat3.respostaUsuari = 0;
        primers.add(primeraMeitat3);
        // PRIMER REFRANY
        PrimeraMeitat primeraMeitat4 = new PrimeraMeitat();
        primeraMeitat4.idPMeitat = 3;
        primeraMeitat4.primeraMeitat = "Tal faras,";
        primeraMeitat4.respostaUsuari = 0;
        primers.add(primeraMeitat4);
        // PRIMER REFRANY
        PrimeraMeitat primeraMeitat5 = new PrimeraMeitat();
        primeraMeitat5.idPMeitat = 4;
        primeraMeitat5.primeraMeitat = "Qui dia passa,";
        primeraMeitat5.respostaUsuari = 0;
        primers.add(primeraMeitat5);

    }

    public static void ompleSegones(ArrayList<SegonaMeitat> segons) {

        SegonaMeitat segonaMeitat1 = new SegonaMeitat();
        segonaMeitat1.idSMeitat = 0;
        segonaMeitat1.segonaMeitat = "Que no vagi a l'era";
        segons.add(segonaMeitat1);

        SegonaMeitat segonaMeitat2 = new SegonaMeitat();
        segonaMeitat2.idSMeitat = 1;
        segonaMeitat2.segonaMeitat = "fins que no el tinguis al sac i ben lligat.";
        segons.add(segonaMeitat2);

        SegonaMeitat segonaMeitat3 = new SegonaMeitat();
        segonaMeitat3.idSMeitat = 2;
        segonaMeitat3.segonaMeitat = "al primer crit.";
        segons.add(segonaMeitat3);

        SegonaMeitat segonaMeitat4 = new SegonaMeitat();
        segonaMeitat4.idSMeitat = 3;
        segonaMeitat4.segonaMeitat = "tal trobaras";
        segons.add(segonaMeitat4);

        SegonaMeitat segonaMeitat5 = new SegonaMeitat();
        segonaMeitat5.idSMeitat = 3;
        segonaMeitat5.segonaMeitat = "any empeny";
        segons.add(segonaMeitat5);

    }

    public static void refrany(ArrayList<refranyComplet> refranys) {

        refranyComplet refranysComplets1 = new refranyComplet();
        refranysComplets1.idRefranyComplet = 0;
        refranysComplets1.refComplet = "Qui no vulgui pols, que no vagi a l'era.";
        refranys.add(refranysComplets1);

        refranyComplet refranysComplets2 = new refranyComplet();
        refranysComplets2.idRefranyComplet = 1;
        refranysComplets2.refComplet = "No diguis blat, fins que no el tinguis al sac i ben lligat.";
        refranys.add(refranysComplets2);

        refranyComplet refranysComplets3 = new refranyComplet();
        refranysComplets3.idRefranyComplet = 2;
        refranysComplets3.refComplet = "A la taula i al llit, al primer crit.";
        refranys.add(refranysComplets3);

        refranyComplet refranysComplets4 = new refranyComplet();
        refranysComplets4.idRefranyComplet = 3;
        refranysComplets4.refComplet = "Tal faras, tal trobaras.";
        refranys.add(refranysComplets4);

        refranyComplet refranysComplets5 = new refranyComplet();
        refranysComplets5.idRefranyComplet = 4;
        refranysComplets5.refComplet = "Qui dia passa, any empeny.";
        refranys.add(refranysComplets5);
    }

    public static void ompleSignificats(ArrayList<significatRefrany> significats) {

        significatRefrany significatRefranys1 = new significatRefrany();
        significatRefranys1.idSignificat = 0;
        significatRefranys1.significatRef = "Qui no vulgui afrontar les conseqüències d’una acció o situació, el millor és evitar-la des del principi.";
        significatRefranys1.respUsuari = 0;
        significats.add(significatRefranys1);

        significatRefrany significatRefranys2 = new significatRefrany();
        significatRefranys2.idSignificat = 1;
        significatRefranys2.significatRef = "No cal donar res per fet fins que no estigui totalment assegurat.";
        significatRefranys2.respUsuari = 0;
        significats.add(significatRefranys2);

        significatRefrany significatRefranys3 = new significatRefrany();
        significatRefranys3.idSignificat = 2;
        significatRefranys3.significatRef = "Reflecteix la importància de ser puntual, de la disciplina i d’estar sempre preparat per respondre amb celeritat.";
        significatRefranys3.respUsuari = 0;
        significats.add(significatRefranys3);

        significatRefrany significatRefranys4 = new significatRefrany();
        significatRefranys4.idSignificat = 3;
        significatRefranys4.significatRef = "Transmet una lliçó de responsabilitat i ètica, recordant-nos que les nostres accions, bones o dolentes, ens acabaran retornant en forma de resultats o situacions similars.";
        significatRefranys4.respUsuari = 0;
        significats.add(significatRefranys4);

        significatRefrany significatRefranys5 = new significatRefrany();
        significatRefranys5.idSignificat = 4;
        significatRefranys5.significatRef = "El temps avança, fins i tot quan sembla que no estem fent res d'especial per accelerar-lo; les coses van canviant de forma natural a mesura que vivim el present.";
        significatRefranys5.respUsuari = 0;
        significats.add(significatRefranys5);
    }

    public static void ordrePrimeres(ArrayList<PrimeraMeitat> primers) {
        // Contadors per el for loop i guardar una variable com part de l'array list.
        int i;
        int j;
        // En la variable aux guardem el ArrayList
        PrimeraMeitat aux;

        for (i = 0; i < NR_REFRANYS; i++) {
            // Agafem tots els objectes de cada posicio i la guardem en aux
            aux = primers.get(i);
            // Generem un orde aleatori en aux
            aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
            // Li afegim els valors

            // La j navega per tot l'array i mira si al numero que es genera es igual que
            // l'i, sino es igual, es genera un altre de nou fins que siguin diferents.
            for (j = 0; j < i; j++) {
                if (primers.get(i).nrOrdreAleatori == primers.get(j).nrOrdreAleatori) {
                    aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
                    primers.set(i, aux);
                    j = -1;
                }
            }
            primers.set(i, aux);
        }
    }

    public static void ordreSegones(ArrayList<SegonaMeitat> segons) {

        // contadors per el for loop.
        int i;
        int j;
        SegonaMeitat aux;
        // Loop per fer que la segona part del refrany sigui aleatoria en cada iteració.

        for (i = 0; i < NR_REFRANYS; i++) {
            // GENERA UN NUMERO DEL 0 AL 4
            aux = segons.get(i);
            aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);

            // LA J NAVEGA POR TOT L'ARRAY I MIRA SI EL NUMERO QUE ES GENERA ES IGUAL QUE EL
            // I, SINO ES IGUAL ES GENERA
            for (j = 0; j < i; j++) {
                if (segons.get(i).nrOrdreAleatori == segons.get(j).nrOrdreAleatori) {
                    aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
                    segons.set(i, aux);
                    j = -1;
                }
            }
            segons.set(i, aux);
        }
    }

    public static void ordreRefranys(ArrayList<refranyComplet> refranys) {

        // contadors per el for loop.
        int i;
        int j;
        refranyComplet aux;
        // Loop per fer que la segona part del refrany sigui aleatoria en cada iteració.

        for (i = 0; i < NR_REFRANYS; i++) {
            // GENERA UN NUMERO DEL 0 AL 4
            aux = refranys.get(i);
            aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);

            // LA J NAVEGA POR TOT L'ARRAY I MIRA SI EL NUMERO QUE ES GENERA ES IGUAL QUE EL
            // I, SINO ES IGUAL ES GENERA
            for (j = 0; j < i; j++) {
                if (refranys.get(i).nrOrdreAleatori == refranys.get(j).nrOrdreAleatori) {
                    aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
                    refranys.set(i, aux);
                    j = -1;
                }
            }
            refranys.set(i, aux);
        }
    }

    public static void ordreSignificats(ArrayList<significatRefrany> significats) {

        // contadors per el for loop.
        int i;
        int j;
        significatRefrany aux;
        // Loop per fer que la segona part del refrany sigui aleatoria en cada iteració.

        for (i = 0; i < significats.size(); i++) {
            // GENERA UN NUMERO DEL 0 AL 4
            aux = significats.get(i);
            aux.nrOrdreAleatori = (int) (Math.random() * significats.size());

            // LA J NAVEGA POR TOT L'ARRAY I MIRA SI EL NUMERO QUE ES GENERA ES IGUAL QUE EL
            // I, SINO ES IGUAL ES GENERA
            for (j = 0; j < i; j++) {
                if (significats.get(i).nrOrdreAleatori == significats.get(j).nrOrdreAleatori) {
                    aux.nrOrdreAleatori = (int) (Math.random() * significats.size());
                    significats.set(i, aux);
                    j = -1;
                }
            }
            significats.set(i, aux);
        }
    }

    /**
     * Asigna ordre aleatori a les primeres meitats per mostrar-les a
     * continuaci� a l'usuari; aquesta acci� s'haur� de repetir en cada execuci�
     * del programa.
     *
     * @param primeres vector d'objectes de segones meitats
     */
    /**
     * Mostra els continguts les primeres i segones meitats en ordre aleatori en
     * un format apropiat per fer triar l'usuari
     *
     * @param primeres
     * @param segones
     */
    public static void mostraMeitats(ArrayList<PrimeraMeitat> primers, ArrayList<SegonaMeitat> segons) {
        // Fem els prints de les dues columnes.
        int aux;
        int aux2;
        System.out.printf("Primera meitat:                                    | Segona meitat: \n");
        // Recorre els dos arrays per mostrar les dues parts dels refranys.
        for (int i = 0; i < NR_REFRANYS; i++) {
            aux = primers.get(i).nrOrdreAleatori;
            aux2 = segons.get(i).nrOrdreAleatori;
            System.out.printf("%50s -%2d | %50s -%2d \n", primers.get(aux).primeraMeitat, i, segons.get(aux2).segonaMeitat, i);
        }
    }

    public static void mostraMeitats2(ArrayList<significatRefrany> significats, ArrayList<refranyComplet> refranys) {
        // Fem els prints de les dues columnes.
        int aux;
        int aux2;
        System.out.printf("Primera meitat:                                    | Segona meitat: \n");
        // Recorre els dos arrays per mostrar les dues parts dels refranys.
        for (int i = 0; i < NR_REFRANYS; i++) {
            aux = significats.get(i).nrOrdreAleatori;
            aux2 = refranys.get(i).nrOrdreAleatori;
            System.out.printf("%50s -%2d | %50s -%2d \n", significats.get(aux).significatRef, i, refranys.get(aux2).refComplet, i);
        }
    }

    /**
     * Demana a l'usuari que indiqui les segones meitats (segons la numeraci�
     * que apareix en pantalla), que corresponen a les primeres meitats (que es
     * mostraran tamb� en ordre aleatori)
     *
     * @param primeres
     */
    public static void demanaJugada(PrimeraMeitat[] primeres, SegonaMeitat[] segones) {
        System.out.printf("");
    }

    /**
     * Mostra el nombre d'encerts i d'errors en la partida
     *
     * @param primeres
     */
    public static void mostraResultats(ArrayList<PrimeraMeitat> primers) {
        // Codi mètode
    }

    public static void menuDemanarJugades(ArrayList<PrimeraMeitat> primers, ArrayList<SegonaMeitat> segons) {
        int opcioPMeitat, opcioSMeitat, contadorIntent = 1;
        int posicio;
        // CONTADOR INTENT 1 ÉS EL PRIMER
        boolean continuar;
        boolean segonIntent = false;

        System.out.printf("\nObjectiu: Emparellar la primera meitat del refrany amb la seva altre meitat. \n");
        do {
            for (int i = 0; i < NR_REFRANYS; i++) {
                System.out.printf("\nEscull la segona meitat que vagi millor amb la primera meitat %d: ", i);
                primers.get(i).respostaUsuari =  input.nextInt();
                while ((primers.get(i).respostaUsuari < 0) || (primers.get(i).respostaUsuari >= NR_REFRANYS)) {
                    System.out.printf("Valor fora de rang, prova un altre: ");
                    primers.get(i).respostaUsuari =  input.nextInt();
                }
                
                primers.get(i).idPMeitat; 

                segons.get(i).idSMeitat; 

                primers.get(i).respostaUsuari; 

                primers.get(i).nrOrdreAleatori; 
                primers.get(i).respostaUsuari; 
                primers.get(i).idPMeitat; 
                segons.get(i).idSMeitat; 
                aux = primers.get(i).nrOrdreAleatori; 
                aux2 = segons.get(i).nrOrdreAleatori; 
                primers.get(aux).primeraMeitat; 
                segons.get(aux2).segonaMeitat; 
            
                if (primers.get(opcioPMeitat).id_SMeitat == segons.get(opcioSMeitat).idSMeitat) {
                    System.out.println("L'has encertat!");
                }

                else {
                    System.out.println("Aquest no era, torna a probar-ho en una altre vegada");
                }
            }

            continuar = continuar();
            // Si es true consumeix el segon intent
            if (continuar) {
                segonIntent = true;
                contadorIntent++;
            }

        } while ((segonIntent == true) && contadorIntent != 3);
    }

    public static void cronometreTemps() {
        double resultat;
        long temps = System.currentTimeMillis();
        resultat = temps / 1000;
        System.out.printf("El temps total empleat es de: %.2f \n", resultat);
    }

    public static boolean continuar() {
        boolean acabar = false;
        char lletra = ' ';
        System.out.printf("Si vols, pots tornar a intentar introduint \"s\"sino introdueix \"n\": ");
        lletra = input.next().charAt(0);
        if (lletra == 's') {
            acabar = true;
        }
        return acabar;
    }

    public static void main(String[] args) {
        // PRIMERA ARRAYLIST
        ArrayList<PrimeraMeitat> primers = new ArrayList<>();
        // SEGONA ARRAYLIST
        ArrayList<SegonaMeitat> segons = new ArrayList<>();
        // Refranys ArrayList
        ArrayList<refranyComplet> refranys = new ArrayList<>();
        // Significats ArrayList
        ArrayList<significatRefrany> significats = new ArrayList<>();

        // OMPLIR REFRANYS EN ELS DOS ARRAYLISTS
        omplePrimeres(primers);
        ompleSegones(segons);
        // CREA EN CADA UNA DE LES MEITATS UNA POSICIO PER CADA REFRANY
        ordrePrimeres(primers);
        ordreSegones(segons);
        // MOSTRA LES MEITATS
        mostraMeitats(primers, segons);
        long tempsInicial = System.currentTimeMillis();
        menuDemanarJugades(primers, segons);
        long tempsFinal = System.currentTimeMillis();
        long tempsResultant = (tempsFinal - tempsInicial) / 1000;
        System.out.println("El temps resultant es de: " + tempsResultant + " segons");
        /*
         * demanaJugada(primers, segons);
         * mostraResultats(primers);
         */
        refrany(refranys);
        ompleSignificats(significats);
        mostraMeitats2(significats, refranys);
    }
}