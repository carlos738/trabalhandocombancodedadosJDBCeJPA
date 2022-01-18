package classes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class AlunoRepository implements JpaRepository<Aluno, Integer> {

    public abstract Optional<Aluno> findById(int i);
}