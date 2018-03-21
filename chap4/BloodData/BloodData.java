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
public class BloodData {
    private String bloodType;
    private String rhFactor;
public BloodData()
 {
     this("o","+");
 }
public BloodData(String bType, String rh)
{
    bloodType = bType;
    rhFactor = rh;
}
public void setBloodType(String bType)
{
    bloodType = bType;
}
public String getBloodType()
{
    return bloodType;
}
public void setrhFactor(String rh)
{
    rhFactor = rh;
}
public String getrhFactor()
{
    return rhFactor;
}

}
