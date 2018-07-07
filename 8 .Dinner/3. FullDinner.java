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
interface MenuFull {

    void serveSoup();

    void serveStarter();

    void serveMain1();

    void serveMain2();

    void serveBread();

    void serveDessert();
}

class HotelVangiFull implements MenuFull {

    String soup = "";
    String starter = "";
    String main1 = "";
    String main2 = "";
    String bread = "";
    String rice = "";
    String dessert = "";

    Scanner scanner = new Scanner(System.in);

    public void serveSoup() {
        System.out.println("Enter soup name: ");
        this.soup = scanner.next();

    }

    public void serveStarter() {
        System.out.println("Enter starter name: ");
        this.starter = scanner.next();
    }

    public void serveMain1() {
        System.out.println("Enter main1 name: ");
        this.main1 = scanner.next();
    }

    public void serveMain2() {
        System.out.println("Enter main2 name: ");
        this.main2 = scanner.next();
    }

    public void serveBread() {
        System.out.println("Enter bread type: ");
        this.bread = scanner.next();
    }

    public void serveDessert() {
        System.out.println("Enter dessert name: ");
        this.dessert = scanner.next();
    }

    @Override
    public String toString() {
        return "HotelVangiFull{" + "soup=" + soup + ", starter=" + starter + ", main1=" + main1 + ", main2=" + main2 + ", bread=" + bread + ", rice=" + rice + ", dessert=" + dessert + '}';
    }

}

class HotelBlueLagoonFull implements MenuFull {

    String soup = "";
    String starter = "";
    String main1 = "";
    String main2 = "";
    String bread = "";
    String rice = "";
    String dessert = "";

    Scanner scanner = new Scanner(System.in);

    public void serveSoup() {
        System.out.println("Enter soup name: ");
        this.soup = scanner.next();

    }

    public void serveStarter() {
        System.out.println("Enter starter name: ");
        this.starter = scanner.next();
    }

    public void serveMain1() {
        System.out.println("Enter main1 name: ");
        this.main1 = scanner.next();
    }

    public void serveMain2() {
        System.out.println("Enter main2 name: ");
        this.main2 = scanner.next();
    }

    public void serveBread() {
        System.out.println("Enter bread type: ");
        this.bread = scanner.next();
    }

    public void serveDessert() {
        System.out.println("Enter dessert name: ");
        this.dessert = scanner.next();
    }

    @Override
    public String toString() {
        return "HotelBlueLagoonFull{" + "soup=" + soup + ", starter=" + starter + ", main1=" + main1 + ", main2=" + main2 + ", bread=" + bread + ", rice=" + rice + ", dessert=" + dessert + '}';
    }
}

public class FullDinner {

    public static void main(String[] args) {
        HotelVangiFull hotelVangiFull = new HotelVangiFull();
        HotelBlueLagoonFull hotelBlueLagoonFull = new HotelBlueLagoonFull();

        hotelVangiFull.serveSoup();
        hotelVangiFull.serveStarter();
        hotelVangiFull.serveMain1();
        hotelVangiFull.serveMain2();
        hotelVangiFull.serveBread();
        hotelVangiFull.serveDessert();

        hotelBlueLagoonFull.serveSoup();
        hotelBlueLagoonFull.serveStarter();
        hotelBlueLagoonFull.serveMain1();
        hotelBlueLagoonFull.serveMain2();
        hotelBlueLagoonFull.serveBread();
        hotelBlueLagoonFull.serveDessert();

        System.out.println("Menu of VANGI" + hotelVangiFull);
        System.out.println("Menu of Blue Lagoon" + hotelBlueLagoonFull);
    }
}
