public class Materia{
    private String nombre;
    private String codigo;
    private int creditos;
    private String profesor;

    public Materia(){}

    public Materia(String Nombre, String Codigo, int Creditos){
        SetNombre(Nombre);
        SetCodigo(Codigo);
        SetCreditos(Creditos);
    }

    public boolean SetNombre(String Nombre){
        if(!Nombre.isEmpty()){
            nombre = Nombre;
            return false;
        }
        return true;
    }

    public String GetNombre(){
        return nombre;
    }

    public boolean SetCodigo(String Codigo){
        if(!Codigo.isEmpty()){
            codigo = Codigo;
            return false;
        }
        return true;
    }

    public String GetCodigo(){
        return codigo;
    }

    public boolean SetCreditos(int Creditos){
        if(Creditos > 0 && Creditos <= 5){
            creditos = Creditos;
            return false;
        }
        return true;
    }

    public int GetCreditos(){
        return creditos;
    }

    public boolean SetProfesor(String Profesor){
        if(!Profesor.isEmpty()){
            profesor = Profesor;
            return false; 
        }
        return true;
    }

    public String GetProfesor(){
        return profesor;
    }
}