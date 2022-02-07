package br.com.brvt.Modelo;

public class SegmentoZ {
    /*
     * CNAB240 BB 
     * Conforme documentação disponível em:
     * https://www.bb.com.br/docs/portal/disem/PgtVer03BB.pdf
     */

    // Segmento Z
    // Controle
    private String zCtrBanco;         // campo 01.3Z - Caracteres de 0 a 2
    private String zCtrLote;          // campo 02.3Z - Caracteres de 3 a 6
    private String zCtrRegistro;      // campo 03.3Z - Caractere 8
    // Serviço
    private String zSrvRegistro;      // campo 04.3Z - Caracteres de 8 a 12
    private String zSrvSegmento;      // campo 05.3Z - Caractere 13
    // Autenticação
    private String zAutLegal;         // campo 06.3Z - Caracteres de 14 a 77
    // Controle Bancário
    private String zAutBancaria;      // campo 07.3Z - Caracteres de 78 a 102
    // Reservado CNAB/Febraban
    private String zCnabFebraban;     // campo 08.3Z - Caracteres de 103 a 229
    // Ocorrencias
    private String zOcorrencias;      // campo 09.3Z - Caracteres de 230 a 239

    public String getZCtrBanco() {
        return this.zCtrBanco;
    }

    public void setZCtrBanco(String banco) {
        this.zCtrBanco = banco;
    }

    public String getZCtrLote() {
        return this.zCtrLote;
    }

    public void getZCtrLote(String lote) {
        this.zCtrLote = lote;
    }

    public String getZCtrRegistro() {
        return this.zCtrRegistro;
    }

    public void setZCtrRegistro(String registro) {
        this.zCtrRegistro = registro;
    }

    public String getZSrvRegistro() {
        return this.zSrvRegistro;
    }

    public void setZSrvRegistro(String registro) {
        this.zSrvRegistro = registro;
    }

    public String getZSrvSegmento() {
        return this.zSrvSegmento;
    }

    public void setZSrvSegmento(String segmento) {
        this.zSrvSegmento = segmento;
    }

    public String getZAutLegal() {
        return this.zAutLegal;
    }

    public void setZAutLegal(String autLegal) {
        this.zAutLegal = autLegal;
    }

    public String getZAutBancaria() {
        return this.zAutBancaria;
    }

    public void setZAutBancaria(String autBancaria) {
        this.zAutBancaria = autBancaria;
    }

    public String getzCnabFebraban() {
        return zCnabFebraban;
    }

    public void setzCnabFebraban(String cnabFebraban) {
        this.zCnabFebraban = cnabFebraban;
    }

    public String getzOcorrencias() {
        return zOcorrencias;
    }

    public void setzOcorrencias(String ocorrencias) {
        this.zOcorrencias = ocorrencias;
    }
    
}
