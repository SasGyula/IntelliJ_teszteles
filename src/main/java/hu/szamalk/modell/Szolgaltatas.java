package hu.szamalk.modell;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Szolgaltatas {
    private ArrayList<String> nevek;

    public Szolgaltatas(){
        this(new ArrayList<String>());
    }

    public Szolgaltatas(String nev){
        this();
        nevekFelvitele(nev);
    }

    public Szolgaltatas(ArrayList<String> nevek) {
        this.nevek = nevek;
    }

    public void nevekFelvitele(String nev){
        this.nevek.add(nev);
    }

    public String [] getNevek() {
        String [] s = new String[nevek.size()];
        return nevek.toArray(s);
    }
    public void setNevek(ArrayList<String> nevek) {

    }
    public int nevekDb(){
        return nevek.size();
    }

}
