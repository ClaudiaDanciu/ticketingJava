import java.util.ArrayList;

/**
 * The Consumer class represents a consumer.
 * Claudia Danciu
 */
    public class Consumer extends Customer
    {
        // instance variables
        private ArrayList<Seat> selectedSeats;
    
        /**
         * Constructor for objects of class Consumer
         */
        public Consumer(String customerAddress, 
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
            selectedSeats = new ArrayList<Seat>();    
        }
    
        /**
         * An example of a method - replace this comment with your own
         * @param  y  a sample parameter for a method
         * @return    the sum of x and y
         */
        public void selectSeat(Seat seat) 
        {
            selectedSeats.add(seat);
        }
        
        
        /**
         * Method to login to the system
         * @param  customerUsername  The username of the customer
         * @param  customerPassword  The password of the customer
         */
        public void login(String customerUsername, String customerPassword) 
        {
            if (customerUsername.equals(this.customerUsername) && customerPassword.equals(this.customerPassword)) 
            {
                System.out.println("Login successful!");
            }
            else 
            {
                System.out.println("Invalid username or password");
            }
        }
    
        /**
         * Method to select an event
         * @param  event  The event to be selected
         */
        public void selectEvent(Event event)
        {
            System.out.println("Selected event: " + event.getEventName());
        }
    
        /**
         * Method to select a show
         * @param  show  The show to be selected
         */
        public void selectShow(Show show) 
        {
            System.out.println("Selected show: " + show.getShowName());
        }
    
        /**
         * Method to register for an account
         */
        public void register() 
        {
            System.out.println("Registering new consumer account...");
        }
    
        /**
         * Method to purchase tickets
         * @param  tickets  The tickets to be purchased
         */
        public void purchaseTickets(ArrayList<Ticket> tickets) 
        {
            System.out.println("Purchasing tickets...");
        }
    
        
        /**
         * Method to update the consumer profile
         * @param  customerAddress  The new address of the customer
         * @param  customerName  The new name of the customer
         * @param  customerUsername  The new username of the customer
         * @param  customerEmail  The new email of the customer
         * @param  customerPassword  The new password of the customer
         */
        public void updateProfile(String customerAddress,
                                String customerName, 
                                String customerUsername,
                                String customerEmail, 
                                String customerPassword)
        {
            this.customerAddress  = customerAddress;
            this.customerName     = customerName;
            this.customerUsername = customerUsername;
            this.customerEmail    = customerEmail;
            this.customerPassword = customerPassword;
        }
        
        /**
         * Register a new customer account.
         *
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
            this.customerAddress  = customerAddress;
            this.customerName     = customerName;
            this.customerUsername = customerUsername;
            this.customerEmail    = customerEmail;
            this.customerPassword = customerPassword;
        }
    }
