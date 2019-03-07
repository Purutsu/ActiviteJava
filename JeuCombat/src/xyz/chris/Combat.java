package xyz.chris;

import java.util.Scanner;

public class Combat {
    private Personnage p1;
    private Personnage p2;

    Combat(Personnage p1, Personnage p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public void commenceCombat() {
        boolean tester = false;
        while (!tester) {
            System.out.println("Joueur "+ p1.getJoueur() +" choisissez votre attaque (1: Attaque basique, 2: Attaque special)");
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
    private void SwapJoueur(){
        Personnage fake;
        fake =  this.p1;
        this.p1 = this.p2;
        this.p2 = fake;
    }
}