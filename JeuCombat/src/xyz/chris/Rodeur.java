package xyz.chris;

public class Rodeur extends Personnage {
    Rodeur(){
        setAtkBase("Tir a l'Arc");
        setAtkSpe("Concentration");
    }

    /**
     * The rogue basic attack effect
     * @param adversaire Your nemesis!
     */
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.getAgi();
        System.out.println("Joueur "+this.getJoueur()+" attaque avec un "+this.getAtkBase()+" pour un total de "+atk+" point de degats");
        adversaire.setVit(adversaire.getVit()-atk);
        System.out.println("Joueur "+adversaire.getJoueur()+" perd "+ atk +" point de degats");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" a ete depouille");
        }
    }

    /**
     * The rogue special attack effect
     * @param adversaire The enemy you want to defeat
     */
    @Override
    public void attaqueSpecial(Personnage adversaire){
        int augmente = this.getNiveau()/2;
        this.setAgi(this.getAgi()+augmente);
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkSpe()+" et augmente son agi d'un total de "+this.getAgi());
    }
}
