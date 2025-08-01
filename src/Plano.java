public class Plano {
    private Navio[][] navios;
    
    public Plano(int m, int n) {
        navios = new Navio[m][n];
    }

    public boolean poner(Navio nave) {
        boolean sePudo;
        sePudo = nave.ubicar(this);
        return sePudo;
    }

    public boolean sePuedeUsar(Posicion posicion) {
        int x, y;
        x = posicion.getX();
        y = posicion.getY();
        return  x >= 0 && x < navios.length &&
                y >= 0 && y < navios[0].length &&
                navios[x][y] == null;
    }

    public void setParteDe(Navio submarino, Posicion posicion){

    }
}