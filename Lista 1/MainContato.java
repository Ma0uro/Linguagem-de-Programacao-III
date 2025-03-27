import java.util.Scanner;

public class MainContato {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Forma de contato:\n" + "0 - Email\n" + "1 - Telefone\n" + "2 - Email e Telefone");
        char opcao = sc.nextLine().charAt(0);

        Contato contato;

        if(opcao == '0' || opcao == '1') {
            System.out.print("Email/Telefone: ");
            String email_telefone = sc.nextLine();
            contato = new Contato(nome,email_telefone, opcao);
            System.out.println(contato);
            System.exit(0);
        }

        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        contato = new Contato(nome, email, telefone);

        System.out.println(contato);

        sc.close();
    }
}
