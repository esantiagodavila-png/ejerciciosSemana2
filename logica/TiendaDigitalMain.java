package logica;

public class TiendaDigitalMain {

    public  static void  main(String[] args){
        TiendaDigital producto1 = new TiendaDigital();
        producto1.name = "Laptop Lenovo";
        producto1.price = "850";
        producto1.category = "Computadoras";
        producto1.disponible = true;

        TiendaDigital producto2 = new TiendaDigital();
        producto2.name = "Samsung Galaxy S25";
        producto2.price = "900";
        producto2.category = "Celulares";
        producto2.disponible = true;

        TiendaDigital producto3 = new TiendaDigital();
        producto3.name = "Audifonos Sony";
        producto3.price = "120";
        producto3.category = "Audio";
        producto3.disponible = false;

        producto1.showInfo();
        producto1.showPrice();

        producto2.showInfo();
        producto2.showPrice();

        producto3.changeDisponibility();
        producto3.showInfo();
        producto3.showPrice();
    }
}
