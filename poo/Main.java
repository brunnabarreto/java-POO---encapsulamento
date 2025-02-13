import models.Pessoa;

public class Main {
public static void main(String[] args) {
    // String nome;
    // int idade;

    // nome = "Brunna!";
    // idade = 17;

    // System.out.println("nome:" + nome);
    // System.out.println("idade:"+ idade);
    
    Pessoa pessoa = new Pessoa("Brunna", 17, "brunna@gmail.com");
   
    pessoa.setNome("Arthur!");


    System.out.println("Nome:" + pessoa.getNome());
    System.out.println("Idade:" + pessoa.getIdade());
    System.out.println("Email:" + pessoa.getEmail());
    

   

} 
}
