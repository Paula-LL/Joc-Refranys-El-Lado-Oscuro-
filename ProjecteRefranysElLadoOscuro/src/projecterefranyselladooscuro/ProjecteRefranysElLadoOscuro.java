/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecterefranyselladooscuro;

import java.util.Scanner;
import java.util.ArrayList;

class PrimeraMeitat{
    //Identificador de la primera meitat
    int idPMeitat;
    //Identificador de la segona meitat que li correspon
    int nrOrdre2aPart;
    //Resposta que dona l'usuari per emparellar meitats en cada execuci�
    int respostaUsuari;
    //Nr d'ordre aleatori que s'assigna en cada execuci�
    int nrOrdreAleatori;
    //Text de la primera meitat
    String primeraMeitat;
}

class SegonaMeitat{
    //Identificador de la segona meitat
    int idSMeitat;
    //Nr d'ordre aleatori que s'assigna en cada execuci�
    int nrOrdreAleatori;
    //Text de la segona meitat
    String segonaMeitat;
}

public class ProjecteRefranysElLadoOscuro {
    final public static int NR_REFRANYS = 5;
    
    /**
     * Introdueix informaci� en el vector d'objectes de pimeres meitats
     * @param primeres vector d'objectes de primeres meitats
     */
    public static void omplePrimeres(PrimeraMeitat[] primeres){
        
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
    
    /**
     * Introdueix informaci� en el vector d'objectes de segones meitats
     * @param segones vector d'objetes de segones meitats
     */
    public static void ompleSegones(SegonaMeitat[] segones){
        
        for(int i = 0; i < NR_REFRANYS; i++){
            segones[i] = new SegonaMeitat();
        }
        
        segones[0].idSMeitat = 0;
        segones[0].nrOrdreAleatori = 0;
        segones[0].segonaMeitat = "que no vagi a l'era";        
        
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
    
    
    /**
     * Asigna ordre aleatori a les segones meitats per mostrar-les
     * a continuaci� a l'usuari; aquesta acci� s'haur� de repetir en
     * cada execuci� del programa.
     * @param segones vector d'objectes de segones meitats
     */
    public static void ordreSegones(SegonaMeitat[] segones){
        int i;
        int j;
        for (i = 0; i < NR_REFRANYS; i++){
            segones[i].nrOrdreAleatori = (int)(Math.random() * NR_REFRANYS);
            for (j = 0; j < i; j++){
                if (segones[j].nrOrdreAleatori == segones[i].nrOrdreAleatori){
                    segones[i].nrOrdreAleatori = (int)(Math.random() * NR_REFRANYS);
                    j = 0;
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
        int i;
        int j;
        for (i = 0; i < NR_REFRANYS; i++){
            primeres[i].nrOrdreAleatori = (int)(Math.random() * NR_REFRANYS);
            for (j = 0; j < i; j++){
                if (primeres[j].nrOrdreAleatori == primeres[i].nrOrdreAleatori){
                    primeres[i].nrOrdreAleatori = (int)(Math.random() * NR_REFRANYS);
                    j = 0;
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
        System.out.printf("");
    }
    
    /**
     * Demana a l'usuari que indiqui les segones meitats (segons la 
     * numeraci� que apareix en pantalla), que corresponen a les 
     * primeres meitats (que es mostraran tamb� en ordre aleatori)
     * @param primeres 
     */
    public static void demanaJugada(PrimeraMeitat[] primeres, SegonaMeitat[] segones){
        //Codi m�tode
    }
    
    /**
     * Mostra el nombre d'encerts i d'errors en la partida
     * @param primeres 
     */
    public static void mostraResultats(PrimeraMeitat[] primeres){
        //Codi m�tode
    }
    
    public static void main(String[] args) {
        
        PrimeraMeitat[] primeres = new PrimeraMeitat[NR_REFRANYS];
        SegonaMeitat[] segones = new SegonaMeitat[NR_REFRANYS];
        
        omplePrimeres(primeres);
        ompleSegones(segones);
        
        ordreSegones(segones);
        ordrePrimeres(primeres);
        
        mostraMeitats(primeres, segones);
        
        demanaJugada(primeres, segones);
        mostraResultats(primeres);
    }    
}
