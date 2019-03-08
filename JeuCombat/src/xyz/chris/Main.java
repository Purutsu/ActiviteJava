package xyz.chris;

/**
 * Main class, Runs the code
 */
public class Main {
    /**
     * Initiate a fight between 2 characters
     * @param args you know what it does
     */
    public static void main(String[] args) {
        PersonnageInit n = new PersonnageInit();
        Personnage p1 = n.initPersonnage();
        p1.setJoueur(1);
        PersonnageInit m = new PersonnageInit();
        Personnage p2 = m.initPersonnage();
        p2.setJoueur(2);
        Combat combat = new Combat(p1,p2);
        combat.commenceCombat();
    }
}
