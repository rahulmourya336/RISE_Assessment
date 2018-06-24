/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author RadioactiveScript
 */
public class Student {

    private String name;
    private String gender;
    private double cpi;
    private float height;

    public Student(String name, String gender, double cpi, float height) {
        this.name = name;
        this.gender = gender;
        this.cpi = cpi;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getCpi() {
        return cpi;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gender=" + gender + ", cpi=" + cpi + ", height=" + height + '}';
    }

    public static int returnMaxIndex(List<Integer> array, Student[] s) {
        int maxIndex = 0;
        for (int array1 = 0; array1 < array.size(); array1++) {
            for (int array2 = 0; array2 < array.size() - 1; array2++) {
                if (s[array.get(array2)].getCpi() >= s[array.get(array2 + 1)].getCpi()) {
                    maxIndex = array.get(array2);
                } else {
                    maxIndex = array.get(array2 + 1);
                }
            }
        }
        return maxIndex;
    }

    public static void startsWith(Student[] students, int limit) {
        for (int loop = 0; loop < limit; loop++) {
            if (students[loop].getName().startsWith("S")) {
                System.out.println("Name: " + students[loop]
                        .getName() + " CPI: " + students[loop].getCpi());
            }
        }
    }

    public static int[] returnMaxIndex(Student[] array) {
        int[] maxIndexes = new int[array.length];
        int index = 0;
        for (int array1 = 0; array1 < array.length; array1++) {
            for (int array2 = 0; array2 < array.length - 1; array2++) {
                if (array[array2].getHeight() < array[array2 + 1].getHeight()) {
                    maxIndexes[index] = array2;
                } else {
                    maxIndexes[index] = array2 + 1;
                }
                index++;
            }
        }
        return maxIndexes;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        List<Integer> MaleIndex = new ArrayList<>();
        List<Integer> FemaleIndex = new ArrayList<>();

        double AverageCpi = 0.0;

        System.out.println("How Many student? ");
        int limit = get.nextInt();
        Student[] students = new Student[limit];
        int[] heightIndex = new int[limit];
        int maxMaleIndex = 0;
        int maxFemaleIndex = 0;

        //Get values from user
        for (int loop = 0; loop < limit; loop++) {

            System.out.println("Name: ");
            String name = get.next();

            System.out.println("Gender: ");
            String gender = get.next();
            gender = gender.toUpperCase();

            System.out.println("CPI: ");
            double CPI = get.nextDouble();

            System.out.println("Height: ");
            float height = get.nextFloat();

            students[loop] = new Student(name, gender, CPI, height);

            if (gender.toUpperCase().startsWith("M")) {
                MaleIndex.add(loop);
            } else {
                FemaleIndex.add(loop);
            }
        }

        // Average of student CPI
        for (int loop = 0; loop < limit; loop++) {
            AverageCpi += students[loop].getCpi();
        }
        System.out.println("\nAverage CPI: " + AverageCpi / limit);

        //Highest Scorer gender wise
        maxMaleIndex = returnMaxIndex(MaleIndex, students);
        maxFemaleIndex = returnMaxIndex(FemaleIndex, students);

        System.out.println("\nHighest Male scorer: " + students[maxMaleIndex]);
        System.out.println("Highest Female scorer: " + students[maxFemaleIndex]);

        //Sort them based on heights - Pending
//        int tempIndex = 0;
//        for (int first = 0; first < limit - 1; first++) {
//            for (int next = 0; next < limit - 1; next++) {
//                System.out.println("next: " + next + " Next+1:" + (next + 1) + "tempIndex :" + tempIndex);
//                if (students[next].getHeight() >= students[(next + 1)].getHeight()) {
//                    heightIndex[tempIndex] = next;
//                } else {
//                    heightIndex[tempIndex] = (next + 1);
//                }
//                tempIndex++;
//            }
//        }
//        System.out.println("\n");
//        int[] indexes = new int[limit];
//        indexes = returnMaxIndex(students);
//        for(int loop = 0; loop < indexes.length; loop++){
//            System.out.println(students[indexes[loop]]);
//        }

        System.out.println("\n-- Sorting based on height Pending -- ");

        System.out.println("\nStudent CPIs whoes name starts with \"S\": ");
        //CPI of those students whose name starts with "S"
        startsWith(students, limit);

    }
}
