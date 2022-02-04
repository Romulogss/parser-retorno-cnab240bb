package br.com.brvt.Modelo;

import java.math.BigDecimal;

public class CNAB240BB {
    /*
     * CNAB240 BB 
     * Conforme documentação disponível em:
     * https://www.bb.com.br/docs/portal/disem/PgtVer03BB.pdf
     */

    // Header do Arquivo
    // Controle
    private String hCtrBanco;         // campo 01.0 - Caracteres de 0 a 2
    private String hCtrLote;          // campo 02.0 - Caracteres de 3 a 6
    private String hCtrRegisto;       // campo 03.0 - Caractere 7
    // Reservado CNAB/Febraban
    private String hCnabFebraban1;    // campo 04.0 - Caracteres de 8 a 16
    // Empresa
    private String hEmpInscTipo;      // campo 05.0 - Caractere 17
    private String hEmpInscNumero;    // campo 06.0 - Caracteres de 18 a 31
    //private String hEmpConvCodigo;  // campo 07.0 foi dividido em 07.0BB1, 07.0BB2, 07.0BB3 e 07.0BB4 - Caracteres de 32 a 51
    private String hEmpConvNumero;    // campo 07.0BB1 - Caracteres de 32 a 40
    private String hEmpConvCodigo;    // campo 07.0BB2 - Caracteres de 41 a 44
    private String hEmpConvResBanco;  // campo 07.0BB3 - Caracteres de 45 a 49
    private String hEmpConvTeste;     // campo 07.0BB4 - Caracteres de 50 a 51
    private String hEmpContAgencia;   // campo 08.0 - Caracteres de 52 a 56
    private String hEmpContAgenciaDv; // campo 09.0 - Caractere 57
    private String hEmpContConta;     // campo 10.0 - Caracteres de 58 a 69
    private String hEmpContContaDv;   // campo 11.0 - Caractere 70
    private String hEmpContDv;        // campo 12.0 - Caractere 71
    private String hEmpNome;          // campo 13.0 - Caracteres de 72 a 101
    private String hBcoNome;          // campo 14.0 - Caracteres de 102 a 131 
    // Reservado CNAB/Febraban
    private String hCnabFebraban2;    // campo 15.0 - Caracteres de 132 a 141
    // Arquivo
    private String hArqCodigo;        // campo 16.0 - Caractere 142
    private String hArqData;          // campo 17.0 - Caracteres de 143 a 150
    private String hArqHora;          // campo 18.0 - Caracteres de 151 a 156
    private String hArqSequencial;    // campo 19.0 - Caracteres de 157 a 162
    private String hArqLayout;        // campo 20.0 - caracteres de 163 a 165
    private String hArqDensidade;     // campo 21.0 - caracteres de 166 a 170
    // Reservado Banco
    private String hRsvBanco;         // campo 22.0 - caracteres de 171 a 190
    // Reservado Empresa
    private String hRsvEmpresa;       // campo 23.0 - caracteres de 191 a 210
    // Reservado CNAB/Febraban
    private String hCnabFebraban3;    // campo 24.0 - Caracteres de 211 a 221
    private String hIdentificacao;    // campo 25.0 - Caracteres de 222 a 224
    private String hVans;             // campo 26.0 - Caracteres de 225 a 227
    private String hServico;          // campo 27.0 - Caracteres de 228 a 229
    private String hOcorrencias;      // campo 28.0 - Caracteres de 230 a 239

    // Segmento Z
    // Controle
    private String zCtrBanco;         // campo 01.3Z - Caracteres de 0 a 2
    private String zCtrLote;          // campo 02.3Z - Caracteres de 3 a 6
    private String zCtrTipoRegistro;  // campo 03.3Z - Caractere 8
    // Serviço
    private String zSrvNumeroRegistro;// campo 04.3Z - Caracteres de 8 a 12
    private String zSrvSegmento;      // campo 05.3Z - Caractere 13
    // Autenticação
    private String zAutLegal;         // campo 06.3Z - Caracteres de 14 a 77
    // Controle Bancário
    private String zAutBancaria;      // campo 07.3Z - Caracteres de 78 a 102
    // Reservado CNAB/Febraban
    private String zCnabFebraban;     // campo 08.3Z - Caracteres de 103 a 229
    // Ocorrencias
    private String zOcorrencias;      // campo 09.3Z - Caracteres de 230 a 239

    // Getters e Setters do Cabeçalho
    public String getHCtrBanco() {
        return this.hCtrBanco;
    }
    
    public void setHCtrBanco (String codigo) {
        this.hCtrBanco = codigo;
    }

    public String getHCtrLote(){
        return this.hCtrLote;
    }

    public void setHCtrLote(String lote) {
        this.hCtrLote = lote;
    }

    public String getHCtrRegistro() {
        return this.hCtrRegisto;
    }

    public void setHCtrRegistro(String registro) {
        this.hCtrRegisto = registro;
    }

