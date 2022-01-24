package kata;

public class LeapYear {
  public boolean isLeapYear(int year) {
      if ( year % 4 == 0){
          if(year % 100 == 0
              && year % 400 != 0 )
              return false;
          return true;
      }
      return false;
  }
};
