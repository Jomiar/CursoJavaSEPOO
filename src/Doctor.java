public class Doctor {
    /*---------------------
    *       Atributos
    * ---------------------*/
    //Autoincrement
    static int id = 0; //Sino fuera statica, no se podria llegar el control del autoincremento. static ayuda a que el valor prevalesca fuera de la clase.
    String name;
    String speciality;

    //Metodo constructor, se ejecuta antes que el instanciado
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }
    //Este métotodo asigna un valor a la variable name desde la clase Main, luego se va al objeto
    //para finalmente asignarle el valor a name.
    Doctor(String name){
        System.out.println("El nombre del doctor asignado es :" + name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
