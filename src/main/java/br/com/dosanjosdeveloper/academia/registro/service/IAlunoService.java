package br.com.dosanjosdeveloper.Academia.Registro.service;

import br.com.dosanjosdeveloper.Academia.Registro.entity.Aluno;
import br.com.dosanjosdeveloper.Academia.Registro.entity.AvaliacaoFisica;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.AlunoForm;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
    Aluno create(AlunoForm form);
    Aluno get(Long id);
    List<Aluno> getAll(String dataDeNascimento);
    Aluno update (Long id, AlunoUpdateForm formUpdate);
    void delete(Long id);
    List<AvaliacaoFisica> getAllAvalacaoFisicaId(Long id);

}
