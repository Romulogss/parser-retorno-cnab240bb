package br.com.brvt.Modelo;

public class ErrosConciliacao {

    public String getMensagemRetorno(String codigoErro) {

        String mensagem;

        switch(codigoErro) {
            case "00":
                mensagem = ("00 - Este código indica que o pagamento foi confirmado");
                break;
            case "01":
                mensagem = ("01 - Insuficiência de Fundos - Débito Não Efetuado");
                break;
            case "02":
                mensagem = ("02 - Crédito ou Débito Cancelado pelo Pagador/Credor");
                break;
            case "03":
                mensagem = ("03 - Débito Autorizado pela Agência - Efetuado");
                break;
            case "AA":
                mensagem = ("AA - Controle Inválido");
                break;
            case "AB":
                mensagem = ("AB - Tipo de Operação Inválido");
                break;
            case "AC": 
                mensagem = ("AC - Tipo de Serviço Inválido");
                break;
            case "AD": 
                mensagem = ("AD - Forma de Lançamento Inválida");
                break;
            case "AE": 
                mensagem = ("AE - Tipo/Número de Inscrição Inválido");
                break;
            case "AF": 
                mensagem = ("AF - Código de Convênio Inválido");
                break;
            case "AG": 
                mensagem = ("AG - Agência/Conta Corrente/DV Inválido");
                break;
            case "AH": 
                mensagem = ("AH - Nº Seqüencial do Registro no Lote Inválido");
                break;
            case "AI": 
                mensagem = ("AI - Código de Segmento de Detalhe Inválido");
                break;
            case "AJ": 
                mensagem = ("AJ - Tipo de Movimento Inválido");
                break;
            case "AK": 
                mensagem = ("AK - Código da Câmara de Compensação do Banco Favorecido/Depositário Inválido");
                break;
            case "AL": 
                mensagem = ("AL - Código do Banco Favorecido ou Depositário Inválido");
                break;
            case "AM": 
                mensagem = ("AM - Agência Mantenedora da Conta Corrente do Favorecido Inválida");
                break;
            case "AN": 
                mensagem = ("AN - Conta Corrente/DV do Favorecido Inválido");
                break;
            case "AO": 
                mensagem = ("AO - Nome do Favorecido Não Informado");
                break;
            case "AP": 
                mensagem = ("AP - Data Lançamento Inválido");
                break;
            case "AQ": 
                mensagem = ("AQ - Tipo/Quantidade da Moeda Inválido");
                break;
            case "AR": 
                mensagem = ("AR - Valor do Lançamento Inválido");
                break;
            case "AS": 
                mensagem = ("AS - Aviso ao Favorecido - Identificação Inválida");
                break;
            case "AT": 
                mensagem = ("AT - Tipo/Número de Inscrição do Favorecido Inválido");
                break;
            case "AU": 
                mensagem = ("AU - Logradouro do Favorecido Não Informado");
                break;
            case "AV": 
                mensagem = ("AV - Nº do Local do Favorecido Não Informado");
                break;
            case "AW": 
                mensagem = ("AW - Cidade do Favorecido Não Informada");
                break;
            case "AX": 
                mensagem = ("AX - CEP/Complemento do Favorecido Inválido");
                break;
            case "AY": 
                mensagem = ("AY - Sigla do Estado do Favorecido Inválida");
                break;
            case "AZ": 
                mensagem = ("AZ - Código/Nome do Banco Depositário Inválido");
                break;
            case "BA": 
                mensagem = ("BA - Código/Nome da Agência Depositária Não Informado");
                break;
            case "BB": 
                mensagem = ("BB - Seu Número Inválido");
                break;
            case "BC": 
                mensagem = ("BC - Nosso Número Inválido");
                break;
            case "BD": 
                mensagem = ("BD - Inclusão Efetuada com Sucesso");
                break;
            case "BE": 
                mensagem = ("BE - Alteração Efetuada com Sucesso");
                break;
            case "BF": 
                mensagem = ("BF - Exclusão Efetuada com Sucesso");
                break;
            case "BG": 
                mensagem = ("BG - Agência/Conta Impedida Legalmente");
                break;
            case "BH": 
                mensagem = ("BH- Empresa não pagou salário");
                break;
            case "BI": 
                mensagem = ("BI - Falecimento do mutuário");
                break;
            case "BJ": 
                mensagem = ("BJ - Empresa não enviou remessa do mutuário");
                break;
            case "BK": 
                mensagem = ("BK- Empresa não enviou remessa no vencimento");
                break;
            case "BL": 
                mensagem = ("BL - Valor da parcela inválida");
                break;
            case "BM": 
                mensagem = ("BM - Identificação do contrato inválida");
                break;
            case "BN": 
                mensagem = ("BN - Operação de Consignação Incluída com Sucesso");
                break;
            case "BO": 
                mensagem = ("BO - Operação de Consignação Alterada com Sucesso");
                break;
            case "BP": 
                mensagem = ("BP - Operação de Consignação Excluída com Sucesso");
                break;
            case "BQ": 
                mensagem = ("BQ - Operação de Consignação Liquidada com Sucesso");
                break;
            case "BR": 
                mensagem = ("BR - Reativação Efetuada com Sucesso");
                break;
            case "BS": 
                mensagem = ("BS - Suspensão Efetuada com Sucesso");
                break;
            case "CA": 
                mensagem = ("CA - Código de Barras - Código do Banco Inválido");
                break;
            case "CB": 
                mensagem = ("CB - Código de Barras - Código da Moeda Inválido");
                break;
            case "CC": 
                mensagem = ("CC - Código de Barras - Dígito Verificador Geral Inválido");
                break;
            case "CD": 
                mensagem = ("CD - Código de Barras - Valor do Título Inválido");
                break;
            case "CE": 
                mensagem = ("CE - Código de Barras - Campo Livre Inválido");
                break;
            case "CF": 
                mensagem = ("CF - Valor do Documento Inválido");
                break;
            case "CG": 
                mensagem = ("CG - Valor do Abatimento Inválido");
                break;
            case "CH": 
                mensagem = ("CH - Valor do Desconto Inválido");
                break;
            case "CI": 
                mensagem = ("CI - Valor de Mora Inválido");
                break;
            case "CJ": 
                mensagem = ("CJ - Valor da Multa Inválido");
                break;
            case "CK": 
                mensagem = ("CK - Valor do IR Inválido");
                break;
            case "CL": 
                mensagem = ("CL - Valor do ISS Inválido");
                break;
            case "CM": 
                mensagem = ("CM - Valor do IOF Inválido");
                break;
            case "CN": 
                mensagem = ("CN - Valor de Outras Deduções Inválido");
                break;
            case "CO": 
                mensagem = ("CO - Valor de Outros Acréscimos Inválido");
                break;
            case "CP": 
                mensagem = ("CP - Valor do INSS Inválido");
                break;
            case "HA": 
                mensagem = ("HA - Lote Não Aceito");
                break;
            case "HB": 
                mensagem = ("HB - Inscrição da Empresa Inválida para o Contrato");
                break;
            case "HC": 
                mensagem = ("HC - Convênio com a Empresa Inexistente/Inválido para o Contrato");
                break;
            case "HD": 
                mensagem = ("HD - Agência/Conta Corrente da Empresa Inexistente/Inválido para o Contrato");
                break;
            case "HE": 
                mensagem = ("HE - Tipo de Serviço Inválido para o Contrato");
                break;
            case "HF": 
                mensagem = ("HF - Conta Corrente da Empresa com Saldo Insuficiente");
                break;
            case "HG": 
                mensagem = ("HG - Lote de Serviço Fora de Seqüência");
                break;
            case "HH": 
                mensagem = ("HH - Lote de Serviço Inválido");
                break;
            case "HI": 
                mensagem = ("HI - Arquivo não aceito");
                break;
            case "HJ": 
                mensagem = ("HJ - Tipo de Registro Inválido");
                break;
            case "HK": 
                mensagem = ("HK - Código Remessa / Retorno Inválido");
                break;
            case "HL": 
                mensagem = ("HL - Versão de layout inválida");
                break;
            case "HM": 
                mensagem = ("HM - Mutuário não identificado");
                break;
            case "HN": 
                mensagem = ("HN - Tipo do beneficio não permite empréstimo");
                break;
            case "HO": 
                mensagem = ("HO - Beneficio cessado/suspenso");
                break;
            case "HP": 
                mensagem = ("HP - Beneficio possui representante legal");
                break;
            case "HQ": 
                mensagem = ("HQ - Beneficio é do tipo PA - Pensão alimentícia");
                break;
            case "HR": 
                mensagem = ("HR - Quantidade de contratos permitida excedida");
                break;
            case "HS": 
                mensagem = ("HS - Beneficio não pertence ao Banco informado");
                break;
            case "HT": 
                mensagem = ("HT - Início do desconto informado já ultrapassado");
                break;
            case "HU": 
                mensagem = ("HU - Número da parcela inválida");
                break;
            case "HV": 
                mensagem = ("HV - Quantidade de parcela inválida");
                break;
            case "HW": 
                mensagem = ("HW - Margem consignável excedida para o mutuário dentro do prazo do contrato");
                break;
            case "HX": 
                mensagem = ("HX - Empréstimo já cadastrado");
                break;
            case "HY": 
                mensagem = ("HY - Empréstimo inexistente");
                break;
            case "HZ": 
                mensagem = ("HZ - Empréstimo já encerrado");
                break;
            case "H1": 
                mensagem = ("H1 - Arquivo sem trailer");
                break;
            case "H2": 
                mensagem = ("H2 - Mutuário sem crédito na competência");
                break;
            case "H3": 
                mensagem = ("H3 - Não descontado – outros motivos");
                break;
            case "H4": 
                mensagem = ("H4 - Retorno de Crédito não pago");
                break;
            case "H5": 
                mensagem = ("H5 - Cancelamento de empréstimo retroativo");
                break;
            case "H6": 
                mensagem = ("H6 - Outros Motivos de Glosa");
                break;
            case "H7": 
                mensagem = ("H7 - Margem consignável excedida para o mutuário acima do prazo do contrato");
                break;
            case "H8": 
                mensagem = ("H8 - Mutuário desligado do empregador");
                break;
            case "H9": 
                mensagem = ("H9 - Mutuário afastado por licença");
                break;
            case "IA": 
                mensagem = ("IA - Primeiro nome do mutuário diferente do primeiro nome do movimento do censo ou diferente da base de Titular do Benefício");
                break;
            case "IB": 
                mensagem = ("IB - Benefício suspenso/cessado pela APS ou Sisobi");
                break;
            case "IC": 
                mensagem = ("IC - Benefício suspenso por dependência de cálculo");
                break;
            case "ID": 
                mensagem = ("ID - Benefício suspenso/cessado pela inspetoria/auditoria");
                break;
            case "IE": 
                mensagem = ("IE - Benefício bloqueado para empréstimo pelo beneficiário");
                break;
            case "IF": 
                mensagem = ("IF - Benefício bloqueado para empréstimo por TBM");
                break;
            case "IG": 
                mensagem = ("IG - Benefício está em fase de concessão de PA ou desdobramento");
                break;
            case "IH": 
                mensagem = ("IH - Benefício cessado por óbito");
                break;
            case "II": 
                mensagem = ("II - Benefício cessado por fraude");
                break;
            case "IJ": 
                mensagem = ("IJ - Benefício cessado por concessão de outro benefício");
                break;
            case "IK": 
                mensagem = ("IK - Benefício cessado: estatutário transferido para órgão de origem");
                break;
            case "IL": 
                mensagem = ("IL - Empréstimo suspenso pela APS");
                break;
            case "IM": 
                mensagem = ("IM - Empréstimo cancelado pelo banco");
                break;
            case "IN": 
                mensagem = ("IN - Crédito transformado em PAB");
                break;
            case "IO": 
                mensagem = ("IO - Término da consignação foi alterado");
                break;
            case "IP": 
                mensagem = ("IP - Fim do empréstimo ocorreu durante período de suspensão ou concessão");
                break;
            case "IQ": 
                mensagem = ("IQ - Empréstimo suspenso pelo banco");
                break;
            case "IR": 
                mensagem = ("IR - Não averbação de contrato – quantidade de parcelas/competências informadas ultrapassou a data limite da extinção de cota do dependente titular de benefícios");
                break;
            case "TA": 
                mensagem = ("TA - Lote Não Aceito - Totais do Lote com Diferença");
                break;
            case "YA": 
                mensagem = ("YA - Título Não Encontrado");
                break;
            case "YB": 
                mensagem = ("YB - Identificador Registro Opcional Inválido");
                break;
            case "YC": 
                mensagem = ("YC - Código Padrão Inválido");
                break;
            case "YD": 
                mensagem = ("YD - Código de Ocorrência Inválido");
                break;
            case "YE": 
                mensagem = ("YE - Complemento de Ocorrência Inválido");
                break;
            case "YF": 
                mensagem = ("YF - Alegação já Informada");
                break;
            case "ZA": 
                mensagem = ("ZA - Agência / Conta do Favorecido Substituída Observação: As ocorrências iniciadas com ZA tem caráter informativo para o cliente");
                break;
            case "ZB": 
                mensagem = ("ZB - Divergência entre o primeiro e último nome do beneficiário versus primeiro e último nome na Receita Federal");
                break;
            case "ZC": 
                mensagem = ("ZC - Confirmação de Antecipação de Valor");
                break;
            case "ZD": 
                mensagem = ("ZD - Antecipação parcial de valor");
                break;
            case "ZE": 
                mensagem = ("ZE - Título bloqueado na base");
                break;
            case "ZF": 
                mensagem = ("ZF - Sistema em contingência – título valor maior que referência");
                break;
            case "ZG": 
                mensagem = ("ZG - Sistema em contingência – título vencido");
                break;
            case "ZH":  
                mensagem = ("ZH - Sistema em contingência – título indexado");
                break;
            case "ZI": 
                mensagem = ("ZI - Beneficiário divergente");
                break;
            case "ZJ": 
                mensagem = ("ZJ - Limite de pagamentos parciais excedido");
                break;
            case "ZK": 
                mensagem = ("ZK - Boleto já liquidado");
                break;
            default:
                mensagem = (codigoErro + " - Erro desconhecido!");
                break;
        }

        return mensagem;

    }
    
}
