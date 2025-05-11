package miniOrderManagementSystem;

import java.util.*;

public class OrderManager {
    public static List<Order> orders = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("\n ===Welcome to OrderManager===");
            System.out.println("1. Add new order");
            System.out.println("2. Update order status");
            System.out.println("3. Mark order as paid");
            System.out.println("4. List orders");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> addNewOrder();
                case 2 -> updateOrderStatus();
                case 3 -> markOrderAsPaid();
                case 4 -> listOrders();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addNewOrder() {
        System.out.print("Enter order ID: ");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter amount: ");
        String amountStr = scanner.nextLine();
        Double totalAmount = Double.parseDouble(amountStr);
        System.out.print("Enter priority (LOW, MEDIUM, HIGH): ");
        String priorityStr = scanner.nextLine();
        PriorityLevel priority = PriorityLevel.valueOf(priorityStr.toUpperCase());
        Order order = new Order(id, totalAmount, OrderStatus.NEW, priority);
        orders.add(order);
        System.out.println("Order added: " + order);
    }

    public static void updateOrderStatus() {
        System.out.print("Enter order ID to update: ");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new status (NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED): ");
        String statusStr = scanner.nextLine();
        OrderStatus newStatus = OrderStatus.valueOf(statusStr.toUpperCase());
        for (Order order : orders) {
            if (order.id.equals(id)) {
                order.updateStatus(newStatus);
                System.out.println("Order status updated: " + order);
                return;
            }
        }
        System.out.println("Order not found.");
    }

    public static void markOrderAsPaid() {
        System.out.print("Enter order ID to mark as paid: ");
        Integer id = scanner.nextInt();
        scanner.nextLine();
        for (Order order : orders) {
            if (order.id.equals(id)) {
                order.markAsPaid();
                System.out.println("Order marked as paid: " + order);
                return;
            }
        }
        System.out.println("Order not found.");
    }

    public static void listOrders() {
        System.out.print("Filter by (PAID / HIGH / ALL): ");
        String filter = scanner.nextLine().toUpperCase();

        for (Order order : orders) {
            switch (filter) {
                case "PAID":
                    if (order.getIsPaid()) System.out.println(order);
                    break;
                case "HIGH":
                    if (order.priority == PriorityLevel.HIGH) System.out.println(order);
                    break;
                case "ALL":
                    System.out.println(order);
                    break;
                default:
                    System.out.println("Invalid filter. Showing all orders:");
                    System.out.println(order);
                    break;
            }
        }
    }
}
