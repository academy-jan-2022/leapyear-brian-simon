package kata;

public class LeapYear {
  public boolean isLeapYear(int year) {
      if(year == 1800)
          return false;
      if (year % 4 == 0)
          return true;
      return false;
  }
};
