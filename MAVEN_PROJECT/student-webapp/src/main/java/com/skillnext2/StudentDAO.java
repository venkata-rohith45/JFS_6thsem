package com.skillnext2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

    public static void save(Student student) {

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/skillnext2_db",
                "root",
                "root"
            );

            // SQL Query
            String sql = "INSERT INTO student(name, sem, department) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            // Set values
            ps.setString(1, student.getName());
            ps.setInt(2, student.getSem());
            ps.setString(3, student.getDepartment());

            // Execute
            ps.executeUpdate();

            con.close();

            System.out.println("Student saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
