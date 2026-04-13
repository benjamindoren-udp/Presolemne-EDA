public class ImpresoraRedCompartida {

    class Nodo {
        String documento;
        Nodo next;

        public Nodo(String documento) {
            this.documento = documento;
            this.next = null;
        }
    }

    class QueueFullException extends Exception {
        public QueueFullException(String msg) {
            super(msg);
        }
    }

    class QueueEmptyException extends Exception {
        public QueueEmptyException(String msg) {
            super(msg);
        }
    }

    private Nodo frente;
    private Nodo fin;
    private int tamaño;
    private int capacidad = 5;

    public ImpresoraRedCompartida() {
        frente = null;
        fin = null;
        tamaño = 0;
    }

    public String imprimirDocumento() throws QueueEmptyException {
        if (frente == null) {
            throw new QueueEmptyException("No hay documentos en la cola");
        }

        String documento = frente.documento;

        if (frente == fin) {
            frente = null;
            fin = null;
        } else {
            frente = frente.next;
        }

        tamaño--;
        return documento;
    }

    public void agregarDocumento(String doc) throws QueueFullException {
        if (tamaño == capacidad) {
            throw new QueueFullException("Cola llena");
        }

        Nodo nuevo = new Nodo(doc);
        if (frente == null) {
            frente = fin = nuevo;
        } else {
            fin.next = nuevo;
            fin = nuevo;
        }
        tamaño++;
    }
}