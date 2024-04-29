package domain;


import lombok.Data;


//Con Data de lombok, se ahorra el codigo de constructores, set and get, metodos String, equals,
@Data
public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;



}
