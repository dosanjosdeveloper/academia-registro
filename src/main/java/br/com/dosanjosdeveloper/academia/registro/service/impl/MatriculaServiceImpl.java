package br.com.dosanjosdeveloper.Academia.Registro.service.impl;

import br.com.dosanjosdeveloper.Academia.Registro.entity.Aluno;
import br.com.dosanjosdeveloper.Academia.Registro.entity.Matricula;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.MatriculaForm;
import br.com.dosanjosdeveloper.Academia.Registro.repository.AlunoRepository;
import br.com.dosanjosdeveloper.Academia.Registro.repository.MatriculaRepository;
import br.com.dosanjosdeveloper.Academia.Registro.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        if (bairro == null){
            return matriculaRepository.findAll();
        }else {
            return matriculaRepository.findAlunosMatriculadosBairro(bairro);
        }
    }

    @Override
    public void delete(Long id) {

    }
}
