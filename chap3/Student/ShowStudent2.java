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
public class ShowStudent2 {
    public static void main(String[] args) {
        Student Sally = new Student ();
        
        Sally.showIdNumber();
        Sally.showHours();
        Sally.showPoints();
        System.out.println("The GPA is: " + Sally.getGradePoint());
                
    }
}
