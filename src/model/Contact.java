package model;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class Contact {
    String name;
    String telf;

    public Contact(String name){
        this.name=name;
    }

    public Contact(String name, String telf) {
        this.telf = telf;
        this.name = name;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
