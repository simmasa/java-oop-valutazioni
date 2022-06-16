package jana60.valutazioni;

public class Studente {
    int id;
    int assenze;
    double mediaVoti;


    Studente(int id, int assenze, double mediaVoti) {
        this.id=id;
        this.assenze=assenze;
        this.mediaVoti=mediaVoti;
    }

    public boolean isPromosso() {
        boolean promosso;
        if (this.assenze>50) {
            promosso=false;
        } else if ((this.assenze<=50&&this.assenze>=25)&&this.mediaVoti>2) {
            promosso=true;
        } else
            promosso=true;
        return promosso;
    }
}
