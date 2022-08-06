import java.util.*;
public class Pr2_5 {
    void record(String t) {
        System.out.println(t);
    }

    void record(String studentName, char grade) {
        System.out.println("Student name is " + studentName);
        System.out.println("Student grade is " + grade);

    }

    void record(int id, String studentName, char grade) {
        System.out.println("Student ID is " + id);
        System.out.println("Student name is " + studentName);
        System.out.println("Student grade is " + grade);
    }

    public static void main(String[] args) {
        Pr2_5 obj = new Pr2_5();
        obj.record("Record of The students :-");
        System.out.println();
        obj.record("Disha", 'A');
        obj.record(82, "Odedara", 'B');
        System.out.println("\n by 21ce82_Disha");
    }
}