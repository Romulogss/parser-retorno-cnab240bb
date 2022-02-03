package br.com.brvt.Modelo;

public class CNAB240BB {
    /*
     * CNAB240 BB 
     * Conforme documentação disponível em:
     * https://www.bb.com.br/docs/portal/disem/PgtVer03BB.pdf
     */


    // Header qual?

    // Segmento Z
    // Controle
    private int zCtrBanco;            // campo 01.3Z - Caracteres de 0 a 2
    private int zCtrLote;             // campo 02.3Z - Caracteres de 3 a 6
    private int zCtrTipoRegistro;     // campo 03.3Z - Caractere 8
    // Serviço
    private int zSrvNumeroRegistro;   // campo 04.3Z - Caracteres de 8 a 12
    private String zSrvSegmento;      // campo 05.3Z - Caractere 13
    // Autenticação
    private String zAutLegal;         // campo 06.3Z - Caracteres de 14 a 77
    // Controle Bancário
    private String zAutBancaria;      // campo 07.3Z - Caracteres de 78 a 102
    // Reservado CNAB/Febraban
    private String zCnabFebraban;     // campo 08.3Z - Caracteres de 103 a 229
    // Ocorrencias
    private String zOcorrencias;      // campo 09.3Z - Caracteres de 230 a 239
    
}
