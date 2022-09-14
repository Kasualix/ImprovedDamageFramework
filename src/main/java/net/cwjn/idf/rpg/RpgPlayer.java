package net.cwjn.idf.rpg;

public interface RpgPlayer {

    int getLevel();
    void setLevel(int i);

    //attribute scaling stats
    int getCons(); //health, defense, knockback resistance
    int getStr(); //physical scaling and requirements, damage, knockback
    int getDex(); //physical scaling and requirements, crit chance, attack speed
    int getAgl(); //physical scaling and requirements, movespeed, evasion chance
    int getIntel(); //elemental scaling and requirements, dark damage
    int getWis(); //elemental scaling and requirements, magic/water damage
    int getFth(); //elemental scaling and requirements, fire/lightning damage

    void setCons(int i);
    void setStr(int i);
    void setDex(int i);
    void setAgl(int i);
    void setIntel(int i);
    void setWis(int i);
    void setFth(int i);

    void incrementCons(int i);
    void incrementStr(int i);
    void incrementDex(int i);
    void incrementAgl(int i);
    void incrementIntel(int i);
    void incrementWis(int i);
    void incrementFth(int i);

}
