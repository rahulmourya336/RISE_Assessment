/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rise.Dinner;

import java.util.Scanner;

/**
 *
 * @author RadioactiveScript
 */
class Menu {

    private String soup;
    private String starter;
    private String main1;
    private String main2;
    private String bread;
    private String rice;
    private String dessert;

    public static Scanner scanner = new Scanner(System.in);

    public Menu(String hotelName) {
        System.out.println("Welcome to "+ hotelName + ". Enter Menu Details.");
        
        System.out.println("Enter Soup name");
        String soup_ = scanner.next();

        System.out.println("Enter Starter name");
        String starter_ = scanner.next();

        System.out.println("Enter Main_1 name");
        String main1_ = scanner.next();

        System.out.println("Enter Main_2 name");
        String main2_ = scanner.next();

        System.out.println("Enter Rice type");
        String rice_ = scanner.next();

        System.out.println("Enter Bread type");
        String bread_ = scanner.next();

        System.out.println("Enter Dessert");
        String dessert_ = scanner.next();

        this.soup = soup_;
        this.starter = starter_;
        this.main1 = main1_;
        this.main2 = main2_;
        this.bread = bread_;
        this.rice = rice_;
        this.dessert = dessert_;
    }

    @Override
    public String toString() {
        return "Menu{" + "soup=" + soup + ", starter=" + starter + ", main1=" + main1 + ", main2=" + main2 + ", bread=" + bread + ", rice=" + rice + ", dessert=" + dessert + '}';
    }
    

}

class HotelVangi extends Menu {

    public HotelVangi(String hotelName) {
        super(hotelName);
    }
    

}

class HotelBlueLagoon  extends Menu{

    public HotelBlueLagoon(String hotelName) {
        super(hotelName);
    }
    

}

public class PlainDinner {

    public static void main(String[] args) {
        HotelVangi hotelVangi =  new HotelVangi("VANGI");
        
        HotelBlueLagoon hotelBlueLagoon = new HotelBlueLagoon("BLUE LAGOON");
        
        System.out.println("Hotel vangi is serving: " + hotelVangi);
        System.out.println("Hotel BlueLagoon is serving: " + hotelBlueLagoon);
    }

}
