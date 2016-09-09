import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanTest {

  @Test
  public void newEventPlan_isEventPlanConstructing(){
    EventPlan testEvent = new EventPlan (2, "snack", true, "beer", false);
    assertEquals(true, testEvent instanceof EventPlan);
  }
}
