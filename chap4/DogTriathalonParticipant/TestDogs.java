/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DogTriathalonParticipant;

public class TestDogs {
    public static void main(String[] args) {

        DogTriathalonParticipant dog1 = new DogTriathalonParticipant("Bowser" , 2, 85, 89,0);
        DogTriathalonParticipant dog2 = new DogTriathalonParticipant("Rush", 3, 78, 72, 80);
        DogTriathalonParticipant dog3 = new DogTriathalonParticipant("Ginger", 3, 90, 86, 72);

        dog1.display();
        dog2.display();
        dog3.display();
    }
}
