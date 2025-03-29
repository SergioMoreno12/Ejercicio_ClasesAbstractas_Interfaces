public class MotoGasolina extends Vehiculo implements Combustion {

    public MotoGasolina() {
    }

    public MotoGasolina(String modelo, int autonomia) {
        super(modelo, autonomia);
    }

    @Override
    public String toString() {
        return "MotoGasolina{" +
                "modelo='" + modelo + '\'' +
                ", autonomia=" + autonomia +
                '}';
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo la moto a gasolina " + modelo);
    }

    @Override
    public void llenarTanque() {
        System.out.println("Llenando el tanque de la moto " + modelo);
    }
}
