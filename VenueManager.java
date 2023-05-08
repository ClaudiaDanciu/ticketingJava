import java.util.ArrayList;

/**
 * The VenueManager class represents a venue manager in a ticket reservation system.
 * Claudia Danciu
 */

public class VenueManager
{
    // instance variables
    private String name;
    private String emailAddress;
    private String password;
    private ArrayList<Show> shows;
    private ArrayList<Event> events;
    private ArrayList<Promotion> promotions;
    
    /**
     * Constructor for objects of class VenueManager
     */
    public VenueManager(String name,
                        String emailAddress, 
                        String password) 
    {
        this.name         = name;
        this.emailAddress = emailAddress;
        this.password     = password;
        this.shows        = new ArrayList<>();
        this.events       = new ArrayList<>();
        this.promotions   = new ArrayList<>();
    }

     /**
     * Adds a new event to the list of events.
     */
    public void createEvent(Event event) 
    {
        events.add(event);
    }
    
    /**
     * Adds a new show to the list of shows.
     */
    public void createShow(Show show) 
    {
        shows.add(show);
    }

    /**
     * Removes an event from the list of events.
     */
    public void cancelEvent(Event event) 
    {
        events.remove(event);
    }

    /**
     * Removes a show from the list of shows.
     */
    public void cancelShow(Show show) 
    {
        shows.remove(show);
    }

    /**
     * Updates the details of an event.
     *
     * @param event The event to update.
     * @param newDescription The new description of the event.
     */
    public void updateEventDetails(Event event, String newDescription) 
    {
        event.setEventDescription(newDescription);
    }

    /**
     * Updates the details of a show.
     *
     * @param show The show to update.
     * @param newName The new name of the show.
     * @param newMaxSeatsPerCustomer The new maximum number of seats that a customer can purchase for the show.
     */
    public void updateShowDetails(Show show, String newName, int newMaxSeatsPerCustomer) 
    {
        show.setShowName(newName);
        show.setMaxSeatsPerCustomer(newMaxSeatsPerCustomer);
    }

    /**
     * Sets the maximum number of seats that a customer can purchase for a show.
       * @param show The show to set the maximum number of seats for.
       * @param maxSeatsPerCustomer The maximum number of seats a customer can purchase for the given show.
       */
    public void setMaxSeatsPerCustomer(Show show, int maxSeatsPerCustomer) 
    {
        show.setMaxSeatsPerCustomer(maxSeatsPerCustomer);
    }
    
    /**
     * Adds a promotion to the list of available promotions.
       * @param promotion The promotion to add.
       */
    public void addPromotion(Promotion promotion) 
    {
        promotions.add(promotion);
    }

    /**
     * Removes a promotion from the list of available promotions.
       * @param promotion The promotion to remove.
       */
    public void removePromotion(Promotion promotion) 
    {
        promotions.remove(promotion);
    }

    /**
     * Displays the details of all available promotions.
     */
    public void viewPromotionDetails() 
    {
        for (Promotion promotion : promotions) 
        {
            System.out.println(promotion.toString());
        }
    }

    /**
     * Assigns seats to a promotion.
       * @param promotion The promotion to assign seats to.
       * param seats The list of seats to assign to the promotion.
       */
    public void assignSeats(Promotion promotion, ArrayList<Seat> seats) 
    {
        promotion.assignSeats(seats);
    }
   
    /**
       * Checks if the requested number of seats is available for a show.
         * @param show The show to check the seat availability for.
         * @param numberOfSeats The number of seats requested by the customer.
         * @return True if the requested number of seats is available, false otherwise.
         */
    public boolean checkAvailability(Show show, int numberOfSeats) 
    {
        int remainingSeats = show.getRemainingSeats();
        return remainingSeats >= numberOfSeats;
    }
}
