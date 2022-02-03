package br.com.brvt.Modelo;

public class ErrosConciliacao {

    public String getMensagemRetorno(String codigoErro) {
        
        String mensagem;

        switch(codigoErro) {
            case "00":
                mensagem = ("00 - Este código indica que o pagamento foi confirmado");
            case "01":
                mensagem = ("01 - Insuficiência de Fundos - Débito Não Efetuado");
            case "02":
                mensagem = ("02 - Crédito ou Débito Cancelado pelo Pagador/Credor");
            case "03":
                mensagem = ("03 - Débito Autorizado pela Agência - Efetuado");
            case "AA":
                mensagem = ("AA - Controle Inválido");
            case "AB":
                mensagem = ("AB - Tipo de Operação Inválido");
            case "AC": 
                mensagem = ("AC - Tipo de Serviço Inválido");
            case "AD": 
                mensagem = ("AD - Forma de Lançamento Inválida");
            case "AE": 
                mensagem = ("AE - Tipo/Número de Inscrição Inválido");
            case "AF": 
                mensagem = ("AF - Código de Convênio Inválido");
            case "AG": 
                mensagem = ("AG - Agência/Conta Corrente/DV Inválido");
            case "AH": 
                mensagem = ("AH - Nº Seqüencial do Registro no Lote Inválido");
            case "AI": 
                mensagem = ("AI - Código de Segmento de Detalhe Inválido");
            case "AJ": 
                mensagem = ("AJ - Tipo de Movimento Inválido");
            case "AK": 
                mensagem = ("AK - Código da Câmara de Compensação do Banco Favorecido/Depositário Inválido");
            case "AL": 
                mensagem = ("AL - Código do Banco Favorecido ou Depositário Inválido");
            case "AM": 
                mensagem = ("AM - Agência Mantenedora da Conta Corrente do Favorecido Inválida");
            case "AN": 
                mensagem = ("AN - Conta Corrente/DV do Favorecido Inválido");
            case "AO": 
                mensagem = ("AO - Nome do Favorecido Não Informado");
            case "AP": 
                mensagem = ("AP - Data Lançamento Inválido");
            case "AQ": 
                mensagem = ("AQ - Tipo/Quantidade da Moeda Inválido");
            case "AR": 
                mensagem = ("AR - Valor do Lançamento Inválido");
            case "AS": 
                mensagem = ("AS - Aviso ao Favorecido - Identificação Inválida");
            case "AT": 
                mensagem = ("AT - Tipo/Número de Inscrição do Favorecido Inválido");
            case "AU": 
                mensagem = ("AU - Logradouro do Favorecido Não Informado");
            case "AV": 
                mensagem = ("AV - Nº do Local do Favorecido Não Informado");
            case "AW": 
                mensagem = ("AW - Cidade do Favorecido Não Informada");
            case "AX": 
                mensagem = ("AX - CEP/Complemento do Favorecido Inválido");
            case "AY": 
                mensagem = ("AY - Sigla do Estado do Favorecido Inválida");
            case "AZ": 
                mensagem = ("AZ - Código/Nome do Banco Depositário Inválido");
            case "BA": 
                mensagem = ("BA - Código/Nome da Agência Depositária Não Informado");
            case "BB": 
                mensagem = ("BB - Seu Número Inválido");
            case "BC": 
                mensagem = ("BC - Nosso Número Inválido");
            case "BD": 
                mensagem = ("BD - Inclusão Efetuada com Sucesso");
            case "BE": 
                mensagem = ("BE - Alteração Efetuada com Sucesso");
            case "BF": 
                mensagem = ("BF - Exclusão Efetuada com Sucesso");
            case "BG": 
                mensagem = ("BG - Agência/Conta Impedida Legalmente");
            case "BH": 
                mensagem = ("BH- Empresa não pagou salário");
            case "BI": 
                mensagem = ("BI - Falecimento do mutuário");
            case "BJ": 
                mensagem = ("BJ - Empresa não enviou remessa do mutuário");
            case "BK": 
                mensagem = ("BK- Empresa não enviou remessa no vencimento");
            case "BL": 
                mensagem = ("BL - Valor da parcela inválida");
            case "BM": 
                mensagem = ("BM - Identificação do contrato inválida");
            case "BN": 
                mensagem = ("BN - Operação de Consignação Incluída com Sucesso");
            case "BO": 
                mensagem = ("BO - Operação de Consignação Alterada com Sucesso");
            case "BP": 
                mensagem = ("BP - Operação de Consignação Excluída com Sucesso");
            case "BQ": 
                mensagem = ("BQ - Operação de Consignação Liquidada com Sucesso");
            case "BR": 
                mensagem = ("BR - Reativação Efetuada com Sucesso");
            case "BS": 
                mensagem = ("BS - Suspensão Efetuada com Sucesso");
            case "CA": 
                mensagem = ("CA - Código de Barras - Código do Banco Inválido");
            case "CB": 
                mensagem = ("CB - Código de Barras - Código da Moeda Inválido");
            case "CC": 
                mensagem = ("CC - Código de Barras - Dígito Verificador Geral Inválido");
            case "CD": 
                mensagem = ("CD - Código de Barras - Valor do Título Inválido");
            case "CE": 
                mensagem = ("CE - Código de Barras - Campo Livre Inválido");
            case "CF": 
                mensagem = ("CF - Valor do Documento Inválido");
            case "CG": 
                mensagem = ("CG - Valor do Abatimento Inválido");
            case "CH": 
                mensagem = ("CH - Valor do Desconto Inválido");
            case "CI": 
                mensagem = ("CI - Valor de Mora Inválido");
            case "CJ": 
                mensagem = ("CJ - Valor da Multa Inválido");
            case "CK": 
                mensagem = ("CK - Valor do IR Inválido");
            case "CL": 
                mensagem = ("CL - Valor do ISS Inválido");
            case "CM": 
                mensagem = ("CM - Valor do IOF Inválido");
            case "CN": 
                mensagem = ("CN - Valor de Outras Deduções Inválido");
            case "CO": 
                mensagem = ("CO - Valor de Outros Acréscimos Inválido");
            case "CP": 
                mensagem = ("CP - Valor do INSS Inválido");
            case "HA": 
                mensagem = ("HA - Lote Não Aceito");
            case "HB": 
                mensagem = ("HB - Inscrição da Empresa Inválida para o Contrato");
            case "HC": 
                mensagem = ("HC - Convênio com a Empresa Inexistente/Inválido para o Contrato");
            case "HD": 
                mensagem = ("HD - Agência/Conta Corrente da Empresa Inexistente/Inválido para o Contrato");
            case "HE": 
                mensagem = ("HE - Tipo de Serviço Inválido para o Contrato");
            case "HF": 
                mensagem = ("HF - Conta Corrente da Empresa com Saldo Insuficiente");
            case "HG": 
                mensagem = ("HG - Lote de Serviço Fora de Seqüência");
            case "HH": 
                mensagem = ("HH - Lote de Serviço Inválido");
            case "HI": 
                mensagem = ("HI - Arquivo não aceito");
            case "HJ": 
                mensagem = ("HJ - Tipo de Registro Inválido");
            case "HK": 
                mensagem = ("HK - Código Remessa / Retorno Inválido");
            case "HL": 
                mensagem = ("HL - Versão de layout inválida");
            case "HM": 
                mensagem = ("HM - Mutuário não identificado");
            case "HN": 
                mensagem = ("HN - Tipo do beneficio não permite empréstimo");
            case "HO": 
                mensagem = ("HO - Beneficio cessado/suspenso");
            case "HP": 
                mensagem = ("HP - Beneficio possui representante legal");
            case "HQ": 
                mensagem = ("HQ - Beneficio é do tipo PA - Pensão alimentícia");
            case "HR": 
                mensagem = ("HR - Quantidade de contratos permitida excedida");
            case "HS": 
                mensagem = ("HS - Beneficio não pertence ao Banco informado");
            case "HT": 
                mensagem = ("HT - Início do desconto informado já ultrapassado");
            case "HU": 
                mensagem = ("HU - Número da parcela inválida");
            case "HV": 
                mensagem = ("HV - Quantidade de parcela inválida");
            case "HW": 
                mensagem = ("HW - Margem consignável excedida para o mutuário dentro do prazo do contrato");
            case "HX": 
                mensagem = ("HX - Empréstimo já cadastrado");
            case "HY": 
                mensagem = ("HY - Empréstimo inexistente");
            case "HZ": 
                mensagem = ("HZ - Empréstimo já encerrado");
            case "H1": 
                mensagem = ("H1 - Arquivo sem trailer");
            case "H2": 
                mensagem = ("H2 - Mutuário sem crédito na competência");
            case "H3": 
                mensagem = ("H3 - Não descontado – outros motivos");
            case "H4": 
                mensagem = ("H4 - Retorno de Crédito não pago");
            case "H5": 
                mensagem = ("H5 - Cancelamento de empréstimo retroativo");
            case "H6": 
                mensagem = ("H6 - Outros Motivos de Glosa");
            case "H7": 
                mensagem = ("H7 - Margem consignável excedida para o mutuário acima do prazo do contrato");
            case "H8": 
                mensagem = ("H8 - Mutuário desligado do empregador");
            case "H9": 
                mensagem = ("H9 - Mutuário afastado por licença");
            case "IA": 
                mensagem = ("IA - Primeiro nome do mutuário diferente do primeiro nome do movimento do censo ou diferente da base de Titular do Benefício");
            case "IB": 
                mensagem = ("IB - Benefício suspenso/cessado pela APS ou Sisobi");
            case "IC": 
                mensagem = ("IC - Benefício suspenso por dependência de cálculo");
            case "ID": 
                mensagem = ("ID - Benefício suspenso/cessado pela inspetoria/auditoria");
            case "IE": 
                mensagem = ("IE - Benefício bloqueado para empréstimo pelo beneficiário");
            case "IF": 
                mensagem = ("IF - Benefício bloqueado para empréstimo por TBM");
            case "IG": 
                mensagem = ("IG - Benefício está em fase de concessão de PA ou desdobramento");
            case "IH": 
                mensagem = ("IH - Benefício cessado por óbito");
            case "II": 
                mensagem = ("II - Benefício cessado por fraude");
            case "IJ": 
                mensagem = ("IJ - Benefício cessado por concessão de outro benefício");
            case "IK": 
                mensagem = ("IK - Benefício cessado: estatutário transferido para órgão de origem");
            case "IL": 
                mensagem = ("IL - Empréstimo suspenso pela APS");
            case "IM": 
                mensagem = ("IM - Empréstimo cancelado pelo banco");
            case "IN": 
                mensagem = ("IN - Crédito transformado em PAB");
            case "IO": 
                mensagem = ("IO - Término da consignação foi alterado");
            case "IP": 
                mensagem = ("IP - Fim do empréstimo ocorreu durante período de suspensão ou concessão");
            case "IQ": 
                mensagem = ("IQ - Empréstimo suspenso pelo banco");
            case "IR": 
                mensagem = ("IR - Não averbação de contrato – quantidade de parcelas/competências informadas ultrapassou a data limite da extinção de cota do dependente titular de benefícios");
            case "TA": 
                mensagem = ("TA - Lote Não Aceito - Totais do Lote com Diferença");
            case "YA": 
                mensagem = ("YA - Título Não Encontrado");
            case "YB": 
                mensagem = ("YB - Identificador Registro Opcional Inválido");
            case "YC": 
                mensagem = ("YC - Código Padrão Inválido");
            case "YD": 
                mensagem = ("YD - Código de Ocorrência Inválido");
            case "YE": 
                mensagem = ("YE - Complemento de Ocorrência Inválido");
            case "YF": 
                mensagem = ("YF - Alegação já Informada");
            case "ZA": 
                mensagem = ("ZA - Agência / Conta do Favorecido Substituída Observação: As ocorrências iniciadas com ZA tem caráter informativo para o cliente");
            case "ZB": 
                mensagem = ("ZB - Divergência entre o primeiro e último nome do beneficiário versus primeiro e último nome na Receita Federal");
            case "ZC": 
                mensagem = ("ZC - Confirmação de Antecipação de Valor");
            case "ZD": 
                mensagem = ("ZD - Antecipação parcial de valor");
            case "ZE": 
                mensagem = ("ZE - Título bloqueado na base");
            case "ZF": 
                mensagem = ("ZF - Sistema em contingência – título valor maior que referência");
            case "ZG": 
                mensagem = ("ZG - Sistema em contingência – título vencido");
            case "ZH":  
                mensagem = ("ZH - Sistema em contingência – título indexado");
            case "ZI": 
                mensagem = ("ZI - Beneficiário divergente");
            case "ZJ": 
                mensagem = ("ZJ - Limite de pagamentos parciais excedido");
            case "ZK": 
                mensagem = ("ZK - Boleto já liquidado");
            default:
                mensagem = ("Erro Desconhecido");
        }

        return mensagem;

    }
}
