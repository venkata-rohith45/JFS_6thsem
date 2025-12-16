package com.skillnext2;
import java.util.*;
public class App {
    public static void main(String[] args) {
        try {
            StudentDAO dao = new StudentDAO();
            // Add student
            Student s1 = new Student("Vaibhav Ram", 5, "IT");
            dao.addStudent(s1);
            System.out.println("Student Added Successfully!");
            Student s2=new Student("Sumanth", 5, "IT");
            dao.addStudent(s2);
            System.out.println("Student Added Successfully!");
            // Fetch students
            List<Student> students = dao.getAllStudents();
            for (Student s : students) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}