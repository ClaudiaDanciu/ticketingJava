import java.util.ArrayList;


/**
 * The Ticket class represents a ticket for a show
 * Claudia Danciu
 */
public class Ticket {
    private String ticketId;
    private Seat seat;
    private double ticketPrice;
    private Show show;
    private Promotion promotion;

    public Ticket(String ticketId, Seat seat, double ticketPrice, Show show) 
    {
        this.ticketId    = ticketId;
        this.seat        = seat;
        this.ticketPrice = ticketPrice;
        this.show        = show;
    }

    /**
     * Calculates the price of the ticket after applying any applicable discounts.
     * @return The price of the ticket after applying discounts.
     */
    public double calculatePrice() 
    {
        double price    = ticketPrice;
        double discount = calculateDiscount();
        price           -= discount;
        return price;
    }

    /**
     * Calculates the total discount that can be applied to the ticket.
     * @return The total discount amount for the ticket.
     */
    public double calculateDiscount() 
    {
        double discount = 0;
        for (Promotion promotion : seat.getShow().getPromotions()) 
        {
            if (promotion.getShow().equals(show)) 
            {
                discount += promotion.getDiscountAmount();
            }
        }
        return discount;
    }

    /**
     * Calculates the total price of the ticket after applying any applicable discounts.
     * @return The total price of the ticket.
     */
    public double calculateTotalPrice() 
    {
        double price = calculatePrice();
        return price + show.getEvent().getDiscountAmount();
    }

    /**
     * Gets the ticket ID.
     * @return The ticket ID.
     */
    public String getTicketId() 
    {
        return ticketId;
    }

    /**
     * Gets the seat associated with the ticket.
     * @return The seat associated with the ticket.
     */
    public Seat getSeat() 
    {
        return seat;
    }

    /**
     * Sets the seat associated with the ticket.
     * @param seat The seat to set.
     */
    public void setSeat(Seat seat) 
    {
        this.seat = seat;
    }
    
    /**
     * Gets the ticket price.
     * @return The ticket price.
     */
    public double getTicketPrice() 
    {
        return ticketPrice;
    }

    /**
     * Sets the ticket price.
     * @param ticketPrice The ticket price to set.
     */
    public void setTicketPrice(double ticketPrice) 
    {
        this.ticketPrice = ticketPrice;
    }

    /**
     * Gets the show associated with the ticket.
     * @return The show associated with the ticket.
     */
    public Show getShow() 
    {
        return show;
    }

    /**
     * Sets the show associated with the ticket.
     * @param show The show to set.
     */
    public void setShow(Show show) 
    {
        this.show = show;
    }

    /**
     * Gets the promotion associated with the ticket.
     * @return The promotion associated with the ticket.
     */
    public Promotion getPromotion() 
    {
        return promotion;
    }

    /**
     * Sets the promotion associated with the ticket.
     * @param promotion The promotion to set.
     */
    public void setPromotion(Promotion promotion) 
    {
        this.promotion = promotion;
    }
    
    /**
     * Gets an array of promotions applicable to the ticket.
     * @return An array of promotions applicable to the ticket.
     */
    public Promotion[] getApplicablePromotions() 
    {
        ArrayList<Promotion> applicablePromotions = new ArrayList<>();
        for (Promotion promotion : seat.getShow().getPromotions()) 
        {
            if (promotion.getShow().equals(show)) 
            {
                applicablePromotions.add(promotion);
            }
        }
        return applicablePromotions.toArray(new Promotion[applicablePromotions.size()]);
    }
}
