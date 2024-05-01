public class Aumovil extends VehiculoBase {

    public Aumovil(String marca) {
        super(marca);
    }

    @Override
    public void arrancar(int velocidadActual) {
        if (velocidadActual == 0) {
            System.out.println("El automóvil está arrancando");
        } else {
            System.out.println("El automóvil ya está en movimiento");
        }
    }

    @Override
    public void acelerar(int velocidadActual) {
        if (velocidadActual > 0) {
            System.out.println("El automóvil " + getMarca() + " está acelerado y va a una velocidad de " + velocidadActual);
        } else {
            System.out.println("El automóvil " + getMarca() + " está en reposo y la velocidad debe ser mayor a cero");
        }
    }

    @Override
    public void detener(int velocidadActual) {
        if (velocidadActual > 0) {
            setVelocidadActual(0);
            System.out.println("El automóvil se ha detido");
        } else {
            System.out.println("El automóvil ya estaba detenido");
        }
    }
}

