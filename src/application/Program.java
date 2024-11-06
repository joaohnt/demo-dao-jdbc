package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        System.out.println(obj);
        Seller seller = new Seller(10, "Aeri Uchinaga", "aeri@gmail.com", new Date(), 3000.0, obj);
        System.out.println(seller);
    }
}
