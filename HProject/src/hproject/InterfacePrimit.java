package hproject;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Davi Guedes
 */
public class InterfacePrimit {
    private int option;
    private String ag;
    ControlePrincipal cont12;//aqui criamos um objeto da classe controle, para poder utilizar seus metodos
    public InterfacePrimit(){
    cont12 = new ControlePrincipal();
    }
    public void intermed(){
    
    }
    public void interadm(){
    
    }
    public void interrec(){
    System.out.println("---------------------------------------------");
    System.out.println("Bem vindo/a por favor escolha uma das opções a seguir");
    System.out.println("---------------------------------------------");
    System.out.println(" 1- Verificar agendamentos");
    System.out.println(" 2- Fazer agendamento");
    System.out.println(" 3- Apagar agendamentos");
    System.out.println(" 4- Sair");
    System.out.println("---------------------------------------------");
    Scanner leroption = new Scanner(System.in);//objeto que vai ler a opcao inserida
    option = leroption.nextInt();//insere a opcao
    Scanner geral = new Scanner(System.in);//um scanner geral
            switch (option) {
                case 1:
                cont12.Agendshow();
                    break;
                case 2:
                    System.out.println("Por favor insira um agendamento");
                    System.out.println("---------------------------------------------");
                    setAg(geral.next());//insere o que deseja ser agendado
                    cont12.Agend(getAg());
                    break;
                case 3:
                    cont12.Agenderase();
                    break;
                default:
                    break;
            }
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }
}
