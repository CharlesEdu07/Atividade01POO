package br.com.charlesedu.app;

import java.util.Locale;

import br.com.charlesedu.entities.Item;
import br.com.charlesedu.entities.Product;
import br.com.charlesedu.entities.Sale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Product product = new Product("TV", 900.00);
        Item item = new Item(product, 3);
        Sale sale = new Sale("01/01/2020");

        sale.addItem(item);

        Product product2 = new Product("Notebook", 1200.00);
        Item item2 = new Item(product2, 2);
        sale.addItem(item2);

        System.out.println(sale.total());
    }
}
