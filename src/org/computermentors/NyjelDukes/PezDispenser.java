package org.computermentors.NyjelDukes;

public class PezDispenser {

    private final String characterName;

    public static final int MAX_PEZ = 12;

    private int pezCount;

    public PezDispenser(String characterName){
        this.characterName = characterName;
        pezCount = 0;
    }

    public String getCharacterName(){
        return characterName;
    }

    public void fill(){
        pezCount = MAX_PEZ;
    }

    public boolean dispense(){
        boolean wasDispensed = false;
        if(!isEmpty()){
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public boolean isEmpty(){
        return pezCount == 0;
    }
}
