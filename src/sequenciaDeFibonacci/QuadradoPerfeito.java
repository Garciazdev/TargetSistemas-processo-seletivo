package sequenciaDeFibonacci;

public class QuadradoPerfeito {

    public static boolean verificador(int num){
        int verif;
        double raiz;
        verif = (5 * (num * num) + 4);

        raiz = Math.sqrt(verif);
            return raiz == Math.floor(raiz);

    }

    
}
