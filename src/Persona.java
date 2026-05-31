public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){}

    public Persona(String Nombre, String Apellido, int Edad){
        SetNombre(Nombre);
        SetApellido(Apellido);
        SetEdad(Edad);
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

    public boolean SetApellido(String Apellido){
        if(!Apellido.isEmpty()){
            apellido = Apellido;
            return true;
        }
        return false;
    }

    public String GetApellido(){
        return apellido;
    }

    public boolean SetEdad(int Edad){
        if(Edad > 0){
            edad = Edad;
            return true;
        }
        return false;
    }

    public int GetEdad(){
        return edad;
    }
}