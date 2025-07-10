package HospitalManagement;
import java.util.*;
class Patient{
    private static int idGiver=1;
    private int id;
    private String name;
    private int age;
    private char gender;
    Patient(String name,int age,char gender){
        this.id=idGiver++;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public String toString(){
        return "Patient ID: "+id+" Name: "+name+" Gender: "+gender+" Age: "+age;
    }
    public void setId(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter your Id:");
        id=s.nextInt();

    }
    public void setName(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter your name:");
        name=s.nextLine();
    }
    public void setAge(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age:");
        age=s.nextInt();
    }
    public void setGender(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your gender:");
        gender=s.next().charAt(0);
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }


}
