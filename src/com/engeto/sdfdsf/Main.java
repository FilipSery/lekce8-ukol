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

        trida1.addStudentsToList(karel);
        trida1.addStudentsToList(Adam);
        trida1.addStudentsToList(Alice);

        System.out.println("Výpis 1:");
        System.out.println(trida1.getClassInfo1());

        System.out.println("\nVýpis 2:");
        System.out.println(trida1.getClassInfo2());


    }
}
