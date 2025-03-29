public class CarroElectrico extends Vehiculo implements Electrico {

    public CarroElectrico() {
    }

    public CarroElectrico(String modelo, int autonomia) {
        super(modelo, autonomia);
    }

    @Override
    public String toString() {
        return "CarroElectrico{" +
                "modelo='" + modelo + '\'' +
                ", autonomia=" + autonomia +
                '}';
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el carro eléctrico " + modelo);
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando la batería del carro eléctrico " + modelo);
    }
}