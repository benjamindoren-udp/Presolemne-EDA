public class RoundRobin {

    Nodo actual;

    class Nodo {
        String idServidor;
        Nodo siguiente;
    }

    public String obtenerSiguienteServidor() {
        if (actual == null) {
            return null;
        }

        String dato = actual.idServidor;
        actual = actual.siguiente;

        return dato;
    }
}