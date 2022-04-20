public class Main {
    protected static Contatore buffer = new Contatore(0);
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        ProduciDato prod = new ProduciDato(pieno, vuoto);
        ProduciDato2 prodM = new ProduciDato2(pieno, vuoto);
        ConsumaDato cons = new ConsumaDato(pieno, vuoto);
        ConsumaDato2 consM = new ConsumaDato2(pieno, vuoto);
        prod.start();
        cons.start();
        prodM.start();
        consM.start();
    }
}
