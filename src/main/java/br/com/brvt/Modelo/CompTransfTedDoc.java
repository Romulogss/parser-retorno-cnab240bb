package br.com.brvt.Modelo;

import br.com.brvt.Util.Util;

public class CompTransfTedDoc {

    private HeaderArquivo headerArquivo;
    private HeaderLoteAB headerLoteAB;
    private SegmentoA segmentoA;
    private SegmentoB segmentoB;
    private SegmentoZ segmentoZ;
    private Util util;
    private String comprovante;
    
    public CompTransfTedDoc(HeaderArquivo hArq, HeaderLoteAB hLoteAB, SegmentoA segA, SegmentoB segB) {
        this.headerArquivo = hArq;
        this.headerLoteAB = hLoteAB;
        this.segmentoA = segA;
        this.segmentoB = segB;
        this.util = new Util();
    }  
    
    public CompTransfTedDoc(HeaderArquivo hArq, HeaderLoteAB hLoteAB, SegmentoA segA, SegmentoB segB, SegmentoZ segZ) {
        this.headerArquivo = hArq;
        this.headerLoteAB = hLoteAB;
        this.segmentoA = segA;
        this.segmentoB = segB;
        this.segmentoZ = segZ;
        this.util = new Util();
    }  

    public String GeraComprovante() {
        String espacos = "";

        comprovante = "\n" + util.FormataData(segmentoA.getSaCdtDataPgto()) + "                 BANCO DO BRASIL                  "  + util.FormataHora(headerArquivo.getHArqHora()) + "\n";
        comprovante += "                    COMPROVANTE DOC/TED\n"; // Centralizar
        comprovante += "====================================================================\n";
        espacos = util.RetornaEspacos(18 + segmentoB.getSbDCompCodDocumento().substring(79,85).length());
        comprovante += "NR. DO DOCUMENTO: " + espacos + segmentoB.getSbDCompCodDocumento() + "\n";
        espacos = util.RetornaEspacos(11 + headerLoteAB.getHlEmpNome().trim().length());
        comprovante += "CLIENTE: " +  headerLoteAB.getHlEmpNome().trim() + "\n";
        espacos = util.RetornaEspacos(12 + segmentoA.getSaFavNome().trim().length());
        comprovante += "FAVORECIDO: " + segmentoA.getSaFavNome().trim() + "\n";
        switch (segmentoB.getSbDCompFavInscTipo()) {
            case "1":
                espacos = util.RetornaEspacos(5 + util.FormataCPF(segmentoB.getSbDCompFavInscNumero()).length());
                comprovante += "CPF: " + "\n";
                break;
            default:
                espacos = util.RetornaEspacos(6 + util.FormataCNPJ(segmentoB.getSbDCompFavInscNumero()).length());
                comprovante += "CNPJ: " + "\n";
                break;
        } 
        espacos = util.RetornaEspacos(11 + new CodigosCompe().getNomeBanco(segmentoA.getSaFavBanco()).length());
        comprovante += "BANCO: " + espacos + segmentoA.getSaFavBanco() + " " + new CodigosCompe().getNomeBanco(segmentoA.getSaFavBanco()) + "\n";







        comprovante += "====================================================================\n";
        espacos = util.RetornaEspacos(18 +segmentoZ.getSzAutBancaria().trim().length());
        comprovante += "NR. AUTENTICACAO: " + espacos + util.FormataAutenticacao(segmentoZ.getSzAutBancaria()) + "\n";
        return comprovante;
    }
    

}
