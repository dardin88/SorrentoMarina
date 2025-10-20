package theboys.sorrentomarina.models.modelsPrenotazione;

/**
 * @author theboys
 */
public class Prenotazione {
  private int id;
  private String data_inizio;
  private String data_fine;
  private int num_posti;
  private float costo;
  private String codice;
  private int id_lido;
  private int id_turista;

  /**
   * Costruttore crea una prenotazione vuota
   */
  public Prenotazione() {super();  }

  /**
   * Costruttore crea una prenotazione con paramentri
   *
   * @param id
   * @param data_inizio
   * @param data_fine
   * @param num_posti
   * @param costo
   * @param id_lido
   * @param id_turista
   */
  public Prenotazione(int id, String data_inizio, String data_fine, int num_posti, float costo, String codice, int id_lido, int id_turista) {
    this.id = id;
    this.data_inizio = data_inizio;
    this.data_fine = data_fine;
    this.num_posti = num_posti;
    this.costo = costo;
    this.codice = codice;
    this.id_lido = id_lido;
    this.id_turista = id_turista;
  }

  /**
   * Costruttore crea una prenotazione con paramentri escluso id
   *
   * @param data_inizio
   * @param data_fine
   * @param num_posti
   * @param costo
   * @param id_lido
   * @param id_turista
   */
  public Prenotazione(String data_inizio, String data_fine, int num_posti, float costo, String codice, int id_lido, int id_turista) {
    this.data_inizio = data_inizio;
    this.data_fine = data_fine;
    this.num_posti = num_posti;
    this.costo = costo;
    this.codice = codice;
    this.id_lido = id_lido;
    this.id_turista = id_turista;
  }


  // Generated getter and setter methods
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getData_inizio() {
    return data_inizio;
  }

  public void setData_inizio(String data_inizio) {
    this.data_inizio = data_inizio;
  }

  public String getData_fine() {
    return data_fine;
  }

  public void setData_fine(String data_fine) {
    this.data_fine = data_fine;
  }

  public int getNum_posti() {
    return num_posti;
  }

  public void setNum_posti(int num_posti) {
    this.num_posti = num_posti;
  }

  public float getCosto() {
    return costo;
  }

  public void setCosto(float costo) {
    this.costo = costo;
  }

  public String getCodice() {
    return codice;
  }

  public void setCodice(String codice) {
    this.codice = codice;
  }

  public int getId_lido() {
    return id_lido;
  }

  public void setId_lido(int id_lido) {
    this.id_lido = id_lido;
  }

  public int getId_turista() {
    return id_turista;
  }

  public void setId_turista(int id_turista) {
    this.id_turista = id_turista;
  }

  @Override
  public String toString() {
    return "Prenotazione(id=" + id + ", data_inizio=" + data_inizio + ", data_fine=" + data_fine + 
           ", num_posti=" + num_posti + ", costo=" + costo + ", codice=" + codice + 
           ", id_lido=" + id_lido + ", id_turista=" + id_turista + ")";
  }
}
