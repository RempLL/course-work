public class SettingsEmployee {

    public static void soutEmployee(Employee[] employee){
        for (Employee value : employee) {
            System.out.println(value);
        }
    }
    public static double calculationMonthlySalary(Employee[] employee){
        double salaryMonth = 0;
        for (Employee value : employee) {
            salaryMonth += value.getSalary();
        }
        return salaryMonth;
    }

    public static double findMinimumSalary(Employee[] employee){
        double min = Integer.MAX_VALUE;
        for (Employee value : employee) {
            if (value.getSalary() < min) {
                min = value.getSalary();
            }
        }
        return min;
    }

    public static double findMaximumSalary(Employee[] employee){
        double max = Integer.MIN_VALUE;
        for (Employee value : employee) {
            if (value.getSalary() > max) {
                max = value.getSalary();
            }
        }
        return max;
    }

    public static double averageValueSalary(Employee[] employee){
         return calculationMonthlySalary(employee)/10;
    }

}
