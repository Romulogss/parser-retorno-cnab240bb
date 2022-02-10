package br.com.brvt.Modelo;

public class ErrosConciliacao {

    public String getMensagemRetorno(String codigoErro) {

        switch(codigoErro) {
            case "00":
                return "00 - Este código indica que o pagamento foi confirmado";
            case "01":
                return "01 - Insuficiência de Fundos - Débito Não Efetuado";
            case "02":
                return "02 - Crédito ou Débito Cancelado pelo Pagador/Credor";
            case "03":
                return "03 - Débito Autorizado pela Agência - Efetuado";
            case "AA":
                return "AA - Controle Inválido";
            case "AB":
                return "AB - Tipo de Operação Inválido";
            case "AC": 
                return "AC - Tipo de Serviço Inválido";
            case "AD": 
                return "AD - Forma de Lançamento Inválida";
            case "AE": 
                return "AE - Tipo/Número de Inscrição Inválido";
            case "AF": 
                return "AF - Código de Convênio Inválido";
            case "AG": 
                return "AG - Agência/Conta Corrente/DV Inválido";
            case "AH": 
                return "AH - Nº Seqüencial do Registro no Lote Inválido";
            case "AI": 
                return "AI - Código de Segmento de Detalhe Inválido";
            case "AJ": 
                return "AJ - Tipo de Movimento Inválido";
            case "AK": 
                return "AK - Código da Câmara de Compensação do Banco Favorecido/Depositário Inválido";
            case "AL": 
                return "AL - Código do Banco Favorecido ou Depositário Inválido";
            case "AM": 
                return "AM - Agência Mantenedora da Conta Corrente do Favorecido Inválida";
            case "AN": 
                return "AN - Conta Corrente/DV do Favorecido Inválido";
            case "AO": 
                return "AO - Nome do Favorecido Não Informado";
            case "AP": 
                return "AP - Data Lançamento Inválido";
            case "AQ": 
                return "AQ - Tipo/Quantidade da Moeda Inválido";
            case "AR": 
                return "AR - Valor do Lançamento Inválido";
            case "AS": 
                return "AS - Aviso ao Favorecido - Identificação Inválida";
            case "AT": 
                return "AT - Tipo/Número de Inscrição do Favorecido Inválido";
            case "AU": 
                return "AU - Logradouro do Favorecido Não Informado";
            case "AV": 
                return "AV - Nº do Local do Favorecido Não Informado";
            case "AW": 
                return "AW - Cidade do Favorecido Não Informada";
            case "AX": 
                return "AX - CEP/Complemento do Favorecido Inválido";
            case "AY": 
                return "AY - Sigla do Estado do Favorecido Inválida";
            case "AZ": 
                return "AZ - Código/Nome do Banco Depositário Inválido";
            case "BA": 
                return "BA - Código/Nome da Agência Depositária Não Informado";
            case "BB": 
                return "BB - Seu Número Inválido";
            case "BC": 
                return "BC - Nosso Número Inválido";
            case "BD": 
                return "BD - Inclusão Efetuada com Sucesso";
            case "BE": 
                return "BE - Alteração Efetuada com Sucesso";
            case "BF": 
                return "BF - Exclusão Efetuada com Sucesso";
            case "BG": 
                return "BG - Agência/Conta Impedida Legalmente";
            case "BH": 
                return "BH- Empresa não pagou salário";
            case "BI": 
                return "BI - Falecimento do mutuário";
            case "BJ": 
                return "BJ - Empresa não enviou remessa do mutuário";
            case "BK": 
                return "BK- Empresa não enviou remessa no vencimento";
            case "BL": 
                return "BL - Valor da parcela inválida";
            case "BM": 
                return "BM - Identificação do contrato inválida";
            case "BN": 
                return "BN - Operação de Consignação Incluída com Sucesso";
            case "BO": 
                return "BO - Operação de Consignação Alterada com Sucesso";
            case "BP": 
                return "BP - Operação de Consignação Excluída com Sucesso";
            case "BQ": 
                return "BQ - Operação de Consignação Liquidada com Sucesso";
            case "BR": 
                return "BR - Reativação Efetuada com Sucesso";
            case "BS": 
                return "BS - Suspensão Efetuada com Sucesso";
            case "CA": 
                return "CA - Código de Barras - Código do Banco Inválido";
            case "CB": 
                return "CB - Código de Barras - Código da Moeda Inválido";
            case "CC": 
                return "CC - Código de Barras - Dígito Verificador Geral Inválido";
            case "CD": 
                return "CD - Código de Barras - Valor do Título Inválido";
            case "CE": 
                return "CE - Código de Barras - Campo Livre Inválido";
            case "CF": 
                return "CF - Valor do Documento Inválido";
            case "CG": 
                return "CG - Valor do Abatimento Inválido";
            case "CH": 
                return "CH - Valor do Desconto Inválido";
            case "CI": 
                return "CI - Valor de Mora Inválido";
            case "CJ": 
                return "CJ - Valor da Multa Inválido";
            case "CK": 
                return "CK - Valor do IR Inválido";
            case "CL": 
                return "CL - Valor do ISS Inválido";
            case "CM": 
                return "CM - Valor do IOF Inválido";
            case "CN": 
                return "CN - Valor de Outras Deduções Inválido";
            case "CO": 
                return "CO - Valor de Outros Acréscimos Inválido";
            case "CP": 
                return "CP - Valor do INSS Inválido";
            case "HA": 
                return "HA - Lote Não Aceito";
            case "HB": 
                return "HB - Inscrição da Empresa Inválida para o Contrato";
            case "HC": 
                return "HC - Convênio com a Empresa Inexistente/Inválido para o Contrato";
            case "HD": 
                return "HD - Agência/Conta Corrente da Empresa Inexistente/Inválido para o Contrato";
            case "HE": 
                return "HE - Tipo de Serviço Inválido para o Contrato";
            case "HF": 
                return "HF - Conta Corrente da Empresa com Saldo Insuficiente";
            case "HG": 
                return "HG - Lote de Serviço Fora de Seqüência";
            case "HH": 
                return "HH - Lote de Serviço Inválido";
            case "HI": 
                return "HI - Arquivo não aceito";
            case "HJ": 
                return "HJ - Tipo de Registro Inválido";
            case "HK": 
                return "HK - Código Remessa / Retorno Inválido";
            case "HL": 
                return "HL - Versão de layout inválida";
            case "HM": 
                return "HM - Mutuário não identificado";
            case "HN": 
                return "HN - Tipo do beneficio não permite empréstimo";
            case "HO": 
                return "HO - Beneficio cessado/suspenso";
            case "HP": 
                return "HP - Beneficio possui representante legal";
            case "HQ": 
                return "HQ - Beneficio é do tipo PA - Pensão alimentícia";
            case "HR": 
                return "HR - Quantidade de contratos permitida excedida";
            case "HS": 
                return "HS - Beneficio não pertence ao Banco informado";
            case "HT": 
                return "HT - Início do desconto informado já ultrapassado";
            case "HU": 
                return "HU - Número da parcela inválida";
            case "HV": 
                return "HV - Quantidade de parcela inválida";
            case "HW": 
                return "HW - Margem consignável excedida para o mutuário dentro do prazo do contrato";
            case "HX": 
                return "HX - Empréstimo já cadastrado";
            case "HY": 
                return "HY - Empréstimo inexistente";
            case "HZ": 
                return "HZ - Empréstimo já encerrado";
            case "H1": 
                return "H1 - Arquivo sem trailer";
            case "H2": 
                return "H2 - Mutuário sem crédito na competência";
            case "H3": 
                return "H3 - Não descontado – outros motivos";
            case "H4": 
                return "H4 - Retorno de Crédito não pago";
            case "H5": 
                return "H5 - Cancelamento de empréstimo retroativo";
            case "H6": 
                return "H6 - Outros Motivos de Glosa";
            case "H7": 
                return "H7 - Margem consignável excedida para o mutuário acima do prazo do contrato";
            case "H8": 
                return "H8 - Mutuário desligado do empregador";
            case "H9": 
                return "H9 - Mutuário afastado por licença";
            case "IA": 
                return "IA - Primeiro nome do mutuário diferente do primeiro nome do movimento do censo ou diferente da base de Titular do Benefício";
            case "IB": 
                return "IB - Benefício suspenso/cessado pela APS ou Sisobi";
            case "IC": 
                return "IC - Benefício suspenso por dependência de cálculo";
            case "ID": 
                return "ID - Benefício suspenso/cessado pela inspetoria/auditoria";
            case "IE": 
                return "IE - Benefício bloqueado para empréstimo pelo beneficiário";
            case "IF": 
                return "IF - Benefício bloqueado para empréstimo por TBM";
            case "IG": 
                return "IG - Benefício está em fase de concessão de PA ou desdobramento";
            case "IH": 
                return "IH - Benefício cessado por óbito";
            case "II": 
                return "II - Benefício cessado por fraude";
            case "IJ": 
                return "IJ - Benefício cessado por concessão de outro benefício";
            case "IK": 
                return "IK - Benefício cessado: estatutário transferido para órgão de origem";
            case "IL": 
                return "IL - Empréstimo suspenso pela APS";
            case "IM": 
                return "IM - Empréstimo cancelado pelo banco";
            case "IN": 
                return "IN - Crédito transformado em PAB";
            case "IO": 
                return "IO - Término da consignação foi alterado";
            case "IP": 
                return "IP - Fim do empréstimo ocorreu durante período de suspensão ou concessão";
            case "IQ": 
                return "IQ - Empréstimo suspenso pelo banco";
            case "IR": 
                return "IR - Não averbação de contrato – quantidade de parcelas/competências informadas ultrapassou a data limite da extinção de cota do dependente titular de benefícios";
            case "TA": 
                return "TA - Lote Não Aceito - Totais do Lote com Diferença";
            case "YA": 
                return "YA - Título Não Encontrado";
            case "YB": 
                return "YB - Identificador Registro Opcional Inválido";
            case "YC": 
                return "YC - Código Padrão Inválido";
            case "YD": 
                return "YD - Código de Ocorrência Inválido";
            case "YE": 
                return "YE - Complemento de Ocorrência Inválido";
            case "YF": 
                return "YF - Alegação já Informada";
            case "ZA": 
                return "ZA - Agência / Conta do Favorecido Substituída Observação: As ocorrências iniciadas com ZA tem caráter informativo para o cliente";
            case "ZB": 
                return "ZB - Divergência entre o primeiro e último nome do beneficiário versus primeiro e último nome na Receita Federal";
            case "ZC": 
                return "ZC - Confirmação de Antecipação de Valor";
            case "ZD": 
                return "ZD - Antecipação parcial de valor";
            case "ZE": 
                return "ZE - Título bloqueado na base";
            case "ZF": 
                return "ZF - Sistema em contingência – título valor maior que referência";
            case "ZG": 
                return "ZG - Sistema em contingência – título vencido";
            case "ZH":  
                return "ZH - Sistema em contingência – título indexado";
            case "ZI": 
                return "ZI - Beneficiário divergente";
            case "ZJ": 
                return "ZJ - Limite de pagamentos parciais excedido";
            case "ZK": 
                return "ZK - Boleto já liquidado";
            default:
                return codigoErro + " - Erro desconhecido!";
        }

    }
    
}
