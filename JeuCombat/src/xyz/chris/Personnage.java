package xyz.chris;

abstract class Personnage {
    protected int joueur, niveau, vit, force, agi, intelligence;

    Personnage(){}
    public int getJoueur(){
        return joueur;
    }
    void setJoueur(int joueur){
        this.joueur = joueur;
    }
    public int getNiveau(){
        return niveau;
    }
    void setNiveau(int niveau){
        this.niveau = niveau;
    }
    public int getVit(){
        return vit;
    }
    void setVit(int vit){
        this.vit = vit;
    }
    public int getForce(){
        return force;
    }
    void setForce(int force){
        this.force = force;
    }
    public int getAgi(){
        return agi;
    }
    void setAgi(int agi){
        this.agi = agi;
    }
    public int getIntelligence(){
        return intelligence;
    }
    void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public abstract void attaqueBasic(Personnage adversaire);
    public abstract void attaqueSpecial(Personnage adversaire);
}
