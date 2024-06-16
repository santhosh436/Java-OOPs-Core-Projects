import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    private int gradeYear;
    private int studentId;
    private String enrollSubjects= " ";
    private int totalTutionFee;
    private int amount;
    private int paidTutionFee;
    private int costOfSubject = 600;
    private int Id  = 2000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Student Firstname:");
        //student name and year
        //creating student id
        //enrolled subjects
        //tution fee
        //paid tution fee
        //status
        this.firstName = in.nextLine();
        System.out.println("Enter the Student Lastname:");
        this.lastName = in.nextLine();
        System.out.println("1.fresher \n2.sophmere\n3.junior\n4.senior");
        gradeYear = in.nextInt();
        System.out.println(firstName +" "+ lastName +" "+gradeYear);
    }

    public void setStudentId(){
        Id++;
        this.studentId = gradeYear+Id;
        System.out.println(studentId);
    }
    public void setEnrollSubjects(){
        Scanner in = new Scanner(System.in);
        String newSubject;
        do{
            System.out.println("Enter the subject to Enroll(Q to quiit):");
            newSubject = in.nextLine();
            if (!newSubject.equals("q")) {

                enrollSubjects = enrollSubjects+" \n"+ newSubject;
                totalTutionFee = totalTutionFee +costOfSubject;
            }
            else {
                System.out.println("Break!");
                break;
            }
        }while (1 != 0);
        System.out.println();
        System.out.println("Enrolled Subjects:"+enrollSubjects);
        System.out.println("Total tution fee:"+totalTutionFee);

    }
    public void payTutionFee(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount to pay the fee:");
        do {
            amount = in.nextInt();
            if (totalTutionFee<amount){
                System.out.println("invalid amount!");
                System.out.println("Enter the correct amount:");
            }
            else {
                paidTutionFee = totalTutionFee - amount;
                break;
            }
        }while(1 !=0);
        System.out.println("remaining tution fee to pay:"+paidTutionFee);
    }
    public void studentInfo(){
        System.out.println("-------------------------------Student details-------------------------------");
        System.out.println("Student Name:"+firstName+" "+lastName);
        System.out.println("grade year:"+gradeYear);
        System.out.println("Student Id: "+studentId);
        System.out.println("Student Enrolled subjects:"+enrollSubjects);
        System.out.println("Total tution fee:"+totalTutionFee);
        System.out.println("Paid tution fee:"+amount);
        System.out.println("balance tution fee to pay:"+paidTutionFee);
    }
}
