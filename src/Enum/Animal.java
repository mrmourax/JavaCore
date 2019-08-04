package Enum;

public enum Animal {
    DOG("sobaka"), CAT("koshka"), FROG("ljagushka"); //toze samoe wto new DOG("sobaka")

    private String translation;



    //default Private in Enum
    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation(){
        return translation;
    }

    public String toString(){
        return "Perevod na russkij jazik " + translation;
    }


}
