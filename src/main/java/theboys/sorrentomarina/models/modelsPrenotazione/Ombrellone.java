package theboys.sorrentomarina.models.modelsPrenotazione;

/**
 * @author theboys
 */
public class Ombrellone {

  private int id;
  private int num_riga;
  private int num_colonna;
  private int id_prenotazione;

  /**
   * Costruttore crea un ombrellone vuoto
   */
  public Ombrellone() {
    super();
  }

  /**
   * Costruttore crea un ombrellone con parametri
   *
   * @param id
   * @param num_riga
   * @param num_colonna
   * @param id_prenotazione
   */
  public Ombrellone(int id,int num_riga,int num_colonna,int id_prenotazione) {
    this.id=id;
    this.num_riga=num_riga;
    this.num_colonna=num_colonna;
    this.id_prenotazione=id_prenotazione;
  }


  // Generated getter and setter methods
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getNum_riga() {
    return num_riga;
  }

  public void setNum_riga(int num_riga) {
    this.num_riga = num_riga;
  }

  public int getNum_colonna() {
    return num_colonna;
  }

  public void setNum_colonna(int num_colonna) {
    this.num_colonna = num_colonna;
  }

  public int getId_prenotazione() {
    return id_prenotazione;
  }

  public void setId_prenotazione(int id_prenotazione) {
    this.id_prenotazione = id_prenotazione;
  }
}
