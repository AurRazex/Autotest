package OOP.Lesson1;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    private final List<Product> productList;

    private int money;

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int temp) {
        for (Product product : productList) {
            if (product instanceof HotDrink) {
                if (product.getName().equals(name) && ((HotDrink) product).getTemp() == temp) {
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }
}