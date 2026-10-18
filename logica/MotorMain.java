package logica;

public class MotorMain {
    public static void main(String[] args) {

        Motor motor1 = new Motor();
        motor1.nombre = "Motor eléctrico";
        motor1.potencia = 1500;
        motor1.velocidad = 1800;
        motor1.encendido = true;

        Motor motor2 = new Motor();
        motor2.nombre = "Motor de combustión";
        motor2.potencia = 2500;
        motor2.velocidad = 3000;
        motor2.encendido = false;

        Motor motor3 = new Motor();
        motor3.nombre = "Motor industrial";
        motor3.potencia = 5000;
        motor3.velocidad = 1500;
        motor3.encendido = true;

        motor1.showInfo();
        motor1.turnDown();
        motor1.showInfo();
        motor1.turnOn();
        motor1.showInfo();
        motor2.showInfo();
    }
}
