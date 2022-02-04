package br.com.brvt.Util;

import br.com.brvt.Modelo.HeaderCNAB240BB;

public class ParserCabecalho {
    
    private HeaderCNAB240BB cabecalho;
    
    public ParserCabecalho(String strCabecalho) {

        cabecalho = new HeaderCNAB240BB();
        cabecalho.setHCtrBanco(strCabecalho.substring(0, 3));
        cabecalho.setHCtrLote(strCabecalho.substring(3,7));
        cabecalho.setHCtrRegistro(strCabecalho.substring(7, 8));
        cabecalho.setHCnabFebraban1(strCabecalho.substring(8, 17));
        cabecalho.setHEmpInscTipo(strCabecalho.substring(17, 18));
        cabecalho.setHEmpInscNumero(strCabecalho.substring(18, 32));
        cabecalho.setHEmpConvNumero(strCabecalho.substring(32, 41));
        cabecalho.setHEmpConvCodigo(strCabecalho.substring(41, 45));
        cabecalho.setHEmpConvResBanco(strCabecalho.substring(45, 50));
        cabecalho.setHEmpConvTeste(strCabecalho.substring(50, 52));
        cabecalho.setHEmpContAgencia(strCabecalho.substring(52, 57));
        cabecalho.setHEmpContAgenciaDv(strCabecalho.substring(57, 58));
        cabecalho.setHEmpContConta(strCabecalho.substring(58, 70));
        cabecalho.setHEmpContContaDv(strCabecalho.substring(70, 71));
        cabecalho.setHEmpContDv(strCabecalho.substring(71, 72));
        cabecalho.setHEmpNome(strCabecalho.substring(72, 102));
        cabecalho.setHBcoNome(strCabecalho.substring(102, 132));
        cabecalho.setHCnabFebraban2(strCabecalho.substring(132, 142));
        cabecalho.setHArqCodigo(strCabecalho.substring(142, 143));
        cabecalho.setHArqData(strCabecalho.substring(143, 151));
        cabecalho.setHArqHora(strCabecalho.substring(151, 157));
        cabecalho.setHArqSequencial(strCabecalho.substring(157, 163));
        cabecalho.setHArqLayout(strCabecalho.substring(163, 166));
        cabecalho.setHArqDensidade(strCabecalho.substring(166, 171));
        cabecalho.setHRsvBanco(strCabecalho.substring(171, 191));
        cabecalho.setHRsvEmpresa(strCabecalho.substring(191, 211));
        cabecalho.setHCnabFebraban3(strCabecalho.substring(211, 221));
        cabecalho.setHIdentificacao(strCabecalho.substring(222, 225));
        cabecalho.setHVans(strCabecalho.substring(225, 228));
        cabecalho.setHServico(strCabecalho.substring(228, 230));
        cabecalho.setHOcorrencias(strCabecalho.substring(230, 239));
    }

    public HeaderCNAB240BB getCabecalho() {
        return this.cabecalho;
    }

}
