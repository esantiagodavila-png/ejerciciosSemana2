package logica;

public class Motor {

    public String nombre;
    public double potencia;
    double velocidad;
    boolean encendido;

    public void turnOn(){
        if(!encendido){
            encendido = true;
        }
        System.out.println("Motor encendido");
    }

    public void showInfo(){
        String itsOn = encendido ? "Está encendido" : "Está apagado";
        System.out.println("Nombre del motor: " + nombre);
        System.out.println("Potencia: " + potencia);
        System.out.println("Velocidad del motor: " + velocidad);
        System.out.println(itsOn);
    }

    void  turnDown(){
        if(encendido){
            encendido = false;
        }
        System.out.println("Motor apagado");
    }


}
