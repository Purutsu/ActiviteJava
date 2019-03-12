package xyz.chris;

/**
 * Main class, Runs the code
 */
public class Main {
    /**
     *Describes the current character
     *@param p The current character
     */
    private static void description(Personnage p){
        System.out.println(p.getCri()+" je suis le "+p.getClasse() + " Joueur " + p.getJoueur() + " niveau " + p.getNiveau() + " je possède " + p.getVit() + " de vitalité, " + p.getForce() +" de force, "+ p.getAgi()+" d'agilité et "+p.getIntelligence()+" d'intelligence !");
    }
    /**
     * Initiate a fight between 2 characters
     * @param args you know what it does
     */
    public static void main(String[] args) {
        PersonnageInit n = new PersonnageInit();
        Personnage p1 = n.initPersonnage(1);
        p1.setJoueur(1);
        description(p1);
        PersonnageInit m = new PersonnageInit();
        Personnage p2 = m.initPersonnage(2);
        p2.setJoueur(2);
        description(p2);

        Combat combat = new Combat(p1,p2);
        combat.commenceCombat();
    }
}
