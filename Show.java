import java.time.LocalDate;
import java.util.ArrayList;

/**
 * The Show class represents a show in a ticket reservation system.
 * @Claudia Danciu
 */

public class Show
{
    // instance variables
    private String showName;
    private LocalDate showDate;
    private int maxSeatsPerCustomer;
    private int totalSeats;
    private int remainingSeats;
    private ArrayList<Ticket> soldTickets;
    private ArrayList<Promotion> promotions;
    private ArrayList<Seat> seats;
    private Event event;
    private VenueManager venueManager;
    /**
     * Creates a new instance of the Show class.
     *
     * @param showName            The name of the show.
     * @param showDate            The date of the show.
     * @param maxSeatsPerCustomer The maximum number of seats a customer can purchase for this show.
     */
    public Show(String showName,
                LocalDate showDate,
                int maxSeatsPerCustomer,
                int totalSeats
                ) 
    {
        this.showName            = showName;
        this.showDate            = showDate;
        this.maxSeatsPerCustomer = maxSeatsPerCustomer;
        this.totalSeats          = totalSeats;
        this.remainingSeats      = totalSeats;
        this.soldTickets         = new ArrayList<>();
        this.promotions          = new ArrayList<>();
        this.seats               = new ArrayList<>();
    }

    /**
     * Gets the name of the show.
     * @return The name of the show.
     */
    public String getShowName() 
    {
        return showName;
    }
    
     public void setShowName(String showName) 
    {
        this.showName = showName;
    }
    
    /**
     * Gets the date of the show.
     * @return The date of the show.
     */
    public LocalDate getShowDate() 
    {
        return showDate;
    }
    
    /**
     * Gets the maximum number of seats a customer can purchase for this show.
     * @return The maximum number of seats a customer can purchase for this show.
     */
    public int getMaxSeatsPerCustomer() 
    {
        return maxSeatsPerCustomer;
    }
    
    /**
     * Sets the maximum number of seats that a customer can purchase.
     */
    public void setMaxSeatsPerCustomer(int maxSeatsPerCustomer) 
    {
        this.maxSeatsPerCustomer = maxSeatsPerCustomer;
    }
    
    /**
     * Returns the total number of seats for the show.
     */
    public int getTotalSeats() 
    {
        return totalSeats;
    }

    /**
     * Returns the number of remaining seats for the show.
     */
    public int getRemainingSeats() 
    {
        return remainingSeats;
    }

    /**
     * Updates the number of remaining seats for the show.
     */
    public void updateRemainingSeats(int numSeats) 
    {
        remainingSeats -= numSeats;
    }
    
    /**
     * Gets a list of tickets sold for this show.
     *
     * @return A list of tickets sold for this show.
     */
    public ArrayList<Ticket> getSoldTickets() 
    {
        return soldTickets;
    }
    
    /**
     * Gets a list of promotions for this show.
     * @return A list of promotions for this show.
     */
    public ArrayList<Promotion> getPromotions() 
    {
        return promotions;
    }
    
    /**
     * Gets a list of seats for this show.
     * @return A list of seats for this show.
     */
    public ArrayList<Seat> getSeats() 
    {
        return seats;
    }

    /**
     * Gets the event associated with this show.
     * @return The event associated with this show.
     */
    public Event getEvent() 
    {
        return event;
    }
    
    /**
     * Gets the venue manager associated with this show.
     * @return The venue manager associated with this show.
     */
    public VenueManager getVenueManager() 
    {
        return venueManager;
    }
    
    /**
     * Sets the event associated with this show.
     *
     * @param event The event to associate with this show.
     */
    public void setEvent(Event event) 
    {
        this.event = event;
    }
    
    /**
     * Sets the venue manager associated with this show.
     * @param venueManager The venue manager to associate with this show.
     */
    public void setVenueManager(VenueManager venueManager) 
    {
        this.venueManager = venueManager;
    }
    
    /**
     * Adds a promotion to this show.
     * @param promotion The promotion to add.
     */
    public void addPromotion(Promotion promotion) 
    {
        promotions.add(promotion);
    }
    
    /**
     * Removes a promotion from this show.
     * @param promotion The promotion to remove.
     */
    public void removePromotion(Promotion promotion) 
    {
        promotions.remove(promotion);
    }
    
    /**
     * Displays the details of this show.
     */
    public void viewShowDetails() 
    {
        System.out.println("Show name: " + showName);
        System.out.println("Show date: " + showDate);
        System.out.println("Maximum seats per customer: " + maxSeatsPerCustomer);
    }
    
    /**
     * Adds a seat to this show.
     * @param seat The seat to add.
     */
    public void addSeat(Seat seat) 
    {
        seats.add(seat);
    }
    
    /**
     * Removes a seat from this show.
     * @param seat The seat to remove.
     */
    public void removeSeat(Seat seat) 
    {
        seats.remove(seat);
    }
    
    /**
     * Displays the details of all tickets sold for this show.
     */
    public void viewSoldTickets() 
    {
        for (Ticket ticket : soldTickets) 
        {
            System.out.println(ticket.toString());
        }
    }
}