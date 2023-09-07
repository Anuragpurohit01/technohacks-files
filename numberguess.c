#include<math.h>
#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main()
{
    int number, guess, numberofguess = 0;

    srand(time(NULL));
    //Generate a random number
    number = rand() % 100 +1;

    printf("Guess the number between 1 and 100\n");
  //  using a do while loop
  do
  {
    if (numberofguess > 9)
    {
        printf("\nYou Loose!\n");
        break;
    }
    scanf("%d",&guess);   // input by user

    // when user guesses lower
    // than actual number
    if (guess > number)
    {
        printf("Lower number Please!\n");
        numberofguess++;
    }
    
    // when user guesses higher than actual number
    else if (number > guess)
    {
        printf("Higher number Please!\n");
        numberofguess++;
    }

    else
    printf("you guessed the number in %d attempts!\n", numberofguess);

  } 
  
  while (guess != number);
}
