package br.com.brvt.Modelo;

public class CodigosCompe {

    public String getNomeBanco(String codigo) {
        /* 
         * Código Bancos
         * Dedos obtidos em https://www.bcb.gov.br/Fis/CODCOMPE/Tabela.pdf acessado em 10/02/2022
         */

        switch (codigo) {
            case "001":
                return "BANCO DO BRASIL S.A.";
            case "003":
                return "BANCO DA AMAZONIA S.A.";
            case "004":
                return "BANCO DO NORDESTE DO BRASIL S.A.";
            case "012":
                return "BANCO STANDARD DE INVESTIMENTOS S.A.";
            case "014":
                return "NATIXIS BRASIL S.A. BANCO MÚLTIPLO";
            case "019":
                return "BANCO AZTECA DO BRASIL S.A";
            case "021":
                return "BANESTES S.A. BANCO DO ESTADO DO ESPIRITO SANTO";
            case "024":
                return "BANCO DE PERNAMBUCO S.A. - BANDEPE";
            case "025":
                return "BANCO ALFA S.A.";
            case "029":
                return "BANCO BANERJ S.A.";
            case "031":
                return "BANCO BEG S.A.";
            case "033":
                return "BANCO SANTANDER (BRASIL) S.A";
            case "036": 
                return "BANCO BRADESCO BBI S.A.";
            case "037":
                return "BANCO DO ESTADO DO PARÁ S.A.";
            case "040":
                return "BANCO CARGILL S.A.";
            case "041":
                return "BANCO DO ESTADO DO RIO GRANDE DO SUL S.A.";
            case "104":
                return "CAIXA ECONOMICA FEDERAL";
            case "237":
                return "BANCO BRADESCO S.A";
            case "318":
                return "BANCO BMG S.A.";
            case "341":
                return "BANCO ITAÚ S.A";
            case "756":
                return "BANCO COOPERATIVO DO BRASIL S.A. - BANCOOB";
            default:
                return "";
        }

    }
}
