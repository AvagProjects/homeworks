public class Employee {
    int id;
    int departmentNumber;
    int age;
    String gender;

    public Employee(int id, int departmentNumber, int age, String gender) {
        this.id = id;
        this.departmentNumber = departmentNumber;
        this.age = age;
        this.gender = gender;
    }

    public void printEmployee() {
        System.out.println("ID: " + id + ", Dept: " + departmentNumber + ", Age: " + age + ", Gender: " + gender);
    }
}
