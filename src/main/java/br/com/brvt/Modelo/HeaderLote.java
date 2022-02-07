package br.com.brvt.Modelo;

public class HeaderLote {

    /*
     * CNAB240 BB 
     * Conforme documentação disponível em:
     * https://www.bb.com.br/docs/portal/disem/PgtVer03BB.pdf
     */

    //Header do Lote
    //Controle
    private String hlCtrBanco;               // campo 01.1 - caracteres de 0 a 2
    private String hlCtrLote;                // campo 02.1 - caracteres de 3 a 6
    private String hlCtrRegistro;            // campo 03.1 - caracrere 7
    // Serviço
    private String hlSrvOperacao;            // campo 04.1 - caractere 8
    private String hlSrvTipo;                // campo 05.1 - caracteres de 9 a 10
    private String hlSrvFormaLancto;         // campo 06.1 - caracteres de 11 a 12
    private String hlSrvLayout;              // campo 07.1 - caracteres de 13 a 15
    // CNAB
    private String hlCNAB1    ;              // campo 08.1 - caractere 16
    // Empresa
    private String hlEmpInscTipo;            // campo 09.1 - caractere 17
    private String hlEmpInscNumero;          // campo 10.1 - caracteres de 18 a 31
    // private String hlEmpConvCodigo;       // campo 11.1 - caracteres de 32 a 51 - dividido em 11.1.BB1, 11.1.BB2, 11.1.BB3 e 11.1.BB4
    private String hlEmpConvCovenio;         // campo 11.1BB1 - caracteres de 32 a 41
    private String hlEmpConvCodigo;          // campo 11.1BB2 - caracteres de 42 a 44
    private String hlEmpConvUsoBanco;        // campo 11.1BB3 - caracteres de 45 a 49
    private String hlEmpConvTeste;           // campo 11.1BB4 - caracteres de 50 a 51
    private String hlEmpContAgencia;         // campo 12.1 - caracteres de 52 a 56
    private String hlEmpContAgenciaDv;       // campo 13.1 - caractere 57
    private String hlEmpContConta;           // campo 14.1 - caracteres de 58 a 69
    private String hlEmpContContaDv;         // campo 15.1 - caractere 70
    private String hlEmpContDv;              // campo 16.1 - caractere 71
    private String hlEmpNome;                // campo 17.1 - caracteres de 72 a 101
    // Informação
    private String hlInformacao1;            // campo 18.1 - caracteres de 102 a 141
    // Endereço
    private String hlEndLogradouro;          // campo 19.1 - caracteres de 142 a 171
    private String hlEndNumero;              // campo 20.1 - caracteres de 172 a 176
    private String hlEndComplemento;         // campo 21.1 - caracteres de 177 a 191
    private String hlEndCidade;              // campo 22.1 - caracteres de 192 a 211
    private String hlEndCep;                 // campo 23.1 - caracteres de 212 a 216
    private String hlEndCepComplemento;      // campo 24.1 - caracteres de 217 a 219
    private String hlEndEstado;              // campo 25.1 - caracteres de 220 a 221
    // CNAB
    private String hlCNAB2;                  // campo 26.1 - caracteres de 222 a 229
    // Ocorrências
    private String hlOcorrencias;            // campo 27.1 - caracteres de 230 a 239

    public String getHlCtrBanco() {
        return hlCtrBanco;
    }

    public void setHlCtrBanco(String banco) {
        this.hlCtrBanco = banco;
    }

    public String getHlCtrLote() {
        return hlCtrLote;
    }

    public void setHlCtrLote(String lote) {
        this.hlCtrLote = lote;
    }

    public String getHlCtrRegistro() {
        return hlCtrRegistro;
    }

    public void setHlCtrRegistro(String registro) {
        this.hlCtrRegistro = registro;
    }

    public String getHlSrvOperacao() {
        return hlSrvOperacao;
    }

    
    public void setHlSrvOperacao(String operacao) {
        this.hlSrvOperacao = operacao;
    }

    public String getHlSrvTipo() {
        return hlSrvTipo;
    }

    public void setHlSrvTipo(String tipo) {
        this.hlSrvTipo = tipo;
    }

    public String getHlSrvFormaLancto() {
        return hlSrvFormaLancto;
    }

    public void setHlSrvFormaLancto(String formaLancamento) {
        this.hlSrvFormaLancto = formaLancamento;
    }

    public String getHlSrvLayout() {
        return hlSrvLayout;
    }

