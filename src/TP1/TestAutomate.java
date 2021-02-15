package TP1;

/**
 * TestAutomate permet d'instancier un objet Automate étant donné le nom de sa classe.
 * Il lance ensuite la reconnaissance des mots donnés ensuite en argument par l'automate.
 */
public class TestAutomate {

    public static void main(String args[]) {
        String[] test = {"TP1.AutomateAAndBStarBStarTable", "ab", "abb", "bb", "abaaa", "abababbbb", "bbbab", "baa", "abababbbb"};
        try {
            Automate automate =  (Automate)Class.forName(test[0]).newInstance();
            for (int i = 1; i < test.length; i++) {
                String arg = test[i];
                boolean r = automate.reconnait(arg);
                System.out.println("\"" + arg + "\"" + (r ? " est" : " n'est pas") + " reconnu ");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("** Erreur : classe \""+ test[0] + "\" non trouvée");
        } catch (InstantiationException e) {
            System.err.println("** Erreur instanciation classe \""+ test[0] + "\"");
        } catch (IllegalAccessException e) {
            System.err.println("** Erreur constructeur classe \""+ test[0] + "\" non accessible");
        }
    }
}
