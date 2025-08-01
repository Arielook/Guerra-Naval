public class Submarino extends Navio {
    char direccion;
    public Submarino(Posicion centro, char direccion) {
        super(centro);  
        this.direccion = direccion;
    }

    @Override
    public boolean ubicar(Plano plano) {
        boolean sePudo;
        Posicion pos1, pos2, pos3;
        switch(direccion) {
            case 'U' :  pos1 = centro.getL();
                        pos2 = centro.getU();
                        pos3 = centro.getR(); break;
            case 'R' :  pos1 = centro.getU();
                        pos2 = centro.getR();
                        pos3 = centro.getD(); break;
            case 'D' :  pos1 = centro.getR();
                        pos2 = centro.getD();
                        pos3 = centro.getL(); break;
            default :   pos1 = centro.getD();
                        pos2 = centro.getL();
                        pos3 = centro.getU();
        }
        if(plano.sePuedeUsar(centro) &&
            plano.sePuedeUsar(pos1) &&
            plano.sePuedeUsar(pos2) &&
            plano.sePuedeUsar(pos3)) {
                sePudo = true;
                
                partes.add(new Parte(centro));
                partes.add(new Parte(pos1));
                partes.add(new Parte(pos2));
                partes.add(new Parte(pos3));

                plano.setParteDe(this, centro);
                plano.setParteDe(this, pos1);
                plano.setParteDe(this, pos2);
                plano.setParteDe(this, pos3);
        } else {
            sePudo = false;
        }
        return sePudo;
    }
}
