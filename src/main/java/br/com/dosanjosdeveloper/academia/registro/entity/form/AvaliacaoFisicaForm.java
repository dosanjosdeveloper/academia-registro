package br.com.dosanjosdeveloper.Academia.Registro.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

    @Positive(message = "Não informe valor negativo")
    private Long alunoId;

    @NotNull(message = "Preencha corretamente.")
    @Positive(message = "'${validatedValue}' precisa ser positivo.")
    private double peso;

    @NotNull(message = "Preencher o campo corretamente.")
    @Positive(message = "'${validatedValue}' necessário ser positivo.")
    @DecimalMin(value = "150", message = "'${validatedValue}' necesário o minimo {value}.")
    private double altura;
}
