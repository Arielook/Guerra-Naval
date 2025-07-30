public class Bote extends Navio {
    char direccion; // V = VERTICAL, H = HORIZONTAL
    public Bote(Posicion centro, char direccion) {
        super(centro);
        this.direccion = direccion;
    }
    
    @Override
    public boolean ubicar(Plano plano) {
        return false;
    }
}
