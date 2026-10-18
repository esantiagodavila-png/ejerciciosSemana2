package logica;

public class Sensor {
    public String nombre;
    public double lectura;
    String tipo;
    String unidad;


    public void showInfo(){
        System.out.println("El nombre del lector es: " + nombre);
        System.out.println("El lector tuvo una lectura de: " + lectura);
        System.out.println("Es del tipo: " + tipo);
        System.out.println("La unidad del lector es: " + unidad);
    }

    public void newRead(double newRead){
        lectura = newRead;
    }

    void showRead(){
        System.out.println("El lector tiene una lectura de: " + lectura);
    }

    void rebootRead(){
        lectura = 0;
        System.out.println("Lectura reiniciada a 0");
    }
}
