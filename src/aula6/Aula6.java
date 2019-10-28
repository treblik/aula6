

package aula6;

import java.util.Scanner;

/**
 *
 * @author Aluno01
 */
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO String usuario;
        //1 Escopo 
        //2 Ram
        //Avaliação
        
        Usuario u = new Usuario();
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um O email:");
        //guardo o valor digitado pelo usuario através do sc.nextLine na variável email 
        u.email = sc.nextLine();
        System.out.println("Digite a senha:");
       u.senha = sc.nextLine();
        System.out.println("O email do usuario é:" + u.email );
        System.out.println("Digite o nome:");
        u.nome = sc.nextLine();
        System.out.println("O nome do usuario é "+u.nome);
        
        
        System.out.println("Digite um O email:");
        u2.email = sc.nextLine();
        System.out.println("Digite a senha:");
       u2.senha = sc.nextLine();
        System.out.println("O email do usuario é:" + u2.email );
        System.out.println("Digite o nome:");
        u2.nome = sc.nextLine();
        System.out.println("O nome do usuario é "+u2.nome);
        
        
        System.out.println("Digite um O email:");
        u3.email = sc.nextLine();
        System.out.println("Digite a senha do 3:");
       u3.senha = sc.nextLine();
        System.out.println("O email do usuario é:" + u3.email );
        System.out.println("Digite o nome:");
        u3.nome = sc.nextLine();
        System.out.println("O nome do usuario é "+u3.nome);
        
    }
    
}
