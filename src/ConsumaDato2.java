public class ConsumaDato2 extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    Contatore dato;

    public ConsumaDato2(Semaforo s1, Semaforo s2) {
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
            System.out.println("Lettore 2: dato letto: " + dato.getValore());
            vuoto.v();
            if(ProduciDato2.repI == (ProduciDato2.tanti - 1)) {
                System.out.println("ultimo valore letto 2");
                loop = false;
            }
        }
    }
}
