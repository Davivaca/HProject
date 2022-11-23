package hproject;
import java.util.Scanner;

/**
 *
 * @author Beatriz
 */

//falta adicionar os elementos às coleções.
public class Adm {
    String nome;
    char sexo;
    String especialidade;
    int crm;
    String login;
    String senha;
    
    Scanner adms = new Scanner(System.in);
    
    public void cadastrarMedicos(){
        System.out.println("------------------Cadastro de médicos------------------");
        System.out.println("Crie um login e senha:");
        this.login = adms.next();
        this.senha = adms.next();
        System.out.println("Login: " + getLogin()+ " e Senha: " +getSenha()+ " criados.");
    }
    
    public void cadastrarAdm(){
        System.out.println("------------------Cadastro de adms------------------");
        System.out.println("Crie um login e senha:");
        this.login = adms.next();
        this.senha = adms.next();
        System.out.println("Login: " + getLogin()+ " e Senha: " +getSenha()+ " criados.");
        
    }
    
    public void cadastrarRecepcao(){
        System.out.println("------------------Cadastro para recepção------------------");
        System.out.println("Crie um login e senha:");
        this.login = adms.next();
        this.senha = adms.next();
        System.out.println("Login: " + getLogin()+ " e Senha: " +getSenha()+ " criados.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
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
