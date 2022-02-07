package br.com.brvt.Util;

import br.com.brvt.Modelo.HeaderLote;

public class ParserHeaderLote {

    private HeaderLote headerLote;

    public ParserHeaderLote(String strHeaderLote) {

        headerLote = new HeaderLote();

        headerLote.setHlCtrBanco(strHeaderLote.substring(0, 3));
        headerLote.setHlCtrLote(strHeaderLote.substring(3,7));
        headerLote.setHlCtrRegistro(strHeaderLote.substring(7, 8));
        headerLote.setHlSrvOperacao(strHeaderLote.substring(8, 9));
        headerLote.setHlSrvTipo(strHeaderLote.substring(9, 11));
        headerLote.setHlSrvFormaLancto(strHeaderLote.substring(11, 13));
        headerLote.setHlSrvLayout(strHeaderLote.substring(13, 16));
        headerLote.setHlCNAB1(strHeaderLote.substring(16, 17));
        headerLote.setHlEmpInscTipo(strHeaderLote.substring(17, 18));
        headerLote.setHlEmpInscNumero(strHeaderLote.substring(18, 32));
        headerLote.setHlEmpConvCovenio(strHeaderLote.substring(32, 41));
        headerLote.setHlEmpConvCodigo(strHeaderLote.substring(41, 45));
        headerLote.setHlEmpConvUsoBanco(strHeaderLote.substring(45, 50));
        headerLote.setHlEmpConvTeste(strHeaderLote.substring(50, 52));
        headerLote.setHlEmpContAgencia(strHeaderLote.substring(52, 57));
        headerLote.setHlEmpContAgenciaDv(strHeaderLote.substring(57, 58));
        headerLote.setHlEmpContConta(strHeaderLote.substring(58,70));
        headerLote.setHlEmpContContaDv(strHeaderLote.substring(70, 71));
        headerLote.setHlEmpContDv(strHeaderLote.substring(71, 72));
        headerLote.setHlEmpNome(strHeaderLote.substring(72, 102));
        headerLote.setHlInformacao1(strHeaderLote.substring(102, 142));
        headerLote.setHlEndLogradouro(strHeaderLote.substring(142, 172));
        headerLote.setHlEndNumero(strHeaderLote.substring(172, 177));
        headerLote.setHlEndComplemento(strHeaderLote.substring(177, 192));
        headerLote.setHlEndCidade(strHeaderLote.substring(192, 212));
        headerLote.setHlEndCep(strHeaderLote.substring(212, 217));
        headerLote.setHlEndCepComplemento(strHeaderLote.substring(217, 220));
        headerLote.setHlEndEstado(strHeaderLote.substring(220, 222));
        headerLote.setHlCNAB2(strHeaderLote.substring(222, 230));
        headerLote.setHlOcorrencias(strHeaderLote.substring(230, 240));
    }

    public HeaderLote getHeaderLote() {
        return this.headerLote;
    }

}
