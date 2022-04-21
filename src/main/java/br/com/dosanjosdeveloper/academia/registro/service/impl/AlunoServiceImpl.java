package br.com.dosanjosdeveloper.Academia.Registro.service.impl;

import br.com.dosanjosdeveloper.Academia.Registro.entity.Aluno;
import br.com.dosanjosdeveloper.Academia.Registro.entity.AvaliacaoFisica;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.AlunoForm;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.AlunoUpdateForm;
import br.com.dosanjosdeveloper.Academia.Registro.infra.utils.JavaTimeUtils;
import br.com.dosanjosdeveloper.Academia.Registro.repository.AlunoRepository;
import br.com.dosanjosdeveloper.Academia.Registro.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento().toLocalDate());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        if (dataDeNascimento == null){
            return repository.findAll();
        }else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvalacaoFisicaId(Long id) {
        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();
    }
}
