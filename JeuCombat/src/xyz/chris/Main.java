package xyz.chris;

public class Main {
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
