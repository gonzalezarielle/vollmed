package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.dadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        dadosEndereco endereco) {
}
