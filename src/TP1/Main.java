package TP1;

public class Main {

    /** Main : les mots en arguments sont-ils reconnus ? */
    public static void main(String args[]) {
        AutomateAB automate = new AutomateAB();
        String[] mots = {"ab","abadab","abaaaaaaa"};
        for (String arg : mots) {
            boolean r = automate.reconnait(arg);
            System.out.println("\n\"" + arg + "\"" + (r ? " est" : " n'est pas") + " reconnu ");
        }
    }

}
