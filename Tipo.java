public class Tipo {
    private String valore;

    public Tipo(String valore) {
        this.valore = valore;
    }

    public Tipo(Tipo altro) {
        this.valore = altro.valore;
    }

    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }

}

// Funzione di utilità per la visita dell'albero
public class Utilita {
    public static void esamina(Tipo info) {
        System.out.println("Valore nodo: " + info);
    }
}
