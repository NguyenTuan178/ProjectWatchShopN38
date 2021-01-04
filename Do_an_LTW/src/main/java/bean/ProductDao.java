package bean;

public class ProductDao {
    private String id;
    private String name;
    private String saleLB;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private String img6;
    private String img7;
    private String img8;
    private long price;
    private long priceSale;

    public ProductDao() {

    }
    public ProductDao(String id, String name, String saleLB, String img1, String img2, String img3, String img4,
                      String img5, String img6, String img7, String img8, long price, long priceSale) {
        super();
        this.id = id;
        this.name = name;
        this.saleLB = saleLB;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.img6 = img6;
        this.img7 = img7;
        this.img8 = img8;
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
    public String getImg3() {
        return img3;
    }
    public void setImg3(String img3) {
        this.img3 = img3;
    }
    public String getImg4() {
        return img4;
    }
    public void setImg4(String img4) {
        this.img4 = img4;
    }
    public String getImg5() {
        return img5;
    }
    public void setImg5(String img5) {
        this.img5 = img5;
    }
    public String getImg6() {
        return img6;
    }
    public void setImg6(String img6) {
        this.img6 = img6;
    }
    public String getImg7() {
        return img7;
    }
    public void setImg7(String img7) {
        this.img7 = img7;
    }
    public String getImg8() {
        return img8;
    }
    public void setImg8(String img8) {
        this.img8 = img8;
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

