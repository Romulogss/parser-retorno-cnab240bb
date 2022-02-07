package br.com.brvt.Util;

import br.com.brvt.Modelo.HeaderArquivo;

public class ParserHeaderArquivo {
    
    private HeaderArquivo headerAqruivo;
    
    public ParserHeaderArquivo(String strHeaderArquivo) {

        headerAqruivo = new HeaderArquivo();
        headerAqruivo.setHCtrBanco(strHeaderArquivo.substring(0, 3));
        headerAqruivo.setHCtrLote(strHeaderArquivo.substring(3,7));
        headerAqruivo.setHCtrRegistro(strHeaderArquivo.substring(7, 8));
        headerAqruivo.setHCnabFebraban1(strHeaderArquivo.substring(8, 17));
        headerAqruivo.setHEmpInscTipo(strHeaderArquivo.substring(17, 18));
        headerAqruivo.setHEmpInscNumero(strHeaderArquivo.substring(18, 32));
        headerAqruivo.setHEmpConvNumero(strHeaderArquivo.substring(32, 41));
        headerAqruivo.setHEmpConvCodigo(strHeaderArquivo.substring(41, 45));
        headerAqruivo.setHEmpConvResBanco(strHeaderArquivo.substring(45, 50));
        headerAqruivo.setHEmpConvTeste(strHeaderArquivo.substring(50, 52));
        headerAqruivo.setHEmpContAgencia(strHeaderArquivo.substring(52, 57));
        headerAqruivo.setHEmpContAgenciaDv(strHeaderArquivo.substring(57, 58));
        headerAqruivo.setHEmpContConta(strHeaderArquivo.substring(58, 70));
        headerAqruivo.setHEmpContContaDv(strHeaderArquivo.substring(70, 71));
        headerAqruivo.setHEmpContDv(strHeaderArquivo.substring(71, 72));
        headerAqruivo.setHEmpNome(strHeaderArquivo.substring(72, 102));
        headerAqruivo.setHBcoNome(strHeaderArquivo.substring(102, 132));
        headerAqruivo.setHCnabFebraban2(strHeaderArquivo.substring(132, 142));
        headerAqruivo.setHArqCodigo(strHeaderArquivo.substring(142, 143));
        headerAqruivo.setHArqData(strHeaderArquivo.substring(143, 151));
        headerAqruivo.setHArqHora(strHeaderArquivo.substring(151, 157));
        headerAqruivo.setHArqSequencial(strHeaderArquivo.substring(157, 163));
        headerAqruivo.setHArqLayout(strHeaderArquivo.substring(163, 166));
        headerAqruivo.setHArqDensidade(strHeaderArquivo.substring(166, 171));
        headerAqruivo.setHRsvBanco(strHeaderArquivo.substring(171, 191));
        headerAqruivo.setHRsvEmpresa(strHeaderArquivo.substring(191, 211));
        headerAqruivo.setHCnabFebraban3(strHeaderArquivo.substring(211, 221));
        headerAqruivo.setHIdentificacao(strHeaderArquivo.substring(222, 225));
        headerAqruivo.setHVans(strHeaderArquivo.substring(225, 228));
        headerAqruivo.setHServico(strHeaderArquivo.substring(228, 230));
        headerAqruivo.setHOcorrencias(strHeaderArquivo.substring(230, 239));
    }

    public HeaderArquivo getHeaderArquivo() {
        return this.headerAqruivo;
    }

}
