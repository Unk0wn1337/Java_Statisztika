package hu.szamalk;

import hu.szamalk.model.Nev;

public class Main {
    public static void main(String[] args) {

        Nev n = new Nev('X');
        n.matrixOsszerak();
        n.megjelenites();
        System.out.println("");

        System.out.println("1. sor karakterszáma:" + n.karakterkSzamSorban(0));
        System.out.println("2. sor karakterszáma:" + n.karakterkSzamSorban(1));
        System.out.println("3. sor karakterszáma:"+n.karakterkSzamSorban(2));

        if(n.teliSor(3)){
            System.out.println("Van e teli sor? Van");
        } else {
            System.out.println("Van e teli sor? Nincs");
        }

        System.out.println(n.teliSorDb());






    }
}