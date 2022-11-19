package hproject;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Beatriz
 */
/*
escolher especialidade; ao total serão: clínico geral, pediatria, ginecologia, ortopedia, otorrinolarigologia, cardiologia, endocrinologista.
*/
public class AgendamentoConsulta {
    String especialidade;
    String dataAgendada;
    int dia;
    int mes;
    int ano;

    public void Clinico(){
    this.especialidade = "Clinico geral";
    System.out.println("Consulta com " + this.especialidade);
    }
    
    public void Pediatria(){
        this.especialidade = "Pediatria";
        System.out.println("Consulta com " + this.especialidade);
        
    }
    
    public void Ginecologia(){
        this.especialidade = "Ginecologia";
        System.out.println("Consulta com " + this.especialidade);
        
    }
    
    public void Ortopedia(){
        this.especialidade = "Ortopedia";
        System.out.println("Consulta com " + this.especialidade);
    }
    
    public void Otorrinolaringologia(){
        this.especialidade = "Otorrinolaringologia";
        System.out.println("Consulta com " + this.especialidade);
    }
    
    public void Cardiologia(){
        this.especialidade = "Cardiologia";
        System.out.println("Consulta com " + this.especialidade);
    }
    
    public void Endocrinologia(){
        this.especialidade = "Endocrinologia";
        System.out.println("Consulta com " + this.especialidade);
    }
    
    public void escolherEspecialidade() {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual especialidade deseja se consultar? Escolha dentre as opções abaixo:");
        System.out.println("1. Clinico geral");
        System.out.println("2. Pediatria");
        System.out.println("3. Ginecologia");
        System.out.println("4. Ortopedia");
        System.out.println("5. Otorrinolaringologia");
        System.out.println("6. Cardiologia");
        System.out.println("7. Endocrinologia");
        
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
                System.out.println("Opção inválida. Se deseja encerrar, digite 0.");
            }
        } while(opcao != 0);
    }
    
    public void datetime(int ano, int mes, int dia){
        Calendar c = Calendar.getInstance();
        
        c.set(ano, mes, dia);
        Date data = c.getTime();
        this.dataAgendada = c.get(Calendar.YEAR) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.DAY_OF_MONTH);
        System.out.println("Data/Hora do cadastro: "+c.getTime());
        System.out.println("Data agendada: "+ this.dataAgendada);
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
