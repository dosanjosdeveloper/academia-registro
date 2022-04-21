package br.com.dosanjosdeveloper.Academia.Registro.service;

import br.com.dosanjosdeveloper.Academia.Registro.entity.Matricula;
import br.com.dosanjosdeveloper.Academia.Registro.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll(String bairro);
    void delete(Long id);
}
