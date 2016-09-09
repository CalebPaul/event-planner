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
    quote = mGuests * 2;
    stringQuote = Integer.toString(quote);
    return stringQuote;
  }

}
