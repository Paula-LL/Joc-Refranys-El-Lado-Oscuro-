/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package projecterefranyelladooscuro;

import java.util.Scanner;
import java.util.ArrayList;

//PRIMERA COLUMNA
class PrimeraMeitat{
    //Identificador de cada refrany de la primera columna
    int idPMeitat;
    //Identificador de la segona meitat que li correspon
    int nrOrdre2aPart;
    //Resposta que dona l'usuari per emparellar meitats en cada execucio
    int respostaUsuari;
    //Nr d'ordre aleatori que s'assigna en cada execucio
    int nrOrdreAleatori;
    //Aqui es guarden tots els inicis de la primera meitat
    String primeraMeitat;
}

//Segona columna
class SegonaMeitat{
    //Identificador de la segona meitat
    int idSMeitat;
    //Nr d'ordre aleatori que s'assigna en cada execucio
    int nrOrdreAleatori;
    //Text de la segona meitat
    String segonaMeitat;
}

public class ProjecteRefranysElLadoOscuro {
    //SCANNER GLOBAL
    public static Scanner input = new Scanner(System.in);
    
    public static final int NR_REFRANYS = 5;
    
    public static void omplePrimeres(PrimeraMeitat[] primeres){
        
        //Loop per crear les 5 instancies per cada refrany
        for(int i = 0; i < NR_REFRANYS; i++){
            primeres[i] = new PrimeraMeitat();
        }
        
        primeres[0].idPMeitat = 0;
        primeres[0].nrOrdre2aPart = 0;
        primeres[0].primeraMeitat = "Qui no vulgui pols";        
        
        primeres[1].idPMeitat = 1;
        primeres[1].nrOrdre2aPart = 1;
        primeres[1].primeraMeitat = "No diguis blat";
        
        primeres[2].idPMeitat = 2;
        primeres[2].nrOrdre2aPart = 2;
        primeres[2].primeraMeitat = "A la taula i al llit";
        
        primeres[3].idPMeitat = 3;
        primeres[3].nrOrdre2aPart = 3;
        primeres[3].primeraMeitat = "Tal far�s,";
        
        primeres[4].idPMeitat = 4;
        primeres[4].nrOrdre2aPart = 4;
        primeres[4].primeraMeitat = "Qui dia passa,";
    }
    
    
    public static void ompleSegones(SegonaMeitat[] segones){
        
        //Loop per crear 5 instancies per cada refrany
        for(int i = 0; i < NR_REFRANYS; i++){
            segones[i] = new SegonaMeitat();
        }
        
        segones[0].idSMeitat = 0;
        segones[0].nrOrdreAleatori = 0;
        segones[0].segonaMeitat = "que no vagi a l'era.";        
        
        segones[1].idSMeitat = 1;
        segones[1].nrOrdreAleatori = 1;
        segones[1].segonaMeitat = "fins que no el tinguis al sac i ben lligat.";
        
        segones[2].idSMeitat = 2;
        segones[2].nrOrdreAleatori = 2;
        segones[2].segonaMeitat = "al primer crit.";
        
        segones[3].idSMeitat = 3;
        segones[3].nrOrdreAleatori = 3;
        segones[3].segonaMeitat = "tal trobar�s.";
        
        segones[4].idSMeitat = 4;
        segones[4].nrOrdreAleatori = 4;
        segones[4].segonaMeitat = "any empeny.";
    }
    
    
    public static void ordreSegones(SegonaMeitat[] segones){
        
        //contadors per el for loop.
        int i;
        int j;
        //Loop per fer que la segona part del refrany sigui aleatoria en cada iteració.
        for (i = 0; i < NR_REFRANYS; i++){
            //GENERA UN NUMERO DEL 0 AL 4
            segones[i].nrOrdreAleatori = (int)(Math.random() * NR_REFRANYS);
            //LA J NAVEGA POR TOT L'ARRAY I MIRA SI EL NUMERO QUE ES GENERA ES IGUAL QUE EL I, SINO ES IGUAL ES GENERA
            for (j = 0; j < i; j++){
                if (segones[j].nrOrdreAleatori == segones[i].nrOrdreAleatori){
                    segones[i].nrOrdreAleatori = (int)(Math.random() * NR_REFRANYS);
                    j = -1;
                }
            }
        }
    }

