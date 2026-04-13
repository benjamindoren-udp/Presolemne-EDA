public class TicketsSoporte {

    Nodo head;

    class Nodo {
        String id;
        Nodo siguiente;
    }

    public void moverAlInicio(String ticket) {

        if (head == null || head.id.equals(ticket)) {
            return;
        }

        Nodo actual = head;
        Nodo anterior = null;

        while (actual != null && !actual.id.equals(ticket)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual != null) {
            anterior.siguiente = actual.siguiente;
            actual.siguiente = head;
            head = actual;
        }
    }
}