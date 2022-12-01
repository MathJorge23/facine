package projetofacine;


public class costrutorCadastro {
    // pessoa
    private String nome;
    private String datanasc;
    private String email;
    private String cpf;
    private String senha;
    //cartao
    private String nome_cartaa;
    private String numero_cartao;
    private String forma_pagamento;
    private String vencimento;
    private String cod_seguranca;
    //ingresso
    private String dia;
    private String horario;
    private String poltrona;
    private String filme;

    public String getNome_cartaa() {
        return nome_cartaa;
    }

    public void setNome_cartaa(String nome_cartaa) {
        this.nome_cartaa = nome_cartaa;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(String poltrona) {
        this.poltrona = poltrona;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }
    
    

    public String getNome_cartao() {
        return nome_cartaa;
    }

    public void setNome_cartao(String nome_cartaa) {
        this.nome_cartaa = nome_cartaa;
    }

    public String getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getCod_seguranca() {
        return cod_seguranca;
    }

    public void setCod_seguranca(String cod_seguranca) {
        this.cod_seguranca = cod_seguranca;
    }
    
    
    public costrutorCadastro(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
