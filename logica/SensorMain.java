package logica;

public class SensorMain {
    public static void main(String[] args) {

        Sensor lector1 = new Sensor();
        lector1.nombre = "Sensor de temperatura";
        lector1.lectura = 25.5;
        lector1.tipo = "Temperatura";
        lector1.unidad = "°C";

        Sensor lector2 = new Sensor();
        lector2.nombre = "Sensor de presión";
        lector2.lectura = 1013.25;
        lector2.tipo = "Presión atmosférica";
        lector2.unidad = "hPa";

        Sensor lector3 = new Sensor();
        lector3.nombre = "Sensor de humedad";
        lector3.lectura = 65.0;
        lector3.tipo = "Humedad relativa";
        lector3.unidad = "%";

        lector1.showInfo();
        lector1.newRead(20.6);
        lector1.showRead();


        lector2.showInfo();
        lector2.rebootRead();
        lector2.showRead();

        lector3.showInfo();

    }
}
