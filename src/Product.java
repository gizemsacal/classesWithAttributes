public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    /* yukarıda ürüne ait bilgileri verdik.(description=açıklama,
    price=fiyat, stockAmount= Stok Miktarı*/
    //getter bloğu
    public int getId() {
        return id;
    }

    //setter bloğu
    public void setId(int id) {
        id = id;
        //this içerisinde bulunduğum class demek.
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public int getstockAmount() {
        return stockAmount;
    }

    public void setstockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getrenk() {
        return renk;
    }

    public void setrenk(String renk) {
        this.renk = renk;
    }

    public String getkod() {
        return this.name.substring(0,1)+id;
    }

    }

