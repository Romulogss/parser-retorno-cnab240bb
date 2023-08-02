package br.com.brvt.Modelo;

import br.com.brvt.Util.Util;
import br.com.brvt.enums.OcorrenciaPagforEnum;

import java.util.List;

public class SegmentoA {
    /*
     * CNAB240 BB 
     * Conforme documentação disponível em:
     * https://www.bb.com.br/docs/portal/disem/PgtVer03BB.pdf
     */

    // Segmento A
    public String saCtrBanco;
    public String saCtrLote;
    public String saCtrRegistro;
    public String saSrvRegistro;
    public String saSrvSegmento;
    public String saSrvMovTipo;
    public String saSrvMovCodigo;
    public String saFavCamara;
    public String saFavBanco;
    public String saFavContAgencia;
    public String saFavContAgenciaDv;
    public String saFavContConta;
    public String saFavContContaDv;
    public String saFavContDv;
    public String saFavNome;
    public String saCdtSeuNumero;
    public String saCdtDataPgto;
    public String saCdtMoedaTipo;
    public String saCdtMoedaQtde;
    public String saCdtValorPgto;
    public String saCdtNossoNumero;
    public String saCdtDataReal;
    public String saCdtValorReal;
    public String saInformacao2;
    public String saInformacaoPoupanca;
    public String saCodFinDoc;
    public String saCodFinTed;
    public String saCodFinComplementar;
    public String saCnab;
    public String saAviso;
    public String saOcorrencias;

    public String getSaCtrBanco() {
        return this.saCtrBanco;
    }

    public void setSaCtrBanco(String saCtrBanco) {
        this.saCtrBanco = saCtrBanco;
    }

    public String getSaCtrLote() {
        return this.saCtrLote;
    }

    public void setSaCtrLote(String saCtrLote) {
        this.saCtrLote = saCtrLote;
    }

    public String getSaCtrRegistro() {
        return this.saCtrRegistro;
    }

    public void setSaCtrRegistro(String saCtrRegistro) {
        this.saCtrRegistro = saCtrRegistro;
    }

    public String getSaSrvRegistro() {
        return this.saSrvRegistro;
    }

    public void setSaSrvRegistro(String saSrvRegistro) {
        this.saSrvRegistro = saSrvRegistro;
    }

    public String getSaSrvSegmento() {
        return this.saSrvSegmento;
    }

    public void setSaSrvSegmento(String saSrvSegmento) {
        this.saSrvSegmento = saSrvSegmento;
    }

    public String getSaSrvMovTipo() {
        return this.saSrvMovTipo;
    }

    public void setSaSrvMovTipo(String saSrvMovTipo) {
        this.saSrvMovTipo = saSrvMovTipo;
    }

    public String getSaSrvMovCodigo() {
        return this.saSrvMovCodigo;
    }

    public void setSaSrvMovCodigo(String saSrvMovCodigo) {
        this.saSrvMovCodigo = saSrvMovCodigo;
    }

    public String getSaFavCamara() {
        return this.saFavCamara;
    }

    public void setSaFavCamara(String saFavCamara) {
        this.saFavCamara = saFavCamara;
    }

    public String getSaFavBanco() {
        return this.saFavBanco;
    }

    public void setSaFavBanco(String saFavBanco) {
        this.saFavBanco = saFavBanco;
    }

    public String getSaFavContAgencia() {
        return this.saFavContAgencia;
    }

    public void setSaFavContAgencia(String saFavContAgencia) {
        this.saFavContAgencia = saFavContAgencia;
    }

    public String getSaFavContAgenciaDv() {
        return this.saFavContAgenciaDv;
    }

    public void setSaFavContAgenciaDv(String saFavContAgenciaDv) {
        this.saFavContAgenciaDv = saFavContAgenciaDv;
    }

    public String getSaFavContConta() {
        return this.saFavContConta;
    }

    public void setSaFavContConta(String saFavContConta) {
        this.saFavContConta = saFavContConta;
    }

    public String getSaFavContContaDv() {
        return this.saFavContContaDv;
    }

    public void setSaFavContContaDv(String saFavContContaDv) {
        this.saFavContContaDv = saFavContContaDv;
    }

    public String getSaFavContDv() {
        return this.saFavContDv;
    }

    public void setSaFavContDv(String saFavContDv) {
        this.saFavContDv = saFavContDv;
    }

    public String getSaFavNome() {
        return this.saFavNome;
    }

    public void setSaFavNome(String saFavNome) {
        this.saFavNome = saFavNome;
    }

    public String getSaCdtSeuNumero() {
        return this.saCdtSeuNumero;
    }

    public void setSaCdtSeuNumero(String saCdtSeuNumero) {
        this.saCdtSeuNumero = saCdtSeuNumero;
    }

    public String getSaCdtDataPgto() {
        return this.saCdtDataPgto;
    }

    public void setSaCdtDataPgto(String saCdtDataPgto) {
        this.saCdtDataPgto = saCdtDataPgto;
    }

    public String getSaCdtMoedaTipo() {
        return this.saCdtMoedaTipo;
    }

    public void setSaCdtMoedaTipo(String saCdtMoedaTipo) {
        this.saCdtMoedaTipo = saCdtMoedaTipo;
    }

    public String getSaCdtMoedaQtde() {
        return this.saCdtMoedaQtde;
    }

    public void setSaCdtMoedaQtde(String saCdtMoedaQtde) {
        this.saCdtMoedaQtde = saCdtMoedaQtde;
    }

