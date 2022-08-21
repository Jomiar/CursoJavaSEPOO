import static ui.UImenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);


        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        System.out.println(patient.name);
        System.out.println(patient.email);

        patient.weight = 60.5; //Kg
        patient.height = 1.65; //Mts

        System.out.println(patient.weight);
        System.out.println(patient.height);

        // Se esta llamando al show Menu de manera resumida,
        // por que es lo que se debe hacer
        // desde el main.
        showMenu();
    }

}
