public class Materia{
    private String nombre;
    private String codigo;
    private int creditos;

    public Materia(String Nombre, String Codigo, int Creditos){

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

}