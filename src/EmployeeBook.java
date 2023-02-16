public class EmployeeBook {

    public static void soutEmployee(Employee[] employee){
        for (Employee value : employee) {
            System.out.println(value);
        }
    }
    public static int calculationMonthlySalaryAll(Employee[] employee){
        int salaryMonth = 0;
        for (Employee value : employee) {
            salaryMonth += value.getSalary();
        }
        return salaryMonth;
    }

    public static Employee findEmployeeMinSalaryAll(Employee[] employee){
        Employee employee1 = null;
        int min = Integer.MAX_VALUE;
        for (Employee value : employee) {
            if (value.getSalary() < min) {
                min=value.getSalary();
                employee1 = value;
            }
        }
        return employee1;
    }

    public static Employee findEmployeeMaxSalaryAll(Employee[] employee){
        Employee employee2 = null;
        double max = Integer.MIN_VALUE;
        for (Employee value : employee) {
            if (value.getSalary() > max) {
                max = value.getSalary();
                employee2 = value;
            }
        }
        return employee2;
    }

    public static double averageValueSalaryAll(Employee[] employee){
        return calculationMonthlySalaryAll(employee)/10D;
    }

    public static void indexSalaryAll(Employee[] employee, int percent){
        double coeff = 1+ percent/100D;
        for (Employee person: employee){
            person.setSalary((int)(person.getSalary()* coeff));
        }
    }

    //Повышенная сложность
    public static Employee findEmployeeMinSalary(Employee[] employee,int department){
        Employee employee3 = null;
        int min = Integer.MAX_VALUE;
        for (Employee value : employee) {
            if (value.getSalary() < min && value.getDepartment()==department) {
                min=value.getSalary();
                employee3 = value;
            }
        }
        return employee3;
    }
    public static Employee findEmployeeMaxSalary(Employee[] employee,int department){
        Employee employee4 = null;
        double max = Integer.MIN_VALUE;
        for (Employee value : employee) {
            if (value.getSalary() > max && value.getDepartment()==department) {
                max = value.getSalary();
                employee4 = value;
            }
        }
        return employee4;
    }

    public static int calculationMonthlySalary(Employee[] employee,int department){
        int salaryMonth = 0;
        for (Employee value : employee) {
            if(value.getDepartment()==department){
                salaryMonth += value.getSalary();
            }
        }
        return salaryMonth;
    }

    public static double averageValueSalary(Employee[] employee,int department){
        int sum=0;
        int count =0;
        for (Employee value : employee) {
            if (value.getDepartment() == department) {
                sum += value.getSalary();
                count++;
            }
        }
        if(count!=0){
            return sum/(double)count;
        }else {
            return 0;
        }
    }

    public static void indexSalary(Employee[] employee,int department, int percent){
        double coeff = 1+ percent/100D;
        for (Employee person: employee){
            if(person.getDepartment()==department){
                person.setSalary((int)(person.getSalary()* coeff));
            }
        }
    }

    public static void soutEmployeeDepartment(Employee[] employee,int department){
        for (Employee value : employee) {
            if (value.getDepartment() == department) {
                System.out.println("id:"+value.getId()+" Ф.И.О: "+value.getFio()+" Зарплата: "+value.getSalary());
            }
        }
    }
    public static void findEmployeesWithSalaryLess(Employee[] employee,int salary){
        for (Employee value : employee) {
            if (value.getSalary() < salary) {
                System.out.println("id:" +value.getId()+" Ф.И.О: "+value.getFio()+" Зарплата: "+value.getSalary());
            }
        }
    }

    public static void findEmployeesWithSalaryMore(Employee[] employee,int salary){
        for (Employee value : employee) {
            if (value.getSalary() > salary) {
                System.out.println("id:" +value.getId()+" Ф.И.О: "+value.getFio()+" Зарплата: "+value.getSalary());
            }
        }
    }
}