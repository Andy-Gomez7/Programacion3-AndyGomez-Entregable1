import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Estudiante extends Persona{
    private String matricula;
    private String carrera; 
    private String fechaInscripcion;
    private Date fechaActual;
    private SimpleDateFormat Formateador;
    private ArrayList<Materia> materias; 

    public Estudiante(){
        super();
        fechaActual = new Date();
        Formateador = new SimpleDateFormat("dd/MM/yyyy");
        materias = new ArrayList<>();
        SetFechaInscripcion();
    }

    public Estudiante(String Nombre, String Apellido, int Edad, String Matricula, String Carrera){
        super(Nombre, Apellido, Edad);
        fechaActual = new Date();
        Formateador = new SimpleDateFormat("dd/MM/yyyy");
        materias = new ArrayList<>();
        SetMatricula(Matricula);
        SetCarrera(Carrera);
        SetFechaInscripcion();
    }

    public boolean SetMatricula(String Matricula){
        if(!Matricula.isEmpty()){
            matricula = Matricula;
            return true;
        }
        return false;
    }

    public String GetMatricula(){
        return matricula;
    }

    public boolean SetCarrera(String Carrera){
        if(!Carrera.isEmpty()){
            carrera = Carrera;
            return true;
        }
        return false;
    }

    public String GetCarrera(){
        return carrera;
    }

    public void SetFechaInscripcion(){
        fechaInscripcion = Formateador.format(fechaActual);
    }

    public String GetFechaInscripcion(){
        return fechaInscripcion;
    }

    public boolean SetMateria(Materia NuevaMateria){
        if(NuevaMateria != null){
            materias.add(NuevaMateria);
            return true;
        }
        return false;
    }
}