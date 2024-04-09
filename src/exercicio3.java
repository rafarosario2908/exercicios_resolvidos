import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        // declarando string nome  e inicializando
        String nome = "rafael";
        System.out.printf("ola meu nome é %s ",nome);

        // declarando o scanner 
        Scanner novoScanner = new Scanner(System.in);
        System.out.printf("\ndigite o sobrenome ");

        // declarando a variavel sobrenome e inicializando com scanner
        String sobrenome = novoScanner.nextLine();
        
        // imprimindo o nome todo
        System.out.printf(" seu nome é %s %s ",nome,sobrenome);
        
        novoScanner.close();
        


    }

}
