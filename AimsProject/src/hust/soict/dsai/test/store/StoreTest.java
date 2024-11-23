package dsai.test.store;

import dsai.aims.disc.DigitalVideoDisc;
import dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new cart
        Store store = new Store();

        // Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation",
                "Roger Allers",
                87,
                19.95f);
        store.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction",
                "George Lucas",
                87,
                24.95f);
        store.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation",
                18.99f);
        store.addDigitalVideoDisc(dvd3, dvd2);
        store.removeDigitalVideoDisc(dvd3);
        store.removeDigitalVideoDisc(dvd3);
    }
}