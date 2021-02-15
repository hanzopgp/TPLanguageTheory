package TP1;

public class AutomateABSTAR extends Automate{

    @Override
    protected void etatInitial() {
        etat = 0;
    }

    @Override
    protected boolean etatCourantEstAcceptant() {
        return etat == 1;
    }

    @Override
    protected void etatSuivant(int charCode) {
        // FULL CODE :
        switch (etat) {
            case 0:
                if (charCode == 'a')
                    etat = 1;
                else
                    etat = 2;
                break;
            case 1:
                if (charCode == 'b')
                    etat = 1;
                else
                    etat = 2;
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
