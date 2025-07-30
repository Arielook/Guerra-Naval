public class Canoa extends Navio {
    public Canoa(Posicion posicion) {
        super(posicion);
    }

    @Override
    public boolean ubicar(Plano plano) {
        return false;
    }
}
