import java.util.ArrayList;
import java.util.Scanner;

public class GestionAcademica {
    private ArrayList<Estudiante> Estudiates;
    private ArrayList<Profesor> Profesores;
    private ArrayList<Materia> Materias;
    private ArrayList<Calificacion> Calificaciones;
    private Scanner scan;

    public GestionAcademica(){
        Estudiates = new ArrayList<>();
        Profesores = new ArrayList<>();
        Materias = new ArrayList<>();
        Calificaciones = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void RegistrarEstudiante(){
        Estudiante nuevoEst = new Estudiante();
        String nombre, apellido, carrera;
        int edad, matricula;

        scan.nextLine();
        do{
            System.out.print("\n\nDigite el nombre: ");
            nombre = scan.nextLine();
        }while (nuevoEst.SetNombre(nombre));

        do{
            System.out.print("\nDigite el apellido: ");
            apellido = scan.nextLine();
        }while (nuevoEst.SetApellido(apellido));

        do{
            System.out.print("\nDigite la edad: ");
            edad = scan.nextInt();
        }while (nuevoEst.SetEdad(edad));

        do{
            System.out.print("\nDigite la matricula: ");
            matricula = scan.nextInt();
        }while (nuevoEst.SetMatricula(matricula));

        scan.nextLine();

        do{
            System.out.print("\nDigite la carrera: ");
            carrera = scan.nextLine();
        }while (nuevoEst.SetCarrera(carrera));

        Estudiates.add(nuevoEst);
    }

    public void RegistrarProfesores(){
        Profesor nuevoProf = new Profesor();
        String nombre, apellido, especialidad, codigo;
        int edad;

        scan.nextLine();
        do{
            System.out.print("\n\nDigite el nombre: ");
            nombre = scan.nextLine();
        }while (nuevoProf.SetNombre(nombre));

        do{
            System.out.print("\nDigite el apellido: ");
            apellido = scan.nextLine();
        }while (nuevoProf.SetApellido(apellido));

        do{
            System.out.print("\nDigite la edad: ");
            edad = scan.nextInt();
        }while (nuevoProf.SetEdad(edad));

        scan.nextLine();

        do{
            System.out.print("\nDigite el codigo: ");
            codigo = scan.nextLine();
        }while (nuevoProf.SetCodigo(codigo));

        do{
            System.out.print("\nDigite la especialidad: ");
            especialidad = scan.nextLine();
        }while (nuevoProf.SetEspecialidad(especialidad));

        Profesores.add(nuevoProf);
    }

    public void RegistrarMateria(){
        Materia nuevaMateria = new Materia();
        String nombre, codigo, profesor;
        int creditos;

        scan.nextLine();
        do{
            System.out.print("\n\nDigite el nombre de materia: ");
            nombre = scan.nextLine();
        }while (nuevaMateria.SetNombre(nombre));

        do{
            System.out.print("\nDigite el codigo de la materia: ");
            codigo = scan.nextLine();
        }while (nuevaMateria.SetCodigo(codigo));

        do{
            System.out.print("\nDigite los credito de la materia: ");
            creditos = scan.nextInt();
        }while (nuevaMateria.SetCreditos(creditos));

        scan.nextLine();

        do{
            System.out.print("\nDigite el profesor: ");
            profesor = scan.nextLine();
        }while (nuevaMateria.SetProfesor(profesor));

        Materias.add(nuevaMateria);
    }

    private Estudiante BuscarEstudiante(String nombreEstudiante){
        for(Estudiante estudiante : Estudiates){
            if(estudiante.GetNombre().equals(nombreEstudiante)){
                return estudiante;
            }
        }
        return null;
    }

    private Estudiante BuscarEstudiante(int Matricula){
        for(Estudiante estudiante : Estudiates){
            if(estudiante.GetMatricula() == Matricula){
                return estudiante;
            }
        }
        return null;
    }

    private Materia BuscarMateria(String nombreMateria){
        for(Materia materia: Materias){
            if(materia.GetNombre().equals(nombreMateria)){
                return materia;
            }
        }
        return null;
    }

    private Profesor BuscarProfesor(String nombreProfesor){
        for(Profesor profesor : Profesores){
            if(profesor.GetNombre().equals(nombreProfesor)){
                return profesor;
            }
        }
        return null;
    }

    public void AsignarMateria(){
        scan.nextLine();

        System.out.print("Digite la materia a asignar: ");
        String nombreMateria = scan.nextLine();

        System.out.print("Digite el estudiante: ");
        String nombreEstudiante = scan.nextLine();

        Materia materia = BuscarMateria(nombreMateria);
        Estudiante estudiante = BuscarEstudiante(nombreEstudiante);

        if(estudiante == null){
            System.out.println("Estudiante no encontrado.");
            return;
        }

        if(materia == null){
            System.out.println("Materia no encontrada.");
            return;
        }

        estudiante.SetMateria(materia);
    }

    public void RegistrarCalificacion(){
        Calificacion calificacion = new Calificacion();
        String nombreMateria;
        Estudiante estudiante;
        Materia materia;
        int matricula, nota;

        scan.nextLine();
        do{
            
            System.out.print("\nDigite la materia en la que quiere calificar: ");
            nombreMateria = scan.nextLine();
            materia = BuscarMateria(nombreMateria);
        } while (calificacion.SetMateria(materia));

        do{
            System.out.print("\nDigite la matricula del estudiante que quiere calificar: ");
            matricula = scan.nextInt();
            estudiante = BuscarEstudiante(matricula);
        } while (calificacion.SetEstudiante(estudiante));
        
        do{
            System.out.print("\nDigite la calificacion: ");
            nota = scan.nextInt();    
        } while (calificacion.SetNota(nota));

        Calificaciones.add(calificacion);
    }

    public void MenuBuscarEstd(){
        int op, matricula;
        String nombre;
        Estudiante estudiante;
        
        do {
            System.out.print("Digite una opcion: \n1-Buscar por matricula\n2-Buscar por nombre\n3-Salir\n");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.print("\nDigite la matricula: ");
                    matricula = scan.nextInt();
                    estudiante = BuscarEstudiante(matricula);
                    System.out.print("\nNombre: "+estudiante.GetNombre()+"\n");
                    System.out.print("Apellido: "+estudiante.GetApellido()+"\n");
                    System.out.print("Matricula: "+estudiante.GetMatricula()+"\n");
                    System.out.print("Edad: "+estudiante.GetEdad()+"\n");
                    System.out.print("Carrera: "+estudiante.GetCarrera()+"\n");
                    System.out.print("Fecha de inscripcion: "+estudiante.GetFechaInscripcion()+"\n\n");
                    break;

                case 2:
                    scan.nextLine();
                    System.out.print("\nDigite el nombre: ");
                    nombre = scan.nextLine();
                    estudiante = BuscarEstudiante(nombre);
                    System.out.print("Nombre: "+estudiante.GetNombre()+"\n");
                    System.out.print("Apellido: "+estudiante.GetApellido()+"\n");
                    System.out.print("Matricula: "+estudiante.GetMatricula()+"\n");
                    System.out.print("Edad: "+estudiante.GetEdad()+"\n");
                    System.out.print("Carrera: "+estudiante.GetCarrera()+"\n");
                    System.out.print("Fecha de inscripcion: "+estudiante.GetFechaInscripcion()+"\n\n");
                    break;

                case 3:
                    break;
            
                default:
                    break;
            }
        } while (op != 3);
    }

