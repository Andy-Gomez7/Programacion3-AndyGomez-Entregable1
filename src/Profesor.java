public class Profesor extends Persona {
    private String codigo;
    private String especialidad;
    
    public Profesor(){
        super();
    }

    public Profesor(String Nombre, String Apellido, int Edad, String Codigo, String Especialidad){
        super(Nombre, Apellido, Edad);
        SetCodigo(Codigo);
        SetEspecialidad(Especialidad);
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

    public boolean SetEspecialidad(String Especialidad){
        if(!Especialidad.isEmpty()){
            especialidad = Especialidad;
            return false;
        }
        return true;
    }

    public String GetEspecialidad(){
        return especialidad;
    }
}