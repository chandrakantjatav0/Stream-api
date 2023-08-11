package sorting;

public class Employee {
    private int empId;
    private String empName;
    private int age;
    private float Salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", Salary=" + Salary +
                '}';
    }

    public Employee(int empId, String empName, int age, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        Salary = salary;

    }
}
