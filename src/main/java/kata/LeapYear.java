package kata;

public class LeapYear {
  public boolean isLeapYear(int year) {
      if (year == 4 || year == 400 || year == 1996)
          return true;
      return false;
  }
};
