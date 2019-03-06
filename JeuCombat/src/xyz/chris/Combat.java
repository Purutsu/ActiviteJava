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
        int nombre = 1;

        while (!tester) {

            System.out.println("Choisissez votre attaque");
            try {
                Scanner sc = new Scanner(System.in);
                int atkp1 = sc.nextInt();

                if (atkp1 < 1 || atkp1 > 2) {
                    System.out.println("Cette attaque n'existe pas");
                }
                else if (atkp1 == 1) {
                    if(nombre == 1){
                        nombre = 2;
                        p1.attaqueBasic(p2);
                    }
                    else {
                        nombre = 1;
                        p2.attaqueBasic(p1);
                    }
                }
                else {
                    if(nombre == 1){
                        nombre = 2;
                        p1.attaqueSpecial(p2);
                    }
                    else {
                        nombre = 1;
                        p2.attaqueSpecial(p1);
                    }
                }

                if (p2.vit <= 0 || p1.vit <= 0){
                    tester = true;
                }
            } catch (Exception e) {
                System.out.println("Caractere invalide");

            }
        }
    }
}
