public class Operadores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(- numero);

        numero = -numero;

        System.out.println(numero);

        numero = numero*-1;

        System.out.println(numero);

        //x repeticao
        //numero = numero + 1;
        //numero++;
        System.out.println(numero++);
        System.out.println(numero);

        System.out.println(++numero);

        boolean variavel = true;
        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);

        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

    //operador ternario
        int a, b;
        a = 5;
        b = 6;
        //String resultado = "";
        //if(a==b)
        //    resultado = "verdadeiro";
        //else
        //    resultado = "falso";

        //String resultado = a==b ? "verdadeiro" : "falso";
        int resultado = a==b ? 1 : 0;
        
        System.out.println(resultado);

    //relacionais

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? "+simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? "+simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? "+simNao);

        String nomeUm = "GLEYSON";
        String nomeDois = new String("GLEYSON");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

    //Lógicos

        boolean condicao1 = true;
        boolean condicao2 = true;

        if(condicao1 && (7>4)){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        System.out.println("fim");
    }
}
