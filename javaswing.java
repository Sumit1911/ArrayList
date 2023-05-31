import javax.swing.*;
public class javaswing {
    public static void main(String args[]) {
        Application.launch(args);
    }
}
class MyjavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
