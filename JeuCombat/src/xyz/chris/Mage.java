package xyz.chris;

/**
 * This represents a character of the mage class
 */
public class Mage extends Personnage {
    /**
     * init mage
     */
    Mage(){
        setAtkBase("Boule de Feu");
        setAtkSpe("Soin");
        setCri("Abracadabra");
        setClasse("Mage");
    }

    /**
     * The mage basic attack effect
     * @param adversaire Your nemesis!
     */
    @Override
    public void attaqueBasic(Personnage adversaire){
        int atk = this.getIntelligence();
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkBase()+" et inflige "+atk+" dommages");
        adversaire.setVit(adversaire.getVit()-atk);
        System.out.println("Joueur "+adversaire.getJoueur()+" perd "+ atk +" points de vie");
        if(adversaire.getVit() <= 0){
            System.out.println("Joueur "+adversaire.getJoueur()+" est mort");
        }
    }

    /**
     * The mage special attack effect
     * @param adversaire The enemy you want to defeat
     */
    @Override
    public void attaqueSpecial(Personnage adversaire){
        int soin = this.getIntelligence();
        System.out.println("Joueur "+this.getJoueur()+" utilise "+getAtkSpe()+" et gagne "+soin+" en vitalité");
        this.setVit(this.getVit()+soin);
        if (this.getVit() > this.getNiveau()*5) {
            this.setVit(this.getNiveau() * 5);
        }
    }
}
