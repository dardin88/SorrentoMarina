package theboys.sorrentomarina.actions.actionsUtente;

import theboys.sorrentomarina.actions.actionsUtils.Action;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * @author theboys
 */
public class MostraInfoAction implements Action {

  /**
   * Esegue la request action
   *
   * @param request  the request
   * @param response the response
   * @return ritorna una view
   */
  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) {
    response.setStatus(HttpServletResponse.SC_ACCEPTED);
    return view("info");
  }
}
