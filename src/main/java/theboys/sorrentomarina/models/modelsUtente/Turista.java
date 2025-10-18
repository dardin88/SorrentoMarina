package theboys.sorrentomarina.models.modelsUtente;

/**
 * @author theboys
 */

public class Turista {
  private int id;
  private String nome;
  private String cognome;
  private String email;
  private String username;
  private String password_turista;

  /**
   * Costruttore turista vuoto
   */
  public Turista() {
    super();
  }

  /**
   * Costruttore turista con parametri
   *
   * @param id
   * @param nome
   * @param cognome
   * @param email
   * @param username
   * @param password
   */
  public Turista(int id, String nome, String cognome, String email, String username, String password) {
    this.id = id;
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.username = username;
    this.password_turista = password;
  }

  /**
   * Costruttore turista con parametri escluso id
   *
   * @param nome
   * @param cognome
   * @param email
   * @param username
   * @param password
   */
  public Turista(String nome, String cognome, String email, String username, String password) {
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.username = username;
    this.password_turista = password;
  }

  /**
   * Costruttore turista solo con alcuni parametri
   *
   * @param nome
   * @param cognome
   * @param email
   */
  public Turista(String nome, String cognome, String email) {
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
  }

  /**
   * Metodo to string
   *
   * @return String - stringa che riassume lo stato del turista
   */
  @Override
  public String toString() {
    return "Turista[id=" + this.id + ",nome=" + this.nome + ",cognome=" + this.cognome + ",email=" + this.email + ",username=" + this.username + ",password="+this.password_turista+"]";
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

  public String getPassword_turista() {
    return password_turista;
  }

  public void setPassword_turista(String password_turista) {
    this.password_turista = password_turista;
  }
}
