package recepcao;

/**
 *
 * @author Beatriz
 */
class Main {
  public static void main(String[] args) {
    System.out.println("-----CADASTRO DE PACIENTES-----");
    
    Cadastro c = new Cadastro();
    
    c.setPaciente("PAcienteAqui");
    c.setSexo('x');
    c.setEndereco("um endereço");
    c.setTelefone(99999999);
    c.status();

    
    System.out.println("-----CADASTRO FINALIZADO-----");
  }
  
}