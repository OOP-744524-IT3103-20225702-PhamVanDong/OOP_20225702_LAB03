package com.yourcompany.app.Aims;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private int price;
    private String image;
    private String detail;
    private String director;
    private int length;
    private String demoLink;

    //Getter and Setter
    public String getDemoLink() {
        return demoLink;
    }

    public void setDemoLink(String demoLink) {
        this.demoLink = demoLink;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
//Constructor

    public DigitalVideoDisc(String title, String category, int price, String image, String detail, String director, int length, String demoLink) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.image = image;
        this.detail = detail;
        this.director = director;
        this.length = length;
        this.demoLink = demoLink;
    }

}

