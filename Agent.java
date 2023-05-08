
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Agent class represents an agent and allows for selection and viewing of assigned seats.
 *
 * @author Claudia Danciu
 */
public class Agent extends Customer
{
    // instance variables
    private ArrayList<Seat> allocatedSeats;
    private Show selectedShow;
    private Scanner input;

    /**
     * Constructor for objects of class Agent
     */
    public Agent(String customerAddress,
                    String customerName, 
                    String customerUsername, 
                    String customerEmail, 
                    String customerPassword
                    )
    {
        // initialise instance variables
        super(customerAddress,
            customerName, 
            customerUsername, 
            customerEmail, 
            customerPassword
            );
        allocatedSeats = new ArrayList<Seat>();
        input = new Scanner(System.in);
    }

    /**
     * Selects a list of seats.
     * @param seats The seats to select.
     */
    public void selectSeats(ArrayList<Seat> seats)
    {
        allocatedSeats.addAll(seats);
    }

    /**
     * Gets a list of assigned seats.
     * @return A list of assigned seats.
     */
    public ArrayList<Seat> viewAssignedSeats()
    {
        return allocatedSeats;
    }
    
    /**
     * Update the agent's profile.
     * @param customerAddress   the new customer address
     * @param customerName      the new customer name
     * @param customerUsername  the new customer username
     * @param customerEmail     the new customer email
     * @param customerPassword  the new customer password
     */
    
    public void updateProfile(String customerAddress, String customerName, String customerUsername, 
    String customerEmail, String customerPassword)
    {
        this.customerAddress  = customerAddress;
        this.customerName     = customerName;
        this.customerUsername = customerUsername;
        this.customerEmail    = customerEmail;
        this.customerPassword = customerPassword;
    }
    
     public void purchaseTickets(ArrayList<Ticket> tickets) {
        double totalPrice = 0.0;

        // Calculate total price of tickets
        for (Ticket ticket : tickets) 
        {
            totalPrice += ticket.calculateTotalPrice();
        }

        // Create payment object
        Payment payment = new Payment("", "", totalPrice);

        // Apply discount to total price
        Promotion promotion = new Promotion("", 0.0, null, null, null);
        payment.applyDiscount(promotion);

        // Get payment details from customer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter card number: ");
        String cardNumber = input.nextLine();
        
        System.out.print("Enter billing address: ");
        String billingAddress = input.nextLine();
        
        // Submit payment
        payment.submitPayment(cardNumber, billingAddress, totalPrice);
    }    

    /**
       * Register a new customer account.
         * @param customerAddress   the customer address
         * @param customerName      the customer name
         * @param customerUsername  the customer username
         * @param customerEmail     the customer email
         * @param customerPassword  the customer password
         */
        public void register(String customerAddress, 
                            String customerName, 
                            String customerUsername, 
                            String customerEmail, 
                            String customerPassword
                            ) 
        {
            this.customerAddress = customerAddress;
            this.customerName = customerName;
            this.customerUsername = customerUsername;
            this.customerEmail = customerEmail;
            this.customerPassword = customerPassword;
        }
    
    /**
     * Select a show to book tickets for.
     * @param show The show to select.
     */
    public void selectShow(Show show)
    {
        this.selectedShow = show;
    }

    public void selectSeat(Seat seat) 
    {
        allocatedSeats.add(seat);
    }

    
    public void selectEvent(Event event) 
    {
        ArrayList<Show> shows = event.getShows();
        // Display available shows to the agent
        for (int i = 0; i < shows.size(); i++) 
        {
            System.out.println((i + 1) + ". " + shows.get(i).toString());
        }
        
        // Prompt agent to select a show
        int selection = -1;
        while (selection < 0 || selection >= shows.size()) 
        {
            System.out.print("Please select a show (1-" + shows.size() + "): ");
            selection = input.nextInt() - 1;
        }
        
        // Select the show
        Show selectedShow = shows.get(selection);
        selectShow(selectedShow);
    }
    
    /**
     * Login to the ticket reservation system.
     * @param customerUsername  the customer username
     * @param customerPassword  the customer password
     */
    @Override
    public void login(String customerUsername, String customerPassword) {
        // Check if the given username and password match the agent's credentials
        if (this.customerUsername.equals(customerUsername) && 
        this.customerPassword.equals(customerPassword)) 
        {
            System.out.println("Agent logged in successfully.");
        } 
        else 
        {
            System.out.println("Invalid username or password.");
        }
    }
}
