package hproject;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Beatriz
 */
/*
Escolher especialidade; Ao total serão: clínico geral, pediatria, ginecologia, ortopedia, otorrinolarigologia, cardiologia e endocrinologista.
*/
public class AgendamentoConsulta extends ControlePrincipal {//vai herdar um método coleção de ControlePrincipal.
    private String especialidade;
    private String dataAgendada;
    private int dia;
    private int mes;
    private int ano;
    

    public void Clinico(){//para ter acesso a marcação desta especialidade.
    this.especialidade = "Clinico geral";
    System.out.println("Consulta com " + this.especialidade);
    datetime();
    
    }
    
    public void Pediatria(){//para ter acesso a marcação desta especialidade.
        this.especialidade = "Pediatria";
        System.out.println("Consulta com " + this.especialidade);
        datetime();
        
    }
    
    public void Ginecologia(){//para ter acesso a marcação desta especialidade.
        this.especialidade = "Ginecologia";
        System.out.println("Consulta com " + this.especialidade);
        datetime();
        
    }
    
    public void Ortopedia(){//para ter acesso a marcação desta especialidade.
        this.especialidade = "Ortopedia";
        System.out.println("Consulta com " + this.especialidade);
        datetime();
    }
    
    public void Otorrinolaringologia(){//para ter acesso a marcação desta especialidade.
        this.especialidade = "Otorrinolaringologia";
        System.out.println("Consulta com " + this.especialidade);
        datetime();
    }
    
    public void Cardiologia(){//para ter acesso a marcação desta especialidade.
        this.especialidade = "Cardiologia";
        System.out.println("Consulta com " + this.especialidade);
        datetime();
    }
    
    public void Endocrinologia(){//para ter acesso a marcação desta especialidade.
        this.especialidade = "Endocrinologia";
        System.out.println("Consulta com " + this.especialidade);
        datetime();
    }
    
    public void escolherEspecialidade() {
        //menu para escolher em qual especialidade o paciente deseja realizar consulta.
        try{
            int opcao = 0;
            while(opcao !=8){
            //int opcao;
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Qual especialidade marcar consulta? Escolha dentre as opções abaixo:");
            System.out.println("1. Clinico geral");
            System.out.println("2. Pediatria");
            System.out.println("3. Ginecologia");
            System.out.println("4. Ortopedia");
            System.out.println("5. Otorrinolaringologia");
            System.out.println("6. Cardiologia");
            System.out.println("7. Endocrinologia");
            System.out.println("8. Sair");

            do{
                //menu();
                opcao = entrada.nextInt();

                switch(opcao){
                case 1:
                    Clinico();
                    break;

                case 2:
                    Pediatria();
                    break;

                case 3:
                    Ginecologia();
                    break;

                case 4:
                    Ortopedia();
                    break;

                case 5:
                    Otorrinolaringologia();
                    break;

                case 6:
                    Cardiologia();
                    break;

                case 7:
                    Endocrinologia();
                    break;
                
                default:
                    break;
                
                }
                if(opcao ==8){
                    break;}
                } while(opcao != 0);
            }}
            
        catch(Exception e){//exceção caso entre algum caractere não permitido.
            System.out.println("Ocorreu um erro ao tentar escolher uma opção. Tente novamente inserindo apenas valores inteiros");
            escolherEspecialidade();
            }
    }
    
    public void datetime() {//aqui o usuário vai inserir o dia que deseja agendar a consulta. É printado e guardado a data do agendamento.
        try{
            Scanner lerano = new Scanner(System.in);
            Scanner lermes = new Scanner(System.in);
            Scanner lerdia = new Scanner(System.in);
            Calendar c = Calendar.getInstance();

            System.out.println("Insira a data em que deseja agendar consulta (ano > mês > dia) com " + getEspecialidade() + " :");

            int ano = lerano.nextInt();
            int mes = lermes.nextInt();
            int dia = lerdia.nextInt();

            c.set(ano, mes, dia);
            Date data = c.getTime();
            this.dataAgendada = c.get(Calendar.YEAR) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.DAY_OF_MONTH);
            System.out.println("Data/Hora do cadastro: "+c.getTime());
            String agendamento = "Data agendada: "+ getDataAgendada() + " com "+ getEspecialidade();
            Agend(agendamento);
            System.out.println(agendamento);
            escolherEspecialidade();
        }
        catch(Exception e){ //exceção caso entre algum caractere não permitido.
            System.out.println("Ocorreu um erro ao tentar inserir os dados. Tente novamente inserindo apenas valores inteiros");
            datetime();
            }
        }
    
    public void statusAgendamento(){
        System.out.print("Consulta marcada para " + getDataAgendada() + " com " + getEspecialidade());
        }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(String dataAgendada) {
        this.dataAgendada = dataAgendada;
    }
	
    

    
}