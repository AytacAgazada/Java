package server.job;

public class Manager extends Employes implements Workable,Leader {
    String role;
    @Override
    public void work(){
        System.out.println("Currently working " + name +" ," + role);

    }

    @Override
    public void lead(){
        System.out.println("Leading the team...");

    }


    public Manager(String name, String department, double salary, int internship, String role) {
        super(name, department, salary, internship);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, double increment) {
        return (int)(a + b + increment); // Type casting
    }



}
