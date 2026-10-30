# CS121P9
By Adithya Ganesan

## Guesser.java
```
import java util
```

### static void main(String[] args)
```
new Guesser() //can't do functionality in main due to using non-static methods
```
### Guesser()
```
create new Scanner input
create new Random random

keepGoing = true;
while(keepGoing)
    print options
    prompt user to input a number
    int num = input.nextInt()

    switch(num)
        case 0
            leave switch
            leave loop
        case 1
            humanGuessed = false
            generate random int correct 0-100

            while(!humanGuessed)
                int count = 0
                prompt user to guess number
                int guess = input.nextInt()

                if(guess == correct)
                    leave loop
                elseif(guess < correct)
                    print("too low")
                elseif(guess > correct)
                    print("too high")
                
                count++
            leave switch
        case 2
            computerGuessed = false
            lowBound = 0
            highBound = 100

            while(!computerGuessed)
                int guess = guesser(highBound,lowBound)
                print(guess)

                ask user H, L, C(orrect)
                check = input.next()

                if(check == h)
                    highBound = guess
                elseif(check == l)
                    lowBound = guess
                elseif(check  == c)
                    leave loop
            
            leave switch
```

### guesser(int higherBound, int lowerBound)
```
return (int) (higherBound + lowerBound)/2
```

