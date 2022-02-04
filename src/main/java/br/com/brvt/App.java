package br.com.brvt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.brvt.Modelo.CNAB240BB;
import br.com.brvt.Util.AbrirArquivo;

public class App {
    public static void main(String[] args) {

        // ATENÇÃO: usar path completo
        // Stream stream = new AbrirArquivo("/home/bruno/Projetos/VSCode/parser-retorno-cnab240bb/modelos/CNAB240BB.ret").getStream();
        //System.out.println(stream.count());

        // List<String> linhas = new LinkedList<String>();

        // stream.forEachOrdered(s -> linhas.add(s.toString()));
        // System.out.println(linhas.size());

        // testando parser cabeçalho
        String teste = "00100000         2036438560001730001189170126       0339280000000606766 SESC - SERVICO SOCIAL DO COMERBANCO DO BRASIL S.A.                    22601202212460900004105000022917030464INTRADIA                                        20         ";
        CNAB240BB cnab = new CNAB240BB();
        cnab.setHCtrBanco(teste.substring(0, 3));
        cnab.setHCtrLote(teste.substring(3,7));
        cnab.setHCtrRegistro(teste.substring(7, 8));
        cnab.setHCnabFebraban1(teste.substring(8, 17));
        cnab.setHEmpInscTipo(teste.substring(17, 18));
        cnab.setHEmpInscNumero(teste.substring(18, 32));
        cnab.setHEmpConvNumero(teste.substring(32, 41));
        cnab.setHEmpConvCodigo(teste.substring(41, 45));
        cnab.setHEmpConvResBanco(teste.substring(45, 50));
        cnab.setHEmpConvTeste(teste.substring(50, 52));
        cnab.setHEmpContAgencia(teste.substring(52, 57));
        cnab.setHEmpContAgenciaDv(teste.substring(57, 58));
        cnab.setHEmpContConta(teste.substring(58, 70));
        cnab.setHEmpContContaDv(teste.substring(70, 71));
        cnab.setHEmpContDv(teste.substring(71, 72));
        cnab.setHEmpNome(teste.substring(72, 102));
        cnab.setHBcoNome(teste.substring(102, 132));
        cnab.setHCnabFebraban2(teste.substring(132, 142));
        cnab.setHArqCodigo(teste.substring(142, 143));
        cnab.setHArqData(teste.substring(143, 151));
        cnab.setHArqHora(teste.substring(151, 157));
        cnab.setHArqSequencial(teste.substring(157, 163));
        cnab.setHArqLayout(teste.substring(163, 166));
        cnab.setHArqDensidade(teste.substring(166, 171));
        cnab.setHRsvBanco(teste.substring(171, 191));
        cnab.setHRsvEmpresa(teste.substring(191, 211));
        cnab.setHCnabFebraban3(teste.substring(211, 221));
        cnab.setHIdentificacao(teste.substring(222, 225));
        cnab.setHVans(teste.substring(225, 228));
        cnab.setHServico(teste.substring(228, 230));
        cnab.setHOcorrencias(teste.substring(230, 239));

        System.out.println("Controle"+
                        "\n\tCódigo        : " + cnab.getHCtrBanco() + 
                        "\n\tLote          : " + cnab.getHCtrLote() +
                        "\n\tRegistro      : " + cnab.getHCtrRegistro() +
                        "\nCNAB1                 : " + cnab.getHCnabFebraban1() + "Tamanho: " + cnab.getHCnabFebraban1().length() +
                        "\nEmpresa" +
                        "\n\tTipo          : " + cnab.getHEmpInscTipo() +
                        "\n\tInscrição     : " + cnab.getHEmpInscNumero() +
                        "\n- Convênio" +
                        "\n\tConvênio      : " + cnab.getHEmpConvNumero() +
                        "\n\tCódigo        : " + cnab.getHEmpConvCodigo() +
                        "\n\tRes Banco     : " + cnab.getHEmpConvResBanco() + "Tamanho: " + cnab.getHEmpConvResBanco().length() +
                        "\n\tArq Testes    : " + cnab.getHEmpConvTeste() + "Tamanho: " + cnab.getHEmpConvTeste().length() +
                        "\n- Conta" +
                        "\n-- Agência" +
                        "\n\tAgência       : " + cnab.getHEmpContAgencia() +
                        "\n\tAgência DV    : " + cnab.getHEmpContAgenciaDv()  +
                        "\n-- Conta" +
                        "\n\tConta         : " + cnab.getHEmpContConta() +
                        "\n\tConta DV      : " + cnab.getHEmpContContaDv() + 
                        "\n\tDV            : " + cnab.getHEmpContDv() + "Tamanho: " + cnab.getHEmpContDv().length() +
                        "\n\tNome          : " + cnab.getHEmpNome() + 
                        "\nBanco" +
                        "\n\tNome Banco    : " + cnab.getHBcoNome() + 
                        "\nCNAB2                 : " + cnab.getHCnabFebraban2() + "Tamanho: " + cnab.getHCnabFebraban2().length() +
                        "\nArquivo" +
                        "\n\tCódigo        : " + cnab.getHArqCodigo() +
                        "\n\tData          : " + cnab.getHArqData() +
                        "\n\tHora          : " + cnab.getHArqHora() +
                        "\n\tSequencial    : " + cnab.getHArqSequencial() +
                        "\n\tLayout        : " + cnab.getHArqLayout() +
                        "\n\tDensidade     : " + cnab.getHArqDensidade() +
                        "\nReservado Banco       : " + cnab.getHRsvBanco() + "Tamanho: " + cnab.getHRsvBanco().length() +
                        "\nReserv. Empresa       : " + cnab.getHRsvEmpresa() + "Tamanho: " + cnab.getHRsvEmpresa().length() +
                        "\nCNAB3                 : " + cnab.getHCnabFebraban3() + "Tamanho: " + cnab.getHCnabFebraban3().length() +
                        "\nIdentificação         : " + cnab.getHIdentificacao() + "Tamanho: " + cnab.getHIdentificacao().length() +
                        "\nVANS                  : " + cnab.getHVans() + "Tamanho: " + cnab.getHVans().length() +
                        "\nServiço               : " + cnab.getHSevico() + "Tamanho: " + cnab.getHSevico().length() +
                        "\nOcorrências           : " + cnab.getHOcorrencias() + "Tamanho: " + cnab.getHOcorrencias().length() +                        
                        "");

        

    }
}
