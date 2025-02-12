package projecterefranys;

import java.util.*;

//PRIMERA MEITAT
class PrimeraMeitat {

    // Identificador de cada refrany de la primera columna
    public int idPMeitat;
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

/*------------------SEGONA FASE--------------------
REFRANTS COMPLETS QUE S'IMPRIMIRAN COLUMNA1
 */
class RefranyComplet {

    // Identificador del refrany complet
    public int idRefranyComplet;
    // Text del refrany complet
    public String refComplet;
    // Nr d'ordre aleatori que s'assigna en cada execucio
    public int nrOrdreAleatori;
}
//SIGNIFICATS DELS REFRANYS COLUMNA2

class SignificatRefrany {

    // Identificador del significat del refranys
    public int idSignificat;
    // String on es guarden els significats
    public String significatRef;
    // Nr d'ordre aleatori que s'assigna en cada execucio
    public int nrOrdreAleatori;
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
        int respostaMeitat1, respostaMeitat2, posicioCorrecta;
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
                //MÈTODE PER EMPARELLAR
                posicioCorrecta = emparellarRefranys(ordreAleatoriPrimeraM, segons);
                encerts = contarEncerts(encerts, posicioCorrecta, respostaMeitat2);
                errors = contarErrors(errors, posicioCorrecta, respostaMeitat2);

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

    public static int emparellarRefranys(int ordreAleatoriPrimeraM, ArrayList<SegonaMeitat> segons) {
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
        return posicioCorrecta;
    }

    public static int contarErrors(int errors, int posicioCorrecta, int respostaMeitat2) {
        if (respostaMeitat2 != posicioCorrecta) {
            errors++;
        }
        return errors;
    }

    public static int contarEncerts(int encerts, int posicioCorrecta, int respostaMeitat2) {
        if (respostaMeitat2 == posicioCorrecta) {
            encerts++;
        }
        return encerts;
    }

    public static void mostrarEncerts(int encerts) {
        System.out.printf("\nEl numero total d'encerts: %d\n", encerts);
    }

    public static void mostrarErrors(int errors) {
        System.out.printf("\nEl numero total d'errors: %d\n", errors);
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

    public static boolean anarFase2() {
        boolean segonaFase = false;
        char lletra;
        System.out.printf("\nVols anar a la segona fase? Introdueix s per continuar o n per acabar la partida: ");
        lletra = input.next().charAt(0);
        while (lletra != 's' && lletra != 'n') {
            System.out.printf("\nOpcio no valida\n");
            System.out.printf("\nVols anar a la segona fase? Introdueix s per continuar o n per acabar la partida: ");
            lletra = input.next().charAt(0);
        }
        if (lletra == 's') {
            segonaFase = true;
        }
        return segonaFase;
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

    /*------------FASE2--------------------------
    OMPLIR REFRANYS PRIMERA COLUMNA
     */
    public static void ompleRefranys(ArrayList<RefranyComplet> refranys) {
        for (int i = 0; i < NR_REFRANYS; i++) {
            //CREAR NOVA INSTANCIA
            RefranyComplet instancia = new RefranyComplet();
            instancia.idRefranyComplet = i;//GENERA UN ID DEL 1 AL 4
            refranys.add(instancia);
        }
        refranys.get(0).refComplet = "Qui no vulgui pols, que no vagi a l'era.";
        refranys.get(1).refComplet = "No diguis blat, fins que no el tinguis al sac i ben lligat.";
        refranys.get(2).refComplet = "A la taula i al llit, al primer crit.";
        refranys.get(3).refComplet = "Tal faras, tal trobaras.";
        refranys.get(4).refComplet = "Qui dia passa, any empeny.";
    }

    //OMPLIR SIGNIFICATS SEGONA COLUMNA
    public static void ompleSignificats(ArrayList<SignificatRefrany> significats) {
        for (int i = 0; i < NR_REFRANYS; i++) {
            SignificatRefrany instancia = new SignificatRefrany();
            instancia.idSignificat = i;//GENERA UN ID DEL 1 AL 4
            significats.add(instancia);
        }
        significats.get(0).significatRef = "Qui no vulgui afrontar les conseqüències d’una acció o situació, el millor és evitar-la des del principi.";
        significats.get(1).significatRef = "No cal donar res per fet fins que no estigui totalment assegurat.";
        significats.get(2).significatRef = "Reflecteix la importància de ser puntual, de la disciplina i d’estar sempre preparat per respondre amb celeritat.";
        significats.get(3).significatRef = "Transmet una lliçó de responsabilitat i ètica, recordant-nos que les nostres accions, bones o dolentes, ens acabaran retornant en forma de resultats o situacions similars.";
        significats.get(4).significatRef = "El temps avança, fins i tot quan sembla que no estem fent res d'especial per accelerar-lo; les coses van canviant de forma natural a mesura que vivim el present.";
    }

    //ORDRE ALEATORI REFRANYS
    public static void ordreRefranys(ArrayList<RefranyComplet> refranys) {
        RefranyComplet aux;

        for (int i = 0; i < NR_REFRANYS; i++) {
            aux = refranys.get(i);

            aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);

            for (int j = 0; j < i; j++) {
                if (refranys.get(i).nrOrdreAleatori == refranys.get(j).nrOrdreAleatori) {
                    aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
                    refranys.set(i, aux);
                    j = -1;
                }
            }
        }
    }
    //ORDRE ALEATORI SIGNIFICATS

    public static void ordreSignificats(ArrayList<SignificatRefrany> significats) {
        SignificatRefrany aux;

        for (int i = 0; i < NR_REFRANYS; i++) {
            aux = significats.get(i);

            aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);

            for (int j = 0; j < i; j++) {
                if (significats.get(i).nrOrdreAleatori == significats.get(j).nrOrdreAleatori) {
                    aux.nrOrdreAleatori = (int) (Math.random() * NR_REFRANYS);
                    significats.set(i, aux);
                    j = -1;
                }
            }
        }
    }
    
