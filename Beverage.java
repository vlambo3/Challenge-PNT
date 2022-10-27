package design;

public class Beverage extends Product {
    public Beverage(String name, String unit, double capacity, double price) {

        super(name, unit, capacity, price);
    }

    @Override
    public String toString() {
        return ("Nombre: " + this.getName() + " /// "
                + this.getUnit() + "Litros: " + this.getCapacity() + " /// "
                + "Precio: " + "$" + this.getPrice().intValue());
    }
}
