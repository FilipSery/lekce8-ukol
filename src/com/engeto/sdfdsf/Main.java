package com.engeto.sdfdsf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ClassRoom trida1 = new ClassRoom("A", "4", new Teacher("Jan", "Dobrovolný"));
        Student karel = new Student("Karel", "Janík",2005, 1, "ID120");
        Student Adam = new Student("Adam", "Novotný", 2005,2,"ID132");
        Student Alice = new Student("Alice", "Novotná", 2004, 3, "ID162");

        trida1.addStudentToList(karel);
        trida1.addStudentToList(Adam);
        trida1.addStudentToList(Alice);

        System.out.println("Výpis 1:");
        System.out.println(trida1.getClassInfo1());

        System.out.println("\nVýpis 2:");
        System.out.println(trida1.getClassInfo2());

        System.out.println("\n --------------------\n3. Vlastní formát - zápis do souboru");
        try {
        trida1.saveClassInfoToFile("Class-File.txt");
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
