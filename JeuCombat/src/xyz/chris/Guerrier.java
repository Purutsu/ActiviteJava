package xyz.chris;
/**
 * This represents a character of the warrior class
 */
public class Guerrier extends Personnage {
    /**
     *init warrior
     */
    Guerrier(){
        setAtkBase("Coup d'epee");
        setAtkSpe("Coup de Rage");
        setCri("Woarg");
        setClasse("Guerrier");
    }

    /**
     * The effect of the warriors basic attack
     * @param adversaire Your nemesis!
     */
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.getForce();
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkBase()+" et inflige "+atk+" dommages.");
        adversaire.setVit(adversaire.getVit()-atk);
        System.out.println("Joueur "+adversaire.getJoueur()+" perd "+ atk +" points de vie");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" est mort");
            System.out.println("Joueur "+adversaire.getJoueur()+" a perdu !");
        }
    }

    /**
     * The effect of the warrior special attack
     * @param adversaire The enemy you want to defeat
     */
    @Override
    public void attaqueSpecial(Personnage adversaire){
        int rage = this.getForce() * 2;
        int feedback = this.getForce()/2;
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkSpe()+" et inflige "+rage +" dommage");
        adversaire.setVit(adversaire.getVit()-rage);
        this.setVit(this.getVit()-feedback);
        System.out.println("Joueur "+adversaire.getJoueur()+" perd "+ rage +" points de vie");
        System.out.println("Joueur "+this.getJoueur()+" perd "+feedback +" points de vie");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" est mort");
            System.out.println("Joueur "+adversaire.getJoueur()+" a perdu !");
        }
    }
}
