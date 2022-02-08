package br.com.brvt.Util;

import br.com.brvt.Modelo.HeaderArquivo;

public class ParserHeaderArquivo {
    
    private HeaderArquivo headerArquivo;
    private String strHeaderArquivo;
    
    public ParserHeaderArquivo(String strHeaderArquivo) {

        this.strHeaderArquivo = strHeaderArquivo;

        this.headerArquivo = new HeaderArquivo();
        this.headerArquivo.setHCtrBanco(strHeaderArquivo.substring(0, 3));
        this.headerArquivo.setHCtrLote(strHeaderArquivo.substring(3,7));
        this.headerArquivo.setHCtrRegistro(strHeaderArquivo.substring(7, 8));
        this.headerArquivo.setHCnabFebraban1(strHeaderArquivo.substring(8, 17));
        this.headerArquivo.setHEmpInscTipo(strHeaderArquivo.substring(17, 18));
        this.headerArquivo.setHEmpInscNumero(strHeaderArquivo.substring(18, 32));
        this.headerArquivo.setHEmpConvNumero(strHeaderArquivo.substring(32, 41));
        this.headerArquivo.setHEmpConvCodigo(strHeaderArquivo.substring(41, 45));
        this.headerArquivo.setHEmpConvResBanco(strHeaderArquivo.substring(45, 50));
        this.headerArquivo.setHEmpConvTeste(strHeaderArquivo.substring(50, 52));
        this.headerArquivo.setHEmpContAgencia(strHeaderArquivo.substring(52, 57));
        this.headerArquivo.setHEmpContAgenciaDv(strHeaderArquivo.substring(57, 58));
        this.headerArquivo.setHEmpContConta(strHeaderArquivo.substring(58, 70));
        this.headerArquivo.setHEmpContContaDv(strHeaderArquivo.substring(70, 71));
        this.headerArquivo.setHEmpContDv(strHeaderArquivo.substring(71, 72));
        this.headerArquivo.setHEmpNome(strHeaderArquivo.substring(72, 102));
        this.headerArquivo.setHBcoNome(strHeaderArquivo.substring(102, 132));
        this.headerArquivo.setHCnabFebraban2(strHeaderArquivo.substring(132, 142));
        this.headerArquivo.setHArqCodigo(strHeaderArquivo.substring(142, 143));
        this.headerArquivo.setHArqData(strHeaderArquivo.substring(143, 151));
        this.headerArquivo.setHArqHora(strHeaderArquivo.substring(151, 157));
        this.headerArquivo.setHArqSequencial(strHeaderArquivo.substring(157, 163));
        this.headerArquivo.setHArqLayout(strHeaderArquivo.substring(163, 166));
        this.headerArquivo.setHArqDensidade(strHeaderArquivo.substring(166, 171));
        this.headerArquivo.setHRsvBanco(strHeaderArquivo.substring(171, 191));
        this.headerArquivo.setHRsvEmpresa(strHeaderArquivo.substring(191, 211));
        this.headerArquivo.setHCnabFebraban3(strHeaderArquivo.substring(211, 221));
        this.headerArquivo.setHIdentificacao(strHeaderArquivo.substring(222, 225));
        this.headerArquivo.setHVans(strHeaderArquivo.substring(225, 228));
        this.headerArquivo.setHServico(strHeaderArquivo.substring(228, 230));
        this.headerArquivo.setHOcorrencias(strHeaderArquivo.substring(230, 239));
        
    }

    public HeaderArquivo getHeaderArquivo() {
        return this.headerArquivo;
    }
    
    public String getStrHeaderArqivo() {
        return this.strHeaderArquivo;
    }

}
