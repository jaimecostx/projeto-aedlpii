package ufp.projetolp;

import java.time.LocalDate;

public class Date {

  public Integer day;
  public Integer month;
  public Integer year;

  public Integer getDay() {
    return day;
  }
  public void setDay(Integer day) {
    this.day = day;
  }
  public Integer getMonth() {
    return month;
  }
  public void setMonth(Integer month) {
    this.month = month;
  }
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }

  /**
   * Constructor
   * set empty Date Object as today's date
   */
  public Date(){
    LocalDate today = LocalDate.now();
    setDay(today.getDayOfMonth());
    setMonth(today.getMonthValue());
    setYear(today.getYear());
  }

  /**
   * Constructor, set date
   * @param day integer day
   * @param month integer month
   * @param year integer year
   */
  public Date(Integer day, Integer month, Integer year){
    setDay(day);
    setMonth(month);
    setYear(year);
  }

  /**
   * Checks if this.date is before d date
   * @param d date
   * @return true or false
   */
  public boolean beforeDate(Date d) {
    if (getYear() < d.getYear()){
      return true;
    }else if(getYear().equals(d.getYear())){
      if (getMonth() < d.getMonth()){
        return true;
      }else if(getMonth().equals(d.getMonth())) {
        return getDay() < d.getDay();
      }
    }
    return false;
  }

  /**
   * Checks if this.date is after d date
   * @param d date
   * @return true or false
   */
  public boolean afterDate(Date d){
    if (d.getDay() != getDay() && d.getMonth() != getMonth() && d.getYear() != getYear()){
      return false;
    }
    return !beforeDate(d);
  }

  @Override
  public String toString(){
    return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
  }
}