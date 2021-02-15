package TP1;

public abstract class Automate {
    public Automate() {}
    /** État interne de l'automate */
    protected int etat;
    /** Positionne l'automate dans son état initial */
    abstract protected void etatInitial();
    /** L'état courant est-il acceptant ? */
    abstract protected boolean etatCourantEstAcceptant();
    /** Étant donné un caractère (donné par son code unicode), déclencher la transition */
    abstract protected void etatSuivant(int charCode);

    /** Méthode générale : le mot est-il reconnu par l'automate ? */
    public boolean reconnait(String mot) {
        etatInitial();
        CodePointIterator it = new CodePointIterator(mot);
        while (it.hasNext()) {
            int c = it.next();
            System.out.println("État : "+ etat + " entrée " + String.format("%c", c));
            etatSuivant(c);
        }
        System.out.println("État : "+ etat);
        return  etatCourantEstAcceptant();
    }
}
