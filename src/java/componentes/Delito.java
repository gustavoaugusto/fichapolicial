package componentes;

import java.sql.Date;

/**
 *
 * @author Gustavo
 */
public class Delito {

    private int id;
    private String nome;
    private String cpf;
    private String residencia;
    private String tipoDeDelito;
    private Date data;
    private String hora;
    private String localDoCrime;
    private String estado;

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getTipoDeDelito() {
        return tipoDeDelito;
    }

    public void setTipoDeDelito(String tipoDeDelito) {
        this.tipoDeDelito = tipoDeDelito;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocalDoCrime() {
        return localDoCrime;
    }

    public void setLocalDoCrime(String localDoCrime) {
        this.localDoCrime = localDoCrime;
    }


   
}
