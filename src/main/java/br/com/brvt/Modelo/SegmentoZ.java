package br.com.brvt.Modelo;

public class SegmentoZ {
    /*
     * CNAB240 BB 
     * Conforme documentação disponível em:
     * https://www.bb.com.br/docs/portal/disem/PgtVer03BB.pdf
     */

    // Segmento Z- autenticacao da remssa
    // Controle
    private String szCtrBanco;         // campo 01.3Z - Caracteres de 0 a 2
    private String szCtrLote;          // campo 02.3Z - Caracteres de 3 a 6
    private String szCtrRegistro;      // campo 03.3Z - Caractere 8
    // Serviço
    private String szSrvRegistro;      // campo 04.3Z - Caracteres de 8 a 12
    private String szSrvSegmento;      // campo 05.3Z - Caractere 13
    // Autenticação
    private String szAutLegal;         // campo 06.3Z - Caracteres de 14 a 77
    // Controle Bancário
    private String szAutBancaria;      // campo 07.3Z - Caracteres de 78 a 102
    // Reservado CNAB/Febraban
    private String szCnab;     // campo 08.3Z - Caracteres de 103 a 229
    // Ocorrencias
    private String szOcorrencias;      // campo 09.3Z - Caracteres de 230 a 239

    public String getSzCtrBanco() {
        return this.szCtrBanco;
    }

    public void setSzCtrBanco(String szCtrBanco) {
        this.szCtrBanco = szCtrBanco;
    }

    public String getSzCtrLote() {
        return this.szCtrLote;
    }

    public void setSzCtrLote(String szCtrLote) {
        this.szCtrLote = szCtrLote;
    }

    public String getSzCtrRegistro() {
        return this.szCtrRegistro;
    }

    public void setSzCtrRegistro(String szCtrRegistro) {
        this.szCtrRegistro = szCtrRegistro;
    }

    public String getSzSrvRegistro() {
        return this.szSrvRegistro;
    }

    public void setSzSrvRegistro(String szSrvRegistro) {
        this.szSrvRegistro = szSrvRegistro;
    }

    public String getSzSrvSegmento() {
        return this.szSrvSegmento;
    }

    public void setSzSrvSegmento(String szSrvSegmento) {
        this.szSrvSegmento = szSrvSegmento;
    }

    public String getSzAutLegal() {
        return this.szAutLegal;
    }

    public void setSzAutLegal(String szAutLegal) {
        this.szAutLegal = szAutLegal;
    }

    public String getSzAutBancaria() {
        return this.szAutBancaria;
    }

    public void setSzAutBancaria(String szAutBancaria) {
        this.szAutBancaria = szAutBancaria;
    }

    public String getSzCnab() {
        return this.szCnab;
    }

    public void setSzCnab(String szCnabFebraban) {
        this.szCnab = szCnabFebraban;
    }

    public String getSzOcorrencias() {
        return this.szOcorrencias;
    }

    public void setSzOcorrencias(String szOcorrencias) {
        this.szOcorrencias = szOcorrencias;
    }

    @Override
    public String toString() {
        return "{" +
            " szCtrBanco='" + getSzCtrBanco() + "'" +
            ", szCtrLote='" + getSzCtrLote() + "'" +
            ", szCtrRegistro='" + getSzCtrRegistro() + "'" +
            ", szSrvRegistro='" + getSzSrvRegistro() + "'" +
            ", szSrvSegmento='" + getSzSrvSegmento() + "'" +
            ", szAutLegal='" + getSzAutLegal() + "'" +
            ", szAutBancaria='" + getSzAutBancaria() + "'" +
            ", szCnabFebraban='" + getSzCnab() + "'" +
            ", szOcorrencias='" + getSzOcorrencias() + "'" +
            "}";
    
    }
    
}
