# MAD AY2019/20 Common Test - Time Control
You are to develop a Time Control mobile application. Time control is a mechanism commonly used in tournament play of almost all two-player board games. Each player is given a limited amount of time to complete their move so that each round of the tournament can finish in a timely manner.

There are 2 **Activity** in the application namely **MainActivity** and **TimeActivity** as shown in Figure below. The **MainActivity** allows the user to input the duration in seconds, and a button to start the timer. Upon clicking on the button, the **TimeActivity** will appear. The remaining time for each player is shown at the top of the screen, and a button to click on when the player wants to end their turn is located at the bottom of the screen. The history of remaining time where each player ends their turn occupies the remaining space on the screen.

<br/><img src="/images/1a.png" width="200"/> <img src="/images/1b.png" width="200"/>

The TimeActivity will perform the following tasks:
- When this Activity is launched, both players’ timer is pre-set to the duration entered by the user in MainActivity. 
- The timer for player 1 will begin counting down at 1 sec interval immediately. 
- When the user clicks on the Next Button, 
  - The timer for player 1 will stop
  - A record is added to the ListView, which shows the amount of time left by player 1
  - The timer for player 2 will start
- When the user clicks on the Next Button again,
  - The timer for player 2 will stop
  - A new record, showing the remaining time for player 2, is added to the ListView
- The timer for player 1 will start, continuing from the remaining time he has left earlier
  - When a timer runs out, a Toast notification will appear, indicating the player’s timer has runs out.

