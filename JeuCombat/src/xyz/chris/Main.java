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
        Personnage p1 = n.initPersonnage(1);
        p1.setJoueur(1);
        System.out.println(p1.getCri()+" je suis le "+p1.getClasse() + " Joueur " + p1.getJoueur() + " niveau " + p1.getNiveau());
        PersonnageInit m = new PersonnageInit();
        Personnage p2 = m.initPersonnage(2);
        p2.setJoueur(2);
        System.out.println("");

        Combat combat = new Combat(p1,p2);
        combat.commenceCombat();
    }
}
