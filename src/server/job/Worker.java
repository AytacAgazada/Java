package server.job;

 public class Worker extends Employes implements Workable,Leader {
    double shift;


     public Worker(String name, String department, double salary, int internship, double shift) {
         super(name, department, salary, internship);
         this.shift = shift;
     }

     public double getShift() {
         return shift;
     }

     public void setShift(double shift) {
         this.shift = shift;
     }

//     @Override
//     final void calculator(){
//         salary += 123400000;
//         System.out.println(salary);
//     } //gives an error and cannot edit

     @Override
     public void work(){
         if (shift >= 20){
             System.out.println("Great job!");
         } else if (shift < 20 && shift > 0) {
             System.out.println("Good job!");
         }
     }


     @Override
     public void lead() {
         if (shift >= 20){
             System.out.println("Leader: " + name);
         }
     }
 }
