package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medico.DadosCadastroMedico;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;


    public Endereco(DadosEndereco dados) {
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.logradouro = dados.logradouro();
        this.uf = dados.uf();
        this.cidade = dados.cidade();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        }
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if (dados.uf() != null) {
            this.uf = dados.uf();
        }
        if (dados.numero() != null) {
            this.numero = dados.numero();
        }
        if (dados.cidade() != null) {
            this.cidade = dados.cidade();
        }
        if (dados.cep() != null) {
            this.cep = dados.cep();
        }
        if (dados.complemento() != null) {
            this.complemento = dados.complemento();
        }

    }
}
