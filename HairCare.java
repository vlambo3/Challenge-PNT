package design;

public class HairCare extends Product {
    public HairCare(String name, String unit, double capacity, double price) {
        super(name, unit, capacity, price);
    }

    @Override
    public String toString() {
        return ("Nombre: " + this.getName() + " /// "
                + "Contenido: " + this.getCapacity().intValue() + "ml" + " /// "
                + "Precio: " + "$" + this.getPrice().intValue());
    }
}
