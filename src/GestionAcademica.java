import java.util.ArrayList;
import java.util.Scanner;

public class GestionAcademica {
    private ArrayList<Estudiante> Estudiates;
    private ArrayList<Profesor> Profesores;
    private ArrayList<Materia> Materias;
    private Scanner scan;

    public GestionAcademica(){
        Estudiates = new ArrayList<>();
        Profesores = new ArrayList<>();
        Materias = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void RegistrarEstudiante(){
        Estudiante nuevoEst = new Estudiante();
        String nombre, apellido, matricula, carrera;
        int edad;

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
            matricula = scan.nextLine();
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
}