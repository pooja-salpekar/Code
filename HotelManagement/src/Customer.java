import java.util.ArrayList;
import java.util.List;


public class Customer {
    private String type;
    public Customer(String type) {
        this.type=type;
    }

    public boolean isRegular() {
        if (this.type=="regular") return true;
        return false;
    }

}
