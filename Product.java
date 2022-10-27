package design;

public class Product implements Comparable<Product>{
    private String name;
    private String unit;
    private Double capacity;
    private Double price;

    public Product(String name, String unit, Double capacity, Double price) {
        this.name = name;
        this.unit = unit;
        this.capacity = capacity;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int compareTo(Product product) {
        return Double.compare(this.getPrice(), product.getPrice());
    }
}
