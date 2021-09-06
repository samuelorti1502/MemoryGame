package clases;

public class Casilla {
    private int posFilas;
    private int posCol;
    private boolean volteada;

    public Casilla(int posFilas, int posCol) {
        this.posFilas = posFilas;
        this.posCol = posCol;
    }

    
    
    public int getPosFilas() {
        return posFilas;
    }

    public void setPosFilas(int posFilas) {
        this.posFilas = posFilas;
    }

    public int getPosCol() {
        return posCol;
    }

    public void setPosCol(int posCol) {
        this.posCol = posCol;
    }

    public boolean isVolteada() {
        return volteada;
    }

    public void setVolteada(boolean volteada) {
        this.volteada = volteada;
    }
    
    
}
