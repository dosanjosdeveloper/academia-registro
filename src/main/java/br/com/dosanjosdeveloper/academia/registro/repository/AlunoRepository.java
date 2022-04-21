package br.com.dosanjosdeveloper.Academia.Registro.repository;

import br.com.dosanjosdeveloper.Academia.Registro.entity.Aluno;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}
