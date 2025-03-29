public class Main {
    public static void main(String[] args) {
        CarroElectrico tesla = new CarroElectrico("Tesla Model 3", 400);
        MotoGasolina yamaha = new MotoGasolina("Yamaha R6", 250);
        AutobusHibrido volvo = new AutobusHibrido("Volvo Híbrido", 600);

        // Prueba del Carro Eléctrico
        tesla.mostrarInformacion();
        tesla.encender();
        tesla.cargarBateria();

        System.out.println();

        // Prueba de la Moto a Gasolina
        yamaha.mostrarInformacion();
        yamaha.encender();
        yamaha.llenarTanque();

        System.out.println();

        // Prueba del Autobús Híbrido
        volvo.mostrarInformacion();
        volvo.encender();
        volvo.cargarBateria();
        volvo.llenarTanque();
    }
}