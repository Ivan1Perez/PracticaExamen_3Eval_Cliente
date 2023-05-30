package es.ieslavereda.practicaexamen_3eval_cliente;

import java.io.Serializable;

public class Fruit implements Serializable {

    private String name;
    private String price;
    private String saleDay;
    private int image;

    public Fruit(String name, String price, String saleDay, int image) {
        this.name = name;
        this.price = price;
        this.saleDay = saleDay;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSaleDay() {
        return saleDay;
    }

    public void setSaleDay(String saleDay) {
        this.saleDay = saleDay;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
