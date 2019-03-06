package xyz.chris;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonnageInit {
    Personnage newPerso;

    public Personnage choisirClasse(){
        System.out.println("Veuillez choisir votre classe: 1)Guerrier, 2) Mage, 3)Rôdeuer");
        Scanner sc = new Scanner(System.in);
        try{
            int val = sc.nextInt();
            if (val == 1){
                System.out.println("Vous êtes désormais un(e) puissant(e) guerrier(e), sans peur et sans reproche");
            }
            else if (val == 2){
                System.out.println("Vous êtes désormais un mage aux pouvoirs sans limite. Ils ne passeront pas!");
                newPerso = new Mage();
            }
            else if (val == 3){
                System.out.println("Vous êtes désormais un rôdeur malin. Ils ne passeront pas!");
            }
            else{
                System.out.println("Valeur incorrecte ");
                return choisirClasse();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Veuillez n'entrer que des chiffres. ");
            return choisirClasse();
        }
    }

    public Personnage selectStats() {


        Scanner sc = new Scanner(System.in);
        boolean tester = false;
        while (!tester) {

/** @p4 = determine les valeurs des stats
 * @valueStats = valeur enregistré pour le personnage
 * */
            int p4;

            try {
                System.out.println("Veuillez choisir votre niveau (1-100)");
                p4 = sc.nextInt();
                newPerso.setNiveau(p4);
                System.out.println("Votre force?");
                p4 = sc.nextInt();
                newPerso.setForce(p4);
                System.out.println("Votre agilité?");
                p4 = sc.nextInt();
                newPerso.setAgi(p4);
                System.out.println("Votre intelligence?");
                p4 = sc.nextInt();
                newPerso.setIntelligence(p4);

                newPerso.vit = 5 * newPerso.niveau;

            } catch (InputMismatchException e) {
                System.out.println("Vous pouvez seulement entrer des nombres !");
                return selectStats();
            }


            System.out.println("La somme de vos statistiques doit être égale a votre niveau de personnage !");


            if (newPerso.niveau == newPerso.force + newPerso.agi + newPerso.intelligence) {

                tester = true;
            }


        }

        return newPerso;
    }

    public Personnage initPersonnage(){
        this.choisirClasse();
        return newPerso;
    }
}
