package hproject;
import java.util.List;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Davi Guedes
 */
public class ControlePrincipal {
    int verifi;//variavel que verifica se o usuario e adiministrador medico ou recepcionista
    List medicos = new ArrayList();//criacao da lista de medicos
    List user_pri = new ArrayList();//criação da lista de usuarios
    List senhas_pri = new ArrayList();//criação da lista de senhas
    List pacientes = new ArrayList();//criacao da lista de pacientes
    List adms = new ArrayList();//criacao da lista de administradores financeiros
    List recep = new ArrayList();//criacao da lista de recepcionistas
    public ControlePrincipal() {//classe construtora
    user_pri.add("ADMdavi");//adiciona os usuarios iniciais
    user_pri.add("RECjulia");
    user_pri.add("MEDjoao");

    senhas_pri.add("10023");//adiciona as senhas iniciais
    senhas_pri.add("64599");
    senhas_pri.add("23764");        
    }
    public String ListaPaciente(){
        pacientes.add("Joao Pinheiro Nasc:12/12/1998");//adiciona os pacientes iniciais
        pacientes.add("Julia Pereira Nasc:3/11/1997");
        pacientes.add("Julio Andrade Nasc:12/2/1988");
        return null;   
    }
    public String addpaci(String paci){//esse metodo adiciona um novo paciente
    pacientes.add(paci);
    return null;
    }
    public String ListaMedicos(){
        user_pri.add("MEDjoao");//adiciona a lista principal
        medicos.add("MEDjoao");//adiciona um medico inicial para a lista de medicos
        senhas_pri.add("12543");//adiciona a lista de senhas principal
        return null;   
    }
    public String addmed(String medi,String senhamed){//esse metodo adiciona um novo medico
    medicos.add(medi);
    return null;
    }
    public String ListaAdms(){
        adms.add("ADMdavi");//adiciona um adm inicial para a lista de administração
        return null;   
    }
    public String addadm(String adm,String senhaadm){//esse metodo adiciona um novo administrador financeiro
    user_pri.add(adm);//adiciona a lista principal
    adms.add(adm);
    senhas_pri.add(senhaadm);//adiciona a lista de senhas principal
    return null;
    }
    public String Listarecep(){
        recep.add("RECjulia");//adiciona um recepcionista inicial para a lista de recepcao
        return null;   
    }
    public boolean verificacao(String usu,String senh){
        if(user_pri.contains(usu)&&senhas_pri.contains(senh)){//verifica se o usuario e senha existem na lista
        return true;
        }else{
        return false;
        }
    }
    public String addrecep(String rec,String senharec){//esse metodo adiciona um novo recepcionista
    user_pri.add(rec);//adiciona a lista principal
    recep.add(rec);
    senhas_pri.add(senharec);//adiciona a lista de senhas principal
    return null;
    }
    public void apresentar(){//metodo simples de apresentacao
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Seja bem vindo/a ao sistema de gerenciamento hospitalar Hproject");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Por favor insira seu nome de usuario e senha para prosseguir");
    }
    public int identificacao(String useri){//metodo para identificar se o usuario e adiministrador medico ou recepcionista
        int tama;//tamanho da string usuario
        tama=useri.length();
    for(int i=0;i<tama;i++ ){
    if(useri.charAt(i) == 'A'||useri.charAt(i+1)=='D'){
    setVerifi(1);
    break;
    }else if(useri.charAt(i) == 'R'||useri.charAt(i+1)=='E'){
     setVerifi(2);
     break;
      }else if(useri.charAt(i) == 'M'||useri.charAt(i+1)=='E'){
       setVerifi(3);
       break;
       }else{
       System.out.println("Nome do usuario invalido!");
      }
    }
       return 0;     
    }

    public int getVerifi() {
        return verifi;
    }

    public void setVerifi(int verifi) {
        this.verifi = verifi;
    }
    
}