package com.mycompany.app;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Integer> testListesi = new ArrayList<Integer>();
        testListesi.add(5);
        testListesi.add(10);
        testListesi.add(15);
        ArrayList<Integer> tersListe = TersCevir(testListesi);
        for(Integer deger : tersListe){
            System.out.println(deger);
        }

    }

    public static ArrayList<Integer> TersCevir(ArrayList<Integer> liste){
        if(liste.size() < 2) return null;
        ArrayList<Integer> listea = new ArrayList<Integer>();

        for(int i = liste.size()-1 ; i >=0 ;i--)
        {
            listea.add(liste.get(i));
        }

        return listea;
    }
}
