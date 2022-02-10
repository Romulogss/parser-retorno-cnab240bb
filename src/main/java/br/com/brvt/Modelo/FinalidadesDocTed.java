package br.com.brvt.Modelo;

public class FinalidadesDocTed {

    public String finalidadeDoc (String codigo) {
        switch (codigo) {
            case "01":
                return "Crédito em conta corrente";
            case "02":
                return "Pagamento aluguel/condomínios";
            case "03":
                return "Pagamento duplicatas/títulos";
            case "04":
                return "Pagamento de dividendos";
            case "05":
                return "Pagamento mensalidades escolares";
            case "06":
                return "Pagamento de salarios";
            case "07":
                return "Pagamento a fornecedires";
            case "08":
                return "Operação câmbio/fundos/bolsa valores";
            case "09":
                return "Repasse de arrecadação/pgto de tributos";
            case "10":
                return "Transferência internacional em reais";
            case "11":
                return "DOC para poupança";
            case "12":
                return "DOC para depósito judicial";
            case "13":
                return "Pensão alimentícia";
            case "14":
                return "Restituição de imposto de renda";
            case "15":
                return "FGTS - LC 110/01";
            case "16":
                return "Pagamento de bolsa auxílio";
            case "17":
                return "Remuneração a cooperado";
            case "18":
                return "Remuneração a cooperado";
            case "19":
                return "Pagamento de prebenda";
            case "20":
                return "Doação com incentivo fiscal";
            case "21":
                return "Patrocínio com incentivo fiscal";
            case "22":
                return "Restituição de tributos - RFB";
            case "50":
                return "Transferência de conta salário";
            case "99":
                return "Outros";
            default:
                return "";
        }
    }

    public String finalidadeTed (String codigo) {
        switch (codigo) {
            // parado na pagina 2 do FINALIDADES%20TED.pdf
            case "00001":
                return "Pagamento impostos tributos e taxas";
            case "00002":
                return "Pagamento concessionaria serv.publico";
            case "00003":
                return "Pagamento de dividendos";
            case "00004":
                return "Pagamento de salarios";
            case "00005":
                return "Pagamento a fornecedores";
            case "00006":
                return "Pagamento de honorários";
            case "00007":
                return "Pagamento aluguel/condomínios";
            case "00008":
                return "Pagamento duplicatas/títulos";
            case "00009":
                return "Pagamento mensalidades escolares";
            case "00010":
                return "Crédito em conta corrente";
            // case "00010":
            //     return "Crédito em conta corrente";
            // case "00010":
            //     return "TED para poupança";
            case "00011":
                return "Pagamentos a corretoras";
            case "00012":
                return "Pagamento de boleto bancário em cartório";
            case "00013":
                return "Pgto tarifa p/prest. serviços arrecadação de conv.";
            case "00014":
                return "Repasse vals ref. tit. Liquidado cartórios de protes.";
            case "00015":
                return "Liquidação financeira de operadora de cartão";
            case "00018":
                return "Operações seguro habitacional SFH";
            case "00019":
                return "Operações do FDS - Caixa";
            case "00023":
                return "Taxa de administração";
            case "00027":
                return "Pagamento de acordo/execução judicial";
            case "00028":
                return "Liquidação de empréstimos consignados";
            case "00029":
                return "Pagamento de bolsa auxílio";
            case "00030":
                return "Remuneração a cooperado";
            case "00031":
                return "Pagamento de prebenda";
            case "00033":
                return "Pagamento de juros sobre capital próprio";
            case "00034":
                return "Pag. de rendimento ou amort. s/cotas e ou debêntures";
            case "00035":
                return "Taxa de serviço";
            case "00037":
                return "Pagto juros/amortiz. Tít.depos.garantia câmaras";
            case "00038":
                return "Estorno ou restituição - diversos";
            case "00039":
                return "Pagamento de vale transporte";
            case "00040":
                return "Simples naciona";
            case "00041":
                return " Repasse de valores para FUNDEB";
            case "00042":
                return "Repasse de Valores de convênio centralizado";
            case "00043":
                return "Patrocínio com incentivo fiscal";
            case "00044":
                return "Doação com incentivo fiscal";    
            case "00045":
                return "Trf CC IF não bancária/CL";
            case "00047":
                return "Pagamento de rescisão de contrato de trabalho";
            case "00050":
                return "Reembolso desp estrut operações renda fixa e variável";
            case "00097":
                return "Compra de moeda estrangeira pelo FSB - Fundo Sober.";
            case "00100":
                return "Depósito judicial";
            case "00101":
                return "Pensão alimentícia";
            case "00103":
                return "Cessão cred. liq. princial aquis. créditos";
            case "00104":
                return "Cessão cred. liq. princial aquis. Créd. FIDC";
            case "00107":
                return "Cessão cred.rep.contr.fluxo cx recebíveis PJ";
            case "00108":
                return "Cessão cred.contr.fluxo cx rec.pagos antecipad.";
            case "00114":
                return "Resgate de aplicação financeira de cliente para conta de sua titularidade";
            case "00117":
                return "Aplicação financeira em nome de cliente remetente";
            case "00200":
                return "Transferência internacional em reais";
            case "00300":
                    return "Restituição de imposto de renda";
            case "00303":
                    return "Restituição de tributos - RFB";


           case "08":
                return "Operação câmbio/fundos/bolsa valores";
            case "09":
                return "Repasse de arrecadação/pgto de tributos";
            
            
            
            case "15":
                return "FGTS - LC 110/01";
            case "18":
                return "Remuneração a cooperado";
            
           
            case "50":
                return "Transferência de conta salário";
            case "99":
                return "Outros";
            default:
                return "";
        }
    }




    
}
