package br.com.brvt.Util;

import br.com.brvt.Modelo.SegmentoZ;

public class ParserSegmentoZ {

    private SegmentoZ segmentoZ;

    public ParserSegmentoZ (String strSegmentoZ) {
        segmentoZ = new SegmentoZ();

        segmentoZ.setSzCtrBanco(strSegmentoZ.substring(0, 3));
        segmentoZ.setSzCtrLote(strSegmentoZ.substring(3, 7));
        segmentoZ.setSzCtrRegistro(strSegmentoZ.substring(7, 8));
        segmentoZ.setSzSrvRegistro(strSegmentoZ.substring(8, 13));
        segmentoZ.setSzSrvSegmento(strSegmentoZ.substring(13, 14));
        segmentoZ.setSzAutLegal(strSegmentoZ.substring(14, 78));
        segmentoZ.setSzAutBancaria(strSegmentoZ.substring(78, 103));
        segmentoZ.setSzCnab(strSegmentoZ.substring(130, 230));
        segmentoZ.setSzOcorrencias(strSegmentoZ.substring(230, 240));
    }

    public SegmentoZ getSegmentoZ() {
        return this.segmentoZ;
    }
    
}
