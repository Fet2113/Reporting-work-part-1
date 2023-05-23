public class Employee {
    private final String fullname;
    private double salary;
    private int department;
    private final int id;
    static int nexttid = 1;
    public Employee(String fullname, double salary, int department) {
            this.fullname = fullname;
            this.salary = salary;
            this.department = department;
            this.id =  nexttid++;
        }

    public String getFullname() {
        return this.fullname;
    }
    public double getSalary() {
        return this.salary;
    }
    public int getDepartment() {
        return this.department;
    }
    public int getId() {
        return this.id;
    }

    public double setSalary() {
        return this.salary;
    }
    public int setDepartment() {
        return this.department;
    }


    public String toString() {
        return String.format("id: %d, Отдел: %d, ФИО: %s, Зарплата: %.2f", id,department,fullname,salary);
    }

}
