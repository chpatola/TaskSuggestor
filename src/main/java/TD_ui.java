
import java.util.Random;
import java.util.Set;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class TD_ui extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Label infotext= new Label("Write a number between 0 and 5 and press *Submit* in order to get a task");
        infotext.setAlignment(Pos.CENTER);
        
        TextField userfiled = new TextField("Write a number between 0 and 5 here");
        userfiled.setMaxWidth(300);
        Label task = new Label();
        
        Button button = new Button("Submit!");
        
        VBox boxie = new VBox();
        boxie.getChildren().addAll(infotext, userfiled,button,task);
        boxie.setAlignment(Pos.CENTER);
        boxie.setSpacing(50);
        boxie.setBackground(new Background(new BackgroundFill(Color.LIGHTPINK, CornerRadii.EMPTY, Insets.EMPTY)));
        
         button.setOnAction (e ->{
             try{
             Random rande = new Random();
             int userinput = Integer.valueOf(userfiled.getText());
           
             if(userinput >5||userinput<0){
                task.setText("Could not give action, input was not between 0 and 5!");
            }
             else if(userinput==rande.nextInt(6)){
                task.setText("Your task:\nGive your partner massage");
            }
            else if (userinput==rande.nextInt(6)){
                task.setText("Your task:\nTell your partner something you like about her/him");
            }
            
            else if(userinput==rande.nextInt(6)){
                task.setText("Your task:\nDo something sensual to your partner");
            }
            else if(userinput==rande.nextInt(6)){
                task.setText("Your task:\nSurprise your partner");
            }
            else if(userinput==rande.nextInt(6)){
                task.setText("Your task:\nGive your partner a kiss!");
            }
            else{
                 task.setText("Your task:\nGive your partner a hug!");
            }
             } catch(NumberFormatException el){
                 task.setText("Could not give action, input was not a number!"); 
             }
        });
        
        Scene scene = new Scene(boxie,800,400);
        
        
        stage.setScene(scene);
        stage.setTitle("Romantic ActionGenerator");
        stage.show();
    }
    
}
