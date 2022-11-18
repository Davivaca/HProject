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
    List medicos = new ArrayList();//criacao da lista de medicos
    List user_pri = new ArrayList();//criação da lista de usuarios
    List senhas_pri = new ArrayList();//criação da lista de senhas
    List pacientes = new ArrayList();//criacao da lista de pacientes
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
    public String ListaMedicos(){
        medicos.add("Doutor joao");//adiciona um medico inicial para a lista de medicos
        return null;   
    }
    public String addmed(String medi,String senhamed){//esse metodo adiciona um novo medico
    user_pri.add(medi);
    medicos.add(medi);
    senhas_pri.add(senhamed);
    return null;
    }
}
