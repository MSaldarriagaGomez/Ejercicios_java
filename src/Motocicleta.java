public class Motocicleta extends VehiculoBase{


    public Motocicleta(String marca) {
        super(marca);
    }

    @Override
    public void arrancar(int velocidadActual) {
        if(velocidadActual==0){
            System.out.println("La motocicleta está arrancando");
        }else {
            System.out.println("La motocicleta ya está en movimiento");}
    }

    @Override
    public void acelerar(int velocidadActual) {
        if (velocidadActual > 0 && velocidadActual < 150) {
            System.out.println("La motocicicleta " + getMarca() + " está acelerando y va a una velocidad de "+ velocidadActual);
        } else {
            System.out.println("La motocicleta solo puede acelerar hasta 150km/h");

        }
    }

    @Override
    public void detener(int velocidadActual) {
        if (velocidadActual > 0) {
            setVelocidadActual(0);
            System.out.println("La motocicleta se ha detido");
        } else {
            System.out.println("La motocicleta ya estaba detenido");
        }
    }
}
