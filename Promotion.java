import java.util.*;
import java.time.LocalDate;

/**
 * The Promotion class represents a promotion that can be applied to a Show for an Event.
 * @Claudia Danciu
 */
public class Promotion 
{
    // instance variables
    private String promotionName;
    private double discountAmount;
    private LocalDate promotionStartDate;
    private LocalDate promotionEndDate;
    private Show show;
    private ArrayList<Seat> assignedSeats;
    private ArrayList<Ticket> tickets;

    /**
     * Constructor for objects of class Promotion
     */
    public Promotion(String promotionName, 
                    double discountAmount, 
                    LocalDate promotionStartDate, 
                    LocalDate promotionEndDate, 
                    Show show
                    ) 
    {
        this.promotionName      = promotionName;
        this.discountAmount     = discountAmount;
        this.promotionStartDate = promotionStartDate;
        this.promotionEndDate   = promotionEndDate;
        this.show               = show;
        this.assignedSeats      = new ArrayList<>();
        this.tickets            = new ArrayList<>();
    }

    // getters and setters
    public String getPromotionName() 
    {
        return promotionName;
    }

    public void setPromotionName(String promotionName) 
    {
        this.promotionName = promotionName;
    }

    public double getDiscountAmount() 
    {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) 
    {
        this.discountAmount = discountAmount;
    }

    public LocalDate getPromotionStartDate() 
    {
        return promotionStartDate;
    }

    public void setPromotionStartDate(LocalDate promotionStartDate) 
    {
        this.promotionStartDate = promotionStartDate;
    }

    public LocalDate getPromotionEndDate() 
    {
        return promotionEndDate;
    }

    public void setPromotionEndDate(LocalDate promotionEndDate) 
    {
        this.promotionEndDate = promotionEndDate;
    }

    public Show getShow() 
    {
        return show;
    }

    public void setShow(Show show) 
    {
        this.show = show;
    }

    public ArrayList<Seat> getAssignedSeats() 
    {
        return assignedSeats;
    }

    public void setAssignedSeats(ArrayList<Seat> assignedSeats) 
    {
        this.assignedSeats = assignedSeats;
    }

    public ArrayList<Ticket> getTickets() 
    {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) 
    {
        this.tickets = tickets;
    }

    // Methods
    public void viewPromotionDetails() 
    {
        System.out.println("Promotion Name: " + promotionName);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Promotion Start Date: " + promotionStartDate);
        System.out.println("Promotion End Date: " + promotionEndDate);
    }

    public void updatePromotionDetails(String promotionName, 
                                        double discountAmount, 
                                        LocalDate promotionStartDate,
                                        LocalDate promotionEndDate
                                        ) 
    {
        this.promotionName      = promotionName;
        this.discountAmount     = discountAmount;
        this.promotionStartDate = promotionStartDate;
        this.promotionEndDate   = promotionEndDate;
    }

    public void assignSeats(ArrayList<Seat> seats) 
    {
        assignedSeats.addAll(seats);
    }

    public boolean checkAvailability() 
    {
        for (Seat seat : assignedSeats) 
        {
            if (!seat.isAvailable()) 
            {
                return false;
            }
        }
        return true;
    }

    public void assignToShow(Show show) 
    {
        this.show = show;
        show.addPromotion(this);
    }

    public void assignToTicket(Ticket ticket) 
    {
        this.tickets.add(ticket);
        ticket.setPromotion(this);
    }
}
