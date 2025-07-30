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
            'U' :   pos1 = centro.getL();
                    pos2 = centro.getU();
                    pos3 = centro.getR(); break;
            'R' :   pos1 = centro.getU();
                    pos2 = centro.getL();
                    pos3 = centro.getD();
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

                plano.setParte(this, centro);
                plano.setParte(this, pos1);
                plano.setParte(this, pos2);
                plano.setParte(this, pos3);
        } else {
            sePudo = false;
        }
        return sePudo;
    }
}
