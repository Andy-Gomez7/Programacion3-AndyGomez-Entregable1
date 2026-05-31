import java.util.ArrayList;

public class Materia{
    private String nombre;
    private String codigo;
    private int creditos;
    private ArrayList<Calificacion> calificaciones;

    public Materia(){
        calificaciones = new ArrayList<>();
    }

    public Materia(String Nombre, String Codigo, int Creditos){
        SetNombre(Nombre);
        SetCodigo(Codigo);
        SetCreditos(Creditos);
    }

    public boolean SetNombre(String Nombre){
        if(!Nombre.isEmpty()){
            nombre = Nombre;
            return true;
        }
        return false;
    }

    public String GetNombre(){
        return nombre;
    }

    public boolean SetCodigo(String Codigo){
        if(!codigo.isEmpty()){
            codigo = Codigo;
            return true;
        }
        return false;
    }

    public String SetCodigo(){
        return codigo;
    }

    public boolean SetCreditos(int Creditos){
        if(Creditos > 0 || Creditos <= 5){
            creditos = Creditos;
            return true;
        }
        return false;
    }

    public int GetCreditos(){
        return creditos;
    }

    public boolean SetCalificaion(Calificacion Calf){
        if(Calf != null){
            calificaciones.add(Calf);
            return true;
        }
        return false;
    }

    
}