package theboys.sorrentomarina.actions.actionsUtils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author theBoys
 */
public class NotFoundAction implements Action {
  /**
   * Esegue la request action
   *
   * @param request the request
   * @param response the response
   * @return ritorna la view 404
   */
  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) {
    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
    return view("404");
  }

}
