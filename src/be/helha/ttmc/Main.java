package be.helha.ttmc;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = WIDTH / 4 * 3;

    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            BorderPane root = new BorderPane();
            Scene scene = new Scene( root, WIDTH, HEIGHT );
            scene.getStylesheets().add( getClass().getResource( "application.css" ).toExternalForm() );
            primaryStage.setMinHeight( HEIGHT );
            primaryStage.setMaxHeight( HEIGHT );
            primaryStage.setMaxWidth( WIDTH );
            primaryStage.setMinWidth( WIDTH );
            primaryStage.setResizable( false );
            primaryStage.setScene( scene );
            primaryStage.setTitle( "TTMC" );
            primaryStage.show();
        } catch( Exception e )
        {
            e.printStackTrace();
        }
    }

    public static void main( String args[] )
    {
        System.out.println( "TTMC par Giorgio Caculli LA196672, Guillaume Lambert LA198116, Tanguy Taminiau LA199566" );
        
		launch(args);
    }
}
