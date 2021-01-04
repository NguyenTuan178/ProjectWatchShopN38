package bean;

public class Product {
    private String id;
    private String name;
    private String saleLB;
    private String img1;
    private String img2;
    private long price;
    private long priceSale;


    public Product() {

    }


    public Product(String id, String name, String saleLB, String img1, String img2, long price, long priceSale) {
        super();
        this.id = id;
        this.name = name;
        this.saleLB = saleLB;
        this.img1 = img1;
        this.img2 = img2;
        this.price = price;
        this.priceSale = priceSale;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSaleLB() {
        return saleLB;
    }


    public void setSaleLB(String saleLB) {
        this.saleLB = saleLB;
    }


    public String getImg1() {
        return img1;
    }


    public void setImg1(String img1) {
        this.img1 = img1;
    }


    public String getImg2() {
        return img2;
    }


    public void setImg2(String img2) {
        this.img2 = img2;
    }


    public long getPrice() {
        return price;
    }


    public void setPrice(long price) {
        this.price = price;
    }


    public long getPriceSale() {
        return priceSale;
    }


    public void setPriceSale(long priceSale) {
        this.priceSale = priceSale;
    }


}