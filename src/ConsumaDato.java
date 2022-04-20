public class ConsumaDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    Contatore dato;

    public ConsumaDato(Semaforo s1, Semaforo s2) {
        pieno= s1;
        vuoto = s2;
    }

    public void run() {
        Boolean loop = true;
        while(loop) {
            try {
                pieno.p();
            } catch (InterruptedException e) {e.printStackTrace();}

            dato = Main.buffer;
            System.out.println("Lettore: dato letto: " + dato.getValore());
            vuoto.v();
            if(ProduciDato.repI == (ProduciDato.tanti - 1)) {
                System.out.println("ultimo valore letto");
                loop = false;
            }
        }
    }
}
