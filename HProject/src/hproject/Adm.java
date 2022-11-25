package hproject;
import java.util.Scanner;

/**
 *
 * @author Beatriz
 */

//falta adicionar os elementos às coleções.
public class Adm extends ControlePrincipal{
    //dados usados nos métodos e que possivelmente serão usados.
    private String nome;
    private String sexo;
    private String especialidade;
    private int crm;
    private String login;
    private String senha;
    
    Scanner adms = new Scanner(System.in);
    
    public void cadastrarMedicos(){ //criar login e senhas para os usuários médicos.
        System.out.println("------------------Cadastro de médicos------------------");
        System.out.println("Crie um login e senha:");
        this.login = adms.next();
        this.senha = adms.next();
        System.out.println("Login: " + getLogin()+ " e Senha: " +getSenha()+ " criados.");
    }
    
    public void cadastrarAdm(){//criar login e senhas para outros usuários administradores.
        System.out.println("------------------Cadastro de adms------------------");
        System.out.println("Crie um login e senha:");
        this.login = adms.next();
        this.senha = adms.next();
        System.out.println("Login: " + getLogin()+ " e Senha: " +getSenha()+ " criados.");
        
    }
    
    public void cadastrarRecepcao(){//criar login e senhas para os usuários que usarão os serviços da recepção.
        System.out.println("------------------Cadastro para recepção------------------");
        System.out.println("Crie um login e senha:");
        this.login = adms.next();
        this.senha = adms.next();
        System.out.println("Login: " + getLogin()+ " e Senha: " +getSenha()+ " criados.");
    }

    //getters e setters dos objetos.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String Senha) {
        this.senha = Senha;
    }
    
    
}
