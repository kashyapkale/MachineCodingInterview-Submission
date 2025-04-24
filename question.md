Create a game where the computer tries to guess the name of the person you are thinking of.

The computer asks a series of yes or no questions to determine the person. The computer only gets a single guess about the identity.

If the guess is correct, the game ends.

If the guess is incorrect:
- the computer asks the player who they were thinking of
- the computer asks to input a new yes or no question to distinguish between the two people
- include the new question and person in future playthroughs

Regardless of the result, the computer asks the player if they would like to play again.

--------------------------------------------------------------------------------------

The following are valid examples of gameplay, but the developer does NOT have to use this exact initial dataset.

Example 1: Computer guesses correctly
New Game!
Is the person a movie star?
> N
Is the person a famous athlete?
> Y
Is the person LeBron James?
> Y
I guessed it!
Would you like to play again?
> N

Example 2: Computer guesses correctly
New Game!
Is the person a movie star?
> Y
Is the person Zendaya?
> Y
I guessed it!
Would you like to play again?
> N

Example 3: Computer does not guess correctly
New Game!
Is the person a movie star?
> N
Is the person a famous athlete?
> Y
Is the person LeBron James?
> N
I give up! Who is it?
> Lionel Messi
What is a question I can use to distinguish between Lionel Messi and LeBron James?
> Is the person a soccer (football) player?
And what is the answer if the person is Lionel Messi?
> Y
Thank You!
Would you like to play again?
> Y

New Game!
Is the person a movie star?
> N
Is the person a famous athlete?
> Y
Is the person a soccer (football) player?
> Y
Is the person Lionel Messi?
> Y
I guessed it!
Would you like to play again?