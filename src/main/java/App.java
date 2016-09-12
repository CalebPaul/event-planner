import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      Map<String , Object> model = new HashMap<String, Object>();
      String stringUserGuests = request.queryParams("guests");
      int intUserGuests = Integer.parseInt(stringUserGuests);

      String stringUserFood = request.queryParams("food");
      String stringUserBand = request.queryParams("band");
      String stringUserBar = request.queryParams("bar");
      String stringUserWeekend = request.queryParams("weekend");

      EventPlan userEvent = new EventPlan(intUserGuests, stringUserFood, stringUserBand, stringUserBar, stringUserWeekend);
      model.put("result", userEvent.getQuote());
      model.put("template", "templates/result.vtl");
      model.put("guests", intUserGuests);
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }
}
