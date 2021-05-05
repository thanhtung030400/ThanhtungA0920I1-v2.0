import java.util.List;

public interface customerService {
    customer getCustomerById(String id);
    List<customer> getAll();
}
