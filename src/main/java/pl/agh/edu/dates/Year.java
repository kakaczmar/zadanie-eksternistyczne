package pl.agh.edu.dates;

import java.util.ArrayList;

public class Year {

    private int calendarYear;

    ArrayList<Month> months = new ArrayList<Month>();

    public ArrayList<Month> getMonths() {
        return months;
    }

    public Month getMonth(int monthNumber) {
        return months.get(monthNumber);
    }

    public Month findMonthbyCalendarNumber(int monthCalendarNumber) {
        for (Month month: months) {
            if (month.getMonthNumber() == monthCalendarNumber)
                return month;
        }
        return null;
    }

    public void addNewMonthToYear(int monthNumber) {
        if (findMonthbyCalendarNumber(monthNumber) == null) {
            months.add(new Month(monthNumber));
        }
    }

    public int getCalendarYear() {
        return calendarYear;
    }

    public Year(int year) {
        super();
        this.calendarYear = year;
    }
}