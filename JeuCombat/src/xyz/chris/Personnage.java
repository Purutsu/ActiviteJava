package xyz.chris;

abstract class Personnage {
    private int joueur, niveau, vit, force, agi, intelligence;
    private String atkSpe, atkBase;

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
    public String getAtkSpe(){
        return atkSpe;
    }
    void setAtkSpe(String atkSpe){
        this.atkSpe = atkSpe;
    }
    public String getAtkBase(){
        return atkBase;
    }
    void setAtkBase(String atkBase){
        this.atkBase = atkSpe;
    }

    public abstract void attaqueBasic(Personnage adversaire);
    public abstract void attaqueSpecial(Personnage adversaire);
}
