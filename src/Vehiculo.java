public interface Vehiculo {

    void arrancar(int velocidadActual);
    void acelerar(int velocidadActual);
    void detener(int velocidadActual);
    void frenar(int velocidadActual);
    void obtenerMarca(String marca);
    boolean obtenerEstado(int velocidadActual, boolean estadoMovimiento);
}
