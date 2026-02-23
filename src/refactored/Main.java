package refactored;

public class Main {

    public static void main(String[] args) {

        OrderRepository repo = new FileOrderRepository();

        NotificationService notifier =
                new EmailNotificationService();

        DiscountStrategy discount =
                new StandardDiscount();

        OrderService service =
                new OrderService(repo, notifier, discount);

        service.createOrder("Juan", "Laptop", 2000, 1);
        service.createOrder("Ana", "Mouse", 50, 3);

        OrderService vipService =
                new OrderService(repo, notifier,
                        new VIPDiscount());

        vipService.createOrder("Carlos", "Monitor", 800, 2);

        System.out.println("\nPedidos en repositorio: " +
                repo.findAll().size());
    }
}