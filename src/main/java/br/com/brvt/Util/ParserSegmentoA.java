package br.com.brvt.Util;

import br.com.brvt.Modelo.SegmentoA;

public class ParserSegmentoA {

    private final SegmentoA segmentoA;

    public ParserSegmentoA (String strSegmentoA) {
        segmentoA = new SegmentoA();

        segmentoA.setSaCtrBanco(strSegmentoA.substring(0, 3));
        segmentoA.setSaCtrLote(strSegmentoA.substring(3, 7));
        segmentoA.setSaCtrRegistro(strSegmentoA.substring(7, 8));
        segmentoA.setSaSrvRegistro(strSegmentoA.substring(8, 13));
        segmentoA.setSaSrvSegmento(strSegmentoA.substring(13, 14));
        segmentoA.setSaSrvMovTipo(strSegmentoA.substring(14, 15));
        segmentoA.setSaSrvMovCodigo(strSegmentoA.substring(15, 17));
        segmentoA.setSaFavCamara(strSegmentoA.substring(17, 20));
        segmentoA.setSaFavBanco(strSegmentoA.substring(20, 23));
        segmentoA.setSaFavContAgencia(strSegmentoA.substring(23, 28));
        segmentoA.setSaFavContAgenciaDv(strSegmentoA.substring(28, 29));
        segmentoA.setSaFavContConta(strSegmentoA.substring(29, 41));
        segmentoA.setSaFavContContaDv(strSegmentoA.substring(41, 42));
        segmentoA.setSaFavContDv(strSegmentoA.substring(42, 43));
        segmentoA.setSaFavNome(strSegmentoA.substring(43, 73));
        segmentoA.setSaCdtSeuNumero(strSegmentoA.substring(73, 93));
        segmentoA.setSaCdtDataPgto(strSegmentoA.substring(93, 101));
        segmentoA.setSaCdtMoedaTipo(strSegmentoA.substring(101, 104));
        segmentoA.setSaCdtMoedaQtde(strSegmentoA.substring(104, 119));
        segmentoA.setSaCdtValorPgto(strSegmentoA.substring(119, 134));
        segmentoA.setSaCdtNossoNumero(strSegmentoA.substring(134, 154));
        segmentoA.setSaCdtDataReal(strSegmentoA.substring(154, 162));
        segmentoA.setSaCdtValorReal(strSegmentoA.substring(162, 177));
        segmentoA.setSaInformacao2(strSegmentoA.substring(177, 217));
        segmentoA.setSasaInformacaoPoupanca(strSegmentoA.substring(177, 179));
        segmentoA.setSaCodFinDoc(strSegmentoA.substring(217, 219));
        segmentoA.setSaCodFinTed(strSegmentoA.substring(219, 224));
        segmentoA.setSaCodFinComplementar(strSegmentoA.substring(224, 226));
        segmentoA.setSaCnab(strSegmentoA.substring(226, 229));
        segmentoA.setSaAviso(strSegmentoA.substring(229, 230));
        segmentoA.setSaOcorrencias(strSegmentoA.substring(230, 240));
    }

    public SegmentoA getSegmentoA() {
        return this.segmentoA;
    }
    
}
