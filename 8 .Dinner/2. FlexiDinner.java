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
abstract class FlexiMenu {

    private String soup;
    private String starter;
    private String main1;
    private String main2;
    private String bread;
    private String rice;
    private String dessert;

    public static Scanner scanner = new Scanner(System.in);

    public FlexiMenu(String hotelName) {
        System.out.println("\n\nWelcome to " + hotelName + ". Enter Menu Details.");

        System.out.println("Enter Soup name: ");
        String soup_ = soup();

        System.out.println("Enter starter name");
        String starter_ = starter();

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

    public abstract String soup();

    public abstract String starter();

    public void setSoup(String soup) {
        this.soup = soup;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    @Override
    public String toString() {
        return "FlexiMenu{" + "soup=" + soup + ", starter=" + starter + ", main1=" + main1 + ", main2=" + main2 + ", bread=" + bread + ", rice=" + rice + ", dessert=" + dessert + '}';
    }
}

class HotelVangiFlexi extends FlexiMenu {

    public HotelVangiFlexi(String hotelName) {
        super(hotelName);
    }

    @Override
    public String soup() {
        String soupName = scanner.next();
        return soupName;
    }

    @Override
    public String starter() {
        String starterName = scanner.next();
        return starterName;
    }

}

class HotelBlueLagoonFlexi extends FlexiMenu {

    public HotelBlueLagoonFlexi(String hotelName) {
        super(hotelName);
    }

    @Override
    public String soup() {
        String soupName = scanner.next();
        return soupName;
    }

    @Override
    public String starter() {
        String starterName = scanner.next();
        return starterName;
    }
}

public class FlexiDinner {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HotelVangiFlexi hotelVangiFlexi = new HotelVangiFlexi("VANGI");

        HotelBlueLagoonFlexi hotelBlueLagoonFlexi = new HotelBlueLagoonFlexi("BLUE LAGOON");

        System.out.println("Hotel vangi is serving: " + hotelVangiFlexi);
        System.out.println("Hotel BlueLagoon is serving: " + hotelBlueLagoonFlexi);
    }
}
