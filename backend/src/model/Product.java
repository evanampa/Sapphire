package model;

public class Product {
    private String name;
    private String description;
    private String category;
    private float price;
    private int stock;
    private String image_url;
    private boolean active;

    public Product(String name,String description,String category,float price,int stock,String image_url,boolean active){
        this.name=name;
        this.description=description;
        this.category=category;
        this.price=price;
        this.stock=stock;
        this.image_url=image_url;
        this.active=active;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getCategory(){
        return this.category;
    }

    public float getPrice(){
        return this.price;
    }

    public int getStock(){
        return this.stock;
    }

    public String getImage_url(){
        return this.image_url;
    }

    public boolean getActive(){
        return this.active;
    }
}
