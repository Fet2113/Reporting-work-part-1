public class Main {

    public static void main(String[] args) {
        Employee[] employees = new  Employee[10];
        for(int i = 0; i < 10; i++){
            employees[i] = new Employee("Имя" + (i+1), (i+1) * 10000, (i%5)+1);
        }

        getAllEmployees(employees);
        System.out.println(getSumSalary(employees));
        System.out.println(getMinSalary(employees));
        System.out.println(getMaxSalary(employees));
        System.out.println(getMidSalary(employees));
        getAllFullname(employees);
    }

    public static void getAllEmployees(Employee[] employees){
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i].toString());
        }
    }
    //1. Получить список всех сотрудников со всеми имеющимися по ним данными
    public static double getSumSalary (Employee[] employees){
        double sum = 0;
        for(int i = 0; i < employees.length; i++){
            sum += employees[i].getSalary();
        }
        return sum;
    }
    //2. Посчитать сумму затрат на зарплаты в месяц.
    public static double getMinSalary (Employee[] employees){
        double min = employees[0].getSalary();
        for(int i = 1; i < employees.length; i++){
            if(employees[i].getSalary() < min)
                min = employees[i].getSalary();
        }
        return min;
    }
    //3. Найти сотрудника с минимальной зарплатой.
    public static double getMaxSalary (Employee[] employees){
        double max = employees[0].getSalary();
        for(int i = 1; i < employees.length; i++){
            if(employees[i].getSalary() > max)
                max = employees[i].getSalary();
        }
        return max;
    }
    //4. Найти сотрудника с максимальной зарплатой.
    public static double getMidSalary (Employee[] employees){
        double sum = getSumSalary(employees);
        double middle = sum/employees.length;
        return middle;
    }
    //5. Подсчитать среднее значение зарплат.

    public static void getAllFullname (Employee[] employees){
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i].getFullname());
        }
    }
    //6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
}