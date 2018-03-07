package xyz.thanhhaidev.addstudentoop;

/**
 * Created by ThanhHaiDev on 07-Mar-18.
 */

public class Student {
    private int student_id;
    private String student_name;
    private static int count = 0;

    public Student() {
        student_name = "";
        student_id = 0;
    }

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        count++;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getInfo() {
        return "ID: " + this.student_id + " - Name: " + this.student_name;
    }
}
