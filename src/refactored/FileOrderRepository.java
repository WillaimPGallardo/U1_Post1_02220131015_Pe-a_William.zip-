package refactored;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileOrderRepository implements OrderRepository {

    private List<Order> orders = new ArrayList<>();

    @Override
    public void save(Order order) {

        orders.add(order);

        try (FileWriter fw = new FileWriter("orders.txt", true)) {
            fw.write(order.getId() + "," +
                     order.getCustomer() + "," +
                     order.getTotal() + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public Order findById(String id) {
        return orders.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}