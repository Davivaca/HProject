package hproject;
import java.util.Scanner;


public class HProject{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            
            int varfinal=0;
            while(varfinal!=2){
            // TODO code application logic here
            ControlePrincipal cont11;//aqui criamos um objeto da classe controle, que possui todos os metodos que serao utilizados posteriormente
            cont11 = new ControlePrincipal();
            InterfacePrimit inter1;//aqui criamos um objeto da classe interface, que possui todos os metodos que serao usados para interagir com o usuario
            inter1 = new InterfacePrimit();

            Scanner lersist = new Scanner(System.in);//um scanner para ler a opcao de sair do sistema 
            System.out.println("------------------");//um pequeno código para inicializar o sistema
            System.out.println("Sistema em processamento digite 2 para sair ou 1 para continuar"); 
            varfinal = lersist.nextInt();
            if(varfinal==1){
            cont11.apresentar();
            Scanner leruser = new Scanner(System.in);//um scanner para ler o usuario
            Scanner lersenha = new Scanner(System.in);//um scanner para ler a senha
            String senha;
            String user;
            user = leruser.next();//leitura do usuario
            senha = lersenha.next();//leitura da senha
            if(cont11.verificacao(user,senha)==true&&cont11.senhacorreta(user, senha)==true){//verifica se o usuario e senha estao corretos
            cont11.identificacao(user);//chama o metodo para identificar o nome de usuario
            if(cont11.verificacao(user,senha)==true){
                cont11.identificacao(user);//chama o metodo para identificar o nome de usuario
                switch (cont11.getVerifi()) {//pega o resultado da verificacao do usuario para usar nos cases
                    case 1:
                    inter1.interadm();//inicia o sitema do administrador
                        break;
                    case 2:
                        inter1.interrec();//inicia o sitema da recepcao
                        break;
                    case 3:
                        inter1.intermed();//inicia o sitema do medico
                        break;
                    default:
                        break;
                }
            }else{//caso o cadastro seja invalidado
            System.out.println("------------------");
            System.out.println("Cadastro invalido!");
            }

        }
                }else{
                 System.out.println("------------------");
                 System.out.println("Desligando sistema");
                break;
                }
            }
        }
    catch(Exception e){//exceção caso entre algum caractere não permitido.
            System.out.println("Ocorreu um erro ao tentar escolher uma opcao. Tente novamente inserindo apenas valores inteiros");
            }
    }
}