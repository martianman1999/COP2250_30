/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BloodData;

/**
 *
 * @author Charles
 */
public class TestBloodData {
    public static void main(String[] args) 
    {
        BloodData b1 = new BloodData();
        BloodData b2 = new BloodData("A","-");
        
        display(b1);
        display(b2);
    }
    public static void display(BloodData b)
    {
        System.out.println("The blood type is " + b.getBloodType() + b.getrhFactor());
    }
}
