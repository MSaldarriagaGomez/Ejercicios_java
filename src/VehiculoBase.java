public class VehiculoBase implements Vehiculo{

    private String marca;
    private int velocidadActual;
    private boolean estadoMovimiento;

    public VehiculoBase(String marca) {
        this.marca = marca;
        this.velocidadActual = 0;
        this.estadoMovimiento = false;
        //estado de movimiento en false es velocidadActual= 0
        // estado de movimiento en true es vehiculo en movimiento
        }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isEstadoMovimiento() {
        return estadoMovimiento;
    }

    public void setEstadoMovimiento(boolean estadoMovimiento) {
        this.estadoMovimiento = estadoMovimiento;
    }

    @Override
    public void arrancar(int velocidadActual) {
        if(velocidadActual==0){
            System.out.println("El vehículo está arrancando");
    }else {
            System.out.println("El vehículo ya está en movimiento");}
    }

    @Override
    public void acelerar(int velocidadActual) {

    }

    @Override
    public void detener(int velocidadActual) {
        if (velocidadActual > 0) {
            setVelocidadActual(0);
            System.out.println("El vehículo se ha detido");
        } else {
            System.out.println("El vehículo ya estaba detenido");
        }
    }

    @Override
    public void frenar(int velocidadActual) {
        if (velocidadActual > 11) {
            setVelocidadActual(velocidadActual - 10);
            System.out.println("La velocidad actual tras frenar es de "+ getVelocidadActual());
        } else {
            System.out.println("No se puede frenar");
        }
    }

    @Override
    public void obtenerMarca(String marca) {
        System.out.println("la marca es "+ getMarca());
    }

    @Override
    public boolean obtenerEstado(int velocidadActual, boolean estadoMovimiento) {
        if (velocidadActual > 0) {
            estadoMovimiento = true;
        } else {
            estadoMovimiento = false;
        }
        return estadoMovimiento;
    }
}
