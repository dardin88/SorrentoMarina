package theboys.sorrentomarina.models.modelsLido;

/**
 * @author theboys
 */
public class Servizio {
  private int id;
  private boolean bar;
  private boolean ristorante;
  private boolean animazione;
  private boolean wifi;
  private boolean cabina;
  private boolean beach_volley;
  private boolean canoa;

  /**
   * Costruttore di servizi vuoto
   */
  public Servizio() {
    super();
  }

  /**
   * Costruttore di servizi con parametri
   *
   * @param id
   * @param bar
   * @param ristorante
   * @param animazione
   * @param wifi
   * @param cabina
   * @param beach_volley
   * @param canoa
   */
  public Servizio(int id, boolean bar, boolean ristorante, boolean animazione, boolean wifi, boolean cabina, boolean beach_volley, boolean canoa) {
    this.id = id;
    this.bar = bar;
    this.ristorante = ristorante;
    this.animazione = animazione;
    this.wifi = wifi;
    this.cabina = cabina;
    this.beach_volley = beach_volley;
    this.canoa = canoa;
  }

  /**
   * Costruttore di sevizi con un unico valore
   * @param b
   */
  public Servizio(boolean b) {
    this.bar = b;
    this.ristorante = b;
    this.animazione = b;
    this.wifi = b;
    this.cabina = b;
    this.beach_volley = b;
    this.canoa = b;
  }

  /**
   * Costruttore di servizi con parametri escluso id
   *
   * @param bar
   * @param ristorante
   * @param animazione
   * @param wifi
   * @param cabina
   * @param beach_volley
   * @param canoa
   */
  public Servizio(boolean bar, boolean ristorante, boolean animazione, boolean wifi, boolean cabina, boolean beach_volley, boolean canoa) {
    this.bar = bar;
    this.ristorante = ristorante;
    this.animazione = animazione;
    this.wifi = wifi;
    this.cabina = cabina;
    this.beach_volley = beach_volley;
    this.canoa = canoa;
  }

  /**
   * Verifica che tutti i servizi siano settati a false
   *
   * @return boolean
   */
  public boolean isAllFalse() {
    if (!(this.bar || this.ristorante || this.animazione || this.wifi || this.cabina || this.beach_volley || this.canoa)) {
      return true;
    } else {
      return false;
    }
  }

  // Getter methods
  public int getId() {
    return id;
  }

  public boolean isBar() {
    return bar;
  }

  public boolean isRistorante() {
    return ristorante;
  }

  public boolean isAnimazione() {
    return animazione;
  }

  public boolean isWifi() {
    return wifi;
  }

  public boolean isCabina() {
    return cabina;
  }

  public boolean isBeach_volley() {
    return beach_volley;
  }

  public boolean isCanoa() {
    return canoa;
  }

  // Setter methods
  public void setId(int id) {
    this.id = id;
  }

  public void setBar(boolean bar) {
    this.bar = bar;
  }

  public void setRistorante(boolean ristorante) {
    this.ristorante = ristorante;
  }

  public void setAnimazione(boolean animazione) {
    this.animazione = animazione;
  }

  public void setWifi(boolean wifi) {
    this.wifi = wifi;
  }

  public void setCabina(boolean cabina) {
    this.cabina = cabina;
  }

  public void setBeach_volley(boolean beach_volley) {
    this.beach_volley = beach_volley;
  }

  public void setCanoa(boolean canoa) {
    this.canoa = canoa;
  }
}
