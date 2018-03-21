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
import java.util.*;
public class EventDemo 
{
    public static void main(String[] args) 
    {
        Event obj1 = new Event();
        System.out.println("Event Number is: " + obj1.getEventNumber() + "and the number of guests :" + obj1.getGuests());
        Event obj2 = new Event("H92",300);
        System.out.println("Event Number is: " + obj2.getEventNumber() + "and the number of guests :" + obj2.getGuests());
    }
}
    