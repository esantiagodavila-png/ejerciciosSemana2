package logica;

public class TiendaDigital {

    public String name;
    public String price;
    String category;
    boolean disponible;


    public void showInfo(){
        String isDisponible = disponible ? "Esta disponible" : "No esta disponible";
        System.out.println("----Datos del producto----");
        System.out.println("Nombre del producto: " + name);
        System.out.println("Categoria del producto: " + category);
        System.out.println(isDisponible);
        System.out.println("Su precio es de: " + price);
    }

    public void changeDisponibility(){
        disponible = !disponible;
    }

    void showPrice (){
        System.out.println("El precio es de: " + price);
    }




}
