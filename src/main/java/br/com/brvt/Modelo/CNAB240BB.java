package br.com.brvt.Modelo;

public class CNAB240BB {
    /*
     * CNAB240 BB 
     * Conforme documentação disponível em:
     * https://www.bb.com.br/docs/portal/disem/PgtVer03BB.pdf
     */


    // Header do Arquivo
    // Controle
    private int hCtrBanco;            // campo 01.0 - Caracteres de 0 a 2
    private int hCtrLote;             // campo 02.0 - Caracteres de 3 a 6
    private int hCtrRegisto;          // campo 03.0 - Caractere 7
    // Reservado CNAB/Febraban
    private String hCnabFebraban1;     // campo 04.0 - Caracteres de 8 a 16
    // Empresa
    private int hEmpInscTipo;         // campo 05.0 - Caractere 17
    private int hEmpInscNumero;       // campo 06.0 - Caracteres de 18 a 31
    //private int hEmpConvCodigo;     // campo 07.0 foi dividido em 07.0BB1, 07.0BB2, 07.0BB3 e 07.0BB4 - Caracteres de 32 a 51
    private int hEmpConvNumero;       // campo 07.0BB1 - Caracteres de 32 a 40
    private int hEmpConvCodigo;       // campo 07.0BB2 - Caracteres de 41 a 44
    private String hEmpConvResBanco;  // campo 07.0BB3 - Caracteres de 45 a 49
    private String hEmpConvTeste;     // campo 07.0BB4 - Caracteres de 50 a 51
    private int hEmpContAgencia;      // campo 08.0 - Caracteres de 52 a 56
    private int hEmpContAgenciaDv;    // campo 09.0 - Caractere 57
    private int hEmpContConta;        // campo 10.0 - Caracteres de 58 a 69
    private int hEmpContContaDV;      // campo 11.0 - Caractere 70
    private int hEmpContDv;           // campo 12.0 - Caractere 71
    private String hEmpNome;          // campo 13.0 - Caracteres de 72 a 101
    private String hBcoNome;          // campo 14.0 - Caracteres de 102 a 131 
    // Reservado CNAB/Febraban
    private String hCnabFebraban2;    // campo 15.0 - Caracteres de 132 a 141
    // Arquivo
    private int hArqCodigo;           // campo 16.0 - Caractere 142
    private int hArqData;             // campo 17.0 - Caracteres de 143 a 150
    private int hArqHora;             // campo 18.0 - Caracteres de 151 a 156
    private int hArqSequencial;       // campo 19.0 - Caracteres de 157 a 162
    private int hArqLayout;           // campo 20.0 - caracteres de 163 a 165
    private int hArqDensidade;        // campo 21.0 - caracteres de 166 a 170
    // Reservado Banco
    private String hRsvBanco;         // campo 22.0 - caracteres de 171 a 190
    // Reservado Empresa
    private String hRsvEmpresa;       // campo 23.0 - caracteres de 191 a 210
    // Reservado CNAB/Febraban
    private String hCnabFebraban3;    // campo 24.0 - Caracteres de 211 a 221
    private String hIdentificacao;    // campo 25.0 - Caracteres de 222 a 224
    private int hVans;                // campo 26.0 - Caracteres de 225 a 227
    private int hServico;             // campo 27.0 - Caracteres de 228 a 229
    private int hOcorrencias;         // campo 28.0 - Caracteres de 230 a 239

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
