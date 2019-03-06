package xyz.chris;

public class Guerrier extends Personnage {
    protected Guerrier(){}
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.force;
        System.out.println("Joueur "+this.joueur+" attaque avec Coup d'épéee pour un total de "+atk+" point de dégats");
        adversaire.vit -= atk;
        System.out.println("Joueur "+adversaire.joueur+" perd"+ atk +" point de dégats");
        if(adversaire.vit <= 0){
            System.out.println("Joueur "+adversaire.joueur+" est banni dans le royaume des ombres");
        }
    }

    @Override
    public void attaqueSpecial(Personnage adversaire){
        int rage = this.force * 2;
        int feedback = this.force/2;
        System.out.println("Joueur "+this.joueur+" utilise coup de rage pour un total de "+rage +" point de dégats");
        adversaire.vit -= rage;
        this.vit -= feedback;
        System.out.println("Joueur "+this.joueur+" perd "+rage +" point de vie en répercussion");
        if(adversaire.vit <= 0){
            System.out.println("Joueur "+adversaire.joueur+" est déjà mort");
        }
    }
}
