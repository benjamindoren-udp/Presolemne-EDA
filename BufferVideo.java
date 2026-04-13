public class BufferVideo {
    public void insertarFrame(int[] buffer, int nuevoFrame, int posicion){
        // Desplazar a la derecha
        for (int i = buffer.length - 1; i > posicion; i--) {
            buffer[i] = buffer[i - 1];
        }

        // Insertar nuevo frame
        buffer[posicion] = nuevoFrame;
}
}