    public void MostrarEstudiantes(){
        System.out.println("===============================");
        System.out.println("           Estudiante          ");
        System.out.println("===============================\n");

        for(Estudiante estudiante : Estudiates){
            System.out.println("------------------------------------------------------------");
            System.out.print("Nombre: "+estudiante.GetNombre()+"\n");
            System.out.print("Apellido: "+estudiante.GetApellido()+"\n");
            System.out.print("Matricula: "+estudiante.GetMatricula()+"\n");
            System.out.print("Edad: "+estudiante.GetEdad()+"\n");
            System.out.print("Carrera: "+estudiante.GetCarrera()+"\n");
            System.out.print("Fecha de inscripcion: "+estudiante.GetFechaInscripcion()+"\n");
            System.out.println("------------------------------------------------------------\n\n");
        }
    }

    public void MostrarProfesor(Profesor profesor){
        if(profesor == null){
        return;
        }

        System.out.print("Nombre: "+profesor.GetNombre()+"\n");
        System.out.print("Apellido: "+profesor.GetApellido()+"\n");
        System.out.print("Codigo: "+profesor.GetCodigo()+"\n");
        System.out.print("Edad: "+profesor.GetEdad()+"\n");
        System.out.print("Especialidad: "+profesor.GetEspecialidad()+"\n");
    }

    public void MostrarMaterias(){
        System.out.println("===============================");
        System.out.println("            Materias           ");
        System.out.println("===============================\n");

        for(Materia materia : Materias){
            System.out.println("------------------------------------------------------------");
            System.out.print("Nombre: "+materia.GetNombre()+"\n");
            System.out.print("Creditos: "+materia.GetCreditos()+"\n");
            MostrarProfesor(BuscarProfesor(materia.GetProfesor()));
            System.out.println("------------------------------------------------------------\n\n");
        }
    }

    public void PromedioGeneral(){

        System.out.println("===============================");
        System.out.println("            Promedio           ");
        System.out.println("===============================\n");

        for(Materia materia : Materias){
            for(Calificacion calificacion : Calificaciones){
                if(materia.GetNombre().equals(calificacion.GetMateria().GetNombre())){
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Materia: "+materia.GetNombre()+"\n");
                    System.out.print("Estudiante: "+calificacion.GetEstudiante().GetNombre()+"\n");
                    System.out.print("Calificaion: "+calificacion.GetNota()+"\n");
                    ComprobarPromedio(calificacion.GetNota());
                    System.out.println("\n------------------------------------------------------------\n\n");
                }
            }    
        }
    }

    private void ComprobarPromedio(int nota){
        if(nota > 70){
            System.out.print("Aprobado");
        }
        else{
            System.out.print("Reprobado");
        }

    }

    public void Menu(){
        int op;

        do {
            
            System.out.print("Digite una opcion: \n");
            System.out.print("\n1. Registrar estudiante");
            System.out.print("\n2. Registrar profesor");
            System.out.print("\n3. Registrar materia");
            System.out.print("\n4. Asignar materia a estudiante");
            System.out.print("\n5. Registrar calificación");
            System.out.print("\n6. Buscar estudiante");
            System.out.print("\n7. Mostrar estudiantes");
            System.out.print("\n8. Mostrar materias");
            System.out.print("\n9. Mostrar reporte de promedios\r\n" + //
                                "");
            System.out.print("10. Salir\n");
            op = scan.nextInt();


            switch (op) {
                case 1:
                    RegistrarEstudiante();
                    break;

                case 2:
                    RegistrarProfesores();
                    break;

                case 3:
                    RegistrarMateria();
                    break;

                case 4:
                    AsignarMateria();
                    break;

                case 5:
                    RegistrarCalificacion();
                    break;

                case 6:
                    MenuBuscarEstd();
                    break;

                case 7:
                    MostrarEstudiantes();
                    break;

                case 8:
                    MostrarMaterias();
                    break;

                case 9:
                    PromedioGeneral();
                    break;

                case 10:
                    break;
            
                default:
                    break;
            }

        } while (op != 10);
    }
}