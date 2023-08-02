package br.com.brvt.Util;

import br.com.brvt.Modelo.SegmentoB;

public class ParserSegmentoB {

    private final SegmentoB segmentoB;

    public ParserSegmentoB (String strSegmentoB) {
        segmentoB = new SegmentoB();

        segmentoB.setSbCtrBanco(strSegmentoB.substring(0, 3));
        segmentoB.setSbCtrLote(strSegmentoB.substring(3, 7));
        segmentoB.setSbCtrRegistro(strSegmentoB.substring(7, 8));
        segmentoB.setSbSrvRegistro(strSegmentoB.substring(8, 13));
        segmentoB.setSbSrvSegmento(strSegmentoB.substring(13, 14));
        segmentoB.setSbCnab1(strSegmentoB.substring(14, 17));
        segmentoB.setSbDCompFavInscTipo(strSegmentoB.substring(17, 18));
        segmentoB.setSbDCompFavInscNumero(strSegmentoB.substring(18, 32));
        segmentoB.setSbDCompFavLogradouro(strSegmentoB.substring(32, 62));
        segmentoB.setSbDCompFavNumero(strSegmentoB.substring(62, 67));
        segmentoB.setSbDCompFavComplemento(strSegmentoB.substring(67, 82));
        segmentoB.setSbDCompFavBairro(strSegmentoB.substring(82, 97));
        segmentoB.setSbDCompFavCidade(strSegmentoB.substring(97, 117));
        segmentoB.setSbDCompFavCep(strSegmentoB.substring(117, 122));
        segmentoB.setSbDCompFavCepComplemento(strSegmentoB.substring(122, 125));
        segmentoB.setSbDCompFavEstado(strSegmentoB.substring(125, 127));
        segmentoB.setSbDCompPagVencimento(strSegmentoB.substring(127, 135));
        segmentoB.setSbDCompPagVlrDocumento(strSegmentoB.substring(135, 150));
        segmentoB.setSbDCompPagVlrAbatimento(strSegmentoB.substring(150, 165));
        segmentoB.setSbDCompPagVlrDesconto(strSegmentoB.substring(165, 180));
        segmentoB.setSbDCompPagVlrMora(strSegmentoB.substring(180, 195));
        segmentoB.setSbDCompPagVlrMulta(strSegmentoB.substring(195, 210));
        segmentoB.setSbDCompCodDocumento(strSegmentoB.substring(210, 225));
        segmentoB.setSbAviso(strSegmentoB.substring(225, 226));
        segmentoB.setSbUG(strSegmentoB.substring(226, 232));
        segmentoB.setSbISPB(strSegmentoB.substring(232, 240));
    }

    public SegmentoB getSegmentoB() {
        return this.segmentoB;
    }
        
}
