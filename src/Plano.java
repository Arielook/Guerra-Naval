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
}