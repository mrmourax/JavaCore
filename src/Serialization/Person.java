package Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -33399292992292L;

    private int id;
    private transient String name; // transient - mi ne xotim eto pole serializovivat



    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }

}
