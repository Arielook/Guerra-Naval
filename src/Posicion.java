public class Posicion {
    private int x, y;
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Posicion getU() {
        return new Posicion(x-1,y);
    }

    public Posicion getR() {
        return new Posicion(x, y+1);
    }

    public Posicion getD() {
        return new Posicion(x+1, y);
    }

    public Posicion getL() {
        return new Posicion(x,y-1);
    }
}