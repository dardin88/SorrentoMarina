package theboys.sorrentomarina.actions.actionsLido;

import theboys.sorrentomarina.actions.actionsUtils.Action;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * @author theboys
 */
public class MostraCreaLido implements Action {
  /**
   * Mostra il form per l'aggiunta di un nuovo lido
   *
   * @param request  la request
   * @param response la response
   * @return ritorna la view con il form di creazione lido
   */
  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) {
    return view("creaLido");
  }
}
