package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Product> list1 = new ArrayList<>();
        for (Product product : getProducts()) {
            if (product.getProductPrice() > 25000f) {
                list1.add(product);
            }
        }
        for (Product product : list1) {
            System.out.println(product);
        }
        System.out.println("**************************************************************************");
        //Using StreamAPI
        List<Product> list2 = getProducts().stream()
                .filter((product) -> product.getProductPrice() > 25000f)
                .collect(Collectors.toList());
        list2.forEach(System.out::println);
        //another StreamAPI method
//        getProducts()
//                .stream().filter((product) -> product.getProductPrice() > 25000f)
//                .forEach(System.out::println);
    }

    private static List<Product> getProducts() {
        ArrayList<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1, "HP laptop", 39699f));
        productsList.add(new Product(2, "Dell Laptop", 44239f));
        productsList.add(new Product(3, "Lenovo Laptop", 45999f));
        productsList.add(new Product(4, "Evita  Laptop", 28899f));
        productsList.add(new Product(5, " Xiaomi Laptop", 51409f));
        return productsList;
    }
}

class Product {
    private int productId;
    private String productName;
    private float productPrice;

    public Product(int productId, String productName, float productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "streamapi.Product{" + "productId=" + productId + ", productName='" + productName + '\'' + ", productPrice=" +
                productPrice + '}';
    }
}