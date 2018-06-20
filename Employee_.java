/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rise;

import java.util.Scanner;

/**
 *
 * @author RadioactiveScript
 */
public class Employee_ {
    
    private final double EXP_GRET_3 = 0.5;
    private final double EXP_LESS_3 = 0.3;
    private final double  IS_FEMALE = 0.2;
    
    private String name;
    private String gender;
    private double salary;
    private float experience;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }
    
       
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many employees: ");
        int counter = scan.nextInt();
        
        Employee_ emp[] = new Employee_[counter];
        
        for(int loop = 0; loop <= counter; loop++){
            System.out.println("Name:  ");
            String name = scan.next();
            emp[loop].setName(name);

            System.out.println("Experience: ");
            float experience = scan.nextFloat();
            emp[loop].setExperience(experience);

            System.out.println("Salary:  ");
            double salary = scan.nextDouble();
            emp[loop].setSalary(salary);

            System.out.println("Gender: ");
            String gender = scan.next();
            emp[loop].setGender(gender);   

        }
        
    }
    
}
