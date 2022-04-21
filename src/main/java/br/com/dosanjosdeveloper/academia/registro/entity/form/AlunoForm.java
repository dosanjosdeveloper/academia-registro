package br.com.dosanjosdeveloper.Academia.Registro.entity.form;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 10, max = 50, message = "'${validatedValue}' necessário conter entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preencher campo corretamente.")
    @CPF(message = "'${validatedValue}' é invalido!")
    private String cpf;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 5,max = 50, message = "'${validatedValue'} precisa estar entre {min} e {max} caracteres.")
    private String bairro;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Past(message = "Data '${validatedValue}' é inválida.")
    private LocalDateTime dataDeNascimento;
}
