package pl.agh.edu;

import java.util.ArrayList;
import pl.agh.edu.dates.Year;

public class Employee {
    private ArrayList<Year> yearsWhenEmployeeWorked = new ArrayList<Year>();
    private String name;

    public ArrayList<Year> getYearsWhenEmployeeWorked() {
        return yearsWhenEmployeeWorked;
    }
    public String getName() {
        return name;
    }
    public Employee(String name) {
        super();
        this.name = name;
    }

    public void addNewYearToEmployee(int year) {
        if (findYearByCalendarYear(year)==null) {
            yearsWhenEmployeeWorked.add(new Year(year));
        }
    }
    public Year getYearByOrder(int yearNumber) {
        return yearsWhenEmployeeWorked.get(yearNumber);
    }

    public Year findYearByCalendarYear(int calendarYear) {
        for (Year year : yearsWhenEmployeeWorked) {
            if (year.getCalendarYear() == calendarYear) {
                return year;
            }
        }
        return null;
    }
}