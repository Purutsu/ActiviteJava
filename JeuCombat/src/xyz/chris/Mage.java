package xyz.chris;

public class Mage extends Personnage {
    protected Mage(){}
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.intelligence;
        System.out.println("Joueur "+this.joueur+" attaque avec Boule de Feu pour un total de "+atk+" point de dégats");
        adversaire.vit -= atk;
        System.out.println("Joueur "+adversaire.joueur+" perd"+ atk +" point de dégats");
        if(adversaire.vit <= 0){
            System.out.println("Joueur "+adversaire.joueur+" est banni dans le royaume des ombres");
        }
    }
    @Override
    public void attaqueSpecial(Personnage adversaire){
        int soin = this.intelligence;
        System.out.println("Joueur "+this.joueur+" utilise soin pour un total de "+soin+" points de vie");
        this.vit += soin;
        if (this.vit > this.niveau*5) {
            this.vit = this.niveau * 5;
        }
    }
}
