package theboys.sorrentomarina.models.modelsUtente;

/**
 * @author theboys
 */
public class ResponsabileLido {
  private int id;
  private String nome;
  private String cognome;
  private String email;
  private String username;
  private String password_responsabile_lido;
  private int id_lido;
  private int id_resp_ente;

  /**
   * Costruttore crea un reasponsabile lido vuoto
   */
  public ResponsabileLido() {
    super();
  }

  public ResponsabileLido(int id, String nome, String cognome, String email, String username, String password, int id_lido, int id_resp_ente) {
    this.id = id;
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.username = username;
    this.password_responsabile_lido = password;
    this.id_lido = id_lido;
    this.id_resp_ente = id_resp_ente;
  }

  /**
   * Costruttore crea un reasponsabile lido con parametri
   *
   * @param nome
   * @param cognome
   * @param email
   * @param username
   * @param password
   * @param id_lido
   * @param id_resp_ente
   */
  public ResponsabileLido(String nome, String cognome, String email, String username, String password, int id_lido, int id_resp_ente) {
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
    this.username = username;
    this.password_responsabile_lido = password;
    this.id_lido = id_lido;
    this.id_resp_ente = id_resp_ente;
  }

  /**
   * Metodo to string
   *
   * @return String - stringa che riassume lo stato del responsabile lido
   */
  @Override
  public String toString() {
    return "ResponsabileLido[id=" + this.id + ",nome=" + this.nome + ",cognome=" + this.cognome + ",email=" + this.email + ",username=" + this.username + "]";
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

  public String getPassword_responsabile_lido() {
    return password_responsabile_lido;
  }

  public void setPassword_responsabile_lido(String password_responsabile_lido) {
    this.password_responsabile_lido = password_responsabile_lido;
  }

  public int getId_lido() {
    return id_lido;
  }

  public void setId_lido(int id_lido) {
    this.id_lido = id_lido;
  }

  public int getId_resp_ente() {
    return id_resp_ente;
  }

  public void setId_resp_ente(int id_resp_ente) {
    this.id_resp_ente = id_resp_ente;
  }
}
