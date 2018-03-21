/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carly;

/**
 *
 * @author Charles
 */
public class Event {
    public final static double GUEST_PRICE = 35.00;
    public final static int LARGE_EVENT = 50;
    
    private String EventNumber;
    private int Guests;
    private double Price;
    
    
    Event()
    {
      this("A000" , 0); 
    }
    Event (String eventNumber, int guest)
    {
        this.EventNumber = eventNumber;
        this.Guests = guest;
        setEventNumber(eventNumber);
        setGuests(guest);
    }
    
    public void setEventNumber (String num)
    {
        EventNumber = num;
    }
    public void setGuests ( int gsts)
    {
        Guests = gsts;
        Price = Guests * GUEST_PRICE;
    }
    public String getEventNumber()
    {
        return EventNumber;
    }
    public int getGuests()
    {
        return Guests;
    }
    public double getPrice()
    {
        return Price;
    }
}
