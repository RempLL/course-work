public class Employee {


    private final String fio;

    private int department;

    private int salary;

    private static int count;

    private final int id;

    public Employee(String fio,int department,int salary){
            id=count++ +1;
            this.fio = fio;
            this.salary = salary;
            this.department = department;

    }

    public int getId(){
        return this.id;
    }

    public String getFio(){
        return  this.fio;
    }

    public int getDepartment(){
        return this.department;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setDepartment(int department){
        this.department = department;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String toString(){
        return "id:" + id + " Ф.И.О: "+ fio + " Отдел:" + department + " Зарплата: " + salary;
    }

}
