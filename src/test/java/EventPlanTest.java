import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanTest {

  @Test
  public void newEventPlan_isEventPlanConstructing_true(){
    EventPlan testEvent = new EventPlan (2, "snack", "yes", "no", "yes");
    assertEquals(true, testEvent instanceof EventPlan);
  }
  // @Test
  // public void newEventPlan_isGuestsPropertyPassing_true(){
  //   EventPlan testEvent = new EventPlan (2, "snack", true, true, false);
  //   assertEquals(2, testEvent.guests);
  // }
}
