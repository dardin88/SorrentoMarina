package theboys.sorrentomarina.router;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import theboys.sorrentomarina.actions.ActionSetupDB;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@Disabled
public class FrontControllerTest extends ActionSetupDB {

  private FrontController  frontController=new FrontController();


  @Test
  public void processRequestTest() throws ServletException, IOException {
    HttpServletRequest request= mockReq;
    HttpServletResponse response= mockRes;
    Mockito.when(request.getPathInfo()).thenReturn("/index");
    ServletContext ctx = Mockito.mock(ServletContext.class);
    Mockito.when(mockReq.getServletContext()).thenReturn(ctx);
    frontController= new FrontController();
    frontController.init();
  }
}