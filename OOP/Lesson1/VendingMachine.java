package OOP.Lesson1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {

    Product getProduct(String name); /*Список продуктов*/
}












/*        public VendingMachine() {
            this.productList = initProduct();
            this.money = 0;
        }

        private List<Product> productList;

        private Integer money;

        public Product getProduct(String name) {
            for (Product product : productList) {
                if (product.getName().equals(name)) {
                    money += product.getPrice();
                    return product;
                }
            }
            return null;
        }

        Private List<Product> initProduct() {
            List<Product> products = new ArrayList<>();
            products.add(new Product(name: "Молоко", Price: 100));
            products.add(new Product(name: "Вода", Price: 50));
            products.add(new Product(name: "Кириешки", Price: 30));
            return products;
        }
    }*/
