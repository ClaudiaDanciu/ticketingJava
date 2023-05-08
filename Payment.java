import java.util.Scanner;

/**
 * The Payment class handles the payment processing and stores the payment details.
 * @Claudia Danciu
 */
public class Payment
{
    // instance variables - replace the example below with your own
    private String cardNumber;
    private String billingAddress;
    private double totalPrice;

    /**
     * Constructor for objects of class Payment
     */
    public Payment(String cardNumber, String billingAddress, double totalPrice)
    {
        // initialise instance variables
        this.cardNumber     = cardNumber;
        this.billingAddress = billingAddress;
        this.totalPrice     = totalPrice;
    }

    
    public void submitPayment(String cardNumber,
                                String billingAddress, 
                                double totalPrice
                                ) 
    {
        if (verifyCardNumber(cardNumber) && verifyBillingAddress(billingAddress)) 
        {
            // payment successful
            System.out.println("Payment submitted successfully.");
        } 
        else 
        {
            // payment failed
            System.out.println("Payment failed.");
        }
    }
    
    public boolean verifyCardNumber(String cardNumber) 
    {
        // verify card number
        if (cardNumber.matches("[0-9]{16}")) 
        {
            return true;
        } 
        else 
        {
            System.out.println("Invalid card number.");
            return false;
        }
    }
    
    public boolean verifyBillingAddress(String billingAddress) 
    {
        // verify billing address
        if (billingAddress.length() >= 5)
        {
            return true;
        } 
        else
        {
            System.out.println("Invalid billing address.");
            return false;
        }
    }
    
    public void applyDiscount(Promotion promotion) 
    {
        double discountAmount = promotion.getDiscountAmount();
        double discountedPrice = totalPrice * (1 - discountAmount);
        totalPrice = discountedPrice;
    }
    
    public void promptForPaymentDetails() 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your card number: ");
        String cardNumber = input.nextLine();
        System.out.print("Enter your billing address: ");
        String billingAddress = input.nextLine();
        submitPayment(cardNumber, billingAddress, totalPrice);
    }
}