    public void setHlSrvLayout(String leiaute) {
        this.hlSrvLayout = leiaute;
    }

    public String getHlCNAB1() {
        return hlCNAB1;
    }

    public void setHlCNAB1(String cnab1) {
        this.hlCNAB1 = cnab1;
    }

    public String getHlEmpInscTipo() {
        return hlEmpInscTipo;
    }

    public void setHlEmpInscTipo(String tipo) {
        this.hlEmpInscTipo = tipo;
    }
    
    public String getHlEmpInscNumero() {
        return hlEmpInscNumero;
    }

    public void setHlEmpInscNumero(String numero) {
        this.hlEmpInscNumero = numero;
    }

    public String getHlEmpConvCovenio() {
        return hlEmpConvCovenio;
    }

    public void setHlEmpConvCovenio(String covenio) {
        this.hlEmpConvCovenio = covenio;
    }

    public String getHlEmpConvCodigo() {
        return hlEmpConvCodigo;
    }

    public void setHlEmpConvCodigo(String codigo) {
        this.hlEmpConvCodigo = codigo;
    }

    public String getHlEmpConvUsoBanco() {
        return hlEmpConvUsoBanco;
    }

    public void setHlEmpConvUsoBanco(String usoBanco) {
        this.hlEmpConvUsoBanco = usoBanco;
    }

    public String getHlEmpConvTeste() {
        return hlEmpConvTeste;
    }

    public void setHlEmpConvTeste(String teste) {
        this.hlEmpConvTeste = teste;
    }

    public String getHlEmpContAgencia() {
        return hlEmpContAgencia;
    }

    public void setHlEmpContAgencia(String agencia) {
        this.hlEmpContAgencia = agencia;
    }

    public String getHlEmpContAgenciaDv() {
        return hlEmpContAgenciaDv;
    }

    public void setHlEmpContAgenciaDv(String agenciaDv) {
        this.hlEmpContAgenciaDv = agenciaDv;
    }
    
    public String getHlEmpContConta() {
        return hlEmpContConta;
    }

    public void setHlEmpContConta(String conta) {
        this.hlEmpContConta = conta;
    }    

    public String getHlEmpContContaDv() {
        return hlEmpContContaDv;
    }

    public void setHlEmpContContaDv(String contaDv) {
        this.hlEmpContContaDv = contaDv;
    }

    public String getHlEmpContDv() {
        return hlEmpContDv;
    }
    
    public void setHlEmpContDv(String dv) {
        this.hlEmpContDv = dv;
    }

    public String getHlEmpNome() {
        return hlEmpNome;
    }

    public void setHlEmpNome(String nome) {
        this.hlEmpNome = nome;
    }   

    public String getHlInformacao1() {
        return hlInformacao1;
    }    

    public void setHlInformacao1(String informacao) {
        this.hlInformacao1 = informacao;
    }

    public String getHlEndLogradouro() {
        return hlEndLogradouro;
    }

   public void setHlEndLogradouro(String hlEndLogradouro) {
        this.hlEndLogradouro = hlEndLogradouro;
    }    

    public String getHlEndNumero() {
        return hlEndNumero;
    }

    public void setHlEndNumero(String numero) {
        this.hlEndNumero = numero;
    }

    public String getHlEndComplemento() {
        return hlEndComplemento;
    }
    
    public void setHlEndComplemento(String complemento) {
        this.hlEndComplemento = complemento;
    }

    public String getHlEndCidade() {
        return hlEndCidade;
    }

    public void setHlEndCidade(String cidade) {
        this.hlEndCidade = cidade;
    }

    public String getHlEndCep() {
        return hlEndCep;
    }

    public void setHlEndCep(String cep) {
        this.hlEndCepComplemento = cep;
    }

    public String getHlEndCepComplemento() {
        return hlEndCepComplemento;
    }

    public void setHlEndCepComplemento(String cepComplemento) {
        this.hlEndCepComplemento = cepComplemento;
    }

    public String getHlEndEstado() {
        return hlEndEstado;
    }

    public void setHlEndEstado(String uf) {
        this.hlEndEstado = uf;
    }
    
    public void setHlCNAB2(String cnab) {
        this.hlCNAB2 = cnab;
    }

    public String getHlCNAB2() {
        return hlCNAB2;
    }

    public void setHlOcorrencias(String ocorrencias) {
        this.hlOcorrencias = ocorrencias;
    }

    public String getHlOcorrencias() {
        return hlOcorrencias;
    }

}
