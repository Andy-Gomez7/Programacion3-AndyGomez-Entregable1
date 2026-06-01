public class Calificacion {
    private int nota;
    private Estudiante estudiante;
    private Materia materia;
    

    public Calificacion(){}

    public Calificacion(int Nota, Estudiante Estudiante){
        SetNota(Nota);
        SetEstudiante(Estudiante);

    }

    public boolean SetNota(int Nota){
        if(Nota >= 0){
            nota = Nota;
            return false;
        }
        return true;
    }

    public int GetNota(){
        return nota;
    }

    public boolean SetEstudiante(Estudiante Estudiante){
        if(Estudiante != null){
            estudiante = Estudiante;
            return false;
        }
        return true;
    }

    public Estudiante GetEstudiante(){
        return estudiante;
    }
    
    public boolean SetMateria(Materia Materia){
        if(Materia != null){
            materia = Materia;
            return false;
        }
        return true;
    }

    public Materia GetMateria(){
        return materia;
    }
}