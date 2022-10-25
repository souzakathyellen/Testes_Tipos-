import java.util.Scanner;

public class TestesTipos {
    public static void main(String[] args) throws Exception {
        
        /* 
        int idade = 30;
        //ESSE COMANDO ABAIXO "Integer.toString(idade)" SERVE PARA CONVERTER VARIÁVEL INTEIRA PARA STRING
        String valor = Integer.toString(idade);
        System.out.println(valor);
        

        String valor = "30.5";
        Float idade = Float.parseFloat(valor);
        System.out.println(idade);
        */

        //ESSE COMANDO DE BAIXO ESTÁ INSTANCIANDO A CLASSE SCANNER " QUE SERVE PARA O USUÁRIO DIGITAR DADOS"
       // Scanner scanner = new Scanner(System.in);
        
        //AQUI EMBAIXO APENAR UM COMANDO SIMPLES PARA EXIBIR UMA MENSAGEM
        //System.out.println("Digite o primeiro número: ");

        //ESSE COMANDO EMBAIXO "scanner.nextInt()" ACIONA O TECLADO PARA O USUÁRIO DIGITAR UM NÚMERO
        //SE FOR USAR STRING USAR "scanner.next()"
        
        /*int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: "); 
        int n2 = scanner.nextInt();

        int resultado = n1 + n2; 
        System.out.println("O resultado da soma é: " + resultado);
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Olá, seja bem vinde! " + nome);



    }
}
