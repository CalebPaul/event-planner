import org.junit.*;
import static org.junit.Assert.*;

public class EventPlanTest {

  @Test
  public void newEventPlan_isEventPlanConstructing_true(){
    EventPlan testEvent = new EventPlan (2, "snacks", "yes", "no", "yes");
    assertEquals(true, testEvent instanceof EventPlan);
  }
  @Test
  public void newEventPlan_isGetQuoteMethodGuestsWorking_500(){
    EventPlan testEvent = new EventPlan (100, "snacks", "no", "no", "no");
    testEvent.getQuote();
    assertEquals("500", testEvent.getQuote());
  }
  @Test
  public void newEventPlan_isGetQuoteMethodFoodSnackWorking_5(){
    EventPlan testEvent = new EventPlan (1, "snacks", "no", "no", "no");
    testEvent.getQuote();
    assertEquals("5", testEvent.getQuote());
  }
  @Test
  public void newEventPlan_isGetQuoteMethodFoodBuffetWorking_7(){
    EventPlan testEvent = new EventPlan (1, "buffet", "no", "no", "no");
    testEvent.getQuote();
    assertEquals("7", testEvent.getQuote());
  }
  @Test
  public void newEventPlan_isGetQuoteMethodFoodCateredWorking_17(){
    EventPlan testEvent = new EventPlan (1, "catered", "no", "no", "no");
    testEvent.getQuote();
    assertEquals("17", testEvent.getQuote());
  }
  @Test
  public void newEventPlan_isGetQuoteMethodBandWorking_455(){
    EventPlan testEvent = new EventPlan (1, "snacks", "yes", "no", "no");
    testEvent.getQuote();
    assertEquals("455", testEvent.getQuote());
  }
  @Test
  public void newEventPlan_isGetQuoteMethodBarWorking_805(){
    EventPlan testEvent = new EventPlan (1, "snacks", "no", "yes", "no");
    testEvent.getQuote();
    assertEquals("805", testEvent.getQuote());
  }
  @Test
  public void newEventPlan_isGetQuoteMethodWeekendWorking_205(){
    EventPlan testEvent = new EventPlan (1, "snacks", "no", "no", "yes");
    testEvent.getQuote();
    assertEquals("205", testEvent.getQuote());
  }

}
