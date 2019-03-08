package xyz.chris;

public class Guerrier extends Personnage {
    Guerrier(){
        setAtkBase("Coup d'epee");
        setAtkSpe("Coup de Rage");
    }

    /**
     * The effect of the warriors basic attack
     * @param adversaire Your nemesis!
     */
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.getForce();
        System.out.println("Joueur "+this.getJoueur()+" attaque avec un feroce "+getAtkBase()+" pour un total de "+atk+" point de degats");
        adversaire.setVit(adversaire.getVit()-atk);
        System.out.println("Joueur "+adversaire.getJoueur()+" perd "+ atk +" point de degats");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" est deja mort");
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
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkSpe()+" pour un total de "+rage +" point de degats");
        adversaire.setVit(adversaire.getVit()-rage);
        this.setVit(this.getVit()-feedback);
        System.out.println("Joueur "+this.getJoueur()+" perd "+feedback +" point de vie en repercussion");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" est deja mort");
        }
    }
}
