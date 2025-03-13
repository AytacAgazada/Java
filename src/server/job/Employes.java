package server.job;

abstract class Employes {
    String name;
    String department;
    double salary;
    int internship;

    public final void calculator(){
        if (internship >= 25){
            salary +=1000;
        } else if (internship < 25 && internship >= 15) {
            salary += 500;
        }
        System.out.println(salary);
    }



    public Employes(double salary, int internship) {
        this.salary = salary;
        this.internship = internship;
    }

    public Employes(String name, String department, double salary, int internship) {
        this(salary, internship);
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getInternship() {
        return internship;
    }

    public void setInternship(int internship) {
        this.internship = internship;
    }

}
