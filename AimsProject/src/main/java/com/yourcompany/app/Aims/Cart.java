package com.yourcompany.app.Aims;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED =20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println( disc.getTitle());
        }
    }

    /*public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList){
        for (DigitalVideoDisc digitalVideoDisc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = digitalVideoDisc;
                qtyOrdered++;
                System.out.println( digitalVideoDisc.getTitle());
            } else {
                System.out.println("Can't add DVD " + digitalVideoDisc.getTitle() + " because qtyOrder > " + MAX_NUMBERS_ORDERED);
            }
        }
    }*/
    public void addDigitalVideoDisc( DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc digitalVideoDisc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = digitalVideoDisc;
                qtyOrdered++;
                System.out.println( digitalVideoDisc.getTitle());
            } else {
                System.out.println("Can't add DVD " + digitalVideoDisc.getTitle() + " because qtyOrder > " + MAX_NUMBERS_ORDERED);
            }
        }
    }


    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (disc == itemsOrdered[i]){
                for (int j = i; j < qtyOrdered -1; j++){
                    itemsOrdered[j] = itemsOrdered[j+1];
                }
                qtyOrdered--;
                break;
            }
        }

    }

    public int totalPrice() {
        int total = 0;
        for(int i = 0; i < qtyOrdered; i++) total += itemsOrdered[i].getPrice();
        return total;
    }


}