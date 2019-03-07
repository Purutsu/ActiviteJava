package xyz.chris;

public class Rodeur extends Personnage {
    Rodeur(){
        setAtkBase("Tir à l'Arc");
        setAtkSpe("Concentration");
    }
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.getAgi();
        System.out.println("Joueur "+this.getJoueur()+" attaque avec un "+this.getAtkBase()+" pour un total de "+atk+" point de dégats");
        adversaire.setVit(adversaire.getVit()-atk);
        System.out.println("Joueur "+adversaire.getJoueur()+" perd "+ atk +" point de dégats");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" a été dépouillé");
        }
    }

    @Override
    public void attaqueSpecial(Personnage adversaire){
        int augmente = this.getNiveau()/2;
        this.setAgi(this.getAgi()+augmente);
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkSpe()+" et augmente son agilité d'un total de "+this.getAgi());
    }
}
