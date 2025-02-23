import java.util.Scanner;

class Donor{
private int studentId;
    private String name,gender,bloodGroup;
    private int age;
    private long phoneNumber;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setBloodGroup(String bloodGroup){
        this.bloodGroup=bloodGroup;
    }
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getBloodGroup(){
        return bloodGroup;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }

    public Donor(String name,int age,String gender,String bloodGroup,long phoneNumber){
        setName(name);
        setAge(age);
        setGender(gender);
        setBloodGroup(bloodGroup);
        setPhoneNumber(phoneNumber);
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Gender:"+getGender());
        System.out.println("Blood Group:"+getBloodGroup());
        System.out.println("Phone number:"+getPhoneNumber());
    }
}
public class Donordetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String n = sc.nextLine();
        System.out.println("Enter age:");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter gender:");
        String g = sc.nextLine();
        System.out.println("Enter blood group:");
        String b = sc.nextLine();
        System.out.println("Enter phone number:");
        long p = sc.nextLong();
        Donor d = new Donor(n,a,g,b,p);
    }}