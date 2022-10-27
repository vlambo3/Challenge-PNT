package design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void showProducts() {

        products.stream().forEach(System.out::println);
    }

    public void showPriceStatics() {
        Collections.sort(products);
        showMostExpensiveProduct();
        showMostCheaperProduct();
    }

    private void showMostExpensiveProduct() {
        System.out.println("El producto más caro: " + products.get(products.size() - 1).getName());
    }

    private void showMostCheaperProduct() {
        System.out.println("El producto más barato: " + products.get(0).getName());
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }
}
