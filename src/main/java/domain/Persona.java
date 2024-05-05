package domain;


import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;


// Con Data de lombok, se ahorra el codigo de constructores, set and get, metodos String, equals,
@Data

// Asocia una tabla en la bd
@Entity

@Table(name = "persona")

// Las instancias de esta clase se pueden serializar
public class Persona implements Serializable {


        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nombre;
        private String apellido;
        private String email;
        private String telefono;
    }



