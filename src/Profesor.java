public class Profesor extends Persona {
    private String codigo;
    private String especialidad;
    
    public Profesor(String Nombre, String Apellido, int Edad, String Codigo, String Especialidad){
        super(Nombre, Apellido, Edad);
        SetCodigo(Codigo);
        SetEspecialidad(Especialidad);
    }

    public void SetCodigo(String Codigo){
        if(Codigo.isEmpty()){
            codigo = Codigo;
        }
        else{
            return;
        }
    }

    public String GetCodigo(){
        return codigo;
    }

    public void SetEspecialidad(String Especialidad){
        if(!Especialidad.isEmpty()){
            especialidad = Especialidad;
        }
        else{
            return;
        }
    }

    public String GetEspecialidad(){
        return especialidad;
    }
}