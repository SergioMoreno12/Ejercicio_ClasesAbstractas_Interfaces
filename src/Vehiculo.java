abstract class Vehiculo {
    protected String modelo;
    protected int autonomia;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, int autonomia) {
        this.modelo = modelo;
        this.autonomia = autonomia;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", autonomia=" + autonomia +
                '}';
    }

    public abstract void encender();

    public void mostrarInformacion() {
        System.out.println("Modelo: " + modelo + ", Autonomía: " + autonomia + " km");
    }
}

// Interface para vehículos eléctricos
interface Electrico {
    void cargarBateria();
}

// Interface para vehículos de combustión
interface Combustion {
    void llenarTanque();
}
