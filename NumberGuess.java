import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;
import java.util.*;

 public class NumberGuess extends Application {
 private int randomNo, lives;
 @Override
 public void start (Stage stage) {
 Random random = new Random();
 //default max for numbers from 0-99
 int max = 100;
 randomNo = random.nextInt(max);
 //numberss of trials
 lives = 8;
 
 //User Input
 TextField textNo = new TextField();
 textNo.setMaxWidth(250);
 textNo.setFont(Font.font("Arial", 20));
 
 //Message shown for the users
 Text texts = new Text(10,20, "Guess the correct Number");
 texts.setFont(Font.font("Arial", 18));
  
 //Users trials left is shown
 Text trials = new Text(10, 20, "You only have " + lives + " trial/s left");
 trials.setFont(Font.font("Arial", 20));
 
 //Shows text for the range of numbers to guess
 Text range = new Text(10, 20, "Range of Numbers: 0-" + max);
 range.setFont(Font.font("Arial", 18));
 
  //Button for submission of answers
 Button answer = new Button("Submit");
 answer.setOnAction(e -> {
 if (lives > 0){
 int guess = Integer.parseInt(textNo.getText());
 if (guess > randomNo) {
 texts.setText("Number to high");
 texts.setFill(Color.BLACK);
 lives  -= 1;
 trials.setText("You only have " + lives + " trial/s left");
 }
 else if(guess < randomNo){
 texts.setText("Number to low");
 texts.setFill(Color.BLACK);
 lives  -= 1;
 trials.setText("You only have " + lives + " trial/s left");
 }
 else{
 texts.setText("Congratulations you guessed the correct number!!!");
 texts.setFill(Color.GREEN);
 randomNo = random.nextInt(max);
 lives = 5;
 trials.setText("New number is generated\nYou have " + lives + " trial/s left");
 }
 }
 else{
 randomNo = random.nextInt(max);
 lives = 8;
 trials.setText("GAME OVER!!!\nNew number is generated\nTrials Left "+ lives);         
 } 
 
 
   });
 
 VBox root = new VBox();
      root.setSpacing(10);
      root.setAlignment(Pos.CENTER);
      root.getChildren().addAll(trials, range, textNo, answer, texts);
   
      Scene scene = new Scene(root, 405, 400);
      stage.setScene(scene);
      stage.setTitle("Number Guessing by Kervy How");
      stage.show();
 
 
 }
 


}