package xyz.chris;
/**
 * abstract class representing a character
 */
abstract class Personnage {
    private int joueur, niveau, vit, force, agi, intelligence;
    private String atkSpe, atkBase;

    /**
     * Never ever
     */
    Personnage(){}

    /**
     *get player number
     */
    public int getJoueur(){
        return joueur;
    }

    /**
     *set player number
     * @param joueur the player's number
     */
    void setJoueur(int joueur){
        this.joueur = joueur;
    }

    /**
     *get character level
     */
    public int getNiveau(){
        return niveau;
    }

    /**
     *set character level
     * @param niveau the character's level value
     */
    void setNiveau(int niveau){
        this.niveau = niveau;
    }

    /**
     *get character vit
     */
    public int getVit(){
        return vit;
    }

    /**
     *set character vit
     * @param vit the character's vitality value
     */
    void setVit(int vit){
        this.vit = vit;
    }

    /**
     *get character's strength
     */
    public int getForce(){
        return force;
    }

    /**
     *sets character strength value
     * @param force the character's strength value
     */
    void setForce(int force){
        this.force = force;
    }

    /**
     *get character's agi
     */
    public int getAgi(){
        return agi;
    }

    /**
     *set character's agility
     * @param agi the character's agility value
     */
    void setAgi(int agi){
        this.agi = agi;
    }

    /**
     *get character's intelligence
     */
    public int getIntelligence(){
        return intelligence;
    }

    /**
     *set character's intelligence
     * @param intelligence the character's intelligence
     */
    void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    /**
     *get character's special attack
     */
    public String getAtkSpe(){
        return atkSpe;
    }

    /**
     *set character's special attack
     * @param atkSpe the name of the character's special attack
     */
    void setAtkSpe(String atkSpe){
        this.atkSpe = atkSpe;
    }

    /**
     *get character basic attack
     */
    public String getAtkBase(){
        return atkBase;
    }

    /**
     *set character's special attack
     * @param atkBase the name of the character's basic attack
     */
    void setAtkBase(String atkBase){
        this.atkBase = atkBase;
    }

    /**
     *Allows the character to use his basic attack against his opponent
     * @param adversaire Your nemesis!
     */
    public abstract void attaqueBasic(Personnage adversaire);

    /**
     *Allows the character to use his special attack against his opponent
     * @param adversaire The enemy you want to defeat
     */
    public abstract void attaqueSpecial(Personnage adversaire);
}
