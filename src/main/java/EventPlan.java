class EventPlan {
  public int mGuests;
  public String mFood;
  public String mBand;
  public String mBar;
  public String mWeekend;

  public EventPlan(int guests, String food, String band, String bar, String weekend){
    mGuests = guests;
    mFood = food;
    mBand = band;
    mBar = bar;
    mWeekend = weekend;
  }

  public String getQuote(){
    int quote = 0;
    String stringQuote = "";
    quote = (mGuests * 2);
    //food
    if (mFood.equals("snacks")) {
      quote += (mGuests * 3);
    } else if (mFood.equals("buffet")) {
      quote += (mGuests * 5);
    } else if (mFood.equals("catered")) {
      quote += (mGuests * 15);
    }
    //band
    if (mBand.equals("yes")) {
      quote += 450;
    }
    //bar
    if (mBar.equals("yes")) {
      quote += 800;
    }
    //weekend
    if (mWeekend.equals("yes")) {
      quote += 200;
    }
    stringQuote = Integer.toString(quote);
    return stringQuote;
  }

}
