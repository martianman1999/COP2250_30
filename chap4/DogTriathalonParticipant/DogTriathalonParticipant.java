/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogTriathalonParticipant;

public class DogTriathalonParticipant {

private final String name;
private final int obedienceScore;
private final int conformationScore;
private final int agilityScore;
private final int total;
private final double avg;
private final int NUM_EVENTS;

public DogTriathalonParticipant (String name, int numEvents, int score1, int score2, int score3) {
    this.name = name;
    NUM_EVENTS = numEvents; 
    obedienceScore = score1;
    conformationScore = score2;
    agilityScore = score3;

    total = obedienceScore + conformationScore + agilityScore;
    avg = (double) total / numEvents; // edited here, I think you are trying to get the average of to total by numEvents, in this case, the score1 shoulb be the sum of the events "numEvents".
    //totalCumulativeScore = totalCumulativeScore + total; 
}
public void display()
    {
        System.out.println(name + " participated in " + NUM_EVENTS + " Events and has an average score of " + avg);
        System.out.println( " " + name + " has total score of " + total + " bringing the total cumlative score to " + total);
    } 
 }