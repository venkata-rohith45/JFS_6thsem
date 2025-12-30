package com.skillnext2;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student(
                "Mayuri",
                5,
                "Computer Science"
        );

        session.persist(student);

        tx.commit();
        session.close();

        System.out.println("Student inserted successfully!");
    }
}
