package br.com.dosanjosdeveloper.Academia.Registro.service.impl;

import br.com.dosanjosdeveloper.Academia.Registro.entity.Aluno;
import br.com.dosanjosdeveloper.Academia.Registro.entity.AvaliacaoFisica;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.AvaliacaoFisicaForm;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.AvaliacaoFisicaUpdateForm;
import br.com.dosanjosdeveloper.Academia.Registro.repository.AlunoRepository;
import br.com.dosanjosdeveloper.Academia.Registro.repository.AvaliacaoFisicaRepository;
import br.com.dosanjosdeveloper.Academia.Registro.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
