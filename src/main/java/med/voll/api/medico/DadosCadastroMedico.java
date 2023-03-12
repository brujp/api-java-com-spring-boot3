package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

//Classe do tipo Record - Novo recurso do Java
//https://docs.oracle.com/en/java/javase/16/language/records.html
public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
