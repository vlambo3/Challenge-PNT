package design;

public class Fruit extends Product {
    public Fruit(String name, String unit, double capacity, double price) {
        super(name, unit, capacity, price);
    }

    @Override
    public String toString() {
        return ("Nombre: " + this.getName() + " /// "
                + "Precio: " + "$" + this.getPrice().intValue() + " /// "
                + "Unidad de venta: " + this.getUnit());
    }
}
