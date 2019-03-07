package xyz.chris;

public class Guerrier extends Personnage {
    Guerrier(){
        setAtkBase("Coup d'épée");
        setAtkSpe("Coup de Rage");
    }
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.getForce();
        System.out.println("Joueur "+this.getJoueur()+" attaque avec un féroce "+getAtkBase()+" pour un total de "+atk+" point de dégats");
        adversaire.setVit(adversaire.getVit()-atk);
        System.out.println("Joueur "+adversaire.getJoueur()+" perd "+ atk +" point de dégats");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" est déjà mort");
        }
    }

    @Override
    public void attaqueSpecial(Personnage adversaire){
        int rage = this.getForce() * 2;
        int feedback = this.getForce()/2;
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkSpe()+" pour un total de "+rage +" point de dégats");
        adversaire.setVit(adversaire.getVit()-rage);
        this.setVit(this.getVit()-feedback);
        System.out.println("Joueur "+this.getJoueur()+" perd "+feedback +" point de vie en répercussion");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" est déjà mort");
        }
    }
}
