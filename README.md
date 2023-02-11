# Java-BowlingGame-Kata
This program implements the scoring system for a game ten-pin bowling.

The game consists of 10 frames,with each frames allowing for two rolls except for the final frame
which allows for three rolls in the case of spare or strike.
The scoring system works as follows:
- A spare is scored by adding the number of pins knocked down in the next roll to the current frame score.
- A strike is scored by adding the number of pins knocked down in the next two rolls to the current frame score.

Testing the program:

The program includes three test cases for different scenarios: all strikes, all spares, and all nines. 
The tests can be run using a Java testing framework such as JUnit. If the tests pass, it means the program is correctly calculating the score for each scenario.

Suggested Test Cases
(When scoring “X” indicates a strike, “/” indicates a spare, “-” indicates a miss)

X X X X X X X X X X X X (12 rolls: 12 strikes) = 10 frames * 30 points = 300

9- 9- 9- 9- 9- 9- 9- 9- 9- 9- (20 rolls: 10 pairs of 9 and miss) = 10 frames * 9 points = 90

5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames * 15 points = 150

Remember to consider a range of different happy path test cases (all types of valid inputs) and edge cases (all types of invalid/missing inputs).
