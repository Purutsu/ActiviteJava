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
                newPerso = new Guerrier();
            }
            else if (val == 2){
                System.out.println("Vous êtes désormais un mage aux pouvoirs sans limite. Ils ne passeront pas!");
                newPerso = new Mage();
            }
            else if (val == 3){
                System.out.println("Vous êtes désormais un rôdeur malin. Ils ne passeront pas!");
                newPerso = new Rodeur();
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
            int stats;

            try {
                System.out.println("Veuillez choisir votre niveau (1-100)");
                stats = sc.nextInt();
                newPerso.setNiveau(stats);
                System.out.println("Votre force?");
                stats = sc.nextInt();
                newPerso.setForce(stats);
                System.out.println("Votre agilité?");
                stats = sc.nextInt();
                newPerso.setAgi(stats);
                System.out.println("Votre intelligence?");
                stats = sc.nextInt();
                newPerso.setIntelligence(stats);

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
        this.selectStats();
        return newPerso;
    }
}