    /**
     * Asigna ordre aleatori a les primeres meitats per mostrar-les
     * a continuaci� a l'usuari; aquesta acci� s'haur� de repetir en
     * cada execuci� del programa.
     * @param primeres vector d'objectes de segones meitats
     */
    public static void ordrePrimeres(PrimeraMeitat[] primeres){
        //Contadors per el for loop.
        int i;
        int j;
        //Loop per a fer que la primera part del refrany sigui aleatoria en cada iteració.
        
        for (i = 0; i < NR_REFRANYS; i++){
            primeres[i].nrOrdreAleatori = (int)(Math.random() * NR_REFRANYS);
            //La j navega per tot l'array i mira si al numero que es genera es igual que l'i, sino es igual, es genera un altre de nou fins que siguin diferents.
            for (j = 0; j < i; j++){
                if (primeres[j].nrOrdreAleatori == primeres[i].nrOrdreAleatori){
                    primeres[i].nrOrdreAleatori = (int)(Math.random() * NR_REFRANYS);
                    j = -1;
                }
            }
        }
    }
    
    /**
     * Mostra els continguts les primeres i segones meitats en ordre aleatori
     * en un format apropiat per fer triar l'usuari
     * @param primeres 
     * @param segones 
     */
    public static void mostraMeitats(PrimeraMeitat[] primeres, SegonaMeitat[] segones){
        //Fem els prints de les dues columnes.
        System.out.printf("Primera meitat:                                    | Segona meitat: \n");
        //Recorre els dos arrays per mostrar les dues parts dels refranys.
        for (int i = 0; i < NR_REFRANYS; i++){
            System.out.printf("%50s | %50s \n", primeres[primeres[i].nrOrdreAleatori].primeraMeitat, segones[segones[i].nrOrdreAleatori].segonaMeitat);
        }
    }
    
    /**
     * Demana a l'usuari que indiqui les segones meitats (segons la 
     * numeraci� que apareix en pantalla), que corresponen a les 
     * primeres meitats (que es mostraran tamb� en ordre aleatori)
     * @param primeres 
     */
    public static void demanaJugada(PrimeraMeitat[] primeres, SegonaMeitat[] segones){
        System.out.printf("");
    }
    
    /**
     * Mostra el nombre d'encerts i d'errors en la partida
     * @param primeres 
     */
    public static void mostraResultats(PrimeraMeitat[] primeres){
        //Codi mètode
    }
    
    public static void menuDemanarJugades(){
        int opcioPMeitat;
        int opcioSMeitat;
        do {
            System.out.printf("Objectiu: Emparellar la primera meitat del refrany amb la seva altre meitat. \n");
            System.out.printf("Escull la primera meitat:");
            opcioPMeitat = input.nextInt();
            System.out.printf("Escull la segona meitat:");
            opcioSMeitat = input.nextInt();
        } while(continuar());
    }
    public static boolean continuar(){
        boolean acabar=false;
        char lletra=' ';
        System.out.printf("Si vols, pots tornar a intentar introduint \"s\".\n En cas que no vulguis seguir, introdueix \"n\"");
        lletra=input.next().charAt(0);
        if (lletra=='s') {
            acabar=true;
        }
        return acabar;
    }
    public static void main(String[] args) {
        
        PrimeraMeitat[] primeres = new PrimeraMeitat[NR_REFRANYS];
        SegonaMeitat[] segones = new SegonaMeitat[NR_REFRANYS];
        
        //Cridem a les funcions fetes anteriorment.
        omplePrimeres(primeres);
        ompleSegones(segones);
        
        ordreSegones(segones);
        ordrePrimeres(primeres);
        
        mostraMeitats(primeres, segones);
        
        menuDemanarJugades();
        demanaJugada(primeres, segones);
        mostraResultats(primeres);
    }    
}






















    



