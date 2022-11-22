/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hproject;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class HProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControlePrincipal cont11;//aqui criamos um objeto da classe controle, que possui todos os metodos que serao utilizados posteriormente
        cont11 = new ControlePrincipal();
        cont11.apresentar();
        Scanner leruser = new Scanner(System.in);
        Scanner lersenha = new Scanner(System.in);
        String senha;
        String user;
        user = leruser.next();
        senha = lersenha.next();
        if(cont11.verificacao(user,senha)==true){
        cont11.identificacao(user);//chama o metodo para identificar o nome de usuario
            switch (cont11.getVerifi()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }else{
        System.out.println("Cadastro invalido!");
        }
    }
    
}
