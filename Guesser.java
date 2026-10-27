import java.util.*;
public class Guesser{
    public static void main(String[] args){
        new Guesser();
    }
    public Guesser(){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean keepGoing = true;
        boolean guessed = false;
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
                    System.out.println("human guesser");
                    int correct = random.nextInt(100) + 1;
                    while(!guessed){
                        int count = 0;
                        System.out.println(count +") please guess a number");
                        int guess = input.nextInt();

                        if(guess == correct){
                            System.out.println("got it!");
                            guessed = true;
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
                    while(!guessed){
                        int lowBound = 0;
                        int highBound = 100;
                        System.out.println("I guess "+guesser(lowBound,highBound));
                        System.out.println("Too (H)igh, too (L)ow, or (C)orrect?\n");
                        String check = input.next();
                        if(check.equalsIgnoreCase("h")){
                            //decrease upper
                            highBound -= (int) highBound/2;
                        } else if(check.equalsIgnoreCase("c")){
                            //increase lower
                            lowBound += (int) highBound/2;
                        }
                    }
                    break;
            }
        }
    }
    private int guesser(int uBound, int lBound){
        return (int) ((uBound - lBound)/2);
    }

}