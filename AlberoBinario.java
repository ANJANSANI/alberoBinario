public class AlberoBinario {
    private NodoAlberoBinario ptr;

    public AlberoBinario(NodoAlberoBinario radice) {
        this.ptr = radice;
    }

    private void visitaAnticipata(NodoAlberoBinario p) {
        if (p == null) return;
        Utilita.esamina(p.getInfo());
        if (p.getLeftChild() != null)
            visitaAnticipata(p.getLeftChild());
        if (p.getRightChild() != null)
            visitaAnticipata(p.getRightChild());
    }

    public void visitaAnticipata() {
        visitaAnticipata(ptr);
    }

    private void visitaDifferita(NodoAlberoBinario p) {
        if (p == null) return;
        if (p.getLeftChild() != null)
            visitaDifferita(p.getLeftChild());
        if (p.getRightChild() != null)
            visitaDifferita(p.getRightChild());
        Utilita.esamina(p.getInfo());
    }

    public void visitaDifferita() {
        visitaDifferita(ptr);
    }

    
    public void inserisci(int valore) {
        ptr = inserisci(ptr, valore);
    }

    private NodoAlberoBinario inserisci(NodoAlberoBinario nodo, int valore) {
        if (nodo == null) {
            return new NodoAlberoBinario(valore);
        }

        if (valore < nodo.getInfo()) {
            nodo.setLeftChild(inserisci(nodo.getLeftChild(), valore));
        } else {
            nodo.setRightChild(inserisci(nodo.getRightChild(), valore));
        }

        return nodo;
    }
}
