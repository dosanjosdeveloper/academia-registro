package br.com.dosanjosdeveloper.Academia.Registro.service;

import br.com.dosanjosdeveloper.Academia.Registro.entity.AvaliacaoFisica;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.AvaliacaoFisicaForm;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);
    AvaliacaoFisica get(Long id);
    List<AvaliacaoFisica> getAll();
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
    void delete (Long id);
}
