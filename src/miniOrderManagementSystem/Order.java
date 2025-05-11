package miniOrderManagementSystem;

public class Order {
    Integer id;
    Double totalAmount;
    OrderStatus status;
    PriorityLevel priority;
    Boolean isPaid;

    public Order(Integer id, Double totalAmount, OrderStatus status, PriorityLevel priority) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.status = status;
        this.priority = priority;
        this.isPaid = false;
    }

    public void updateStatus(OrderStatus newStatus){
        this.status = newStatus;
    }

    public void markAsPaid() {
        this.isPaid = true;
    }

    public Boolean getIsPaid() {
        return isPaid;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", totalAmount=" + totalAmount +
                ", status=" + status +
                ", priority=" + priority +
                ", isPaid=" + isPaid +
                '}';
    }
}
