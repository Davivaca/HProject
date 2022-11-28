package hproject;
import java.util.Scanner;

public class InterfacePrimit {
    private int option;
    private String ag;
    int opt2;
    
    AgendamentoConsulta agconsulta = new AgendamentoConsulta(); //objeto da classe AgendamentoConsulta para utilizar em sua interface.
    Medico med = new Medico(); // objeto da classe Medico para chamar em sua interface.
    Adm adm = new Adm(); // objeto da classe Adm, para utilizar seus métodos.
    ControlePrincipal cont12;//aqui criamos um objeto da classe controle, para poder utilizar seus metodos
    ControleFinanceiro cf = new ControleFinanceiro();
    
    public InterfacePrimit(){
        cont12 = new ControlePrincipal();//utilizandoo metodo construtor
        }
    /*esse codigo nao tem mais utilidade mas sera mantido caso surja uma necessidade futura
    *
    *public void intermed(){//toda essa parte se refere a interface dos medicos
    *while(opt2!=3){//enquanto nao for inserido o valor 3 a interface continua funcionando
    *System.out.println("---------------------------------------------");
    *System.out.println("Bem vindo/a por favor escolha uma das opções a seguir");
    *System.out.println("---------------------------------------------");
    *System.out.println(" 1- Verificar lista de pacientes");
    *System.out.println(" 2- Adicionar pacientes");
    *System.out.println(" 3- Sair");
    *System.out.println("---------------------------------------------");  
    *Scanner leroption = new Scanner(System.in);//objeto que vai ler a opcao inserida
    *opt2 = leroption.nextInt();//insere a opcao
    *        switch (opt2) {
    *            case 1:
    *            cont12.Pacienteshow();//mostra todos os pacientes todos esses metodos estao na classe controle principal
    *                break;
    *            case 2:
    *            Scanner lerpa = new Scanner(System.in);//objeto que vai ler o novo paciente
    *                String paci;
    *                System.out.println("Por favor insira um paciente");
    *                System.out.println("---------------------------------------------");
    *                paci = lerpa.next();//string paci recebe a string inserida pelo usuario
    *                cont12.addpaci(paci);//string e adicionada na lista principal
    *                break;
    *            default:
    *                break;
    *        }
    *    }
    }*/
    
    /*esse codigo nao tem mais utilidade mas sera mantido caso surja uma necessidade futura
    *
    *public void interadm(){//toda essa parte se refere a interface dos administradores financeiros
    *while(opt2!=3){//enquanto nao for inserido o valor 3 a interface continua funcionando
    *System.out.println("---------------------------------------------");
    *System.out.println("Bem vindo/a por favor escolha uma das opções a seguir");
    *System.out.println("---------------------------------------------");
    *System.out.println(" 1- Verificar gastos financeiros");
    *System.out.println(" 2- opção a adicionar");
    *System.out.println(" 3- Sair");
    *System.out.println("---------------------------------------------");  
    *Scanner leroption = new Scanner(System.in);//objeto que vai ler a opcao inserida
    *opt2 = leroption.nextInt();//insere a opcao
    *        switch (opt2) {
    *            case 1:
    *            
    *                break;
    *            case 2:
    *            
    *                break;
    *            default:
    *                break;
    *        }
    *    }  
    }*/
    
    /*esse codigo nao tem mais utilidade mas sera mantido caso surja uma necessidade futura
    
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
    */
    
    public void intermed(){//interface dos medicos.
        while(option!=4){
            System.out.println("---------------------------------------------");
            System.out.println("Bem vindo(a). Por favor, escolha uma das opcoes a seguir:");
            System.out.println("---------------------------------------------");
            System.out.println(" 1- Consultar agenda");
            System.out.println(" 2- Avaliacao do paciente");
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
    
    public void interadm(){//interface dos administradores. "Produtos" são os utensílios usados na unidade hospitalar.
        while(option!=12){
            System.out.println("---------------------------------------------");
            System.out.println("Bem vindo(a). Por favor, escolha uma das opções a seguir:");
            System.out.println("---------------------------------------------");
            System.out.println(" 1- Consultar agenda");
            System.out.println(" 2- Cadastrar Administradores");
            System.out.println(" 3- Cadastrar Medicos");
            System.out.println(" 4- Cadastrar Recepcionistas");
            System.out.println(" 5- Adicionar Produto");
            System.out.println(" 6- Listar Produtos ");
            System.out.println(" 7- Adicionar Clientes");
            System.out.println(" 8- Total de Produtos");
            System.out.println(" 9- valor Planos");
            System.out.println(" 10- Balanço de Contas");
            System.out.println(" 11- Listar clientes");
            System.out.println(" 12- Sair");
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
                                
                        case 5:
                                cf.adicionaProduto();
                                break;
                        case 6:
                                cf.listarProdutos();
                                break;
                        case 7:
                                cf.adicionaClientes();
                                break;
                        case 8:
                                cf.calculaTotalProdutos();
                                break;
                        case 9:
                                cf.calculaValorPlanos();
                                break;
                        case 10:
                                cf.balanco();
                                break;  
                        case 11:
                            cf.listarClientes();
                            break;
                        default:
                            break;
                    }
        }
    }
    
    public void interrec(){//toda essa parte se refere a interface dos recepcionista
        while(option!=4){
            System.out.println("---------------------------------------------");
            System.out.println("Bem vindo(a). Por favor, escolha uma das opcoes a seguir:");
            System.out.println("---------------------------------------------");
            System.out.println(" 1- Verificar agendamentos");
            System.out.println(" 2- Fazer agendamento");
            System.out.println(" 3- Apagar agendamentos");
            System.out.println(" 4- Sair");
            System.out.println("---------------------------------------------");
            Scanner leroption = new Scanner(System.in);//objeto que vai ler a opcao inserida
            option = leroption.nextInt();//insere a opcao
            //Scanner geral = new Scanner(System.in);//um scanner geral
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