public class Portaavion extends Navio{
    public Portaavion(Posicion centro) {
        super(centro);
    }

    @Override
    public boolean ubicar(Plano plano) {
        return false;
    }
}
