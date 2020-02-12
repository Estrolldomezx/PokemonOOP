package com.company;

/**
 * @author Wanish Sengkhim 6110110617
 */
public class Bag {

    String Berry  ="Berry";
    int Berrycount = 0;

    int PickItem(String NameofItem, int count) {
        if (NameofItem.equals(this.Berry)) {
            this.Berrycount = count + 1;
            return this.Berrycount;
        }
        else {
            return 0;
        }
    }
        void print(int Berry1){
            System.out.println("Name of Item : "+Berry+"Amount : "+Berry1);
            System.out.println("===============================================");
        }
    }


