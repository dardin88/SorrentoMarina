package theboys.sorrentomarina.models.modelsUtente;

/**
 * @author theboys
 */
public class ResponsabileEnte {

  private String nome, cognome, email, username, password_ente;
  private int id;

  /**
   * Costruttore crea un reasponsabile ente vuoto
   */
  public ResponsabileEnte() {
    super();
  }

  /**
   * Costruttore crea un reasponsabile ente con parametri
   *
   * @param id
   * @param nome
   * @param cognome
   * @param email
   * @param username
   * @param password
   */
  public ResponsabileEnte(int id, String nome, String cognome, String email, String username, String password) {
    this.id = id;
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.username = username;
    this.password_ente = password;
  }

  /**
   * Costruttore crea un reasponsabile ente con parametri escluso id
   *
   * @param nome
   * @param cognome
   * @param email
   * @param username
   * @param password
   */
  public ResponsabileEnte(String nome, String cognome, String email, String username, String password) {
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.username = username;
    this.password_ente = password;
  }


  // Generated getter and setter methods
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCognome() {
    return cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword_ente() {
    return password_ente;
  }

  public void setPassword_ente(String password_ente) {
    this.password_ente = password_ente;
  }
}
