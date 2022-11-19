/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hproject;

/**
 *
 * @author user
 */
public class HProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    CadastroMedico cm = new CadastroMedico();
    cm.setNome("julia");
    cm.setEspecialidade("ginecologista");
    cm.setCrm(12365);
    cm.medicos();
    cm.cadastro();
    
    System.out.println("pronto");
    AgendamentoConsulta ag = new AgendamentoConsulta();
    ag.datetime(2022, 12, 2);
    ag.escolherEspecialidade();
    ag.statusAgendamento();
    
    
    }
    
}
