import java.util.ArrayList;

/**
 * The Event class represents an event in a ticket reservation system.
 * @Claudia Danciu
 */
public class Event
{
    // instance variables
    private String eventDate;
    private String eventDescription;
    private ArrayList<Show> shows;
    private VenueManager venueManager;
    private String eventName;
    private double discountAmount;
    
    /**
     * Creates a new instance of the Event class.
     * @param eventDate        The date of the event.
     * @param eventDescription The description of the event.
     */
    public Event(String eventDate, String eventDescription) {
        this.eventDate        = eventDate;
        this.eventDescription = eventDescription;
        this.shows            = new ArrayList<>();
        this.eventName        = eventName;
    }

    /**
     * Gets the date of the event.
     * @return The date of the event.
     */
    public String getEventDate() 
    {
        return eventDate;
    }
    
    /**
     * Gets the name of the event
     * @return The name of the event.
     */
    public String getEventName() 
    {
        return eventName;
    } 
    
    /**
     * Gets the description of the event.
     * @return The description of the event.
     */
    public String getEventDescription()
    {
        return eventDescription;
    }
    
    public void setEventDescription(String eventDescription) 
    {
        this.eventDescription = eventDescription;
    }
    
    public void setEventName(String eventName) 
    {
        this.eventName = eventName;
    }
    
    /**
     * Gets a list of shows for this event.
     * @return A list of shows for this event.
     */
    public ArrayList<Show> getShows() 
    {
        return shows;
    }

    /**
     * Gets the venue manager for this event.
     * @return The venue manager for this event.
     */
    public VenueManager getVenueManager() 
    {
        return venueManager;
    }
    
    /**
     * Sets the venue manager for this event.
     * @param venueManager The venue manager for this event.
     */
    public void setVenueManager(VenueManager venueManager) 
    {
        this.venueManager = venueManager;
    }
    
    /**
     * Displays the details of this event.
     */
    public void viewEventDetails() 
    {
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Description: " + eventDescription);
    }
    
    /**
     * Adds a show to this event.
     * @param show The show to add.
     */
    public void assignShow(Show show) 
    {
        shows.add(show);
    }
    
    /**
     * Returns the discount amount of the promotion.
     */
    public double getDiscountAmount() 
    {
        return discountAmount;
    }

    /**
     * Sets the discount amount of the promotion.
     */
    public void setDiscountAmount(double discountAmount) 
    {
        this.discountAmount = discountAmount;
    }
}
