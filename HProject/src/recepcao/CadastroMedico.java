package recepcao;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Beatriz
 */

/*
nome, sexo, especialidade, crm
*/
public class CadastroMedico {
    String nome;
    char sexo;
    String especialidade;
    int crm;
    String login;
    String Senha;
    
    List medico = new ArrayList();
    List medicos = new ArrayList();
    
    /*public CadastroMedico(String nome, char sexo, String especialidade, int crm, String login, String Senha) {
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.crm = crm;
        this.login = login;
        this.Senha = Senha;
    }*/

    
    public void cadastro(){
        /*medico.add(this.nome);
        medico.add(this.sexo);
        medico.add(this.especialidade);
        medico.add(this.crm);
        medico.add(this.login);
        medico.add(this.Senha);*/
        medicos.add(medico);
        System.out.println(medico);
        System.out.println("alg");
        }

    public String getNome() {
        return nome;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
        medico.add(this.nome);
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        medico.add(this.sexo);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        medico.add(this.especialidade);
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
        medico.add(this.crm);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        medico.add(this.login);
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
        medico.add(this.Senha);
    }

    public List getMedico() {
        return medico;
    }

    public void setMedico(List medico) {
        this.medico = medico;
    }

    public List getMedicos() {
        return medicos;
    }

    public void setMedicos(List medicos) {
        this.medicos = medicos;
    }

    public void medicos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
