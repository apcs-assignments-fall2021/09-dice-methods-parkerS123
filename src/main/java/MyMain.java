public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int roll = (int) (Math.random()* 6 + 1);
        return roll;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        double counter = 0.0;

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        for (int i = 0; i < 10000; i++) {
            for(int j = 0; j < 6; j++){
                rollDie();
                if (rollDie() == 6){
                    counter ++;
                    break;
                }
            }

        }
        counter = counter/100.0; // divide by 100 because 10000/100 = 100 because we want percentage not decimal

        return counter;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        // use probibilityone six method to see if it gets a six, then run again, if both sixes add one to counter

        double counter = 0.0;
        int six_counter = 0;

        for (int i = 0; i < 10000; i++) {
            six_counter = 0;
            for(int j = 0; j < 12; j++){
                rollDie();
                if (rollDie() == 6){
                    six_counter ++;
                }
                if (six_counter == 2) {
                    six_counter = 0;
                    counter ++;
                    break;
                }
            }

        }
        counter = counter/100.0;
        return counter;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        double counter = 0.0;
        int six_counter = 0;

        for (int i = 0; i < 10000; i++) {
            six_counter = 0;
            for(int j = 0; j < 18; j++){
                rollDie();
                if (rollDie() == 6){
                    six_counter ++;
                }
                if (six_counter == 3) {
                    six_counter = 0;
                    counter ++;
                    break;
                }
            }

        }
        counter = counter/100.0;
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(rollDie());
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
