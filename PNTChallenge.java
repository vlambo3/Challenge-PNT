import design.*;

import java.util.ArrayList;
import java.util.List;

public class PNTChallenge {
    private static Store store = new Store();

    public static void main(String[] args) {
        sendProductsToStore(getRandomProducts());
        store.showProducts();
        System.out.println("=============================");
        store.showPriceStatistics();
    }

    public static void sendProductsToStore(List<Product> products) {
        store.addProducts(products);

    }

    public static List<Product> getRandomProducts() {
        List<Product> randomProducts = new ArrayList<>();

        randomProducts.add(new Beverage("Coca-Cola Zero", "Litros", 1.5, 20));
        randomProducts.add(new Beverage("Coca-Cola", "Litros", 1.5, 18));
        randomProducts.add(new HairCare("Shampoo Sedal", "Contenido", 500, 30));
        randomProducts.add(new Fruit("Frutillas", "kilo", 1, 64));

        return randomProducts;

    }
}
