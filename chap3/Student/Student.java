/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Charles
 */
public class Student {
private int idNumber;
private int hours;
private int points;
public Student(){
    idNumber = 999;
    points = 12;
    hours = 3;
}
// public set and get methods
public void setIdNumber(int number) 
{
        idNumber = number;  
}
public int getIdNumber(){
    return idNumber;
    
}
public void setHours(int number){
    hours = number;
    
}
public int getHours(){
    return hours;
}
public void setPoints(int number){
    points = number;
}
public int getPoints(){
    return points;
}
public void showIdNumber(){
    System.out.println("Id Number is: " + idNumber);
}        
public void showHours(){
    System.out.println("The hours are: " + hours);
}
public void showPoints(){
    System.out.println("The hours are : " + points);
}
public double getGradePoint(){
    return (points * 1.0 / hours);
}

}
