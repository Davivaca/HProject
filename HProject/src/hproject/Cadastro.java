package hproject;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Beatriz
 */
public class Cadastro{
  private String paciente;
  private char sexo;
  private int nascimento_dia;
  private int nascimento_mes;
  private int nascimento_ano;
  private String endereco;
  private String telefone;
  private String email;
  private String rg;
  private boolean plano;
  private boolean alergia;
  private String qalergia;
  private String tipoSanguineo;
  //private String pagamento;
   
  public String getPaciente() {
    return this.paciente;
  }

  public char getSexo(){
    return this.sexo;
  }

    public int getNascimento_dia() {
        return nascimento_dia;
    }

    public void setNascimento_dia(int nascimento_dia) {
        this.nascimento_dia = nascimento_dia;
    }

    public int getNascimento_mes() {
        return nascimento_mes;
    }

    public void setNascimento_mes(int nascimento_mes) {
        this.nascimento_mes = nascimento_mes;
    }

    public int getNascimento_ano() {
        return nascimento_ano;
    }

    public void setNascimento_ano(int nascimento_ano) {
        this.nascimento_ano = nascimento_ano;
    }

  
  public String getEndereco(){
    return this.endereco;
  }

  public String getTelefone(){
    return this.telefone;
  }

  public String getEmail(){
    return this.email;
  }

  public String getRg(){
    return this.rg;
  }

  public boolean getPlano(){
    return this.plano;
  }

  public boolean getAlergia(){
    return this.alergia;
  }

  public String getQalergia(){
    return this.qalergia;
  }

  public String getTipoSanguineo(){
    return this.tipoSanguineo;
  }


  // OS SET:
  public void setPaciente(String pacient){
    this.paciente = pacient;
  }

  // arrumar aqui
  public void setSexo(char sex){
    this.sexo = sex;
    if(sex != 'M' || sex != 'F'){
        System.out.println("Sexo inválido, tente novamente");}
  }

  
  public void setEndereco(String end){
    this.endereco = end;
  }

  public void setTelefone(String tel){
    this.telefone = tel;
  }

  public void setEmail(String mail){
    this.email = mail;
  }

  public void setRg(String identity){
    this.rg = identity;
  }

  public void setPlano(boolean plan){
    this.plano = plan;
  }

  public void setAlergia(boolean alergic){
    this.alergia = alergic;
  }

  public void setTipoSanguineo(String bloodType){
    this.tipoSanguineo = bloodType;
  }

  /*public void setQalergia(boolean qalergic){
    this.qalergia = qalergic;
  }
  */

  public void status(){
    System.out.println("nome do paciente: " + this.getPaciente());
    System.out.println("Sexo: "+ getSexo());
    System.out.println("endereço: "+ getEndereco());
    System.out.println("contato: "+ getTelefone() + " e-mail: "+ getEmail() + " plano de saude: " + getPlano());
    System.out.println("rg: "+ getRg());
    System.out.println("alergias: "+ getAlergia() + " Se sim, qual: "+ getQalergia());
    System.out.println("Tipo sanguíneo:  "+ getTipoSanguineo());
    //System.out.println(getIdade());
  }

  //tem algo errado aqui.
   public Integer getIdade() {
		GregorianCalendar idade =new GregorianCalendar();
		GregorianCalendar nascimento=new GregorianCalendar();		
		int anohj= idade.get(Calendar.YEAR);
		int anoNascimento=nascimento.get(this.nascimento_ano);
		return (anohj-anoNascimento);
	}

}

