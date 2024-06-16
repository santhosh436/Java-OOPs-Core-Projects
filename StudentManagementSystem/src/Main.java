import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of Students to Enroll:");
        int nofStd = in.nextInt();
        Student[] students = new Student[nofStd];
        for(int i=0;i<nofStd;i++ ){
            students[i] = new Student();
            students[i].setStudentId();
            students[i].setEnrollSubjects();
            students[i].payTutionFee();
            System.out.println("-----------------------------------------------------------------------");
        }
        for (int i=0;i<nofStd;i++){
            students[i].studentInfo();
        }
    }
}