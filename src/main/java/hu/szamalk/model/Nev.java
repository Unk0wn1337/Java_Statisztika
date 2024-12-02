package hu.szamalk.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nev {
    private char karakterKirajzolasa;
    private char[][] matrix;

    public Nev(char karakterKirajzolasa) {
        this.karakterKirajzolasa = karakterKirajzolasa;
        matrix = new char[5][5];

    }

    public void matrixOsszerak() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (i + j == 4) || (i - j == 0)) {
                    matrix[i][j] = karakterKirajzolasa;
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
    }


    public void megjelenites() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public int karakterkSzamSorban(int sor){
        int karakterekSzama = 0;
        if(sor >= 0 &&  sor < 5){
            for(int j = 0; j < 5; j++){
                if(matrix[sor][j] != ' '){
                    karakterekSzama++;
                }
            }
        }
        return karakterekSzama;
    }

    public int teliSorDb(){
       return 0;
    }

    public boolean teliSor(int sor){
        boolean vanTeliSor = true;
        if(sor >= 0 &&  sor < 5) {
            for (int j = 0; j < 5; j++) {
                if(matrix[sor][j] == ' '){
                        vanTeliSor = false;
                }
            }
        }
        return vanTeliSor;
    }

    public static void fajlbaIr(){

    }



    public List<Character> getTomb(){
        ArrayList<Character> karaterLista = new ArrayList<Character>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                karaterLista.add(matrix[i][j]);
            }
        }
        return Collections.unmodifiableList(karaterLista);
    }


}
