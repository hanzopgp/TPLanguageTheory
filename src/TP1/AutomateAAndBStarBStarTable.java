package TP1;

public class AutomateAAndBStarBStarTable extends Automate{

    public AutomateAAndBStarBStarTable() {
    }

    /**
     * État interne de l'automate
     */
    protected int etat;
    protected int[][] _tableTransition = {
            {1,2},
            {3,4},
            {3,2},
            {3,3},
            {1,4}
    };

    /**
     * Positionne l'automate dans son état initial
     */
    protected void etatInitial() {
        etat = 0;
    }

    /**
     * L'état courant est-il acceptant ?
     */
    protected boolean etatCourantEstAcceptant() {
        return (etat == 2 || etat == 4);
    }

    /**
     * Étant donné un caractère déclencher la transition
     */
    protected void etatSuivant(int c) {
        etat = _tableTransition[etat][c-'a'];
    }

    /**
     * Le mot est-il reconnu par l'automate ?
     */
    public boolean reconnait(String mot) {
        etatInitial();
        for (int i = 0; i < mot.length(); i++) {
            char c = mot.charAt(i);
            System.err.println("État : " + etat + " entrée " + c);
            etatSuivant(c);
        }
        System.err.println(" -> état : " + etat);
        return etatCourantEstAcceptant();
    }
}