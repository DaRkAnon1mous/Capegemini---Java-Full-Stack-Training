import java.util.Scanner;


class Student{
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setStudentAddress(String studentAddress){
        this.studentAddress=studentAddress;
    }
    public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentAddress(){
        return studentAddress;
    }
    public String getCollegeName(){
        return collegeName;
    }

    public Student(int studentId,String studentName,String studentAddress,String collegeName){
        setStudentId(studentId);
        setStudentName(studentName);
        setStudentAddress(studentAddress);
        setCollegeName(collegeName);
        System.out.println("StudentId:"+getStudentId());
        System.out.println("Student name:"+getStudentName());
        System.out.println("Address:"+getStudentAddress());
        System.out.println("College name:"+getCollegeName());
    }

    public Student(int studentId,String studentName,String studentAddress){
        setStudentId(studentId);
        setStudentName(studentName);
        setStudentAddress(studentAddress);
        setCollegeName("NIT");
        System.out.println("StudentId:"+getStudentId());
        System.out.println("Student name:"+getStudentName());
        System.out.println("Address:"+getStudentAddress());
        System.out.println("College name:"+getCollegeName());
    }
    public void result2(){
        
    }

}





public class Setget_constructor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student's Name:");
        String sname = sc.nextLine();
        System.out.println("Enter Student's address:");
        String saddress = sc.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No):");
        String s;

        while(true){
            try{
            s = sc.nextLine();
            if (s.equalsIgnoreCase("Yes")||s.equalsIgnoreCase("No")){
                break;
            }else{
                System.out.println("Whether the student is from NIT(Yes/No):");
            }
        } catch(Exception e){
                // System.out.println("Please enter a valid number");
                sc.next();
            }
        }
        if(s.equalsIgnoreCase("No")){
            System.out.println("Enter the college name");
            String scname =sc.nextLine();
            Student s1 = new Student(sid, sname, saddress,scname);
        }else{
            Student s2 = new Student(sid, sname, saddress);
        }
 

    }}