    public String getSaCdtValorPgto() {
        return this.saCdtValorPgto;
    }

    public void setSaCdtValorPgto(String saCdtValorPgto) {
        this.saCdtValorPgto = saCdtValorPgto;
    }

    public String getSaCdtNossoNumero() {
        return this.saCdtNossoNumero;
    }

    public void setSaCdtNossoNumero(String saCdtNossoNumero) {
        this.saCdtNossoNumero = saCdtNossoNumero;
    }

    public String getSaCdtDataReal() {
        return this.saCdtDataReal;
    }

    public void setSaCdtDataReal(String saCdtDataReal) {
        this.saCdtDataReal = saCdtDataReal;
    }

    public String getSaCdtValorReal() {
        return this.saCdtValorReal;
    }

    public void setSaCdtValorReal(String saCdtValorReal) {
        this.saCdtValorReal = saCdtValorReal;
    }

    public String getSaInformacao2() {
        return this.saInformacao2;
    }

    public void setSaInformacao2(String saInformacao2) {
        this.saInformacao2 = saInformacao2;
    }

    public String getSasaInformacaoPoupanca() {
        return this.saInformacaoPoupanca;
    }

    public void setSasaInformacaoPoupanca(String poupanca) {
        this.saInformacaoPoupanca = poupanca;
    }

    public String getSaCodFinDoc() {
        return this.saCodFinDoc;
    }

    public void setSaCodFinDoc(String saCodFinDoc) {
        this.saCodFinDoc = saCodFinDoc;
    }

    public String getSaCodFinTed() {
        return this.saCodFinTed;
    }

    public void setSaCodFinTed(String saCodFinTed) {
        this.saCodFinTed = saCodFinTed;
    }

    public String getSaCodFinComplementar() {
        return this.saCodFinComplementar;
    }

    public void setSaCodFinComplementar(String saCodFinComplementar) {
        this.saCodFinComplementar = saCodFinComplementar;
    }

    public String getSaCnab() {
        return this.saCnab;
    }

    public void setSaCnab(String saCnab) {
        this.saCnab = saCnab;
    }

    public String getSaAviso() {
        return this.saAviso;
    }

    public void setSaAviso(String saAviso) {
        this.saAviso = saAviso;
    }

    public String getSaOcorrencias() {
        return this.saOcorrencias;
    }

    public void setSaOcorrencias(String saOcorrencias) {
        this.saOcorrencias = saOcorrencias;
    }

    public List<OcorrenciaPagforEnum> getOcorrenciasEnum() {
        return Util.getOcorrenciasEnum(saOcorrencias);
    }


    @Override
    public String toString() {
        return ("Controle"+
                "\n\tCódigo          : " + this.getSaCtrBanco() + 
                "\n\tLote            : " + this.getSaCtrLote() +
                "\n\tRegistro        : " + this.getSaCtrRegistro() +
                "\nServiço" +
                "\n\tRegistro        : " + this.getSaSrvRegistro() +
                "\n\tSegmento        : " + this.getSaSrvSegmento() +
                "\n\tTipo Movimento  : " + this.getSaSrvMovTipo() +
                "\n\tCodigo Movimento: " + this.getSaSrvMovCodigo() +
                "\nFavorecido" +
                "\n\tCamara          : " + this.getSaFavCamara() +
                "\n\tBanco           : " + this.getSaFavBanco() +
                "\n\tAgencia         : " + this.getSaFavContAgencia() +
                "\n\tAgencia Dv      : " + this.getSaFavContAgenciaDv() +
                "\n\tConta           : " + this.getSaFavContConta() +
                "\n\tConta Dv        : " + this.getSaFavContContaDv() +
                "\n\tDv              : " + this.getSaFavContDv() + "Tamanho: " + this.getSaFavContDv().length() + 
                "\n\tNome            : " + this.getSaFavNome() +
                "\nCrédito" +
                "\n\tSeu Numero      : " + this.getSaCdtSeuNumero() + "Tamanho: " + this.getSaCdtSeuNumero().length() +
                "\n\tData Pgto       : " + this.getSaCdtDataPgto() +
                "\n\tMoeda Tipo      : " + this.getSaCdtMoedaTipo() +
                "\n\tMoeda Qtde      : " + this.getSaCdtMoedaQtde() +
                "\n\tValor Pgto      : " + this.getSaCdtValorPgto() +
                "\n\tNosso Numero    : " + this.getSaCdtNossoNumero() +
                "\n\tData Real       : " + this.getSaCdtDataReal() +
                "\n\tValor Real      : " + this.getSaCdtValorReal() +
                "\nInformacao2             : " + this.getSaInformacao2()  + "Tamanho: " + this.getSaInformacao2().length() +
                "\n- Poupança              : " + this.getSasaInformacaoPoupanca() +
                "\nCodigo Finalidade Doc   : " + this.getSaCodFinDoc() +
                "\nCodigo Finalidade Ted   : " + this.getSaCodFinTed() +
                "\n\tCodFinComplementar    : " + this.getSaCodFinComplementar() +
                "\nCnab                    : " + this.getSaCnab()  + "Tamanho: " +  this.getSaCnab().length() +
                "\nAviso                   : " + this.getSaAviso()  + "Tamanho: " +  this.getSaAviso().length() +
                "\nOcorrencias             : " + this.getSaOcorrencias());
    }






    

    
}
