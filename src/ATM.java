 /** 
   import BankAcc.BankAcc;
import com.sun.accessibility.internal.resources.accessibility;
   import javafx.application.Application;
   import javafx.scene.Scene;
   import javafx.event.ActionEvent;
   import javafx.event.EventHandler;   
   import javafx.scene.control.Button;
   import javafx.scene.layout.StackPane;
   import javafx.stage.Stage; 
 
   public abstract class ATM extends Application {
       BankAcc x = new BankAcc(12345,5000);       
   
      private static void Launch(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Button button;
    
    public static void main (String[] args){

        Launch(args);
    }
    
    @Override
    public void start (Stage primaryStage) throws Exception {
        primaryStage.setTitle("LOGIN");
        button = new Button();
        button.setText("click me");
        button.setOnAction((EventHandler<ActionEvent>) this);
        StackPane layout;
        layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    } 
    
    
    public void handle(ActionEvent event) {
        if(event.getSource()--button); 
    }
}
   
*/