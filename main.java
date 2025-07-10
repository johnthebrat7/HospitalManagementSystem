package HospitalManagement;
import java.util.*;
public class main {
    static ArrayList<Patient> P=new ArrayList<>();
    static ArrayList<Doctor> Dr=new ArrayList<>();
    static ArrayList<Appointment>  App=new ArrayList<>();
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int choice;
        //Patient p1=new Patient("John",21,'M');
        do{
            System.out.println("Hospital Management System:");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor:");
            System.out.println("3. Schedule Appointment:");
            System.out.println("4. View Patients:");
            System.out.println("5. View Doctors:");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit ");
            System.out.println("Enter your Choice:");
            choice =s.nextInt();
            switch (choice){
                case 1:
                    addPatient(s);
                    break;
                case 2:
                    addDoctor(s);
                    break;
                case 3:
                    scheduleAppointment(s);
                    break;
                case 4:
                    viewPatients();
                    break;
                case 5:
                    viewDoctors();
                    break;
                case 6:
                    viewAppointment();
                    break;
                case 0:
                    System.out.println("Exiting ....");
                    break;
                default:
                    System.out.println("Invalid choice please enter again:");
            }
        }while(choice!=0);
        s.close();

    }
    public static void addPatient(Scanner s){
        System.out.println("Enter the name of the patient:");
        String name=s.nextLine();
        System.out.println("Enter the patients age:");
        int age=s.nextInt();
        System.out.println("Enter patients gender:");
        char gender=s.nextLine().charAt(0);
        Patient p=new Patient(name,age,gender);
        P.add(p);
        System.out.println("Patient added successfully");
    }
    public static void addDoctor(Scanner s){
        System.out.println("Enter the name of the Doctor:");
        String name=s.nextLine();
        System.out.println("Enter the speciality of the doctor:");
        String speciality=s.nextLine();
        Doctor doctor=new Doctor(name,speciality);
        Dr.add(doctor);
        System.out.println("Doctor added successfully");
    }
    public static void scheduleAppointment(Scanner s) {
        System.out.println("Enter Patient ID: ");
        int patientId = s.nextInt();
        System.out.println("Enter Doctor ID: ");
        int doctorId = s.nextInt();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = s.next();

        Patient p = findPatientById(patientId);
        Doctor dr = findDoctorById(doctorId);

        if (p != null && dr != null) {
            Appointment appointment = new Appointment(p, dr, date);
            App.add(appointment);
            System.out.println("Appointment scheduled successfully!");
        } else {
            System.out.println("Invalid Patient ID or Doctor ID.");


        }
    }
    public static void viewPatients(){

        for(Patient a:P){
            System.out.println(" "+ a);

        }
    }
    public static void viewDoctors(){
        //int i=1;
        for(Doctor a:Dr){
            System.out.println(" "+ a);
        }
    }
    public static void viewAppointment(){

        for(Appointment a:App){
            System.out.println(" "+ a);

        }
    }
    private static Patient findPatientById(int id) {
        for (Patient p : P) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    private static Doctor findDoctorById(int id) {
        for (Doctor doctor : Dr) {
            if (doctor.getId() == id) {
                return doctor;
            }
        }
        return null;
    }
}
