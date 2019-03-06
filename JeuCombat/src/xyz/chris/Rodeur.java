package xyz.chris;

public class Rodeur extends Personnage {
    protected Rodeur(){}
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.agi;
        System.out.println("Joueur "+this.joueur+" attaque avec un Tir à l'Arc pour un total de "+atk+" point de dégats");
        adversaire.vit -= atk;
        System.out.println("Joueur "+adversaire.joueur+" perd"+ atk +" point de dégats");
        if(adversaire.vit <= 0){
            System.out.println("Joueur "+adversaire.joueur+" est banni dans le royaume des ombres");
        }
    }

    @Override
    public void attaqueSpecial(Personnage adversaire){
        int augmente = this.niveau/2;
        this.agi += augmente;
        System.out.println("Joueur "+this.joueur+" utilise Concentration et augmente son agilité d'un total de "+this.agi);
    }
}
