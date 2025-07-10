package HospitalManagement;

public class Doctor {
    private static int docID=100;
    private int id;
    private String name;
    private String speciality;

    Doctor(String name,String speciality){
        this.id=docID++;
        this.name=name;
        this.speciality=speciality;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "Doctor ID: "+id+" Name: "+name+" Speciality : "+ speciality;
    }
}
