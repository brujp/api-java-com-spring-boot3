package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

//Classe do tipo Record - Novo recurso do Java
public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
