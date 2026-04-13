public class Undo {

    Nodo inicio;
    Nodo fin;
    Nodo top; // pila

    class Nodo {
        String dato;
        Nodo anterior;
        Nodo siguiente;
    }

    public void deshacerAccion() {

        if (fin == null) {
            return;
        }

        Nodo extraido = fin;

        // Caso: un solo nodo
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            fin = fin.anterior;
            fin.siguiente = null;
        }

        // Insertar en la pila
        extraido.anterior = null;
        extraido.siguiente = top;
        top = extraido;
    }
}