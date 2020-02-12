package com.company;

/**
 * @author Wanish Sengkhim 6110110617
 */
public class Item {
    String name;
    int HP;
    int damage;
    Item(){
        name = "Name of Item";
        HP = 0;
        damage = 0;
    }

    Item(String Name, int HP, int damage){
        this.name = Name;
        this.HP = HP;
        this.damage = damage;
    }
}
