package theboys.sorrentomarina.actions;

import jakarta.servlet.ServletContext;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import theboys.sorrentomarina.actions.actionsUtils.Action;
import theboys.sorrentomarina.actions.actionsUtils.NotFoundAction;

/**
 * @author theboys
 */
public class ActionTest extends ActionSetup {

  @Override
  @BeforeEach
  public void setup() {
    super.setup();
  }

  /**
   *Test - ritorna la view TestView
   */
  @Test
  public void testView() {
    // Use concrete implementation instead of mocking interface
    Action ac = new NotFoundAction();
    String result = ac.view("testView");
    assertEquals("/WEB-INF/views/testView.jsp", result,
        "It should return the view path");
  }

  /**
   *Test - GetSource base di dati
   */
  @Test
  public void testGetSource() {
    // Use concrete implementation instead of mocking interface
    Action ac = new NotFoundAction();
    ServletContext sc = Mockito.mock(ServletContext.class);
    Mockito.when(sc.getAttribute("db"))
        .thenReturn(Mockito.mock(DataSource.class));
    Mockito.when(mockReq.getServletContext()).thenReturn(sc);
    assertNotNull(ac.getSource(mockReq), "It should return a data source");
  }
}
