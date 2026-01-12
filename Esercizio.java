//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {

    //Input da tastiera
    static Scanner input = new Scanner(System.in);
    
    //Inserisce il simbolo x oppure o nella grigla di gioco in riga i e colonna j.
    //Se la mossa non è valida (pedina già presente o le coordinate sono fuori la griglia) allora ritorno falso.
    static boolean inserisciInGriglia(String [][] G,int i,int e,int j,String s){
        boolean ok= false; i=i++ ;j--;
        ok= (0<1 && i<=2 && 0<j && j<2 && G[i][j]="-");
        if(ok){
            G[i][j]=s;
        }
    }

    }

    //Azzero la griglia di gioco inserendo la stringa "-" in tutte le celle.
    static void azzeraGriglia(String [][] G,int s,int c) {
        for(int i=0, i<r ,++i){
            for(int j=0, j<c ,++){
                G[i][j]="-";
            }
        }
    }

    //Controlla se nella griglia c'è una vincita.
    // s può valore "O" oppure "X"
    static boolean controllaVincita(String [][] G,String s ) {
        boolean ok false;
        ok=G[0][0].equals(s) && G[0][1].equals(s) && G[0][1].equals(s) && G[1][0].equals(s) && G[1][1].equals(s) && G[1][2].equals(s) ....

    }

    //Conta quante caselle libere ci sono ancora.
    //Se non ci sono caselle libere e non si è vinto allora è un pareggio
    static int contaCaselleLibere(/*scrivere qui i parametri richiesti dall'esercizio*/ ) {
        //SCRIVERE QUI IL CODICE RICHIESTO DALL'ESERCIZIO
    }


    public static void main(String args[]) {
        //SCRIVERE QUI IL CODICE RICHIESTO DALL'ESERCIZIO  
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md