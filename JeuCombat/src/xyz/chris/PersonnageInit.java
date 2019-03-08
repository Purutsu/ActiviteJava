package xyz.chris;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Init a character class and stats
 */
public class PersonnageInit {
    Personnage newPerso;
    /**
    *Allows to choose your class between Mage, Warrior and Rogue
    */
    public void choisirClasse(){
        System.out.println("Veuillez choisir votre classe: 1)Guerrier, 2) Mage, 3)Rôdeuer");
        Scanner sc = new Scanner(System.in);
        try{
            int val = sc.nextInt();
            if (val == 1){
                System.out.println("Vous etes désormais un(e) puissant(e) guerrier(e), sans peur et sans reproche");
                newPerso = new Guerrier();
            } else if (val == 2){
                System.out.println("Vous etes désormais un mage aux pouvoirs sans limite. Ils ne passeront pas!");
                newPerso = new Mage();
            } else if (val == 3){
                System.out.println("Vous etes désormais un rôdeur malin. Vous etes pret a tout pour l'argent");
                newPerso = new Rodeur();
            } else{
                System.out.println("Valeur incorrecte ");
                choisirClasse();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Veuillez n'entrer que des chiffres. ");
            choisirClasse();
        }
    }

    /**
     *Allows to choose the stats of a character
     */
    public void selectStats() {
        Scanner sc = new Scanner(System.in);
        boolean tester = false;
        while (!tester) {
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
                newPerso.setVit(5 * newPerso.getNiveau());
            } catch (InputMismatchException e) {
                System.out.println("Vous pouvez seulement entrer des nombres !");
                selectStats();
            }
            if (newPerso.getNiveau() <= 100 && newPerso.getNiveau() >= 1 && newPerso.getNiveau() == newPerso.getForce() + newPerso.getAgi() + newPerso.getIntelligence()) {
                tester = true;
            } else{
                System.out.println("La somme de vos statistiques doit etre egale a votre niveau de personnage et un personnage ne peut pas avoir un niveau inferieur a 1 ou superieur a 100!");
            }
        }
    }

    /**
     *Calls the choisirClasse and selectStats methods in order to create a new character from scratch
     */
    public Personnage initPersonnage(){
        this.choisirClasse();
        this.selectStats();
        return newPerso;
    }
}
