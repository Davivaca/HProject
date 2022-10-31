package recepcao;

/**
 *
 * @author Beatriz
 */
public class Cadastro{
  private String paciente;
  private char sexo;
  private int nascimento;
  private String endereco;
  private int telefone;
  private String email;
  private int rg;
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

  public int getNascimento(){
    return this.nascimento;
  }

  public String getEndereco(){
    return this.endereco;
  }

  public int getTelefone(){
    return this.telefone;
  }

  public String getEmail(){
    return this.email;
  }

  public int getRg(){
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

  public void setNascimento(int data){
    this.nascimento = data;
  }
  
  public void setEndereco(String end){
    this.endereco = end;
  }

  public void setTelefone(int tel){
    this.telefone = tel;
  }

  public void setEmail(String mail){
    this.email = mail;
  }

  public void setRg(int identity){
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
  }
}


/*
1. arrumar tamanho de inteiro em contato
2. arrumar condição para sexo do paciente
3. calcular idade do paciente em nascimento
4. arrumar tamanho de inteiro em rg
5. definir múltipla escolha em tipo sangíneo.
*/
