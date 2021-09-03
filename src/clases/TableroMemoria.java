package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TableroMemoria {
    
    private int mataleatorio[][];
    private Random aleat;
    private int[][] matAux;
    
    public TableroMemoria(){
        mataleatorio = new int[8][8];
        matAux = new int[8][8];
        aleat = new Random();
        this.aleatorio();
        //aleatorio();
    }
    
    public void aleatorio() {
        int acumulador = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                mataleatorio[i][j] = 0;
                matAux[i][j] = 0;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                mataleatorio[i][j] = aleat.nextInt(32) + 1;
                
                do {
                    acumulador = 0;
                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (mataleatorio[i][j] == mataleatorio[k][l]) {
                                acumulador += 1;
                            }
                        }
                    }
                    if (acumulador == 3) {
                        mataleatorio[i][j] = aleat.nextInt(32) + 1;
                    }
                }while(acumulador == 3);
            }
        }
        imprimirP();
    }
    
    public void imprimirP(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(mataleatorio[i][j] + "   ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        TableroMemoria tablero = new TableroMemoria();
    }
}
