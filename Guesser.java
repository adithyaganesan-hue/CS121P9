import java.util.*;
public class Guesser{
    public static void main(String[] args){
        new Guesser();
    }
    public Guesser(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean keepGoing = true;
        while(keepGoing){
            System.out.println("0) Exit\n1) Human Guesser\n2) Computer Guesser\n");
            System.out.println("Please enter a number: ");
            int num = input.nextInt();
            switch(num){
                case 0:
                    keepGoing = false;
                    break;
                //human guesser
                case 1:
                    boolean humanGuessed = false;
                    System.out.println("human guesser");
                    int correct = random.nextInt(100) + 1;
                    while(!humanGuessed){
                        int count = 0;
                        System.out.println(count +") please guess a number");
                        int guess = input.nextInt();

                        if(guess == correct){
                            System.out.println("got it!");
                            humanGuessed = true;
                        } else if(guess < correct){
                            System.out.println("too low.");
                        } else if(guess > correct){
                            System.out.println("too high.");
                        }
                        count++;
                    }
                    System.out.println("Very Good!");
                    break;
                case 2:
                    System.out.println("computer guesser");
                    boolean computerGuessed = false;
                    int lowBound = 0;
                    int highBound = 100;

                    while (!computerGuessed) {
                        int guess = guesser(highBound, lowBound);
                        System.out.println("I guess " + guess);
                        System.out.println("Too (H)igh, too (L)ow, or (C)orrect?\n");

                        String check = input.next();

                        if (check.equalsIgnoreCase("h")) {
                            highBound = guess;
                        } else if (check.equalsIgnoreCase("l")) {
                            lowBound = guess;
                        } else if (check.equalsIgnoreCase("c")) {
                            computerGuessed = true;
                        }
                    }
                    break;
            }
        }
        input.close();
    }
    private int guesser(int higherBound, int lowerBound){
        return (int) ((higherBound + lowerBound)/2);
    }
}