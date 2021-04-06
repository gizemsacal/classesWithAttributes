public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.setname("car");
        product.setId(57);
        product.setdescription("FırFır");
        product.setprice(29.000);
        product.setstockAmount(3);

        ProductManager ProductManager = new ProductManager();
        ProductManager.Add(product);
        System.out.println(product.getkod());

    }
}
