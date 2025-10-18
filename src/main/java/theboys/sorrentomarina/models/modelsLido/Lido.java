package theboys.sorrentomarina.models.modelsLido;
/**
 * @author theboys
 */
public class Lido {
  private int id;
  private String nome;
  private String indirizzo;
  private String telefono;
  private String email;
  private String logo;
  private float prezzo_singolo;
  private int num_righe;
  private int num_colonne;
  private int id_servizi;
  private int id_resp_ente;

  /**
   * Costruttore crea un lido vuoto
   */
  public Lido() {
    super();
  }

  /**
   * Costruttore crea un lido con parametri
   *
   * @param id
   * @param nome
   * @param indirizzo
   * @param telefono
   * @param email
   * @param logo
   * @param prezzo_singolo
   * @param num_righe
   * @param num_colonne
   * @param id_servizi
   * @param id_resp_ente
   */
  public Lido(int id, String nome, String indirizzo, String telefono, String email, String logo, float prezzo_singolo, int num_righe, int num_colonne, int id_servizi, int id_resp_ente) {
    this.id = id;
    this.nome = nome;
    this.indirizzo = indirizzo;
    this.telefono = telefono;
    this.email = email;
    this.logo = logo;
    this.prezzo_singolo = prezzo_singolo;
    this.num_righe = num_righe;
    this.num_colonne = num_colonne;
    this.id_servizi = id_servizi;
    this.id_resp_ente = id_resp_ente;
  }

  /**
   * Metodo to string
   *
   * @return String - stringa che riassume lo stato del lido
   */
  @Override
  public String toString() {
    return "Lido[id=" + this.id + ", nome=" + this.nome + ", indirizzo=" + this.indirizzo + ", telefono=" + this.telefono + ", email=" + this.email + ", prezzo_singolo=" + this.prezzo_singolo + "]";
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

  public String getIndirizzo() {
    return indirizzo;
  }

  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public float getPrezzo_singolo() {
    return prezzo_singolo;
  }

  public void setPrezzo_singolo(float prezzo_singolo) {
    this.prezzo_singolo = prezzo_singolo;
  }

  public int getNum_righe() {
    return num_righe;
  }

  public void setNum_righe(int num_righe) {
    this.num_righe = num_righe;
  }

  public int getNum_colonne() {
    return num_colonne;
  }

  public void setNum_colonne(int num_colonne) {
    this.num_colonne = num_colonne;
  }

  public int getId_servizi() {
    return id_servizi;
  }

  public void setId_servizi(int id_servizi) {
    this.id_servizi = id_servizi;
  }

  public int getId_resp_ente() {
    return id_resp_ente;
  }

  public void setId_resp_ente(int id_resp_ente) {
    this.id_resp_ente = id_resp_ente;
  }
}