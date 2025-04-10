public class Main {
    public static void main(String[] args) {
        NodoAlberoBinario radice = new NodoAlberoBinario(new Tipo("a"));
        NodoAlberoBinario sinistra = new NodoAlberoBinario(new Tipo("b"));
        NodoAlberoBinario destra = new NodoAlberoBinario(new Tipo("c"));
        NodoAlberoBinario sinistra_sx = new NodoAlberoBinario(new Tipo("d"));
        NodoAlberoBinario destra_dx = new NodoAlberoBinario(new Tipo("e"));

        radice.setLeftChild(sinistra);
        radice.setRightChild(destra);
        sinistra.setLeftChild(sinistra_sx);
        destra.setRightChild(destra_dx);

        AlberoBinario albero = new AlberoBinario(radice);

        System.out.println("Visita anticipata:");
        albero.visitaAnticipata();

        System.out.println("\nVisita differita:");
        albero.visitaDifferita();
    }
}
