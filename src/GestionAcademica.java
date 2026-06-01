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
        String nombre, codigo;
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

    public void AsignarMateria(String Estudiante, String Materia){
        Estudiante estudiante = BuscarEstudiante(Estudiante);
        Materia materia = BuscarMateria(Materia);

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
            System.out.print("Digite una opcion: \n1-Buscar por nombre\n2-Buscar por matricula\n3-Salir\n");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite la matricula: ");
                    matricula = scan.nextInt();
                    estudiante = BuscarEstudiante(matricula);
                    System.out.print("Nombre: "+estudiante.GetNombre()+"\n");
                    System.out.print("Apellido: "+estudiante.GetApellido()+"\n");
                    System.out.print("Matricula: "+estudiante.GetMatricula()+"\n");
                    System.out.print("Edad: "+estudiante.GetEdad()+"\n");
                    System.out.print("Carrera: "+estudiante.GetCarrera()+"\n");
                    System.out.print("Fecha de inscripcion: "+estudiante.GetFechaInscripcion()+"\n");
                    break;

                case 2:
                    scan.nextLine();
                    System.out.print("Digite la matricula: ");
                    nombre = scan.nextLine();
                    estudiante = BuscarEstudiante(nombre);
                    System.out.print("Nombre: "+estudiante.GetNombre()+"\n");
                    System.out.print("Apellido: "+estudiante.GetApellido()+"\n");
                    System.out.print("Matricula: "+estudiante.GetMatricula()+"\n");
                    System.out.print("Edad: "+estudiante.GetEdad()+"\n");
                    System.out.print("Carrera: "+estudiante.GetCarrera()+"\n");
                    System.out.print("Fecha de inscripcion: "+estudiante.GetFechaInscripcion()+"\n");
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

    public void MostrarProfesores(){
        System.out.println("===============================");
        System.out.println("           Profesores          ");
        System.out.println("===============================\n");

        for(Profesor profesores : Profesores){
            System.out.println("------------------------------------------------------------");
            System.out.print("Nombre: "+profesores.GetNombre()+"\n");
            System.out.print("Apellido: "+profesores.GetApellido()+"\n");
            System.out.print("Codigo: "+profesores.GetCodigo()+"\n");
            System.out.print("Edad: "+profesores.GetEdad()+"\n");
            System.out.print("Especialidad: "+profesores.GetEspecialidad()+"\n");
            System.out.println("------------------------------------------------------------\n\n");
        }
    }

    public void MostrarMaterias(){
        System.out.println("===============================");
        System.out.println("            Materias           ");
        System.out.println("===============================\n");

        for(Materia materia : Materias){
            System.out.println("------------------------------------------------------------");
            System.out.print("Nombre: "+materia.GetNombre()+"\n");
            System.out.print("Creditos: "+materia.GetCreditos()+"\n");
            System.out.println("------------------------------------------------------------\n\n");
        }
    }
}