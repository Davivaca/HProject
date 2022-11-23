package hproject;
import java.util.Scanner;

public class InterfacePrimit {
    private int option;
    private String ag;
    
    AgendamentoConsulta agconsulta = new AgendamentoConsulta();
    Medico med = new Medico();
    ControlePrincipal cont12;//aqui criamos um objeto da classe controle, para poder utilizar seus metodos
    public InterfacePrimit(){
    cont12 = new ControlePrincipal();
    }
    
    
    public void intermed(){
        while(option!=4){
            System.out.println("---------------------------------------------");
            System.out.println("Bem vindo(a). Por favor, escolha uma das opções a seguir:");
            System.out.println("---------------------------------------------");
            System.out.println(" 1- Consultar agenda");
            System.out.println(" 2- Avaliação do paciente");
            System.out.println(" 3- Cancelar agendamentos");
            System.out.println(" 4- Sair");
            System.out.println("---------------------------------------------");
            
            Scanner medico = new Scanner(System.in);
            option = medico.nextInt();
                    switch (option) {
                        case 1:
                        cont12.Agendshow();
                            break;
                        case 2:
                            med.AvaliacaoPaciente();
                            med.statusAvaliacao();
                            break;
                        case 3:
                            cont12.Agenderase();
                            break;
                        default:
                            break;
                    }
        }
        }
    
    public void interadm(){
        System.out.print("por enquanto está vazio.");
    }
    
    public void interrec(){
        while(option!=4){
        System.out.println("---------------------------------------------");
        System.out.println("Bem vindo(a). Por favor, escolha uma das opções a seguir:");
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
                        /*System.out.println("Por favor insira um agendamento");
                        System.out.println("---------------------------------------------");
                        setAg(geral.next());//insere o que deseja ser agendado
                        cont12.Agend(getAg());*/
                        agconsulta.escolherEspecialidade();
                        break;
                    case 3:
                        cont12.Agenderase();
                        break;
                    default:
                        break;
                }
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
