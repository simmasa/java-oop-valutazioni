package jana60.valutazioni;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Studente[] classe= new Studente[10];

        Random assenze = new Random();

        for (int i =0;i< classe.length;i++) {
            classe[i] = new Studente(getId(), assenze.nextInt(100),votoRandom());
        }

        int studProm=0;

        for (int i =0;i< classe.length;i++) {
            if (classe[i].isPromosso()) {
                System.out.println("Lo studente " + classe[i].id + " è stato promosso");
                studProm++;
            }else
                System.out.println("Lo studente " + classe[i].id + " è stato bocciato");

        }
        System.out.println("In totale sono stati promossi "+studProm+" studenti");
    }
    public static int getId() {

        String idString ="";
        Random rn = new Random();
        for (int i = 0;i<5;i++) {
            idString += rn.nextInt(10);
        }
        return Integer.parseInt(idString);
    }
    public static float votoRandom() {
        float minLimit = 1F;
        float maxLimit = 5F;
        float voto = minLimit + new Random().nextFloat() * (maxLimit - minLimit);
        return voto;
    }
}
