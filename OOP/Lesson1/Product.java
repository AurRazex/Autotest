package OOP.Lesson1;

public abstract class Product {

    public Product(String name, int price) {
        this.name = name; /*Название продукта*/
        this.price = price; /*Цена продукта*/
    }

    private String name;

    private  int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
