import java.util.Random;

public class Main {

    public static void main(String[] args) {
//scenario 1
        Random rand = new Random();
        int evens = 0;
        int odds = 0;
        double probability = 0.5;
        for (int a = 0; a < 100000; a++) {
            int num = rand.nextInt(6) + 1;
            if (num == 2 || num == 4|| num == 6) {
                evens++;
            }
            else {
                odds++;
            }
        }
        double percentage = evens / 100000.0;
        System.out.printf("\nScenario 1\nExpected Percentage: %f\nAmount of evens: %d\nAmount of odds: %d\nActual percentage: %f\n", probability, evens, odds, percentage);

  //scenario 2
   int evenor5plus = 0;
   int odd2 =0;
   double probability2 = .70;
   for (int b = 0; b <100000; b++) {
       int num2 = rand.nextInt (10) + 1;
       if (num2 > 5 || num2 == 2 || num2 ==4) {
           evenor5plus++;
       }
       else {
           odd2++;
       }
       }
       double percentage2 =evenor5plus / 100000.0;
        System.out.printf("\nScenario 2\nExpected Percentage: %f\nAmount of evens or more than 5: %d\nAmount of odds or less than 5: %d\nActual percentage: %f\n", probability2, evenor5plus, odd2, percentage2);


     //scenario 3
        int True = 0;
        int False = 0;
       double Probability3 = 0.25;
        for (int c = 0; c < 100000; c++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            if ((roll1 % 2 == 0) && (roll2 % 2 == 1)) {
                True++;
            }
            else {
                False++;
            }
        }
       double Percentage3 = True / 100000.0;
        System.out.printf("\nScenario 3\nExpected Outcome: %f\nAmount of even then odd: %d\nAmount of other: %d\nActual percentage: %f\n", Probability3, True, False, Percentage3);
        //scenario 4
        int True4 = 0;
        int False4 = 0;
        double Probability4 = .0370370;
        for (int d = 0; d < 100000; d++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            if ((roll1  == 2 || roll1 == 1) && (roll2 == 3 || roll2 == 4) && (roll3 == 5 || roll3 ==6)) {
                True4++;
            }
            else {
                False4++;
            }
        }
        double Percentage4 = True4 / 100000.0;
        System.out.printf("\nScenario 4\nExpected Outcome: %f\nAmount of 1-2 then 3-4 then 5-6: %d\nAmount of other: %d\nActual percentage: %f\n", Probability4, True4, False4, Percentage4);

        //scenario 5
        int True5 = 0;
        int False5 = 0;
        double Probability5 = .2777777;
        for (int d = 0; d < 100000; d++) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            int roll3 = rand.nextInt(6) + 1;
            int roll4 = rand.nextInt(6) + 1;
            if ((roll1  != roll2 && roll1 != roll3 && roll1 != roll4 && roll2 != roll3 && roll2 !=roll4 && roll3 != roll4)) {
                True5++;
            }
            else {
                False5++;
            }
        }
        double Percentage5 = True5 / 100000.0;
        System.out.printf("\nScenario 5\nExpected Outcome: %f\nAmount of outcomes where none of the rolls: %d\nAmount of other: %d\nActual percentage: %f\n", Probability5, True5, False5, Percentage5);







    }

    }
