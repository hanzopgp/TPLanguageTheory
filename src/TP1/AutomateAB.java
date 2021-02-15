package TP1;

public class AutomateAB extends Automate{

    public AutomateAB() {
    }

    /**
     * État interne de l'automate
     */
    protected int etat;

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
        return etat == 2;
    }

    /**
     * Étant donné un caractère déclencher la transition
     */
    protected void etatSuivant(int c) {
        switch (etat) {
            case 0:
                if (c == 'a')
                    etat = 1;
                else
                    etat = 3;
                break;
            case 1:
                if (c == 'b')
                    etat = 2;
                else
                    etat = 3;
                break;
            case 2:
                etat = 3;
                break;
        }
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