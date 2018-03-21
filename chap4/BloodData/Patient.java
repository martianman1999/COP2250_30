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
public class Patient {
    private String id;
    private int age;
    private BloodData bloodData;
    
public Patient()
{
    id = "0";
    age = 0;
    bloodData = new BloodData();
}
public Patient(String id, int age,String bType, String rhFactor )
{
    this.id = id;
    this.age = age;
    bloodData = new BloodData(bType, rhFactor);
}
public String getId()
{
    return id;
}
public int getAge()
{
    return age;
}
public BloodData getBloodData()
{
    return bloodData;
}
}
