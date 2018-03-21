
package Spa;

/**
 *
 * @author Charles
 */
public class SpaService {
    
    public SpaService()
    {
     serviceDescription = "XXX";
     price = 0;
    }    
    private String serviceDescription;
    private double price;
   public void setServiceDescription(String service){
       serviceDescription = service;
   }
   public void setPrice(double pr){
       price = pr;
   }
   public String getServiceDescription(){
       return serviceDescription;
   }
   public double getPrice(){
       return price;
   }
}
