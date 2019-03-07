package xyz.chris;

public class Mage extends Personnage {
    Mage(){
        setAtkBase("Boule de Feu");
        setAtkSpe("Soin");
    }
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.getIntelligence();
        System.out.println("Joueur "+this.getJoueur()+" attaque avec une "+getAtkBase()+" pour un total de "+atk+" point de dégats");
        adversaire.setVit(adversaire.getVit()-atk);
        System.out.println("Joueur "+adversaire.getJoueur()+" perd "+ atk +" point de dégats");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" est banni dans le royaume des ombres");
        }
    }
    @Override
    public void attaqueSpecial(Personnage adversaire){
        int soin = this.getIntelligence();
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkSpe()+" pour un total de "+soin+" points de vie");
        this.setVit(this.getVit()+soin);
        if (this.getVit() > this.getNiveau()*5) {
            this.setVit(this.getNiveau() * 5);
        }
    }
}
