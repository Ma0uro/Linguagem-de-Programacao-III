public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String email_telefone, char opcao){

        setNome(nome);

        if(opcao == '0'){
            if(!setEmail(email_telefone)){
                System.out.println("Email inserido de forma incorreta!");
                System.exit(1);
            }

            setEmail(email_telefone);
            System.out.println("Email inserido com sucesso!");
        }

        if(opcao == '1') {
            if(!setTelefone(email_telefone)){
                System.out.println("Numero inserido de forma incorreta!");
                System.exit(1);
            }

            setTelefone(email_telefone);
        }
    }

    public Contato(String nome, String email, String telefone){

        setNome(nome);
        System.out.println("Nome inserido com sucesso!");

            if(!setEmail(email)) {
                System.out.println("Email inserido de forma incorreta!");
                System.exit(1);
            }

            setEmail(email);
            System.out.println(("Email inserido com sucesso!"));

            if(!setTelefone(telefone)) {
                System.out.println("Numero inserido de forma incorreta!");
                System.exit(1);
            }

            setTelefone(telefone);
            System.out.println("Numero inserido com sucesso!");
    }

    public boolean validaEmail(String email){

        boolean ponto = false, arroba = false;

        for(int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@'){
                arroba = true;
            }
            if(email.charAt(i) == '.'){
                ponto = true;
            }
            if(arroba && ponto)
                return true;
        }

        return false;
    }

    public boolean validaTelefone(String telefone){

        if(telefone.length() > 11)
            return false;

        for(int i = 0; i < telefone.length(); i++){
            if(telefone.charAt(i) <  '0' || telefone.charAt(i) > '9')
                return false;
        }

        return true;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean setEmail(String email){
        if(validaEmail(email)){
            this.email = email;
        return true;
        }

        return false;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public boolean setTelefone(String telefone){
        if(validaTelefone(telefone)){
            this.telefone = telefone;
        return true;
        }

        return false;
    }

    public String toString(){
        return "\nInformações para contato\n" + "------------------------\n" +
                "Nome: " + this.nome + "\n" + "Email: " + this.email
                + "\n" + "Telefone: "+ this.telefone + "\n";
    }
}

