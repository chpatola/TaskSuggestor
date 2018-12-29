
import java.util.Set;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class TD_ui extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Label infotext= new Label("Write a number between 0 and 9 in order to get a task");
        TextField userfiled = new TextField("Write a number between 0 and 9 here");
        Label task = new Label();
        VBox boxie = new VBox();
        boxie.getChildren().addAll(infotext, userfiled,task);
        boxie.setAlignment(Pos.CENTER);
        boxie.setSpacing(50);
        
        Scene scene = new Scene(boxie,400,400);
        
        stage.setScene(scene);
        stage.show();
    }
    
}
