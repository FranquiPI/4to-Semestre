package utn.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//boilerplate - Repetitivo
@Data //Esta notación es para crear los geters y seters
@NoArgsConstructor //Esta notación es para crear un constructor vacío
@AllArgsConstructor //Esta notación es para crear un contructor con todos los atributos
@ToString //ESta notación es para crear el tostring
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstudiante;
    private String apellido;
    private String telefono;
    private String email;

}
