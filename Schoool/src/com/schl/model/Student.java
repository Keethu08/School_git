package com.schl.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Simple Student model used by the application.
 */
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private LocalDate enrollmentDate;

    // ...existing code...

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String email, int age, LocalDate enrollmentDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.enrollmentDate = enrollmentDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    /**
     * Returns a user-friendly single-line representation of the student.
     * Example: "ID: 12 - John Doe (age 20) - john@example.com - Enrolled: 2024-09-01"
     */
    public String toDisplayString() {
        String name = ((firstName != null ? firstName : "") + " " + (lastName != null ? lastName : "")).trim();
        String emailPart = (email != null && !email.isEmpty()) ? email : "-";
        String enrolled = "-";
        if (enrollmentDate != null) {
            enrolled = enrollmentDate.format(DateTimeFormatter.ISO_DATE);
        }
        String agePart = (age > 0) ? "(age " + age + ")" : "";
        return "ID: " + id + " - " + (name.isEmpty() ? "<no name>" : name) + " " + agePart + " - " + emailPart + " - Enrolled: " + enrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", enrollmentDate=" + enrollmentDate +
                '}';
    }
}
