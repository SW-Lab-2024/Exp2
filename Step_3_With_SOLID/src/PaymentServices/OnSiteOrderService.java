package PaymentServices;

public class OnSiteOrderService implements OrderRegistrationService, OrderPaymentService {
    @Override
    public void registerOrder(String customerName) {
        System.out.println("On-site order registered for " + customerName);
    }

    @Override
    public void payOrder(int foodPrice) {
        System.out.println("On-site payment with price: " + foodPrice + " Tomans!");
    }
}
