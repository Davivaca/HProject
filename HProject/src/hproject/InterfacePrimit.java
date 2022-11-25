package hproject;
import java.util.Scanner;

public class InterfacePrimit {
    private int option;
    private String ag;
    int opt2;
    
    AgendamentoConsulta agconsulta = new AgendamentoConsulta();
    Medico med = new Medico();
    Adm adm = new Adm();
    ControlePrincipal cont12;//aqui criamos um objeto da classe controle, para poder utilizar seus metodos
    public InterfacePrimit(){
    cont12 = new ControlePrincipal();//utilizandoo metodo construtor
    }
    public void intermed(){//toda essa parte se refere a interface dos medicos
    while(opt2!=3){//enquanto nao for inserido o valor 3 a interface continua funcionando
    System.out.println("---------------------------------------------");
    System.out.println("Bem vindo/a por favor escolha uma das opções a seguir");
    System.out.println("---------------------------------------------");
    System.out.println(" 1- Verificar lista de pacientes");
    System.out.println(" 2- Adicionar pacientes");
    System.out.println(" 3- Sair");
    System.out.println("---------------------------------------------");  
    Scanner leroption = new Scanner(System.in);//objeto que vai ler a opcao inserida
    opt2 = leroption.nextInt();//insere a opcao
            switch (opt2) {
                case 1:
                cont12.Pacienteshow();//mostra todos os pacientes todos esses metodos estao na classe controle principal
                    break;
                case 2:
                Scanner lerpa = new Scanner(System.in);//objeto que vai ler o novo paciente
                    String paci;
                    System.out.println("Por favor insira um paciente");
                    System.out.println("---------------------------------------------");
                    paci = lerpa.next();//string paci recebe a string inserida pelo usuario
                    cont12.addpaci(paci);//string e adicionada na lista principal
                    break;
                default:
                    break;
            }
        }
    }
    public void interadm(){//toda essa parte se refere a interface dos administradores financeiros
    while(opt2!=3){//enquanto nao for inserido o valor 3 a interface continua funcionando
    System.out.println("---------------------------------------------");
    System.out.println("Bem vindo/a por favor escolha uma das opções a seguir");
    System.out.println("---------------------------------------------");
    System.out.println(" 1- Verificar gastos financeiros");
    System.out.println(" 2- opção a adicionar");
    System.out.println(" 3- Sair");
    System.out.println("---------------------------------------------");  
    Scanner leroption = new Scanner(System.in);//objeto que vai ler a opcao inserida
    opt2 = leroption.nextInt();//insere a opcao
            switch (opt2) {
                case 1:
                
                    break;
                case 2:
                
                    break;
                default:
                    break;
            }
        }  
    }
    public void interrec(){//toda essa parte se refere a interface dos recepcionistas
    while(option!=4){
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
                cont12.Agendshow();//mostra todos os agendamentos todos esses metodos estao na classe controle principal
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
    
    
    public void intermed(){//interface dos medicos.
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
    
    public void interadm(){//interface dos administradores.
        while(option!=5){
            System.out.println("---------------------------------------------");
            System.out.println("Bem vindo(a). Por favor, escolha uma das opções a seguir:");
            System.out.println("---------------------------------------------");
            System.out.println(" 1- Consultar agenda");
            System.out.println(" 2- Cadastrar Administradores");
            System.out.println(" 3- Cadastrar Médicos");
            System.out.println(" 4- Cadastrar Recepcionistas");
            System.out.println(" 5- Sair");
            System.out.println("---------------------------------------------");
            
            Scanner medico = new Scanner(System.in);
            option = medico.nextInt();
                    switch (option) {
                        case 1:
                        cont12.Agendshow();
                            break;
                        case 2:
                            adm.cadastrarAdm();
                            break;
                        case 3:
                            adm.cadastrarMedicos();
                            break;
                            
                        case 4:
                            adm.cadastrarRecepcao();
                            break;
                        default:
                            break;
                    }
        }
    }
    
    public void interrec(){//toda essa parte se refere a interface dos recepcionista
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
