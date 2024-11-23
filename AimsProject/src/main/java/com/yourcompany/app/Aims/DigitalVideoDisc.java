package com.yourcompany.app.Aims;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private float price;
    private String image;
    private String detail;
    private String director;
    private int length;
    private String demoLink;
    private static int nbDigitalVideoDiscs = 0;
    private int id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
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

    public int getId() {
        return id;
    }


    //Constructor

    public DigitalVideoDisc(String title, String category, float price, String image, String detail, String director, int length, String demoLink) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.image = image;
        this.detail = detail;
        this.director = director;
        this.length = length;
        this.demoLink = demoLink;
        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title){
        this.title = title;
        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float price) {
        this.category = category;
        this.title = title;
        this.length = length;
        this.price = price;
        this.director = director;
        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }

    public DigitalVideoDisc(String title, String category, float price) {
        this.category = category;
        this.title = title;
        this.price = price;
        this.id = nbDigitalVideoDiscs;
        nbDigitalVideoDiscs++;
    }


}

