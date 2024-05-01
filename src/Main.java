public class Main {
    public static void main(String[] args) {

        Motocicleta moto1=new Motocicleta("Honda");
        System.out.println("El estado actual de la moto es " + moto1.obtenerEstado(moto1.getVelocidadActual(), moto1.isEstadoMovimiento()));
        moto1.arrancar(moto1.getVelocidadActual());
        moto1.setVelocidadActual(120);
        System.out.println("El estado actual de la moto es "+ moto1.obtenerEstado(moto1.getVelocidadActual(), moto1.isEstadoMovimiento()));
        moto1.acelerar(moto1.getVelocidadActual());
        moto1.frenar(moto1.getVelocidadActual());
        moto1.detener(moto1.getVelocidadActual());
        System.out.println("El estado actual de la moto es "+ moto1.obtenerEstado(moto1.getVelocidadActual(), moto1.isEstadoMovimiento()));
        moto1.obtenerMarca(moto1.getMarca());

        System.out.println("******************************** \n");

        Aumovil auto1= new Aumovil("Toyota");
        System.out.println("El estado actual del automovil es " + auto1.obtenerEstado(auto1.getVelocidadActual(), auto1.isEstadoMovimiento()));
        auto1.arrancar(auto1.getVelocidadActual());
        auto1.setVelocidadActual(60);
        System.out.println("El estado actual del automovil es "+ auto1.obtenerEstado(auto1.getVelocidadActual(), auto1.isEstadoMovimiento()));
        auto1.acelerar(auto1.getVelocidadActual());
        auto1.frenar(auto1.getVelocidadActual());
        auto1.detener(auto1.getVelocidadActual());
        System.out.println("El estado actual del automovil es "+ auto1.obtenerEstado(auto1.getVelocidadActual(), auto1.isEstadoMovimiento()));
        auto1.obtenerMarca(auto1.getMarca());

    }
}
