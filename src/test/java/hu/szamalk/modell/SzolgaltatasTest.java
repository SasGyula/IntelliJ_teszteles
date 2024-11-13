package hu.szamalk.modell;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SzolgaltatasTest {

    @Test
    void uresKontstruktor(){
        System.out.println("Üres konstruktorral!");
        Szolgaltatas sz = new Szolgaltatas();
        int kapott = sz.nevekDb();
        int vart = 0;
        Assertions.assertTrue(kapott == vart);
    }
    @Test
    void nevKontstruktor(){
        System.out.println("Név konstruktorral!");
        Szolgaltatas sz = new Szolgaltatas("Béla");
        int kapott = sz.nevekDb();
        int vart = 1;
        Assertions.assertTrue(kapott == vart);
    }
    @Test
    void listaKontstruktor(){
        System.out.println("Lista konstruktorral!");
        ArrayList<String> nevek = new ArrayList<>();
        nevek.add("Béla");
        nevek.add("Géza");
        nevek.add("Juli");
        Szolgaltatas sz = new Szolgaltatas(nevek);
        int kapott = sz.nevekDb();
        int vart = nevek.size();
        Assertions.assertTrue(kapott == vart);
    }
}