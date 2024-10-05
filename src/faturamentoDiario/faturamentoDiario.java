package faturamentoDiario;

public class faturamentoDiario {
    public static void main(String[] args) {

        FaturamentoDados[] faturamentoDiario = new FaturamentoDados[30];
        faturamentoDiario[0] = new FaturamentoDados("01/10/2023", 22174.1664);
        faturamentoDiario[1] = new FaturamentoDados("02/10/2023", 24537.6698);
        faturamentoDiario[2] = new FaturamentoDados("03/10/2023", 26139.6134);
        faturamentoDiario[3] = new FaturamentoDados("04/10/2023", 0.0);
        faturamentoDiario[4] = new FaturamentoDados("05/10/2023", 0.0);
        faturamentoDiario[5] = new FaturamentoDados("06/10/2023", 26742.6612);
        faturamentoDiario[6] = new FaturamentoDados("07/10/2023", 0.0);
        faturamentoDiario[7] = new FaturamentoDados("08/10/2023", 42889.2258);
        faturamentoDiario[8] = new FaturamentoDados("09/10/2023", 46251.174);
        faturamentoDiario[9] = new FaturamentoDados("10/10/2023",11191.4722);
        faturamentoDiario[10] = new FaturamentoDados("11/10/2023",0.0);
        faturamentoDiario[11] = new FaturamentoDados("12/10/2023",0.0);
        faturamentoDiario[12] = new FaturamentoDados("13/10/2023",3847.4823);
        faturamentoDiario[13] = new FaturamentoDados("14/10/2023",373.7838);
        faturamentoDiario[14] = new FaturamentoDados("15/10/2023",2659.7563);
        faturamentoDiario[15] = new FaturamentoDados("16/10/2023",48924.2448);
        faturamentoDiario[16] = new FaturamentoDados("17/10/2023",18419.2614);
        faturamentoDiario[17] = new FaturamentoDados("18/10/2023",0.0);
        faturamentoDiario[18] = new FaturamentoDados("19/10/2023",0.0);
        faturamentoDiario[19] = new FaturamentoDados("20/10/2023",35240.1826);
        faturamentoDiario[20] = new FaturamentoDados("21/10/2023",43829.1667);
        faturamentoDiario[21] = new FaturamentoDados("22/10/2023",18235.6852);
        faturamentoDiario[22] = new FaturamentoDados("23/10/2023",4355.0662);
        faturamentoDiario[23] = new FaturamentoDados("24/10/2023",13327.1025);
        faturamentoDiario[24] = new FaturamentoDados("25/10/2023",0.0);
        faturamentoDiario[25] = new FaturamentoDados("26/10/2023",0.0);
        faturamentoDiario[26] = new FaturamentoDados("27/10/2023",25681.8318);
        faturamentoDiario[27] = new FaturamentoDados("28/10/2023",1718.12);
        faturamentoDiario[28] = new FaturamentoDados("29/10/2023",13220.49);
        faturamentoDiario[29] = new FaturamentoDados("30/10/2023",8414.61);

        double somaFaturamento = 0.00;
        int diasComFaturamento = 21;

        for(FaturamentoDados f : faturamentoDiario) {
            if(f != null && f.getValor()> 0.00){
                somaFaturamento += f.getValor();
            }
        }

        double mediaFaturamento = somaFaturamento/diasComFaturamento;
        int diasAbaixoDaMedia = 0;

        for (FaturamentoDados f : faturamentoDiario) {
            if (f != null && f.getValor() > 0.0 && f.getValor() < mediaFaturamento) {
                diasAbaixoDaMedia++;

            }
        }

        FaturamentoDados menorFaturamento = faturamentoDiario[0];
        FaturamentoDados maiorFaturamento = faturamentoDiario[0];

        for(FaturamentoDados f : faturamentoDiario) {
            if (f.getValor() < menorFaturamento.getValor()){
                menorFaturamento = f;
            }
            if (f.getValor() > maiorFaturamento.getValor()){
                maiorFaturamento = f;
            }
        }

        System.out.println("Menor Faturamento: " + menorFaturamento);
        System.out.println("Maior Faturamento: " + maiorFaturamento);
        System.out.println("O Numero de Dias que o faturamento diario foi maior que a media mensal: " + diasAbaixoDaMedia+ " Dias");
    }


}

