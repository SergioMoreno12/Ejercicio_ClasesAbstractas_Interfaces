public class AutobusHibrido extends Vehiculo implements Electrico, Combustion {

    public AutobusHibrido() {
    }

    public AutobusHibrido(String modelo, int autonomia) {
        super(modelo, autonomia);
    }

    @Override
    public String toString() {
        return "AutobusHibrido{" +
                "modelo='" + modelo + '\'' +
                ", autonomia=" + autonomia +
                '}';
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el autobús híbrido " + modelo);
    }

    @Override
    public void cargarBateria() {
        System.out.println("Cargando la batería del autobús híbrido " + modelo);
    }

    @Override
    public void llenarTanque() {
        System.out.println("Llenando el tanque del autobús híbrido " + modelo);
    }
}
