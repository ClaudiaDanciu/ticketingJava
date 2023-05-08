
/**
 * The Seat class represents a seat in a venue
 * Claudia Danciu
 */
public class Seat
{
    // instance variables
    private int seatNumber;
    private boolean isAvailable;
    private Show show;
    private Show showId;
    private boolean reserved;


    /**
     * Constructor for objects of class Seat
     * @param seatNumber the number of the seat
     * @param isAvailable true if the seat is available, false otherwise
     * @param show the show to which the seat belongs
     * @param showId the ID of the show to which the seat belongs
     */
    public Seat(int seatNumber, boolean isAvailable, Show show, Show showId)
    {
        // initialise instance variables
        this.seatNumber = seatNumber;
        this.isAvailable = isAvailable;
        this.show = show;
        this.showId = showId;
        this.reserved = false;
    }

    /**
     * Returns the number of the seat
     * @return the number of the seat
     */
    public int getSeatNumber() 
    {
        return seatNumber;
    }
    
    /**
     * Returns true if the seat is available, false otherwise
     * @return true if the seat is available, false otherwise
     */
    public boolean isAvailable() 
    {
        return isAvailable;
    }
    
    public void reserve() 
    {
        this.reserved = true;
    }

    
    /**
     * Reserves the seat
     */
    public void reserveSeat() 
    {
        isAvailable = false;
    }
    
    /**
     * Releases the seat
     */
    public void releaseSeat() 
    {
        isAvailable = true;
    }
    
    /**
     * Returns the show to which the seat belongs
     * @return the show to which the seat belongs
     */
    public Show getShow() 
    {
        return show;
    }
    
    /**
     * Sets the show to which the seat belongs
     * @param show the show to which the seat belongs
     */
    public void setShow(Show show) 
    {
        this.show = show;
    }

    /**
     * Returns the ID of the show to which the seat belongs
     * @return the ID of the show to which the seat belongs
     */
    public Show getShowId() 
    {
        return showId;
    }
    
     public boolean isReserved() 
     {
        return reserved;
    }
    
    /**
     * Checks the availability of the seat and prints a message
     * indicating whether the seat is available or not.
     */
    public void checkAvailability() 
    {
        if (isAvailable) {
            System.out.println("Seat " + seatNumber + " is available");
        } else {
            System.out.println("Seat " + seatNumber + " is not available");
        }
    }
}
