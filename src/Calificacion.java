public class Calificacion {
    private int nota;
    private Estudiante estudiante;
    private Materia materia;
    

    public void Calificaicon(){}

    public void Calificaicon(int Nota, Estudiante Estudiante){
        SetNota(Nota);
        SetEstudiante(Estudiante);

    }

    public boolean SetNota(int Nota){
        if(Nota > 0 || Nota <= 4){
            nota = Nota;
            return true;
        }
        return false;
    }

    public int GetNota(){
        return nota;
    }

    public boolean SetEstudiante(Estudiante Estudiante){
        if(Estudiante != null){
            estudiante = Estudiante;
            return true;
        }
        return false;
    }

    public Estudiante GetEstudiante(){
        return estudiante;
    }
    
    public boolean SetMateria(Materia Materia){
        if(Materia != null){
            materia = Materia;
            return true;
        }
        return false;
    }

    public Materia GetMateria(){
        return materia;
    }
}