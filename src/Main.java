import static ui.UImenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor myDoctorAnn = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);

        // Se esta llamando al show Menu de manera resumida,
        // por que es lo que se debe hacer desde
        // desde el main.
        showMenu();
    }

}
