package study.timeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeExamples {

    public static void main(String[] args){
        LocalDateTime christmas = christmasCalculation();
        System.out.println("Christmas: " + christmas);

        LocalDateTime newYear = newYearCalculation();
        System.out.println("New Year: " + newYear);

        LocalDate endOfRecess = endOfRecessCalculation(newYear.toLocalDate());
        System.out.println("End of Recess: " + endOfRecess);

        LocalDate startOfWork = startOfWorkCalculation(endOfRecess);
        System.out.println("Start of Work: " + startOfWork);
    }

    static LocalDateTime christmasCalculation() {
        LocalDate today = LocalDate.now();
        return today.withMonth(12).withDayOfMonth(25).atStartOfDay();
    }

    static LocalDateTime newYearCalculation(){
        LocalDate today = LocalDate.now();
        return today.plusYears(1).withDayOfMonth(1).withMonth(1).atStartOfDay();
    }

    static LocalDate endOfRecessCalculation(LocalDate newYear){
        return newYear.plusDays(1);
    }

    static LocalDate startOfWorkCalculation(LocalDate endOfRecess){
        if (endOfRecess.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
            return endOfRecess.plusDays(1);
        }
        else if (endOfRecess.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
            return endOfRecess.plusDays(2);
        }
        else {
            return endOfRecess;
        }
    }

}
