package Transport.Repository;

import Transport.Domain.Payment;

import java.util.ArrayList;
import java.util.Set;

public interface PaymentRepository extends MainRepository<Payment, String>
{
    ArrayList<Payment> getAll();
}
