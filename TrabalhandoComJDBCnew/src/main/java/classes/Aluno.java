package classes;

import javax.annotation.processing.Generated;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY);
    private int id;

}
