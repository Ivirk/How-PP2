import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class simpleCalculator extends Application{
   @Override 
   public void start(Stage stage){
   // User Input
   TextField calcuText = new TextField();
   calcuText.setMaxWidth(150);     
   TextField calcutext = new TextField();
   calcutext.setMaxWidth(150);

   // Label for the answer
   Label answers = new Label();
   answers.setTextFill(Color.RED);
   answers.setFont(Font.font("Arial", 20));
   
   // Addition Button 
   Button addition = new Button();
   addition.setText("+");
   addition.setOnAction(e -> {
   try{
   double num1 = Double.parseDouble(calcuText.getText());
   double num2 = Double.parseDouble(calcutext.getText());
   double answer = num1 + num2;
   answers.setText("Result: " + answer);
   } 
   catch (NumberFormatException ex) {
   answers.setText("Invalid input");
   }
   });
   
   // Subtraction Button 
   Button subtraction = new Button();
   subtraction.setText("-");
   subtraction.setOnAction(e -> {
   try {
   double num1 = Double.parseDouble(calcuText.getText());
   double num2 = Double.parseDouble(calcutext.getText());
   double answer = num1 - num2;
   answers.setText("Result: " + answer);
   } 
   catch (NumberFormatException ex) {
   answers.setText("Invalid input");
   }
   });

   // Multiplication Button
   Button multiplication = new Button();
   multiplication.setText("x");
   multiplication.setOnAction(e -> {
   try {
   double num1 = Double.parseDouble(calcuText.getText());
   double num2 = Double.parseDouble(calcutext.getText());
   double answer = num1 * num2;
   answers.setText("Result: " + answer);
   } 
   catch (NumberFormatException ex) {
   answers.setText("Invalid input");
   }
   });
    
   // Division Button  
   Button division = new Button();
   division.setText("/");
   division.setOnAction(e -> {
   try {
   double num1 = Double.parseDouble(calcuText.getText());
   double num2 = Double.parseDouble(calcutext.getText());
   double answer = num1 / num2;
   answers.setText("Result: " + answer);
   }
   catch (NumberFormatException ex) {
   answers.setText("Invalid input");
   }
   });

    VBox root = new VBox();
         root.setSpacing(10);
         root.setAlignment(Pos.CENTER);
        

    root.getChildren().addAll(answers,calcuText, calcutext, addition, subtraction, multiplication, division );
       
  
        // create a new scene
        Scene scene = new Scene(root, 300, 500);
        
        //add the scene to the stage, then configure the stage and make it visible
        stage.setScene(scene);
        stage.setTitle("Kervy How Simple Calculator");
        stage.show();
    
    
}
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
}