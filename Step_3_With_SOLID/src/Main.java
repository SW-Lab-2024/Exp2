import PaymentServices.OnSiteOrderService;
import PaymentServices.OnlineOrderService;
import PaymentServices.OrderPaymentService;
import PaymentServices.OrderRegistrationService;
import PaymentServices.PhoneOrderService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderRegistrationService orderRegistrationService = null;
        OrderPaymentService orderPaymentService = null;
        String customerName;
        Order order;
        int customerAnswerForOrder = 0;
        int customerAnswerForPaymentMethod = 0;

        System.out.println("Enter Customer Name: ");
        customerName = scanner.nextLine();
        order = new Order(customerName);

        //Step 1: Select Order Items
        while (customerAnswerForOrder != 3) {
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("To submit your order enter 3.");
            customerAnswerForOrder = scanner.nextInt();

            if (customerAnswerForOrder == 1) {
                order.addItem(new Food("Sandwich", 1000));
            } else if (customerAnswerForOrder == 2) {
                order.addItem(new Food("Pizza", 2000));
            }
        }

        // Step 2: Select Payment Method
        System.out.println("Enter Your Payment Method (1 for online, 2 for on-site, 3 for phone):");
        customerAnswerForPaymentMethod = scanner.nextInt();
        if (customerAnswerForPaymentMethod == 1) {
            orderRegistrationService = new OnlineOrderService();
            orderPaymentService = new OnlineOrderService();
            orderRegistrationService.registerOrder(customerName);
        } else if (customerAnswerForPaymentMethod == 2) {
            orderRegistrationService = new OnSiteOrderService();
            orderPaymentService = new OnSiteOrderService();
            orderRegistrationService.registerOrder(customerName);
        } else if (customerAnswerForPaymentMethod == 3) {
            orderRegistrationService = new PhoneOrderService();
            orderPaymentService = new PhoneOrderService();
            orderRegistrationService.registerOrder(customerName);
        }

        // Step 3: Pay Price
        System.out.println("Pay Price:");
        if (orderPaymentService != null) {
            orderPaymentService.payOrder(order.getTotalPrice());
        }

        // Finally Print Bill
        System.out.println(order);
    }
}
