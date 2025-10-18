package theboys.sorrentomarina.actions.actionsLido;

import theboys.sorrentomarina.actions.actionsUtils.Action;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * @author theboys
 */
public class MostraAffluenza implements Action {

  /**
   * Reindirizzamento a affluenzaLido
   *
   * @param request the request
   * @param response the response
   * @return
   */
  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) {
    return view("affluenzaLido");
  }
}
