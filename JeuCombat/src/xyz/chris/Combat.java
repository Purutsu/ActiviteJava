package xyz.chris;

import java.util.Scanner;

/**
 * Manages everything related to fight between 2 players
 */
public class Combat {
    private Personnage p1;
    private Personnage p2;

    /**
     *Initialize the player instances
     * @param p1 first player
     * @param p2 second player
     */
    Combat(Personnage p1, Personnage p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     *The fight begins, may the strongest warrior win
     */
    public void commenceCombat() {
        boolean tester = false;
        while (!tester) {
            System.out.println("Joueur "+ p1.getJoueur() +" veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
            System.out.println("Il vous reste " + p1.getVit() + " point de vie");
            try {
                Scanner sc = new Scanner(System.in);
                int attaqueP1 = sc.nextInt();

                if (attaqueP1 < 1 || attaqueP1 > 2) {
                    System.out.println("Cette attaque n'existe pas");
                } else if (attaqueP1 == 1) {
                        p1.attaqueBasic(p2);
                } else {
                        p1.attaqueSpecial(p2);
                }
                if (p2.getVit() <= 0 || p1.getVit() <= 0){
                    tester = true;
                }
            } catch (Exception e) {
                System.out.println("Caractere invalide");
            }
            SwapJoueur();
        }
    }

    /**
     * Changes which character is allowed to play
     */
    private void SwapJoueur(){
        Personnage fake;
        fake =  this.p1;
        this.p1 = this.p2;
        this.p2 = fake;
    }
}