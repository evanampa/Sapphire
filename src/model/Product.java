package model;

public class Product {
    private int id;
    private String name;
    private String description;
    private String category;
    private float price;
    private int stock;
    private String image_url;
    private boolean active;

    public void setProduct(int id,String name,String description,String category,float price,int stock,String image_url,boolean active){
        this.id=id;
        this.name=name;
        this.description=description;
        this.category=category;
        this.price=price;
        this.stock=stock;
        this.image_url=image_url;
        this.active=active;
    }
}