    public static void mostrarSignificats2(ArrayList<RefranyComplet> refranys, ArrayList<SignificatRefrany> significats) {
        int aux;
        int aux2;

        System.out.printf("                              Refranys:                                           Significats: \n");
        for (int i = 0; i < NR_REFRANYS_MOSTRATS; i++) {
            aux = refranys.get(i).nrOrdreAleatori;
            aux2 = significats.get(i).nrOrdreAleatori;
            System.out.printf("%75s -%2d |-%2d %s \n", refranys.get(aux).refComplet, i,i, significats.get(aux2).significatRef);
        }
    }
    public static void mostrarJugadesFase2 (ArrayList<RefranyComplet> refranys, ArrayList<SignificatRefrany> significats) {
        int contadorIntent = 0; 
        int respostaRefrany, respostaSignificat;
        int errors = 0; 
        int encerts = 0; 
        long tempsInicial;
        boolean continuar = true;

        do {
            tempsInicial = tempsInicial();
            System.out.printf("Objectiu: relacionar refrany amb significat:\n");
            respostaRefrany = preguntarRefrany();
            respostaSignificat = preguntarSignificat();

            int ordreAleatoriRefrany = refranys.get(respostaRefrany).nrOrdreAleatori;
            int posicioCorrecta = -1;
            int i = 0; 

            while(i < significats.size() && posicioCorrecta == -1){
                if (significats.get(i).nrOrdreAleatori == ordreAleatoriRefrany) {
                    posicioCorrecta = i;
                }
                i++;
            }
            if (respostaSignificat == posicioCorrecta){
                encerts++;
            }
            else {
                errors++;
            }
            mostrarErrors(errors);
            mostrarEncerts(encerts);
            tempsResultant(tempsInicial);
            if (contadorIntent >= 2){
                continuar = false;
            }
        } while((continuar==true));
    }
    public static int preguntarRefrany(){
        int respostaRefrany;
        System.out.print("\nIntrodueix el refrany: ");
        respostaRefrany = input.nextInt();
        while(respostaRefrany < 0 || respostaRefrany > 4){
            System.out.print("\nFora de rang \n");
            System.out.print("\nIntrodueix el refrany: \n");
            respostaRefrany = input.nextInt();
        }
        return respostaRefrany;
    }

    public static int preguntarSignificat() {
        int respostaSignificat;
        System.out.printf("\nIntrodueix el significat: ");
        respostaSignificat = input.nextInt();
        while(respostaSignificat < 0 || respostaSignificat > 4){
            System.out.print("\nFora de rang \n");
            System.out.print("\nIntrodueix el refrany: \n");
            respostaSignificat = input.nextInt();
        }
        return respostaSignificat;
    }
    public static void main(String[] args) {

        // PRIMERA ARRAYLIST
        ArrayList<PrimeraMeitat> primers = new ArrayList<>();
        // SEGONA ARRAYLIST
        ArrayList<SegonaMeitat> segons = new ArrayList<>();
        //SEGONA FASE: REFRANYS
        ArrayList<RefranyComplet> refranys = new ArrayList<>();
        //SEGONA FASE: SIGNIFICATS
        ArrayList<SignificatRefrany> significats = new ArrayList<>();
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
        if (anarFase2() == true) {
            ompleRefranys(refranys);
            ompleSignificats(significats);
            ordreRefranys(refranys);
            ordreSignificats(significats);
            mostrarSignificats2(refranys, significats);
            mostrarJugadesFase2(refranys,significats);
        }

    }

}
