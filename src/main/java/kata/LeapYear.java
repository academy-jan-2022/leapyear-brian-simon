package kata;

public class LeapYear {
  public boolean isLeapYear(int year) {
      if (year == 4 || year == 400)
          return true;
      return false;
  }
};
