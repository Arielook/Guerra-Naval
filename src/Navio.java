import java.util.ArrayList;

abstract public class Navio {
    protected ArrayList<Parte> partes;
    protected boolean eliminado;
    protected Posicion centro;
    protected int nroPartesDanadas;

    public Navio(Posicion centro) {
        partes = new ArrayList<Parte>();
        eliminado = false;
        this.centro = centro;
        nroPartesDanadas = 0;
    }

    abstract public boolean ubicar(Plano plano);
}