    public String getHCnabFebraban1 () {
        return this.hCnabFebraban1;
    }

    public void setHCnabFebraban1(String cnab) {
        this.hCnabFebraban1 = cnab;
    }

    public String getHEmpInscTipo() {
        return this.hEmpInscTipo;
    }

    public void setHEmpInscTipo(String tipo) {
        this.hEmpInscTipo = tipo;
    }

    public String getHEmpInscNumero() {
        return this.hEmpInscNumero;
    }

    public void setHEmpInscNumero(String numero) {
        this.hEmpInscNumero = numero;
    }

    public String getHEmpConvNumero() {
        return this.hEmpConvNumero;
    }

    public void setHEmpConvNumero(String numero) {
        this.hEmpConvNumero = numero;
    }

    public String getHEmpConvCodigo() {
        return this.hEmpConvCodigo;
    }

    public void setHEmpConvCodigo(String codigo) {
        this.hEmpConvCodigo = codigo;
    }

    public String getHEmpConvResBanco() {
        return this.hEmpConvResBanco;
    }

    public void setHEmpConvResBanco(String resBanco) {
        this.hEmpConvResBanco = resBanco;
    }

    public String getHEmpConvTeste() {
        return this.hEmpConvTeste;
    }

    public void setHEmpConvTeste(String teste) {
        this.hEmpConvTeste = teste;
    }

	public String getHEmpContAgencia() {
		return this.hEmpContAgencia;
	}

    public void setHEmpContAgencia(String agencia) {
        this.hEmpContAgencia = agencia;
    }

    public String getHEmpContAgenciaDv() {
		return this.hEmpContAgenciaDv;
	}

    public void setHEmpContAgenciaDv(String agenciaDv) {
        this.hEmpContAgenciaDv = agenciaDv;
    }

    public String getHEmpContConta() {
        return this.hEmpContConta;
    }

    public void setHEmpContConta(String conta) {
        this.hEmpContConta = conta;
    }

    public String getHEmpContContaDv() {
        return this.hEmpContContaDv;
    }

    public void setHEmpContContaDv(String contaDv) {
        this.hEmpContContaDv = contaDv;
    }

    public String getHEmpContDv() {
        return this.hEmpContDv;
    }

    public void setHEmpContDv(String dv) {
        this.hEmpContDv = dv;
    }

    public String getHEmpNome() {
        return this.hEmpNome;
    }

    public void setHEmpNome(String nome) {
        this.hEmpNome = nome;
    }

    public String getHBcoNome() {
        return this.hBcoNome;
    }

    public void setHBcoNome(String nome) {
        this.hBcoNome = nome;
    }

    public String getHCnabFebraban2 () {
        return this.hCnabFebraban2;
    }

    public void setHCnabFebraban2(String cnab) {
        this.hCnabFebraban2 = cnab;
    }

    public String getHArqCodigo() {
        return this.hArqCodigo;
    }

    public void setHArqCodigo(String codigo) {
        this.hArqCodigo = codigo;
    }

    public String getHArqData() {
        return this.hArqData;
    }
    
    public void setHArqData(String data) {
        this.hArqData = data;
    }

    public String getHArqHora() {
        return this.hArqHora;
    }
    
    public void setHArqHora(String hora) {
        this.hArqHora = hora;
    }


    public String getHArqSequencial() {
        return this.hArqSequencial;
    }

    public void setHArqSequencial(String sequencial) {
        this.hArqSequencial = sequencial;
    }

    public String getHArqLayout() {
        return this.hArqLayout;
    }

    public void setHArqLayout(String layout) {
        this.hArqLayout = layout;
    }

    public String getHArqDensidade() {
        return this.hArqDensidade;
    }

    public void setHArqDensidade(String densidade) {
        this.hArqDensidade = densidade;
    }

    public String getHRsvBanco() {
        return this.hRsvBanco;
    }

    public void setHRsvBanco(String rsvBanco) {
        this.hRsvBanco = rsvBanco;
    }

    public String getHRsvEmpresa() {
        return this.hRsvEmpresa;
    }

    public void setHRsvEmpresa(String rsvEmpresa) {
        this.hRsvEmpresa = rsvEmpresa;
    }

    public String getHCnabFebraban3 () {
        return this.hCnabFebraban3;
    }

    public void setHCnabFebraban3(String cnab) {
        this.hCnabFebraban3 = cnab;
    }

    public String getHIdentificacao() {
        return this.hIdentificacao;
    }

    public void setHIdentificacao(String id) {
        this.hIdentificacao = id;
    }

    public String getHVans() {
        return this.hVans;
    }

    public void setHVans(String vans) {
        this.hVans = vans;
    }

    public String getHSevico() {
        return this.hServico;
    }

    public void setHServico(String servico) {
        this.hServico = servico;
    }


    public String getHOcorrencias() {
        return this.hOcorrencias;
    }

    public void setHOcorrencias(String ocorrencias) {
        this.hOcorrencias = ocorrencias;
    }



}
