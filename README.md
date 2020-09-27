## Swagger documentation API link
http://localhost:8080/swagger-ui.html#/play-controller
 


### Code local installation
1. Extract the folder
2.  Import project as existing maven project
3.  Run project as Java application
4.  root url to start API-http://localhost:8080//play4/START

### Testing steps
1. http://localhost:8080//play4/START
Request type- GET
Input – none
Output- ready with both players name
 








2. http://localhost:8080//play4/chooseColor/Yellow
Request type- GET
Input – Color at the end eg in above is (Yellow)
Output- Set player1 color the the color specified

 



















3. http://localhost:8080//play4/Player1/1
Input- column name is entered at the end of url (eg for this url 1 is the column which player 1 chooses)
Output: valid move  and for each player what column value was entered.
 


4. http://localhost:8080//play4/Player2/5
Input- column name is entered at the end of url (eg for this url 5 is the column which player 2 chooses)
Output: valid move and for each player what column value was entered.
 


Similarly after enterting some columns for player1 and player2
 

If same player tries to take another turn after another
Output-  It’s not your turn
 






