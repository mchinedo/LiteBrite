package LiteBrite;

import javafx.application.Application;
import cs015.prj.LiteBriteSupport.*;
import javafx.stage.Stage;

/**
 * This is the App class.
 * You should instantiate your top-level object in the constructor.
 *
 * Your class comments go here.
 */
public class App extends Application {
	private ColorPalette _liteBritePalette;
	private ColorButton _colorButton;

    public void start(Stage stage) {
        // This line causes the LiteBrite frame to appear.
        new cs015.prj.LiteBriteSupport.LiteBriteFrame(stage);
        
        ColorPalette _liteBritePalette = new ColorPalette();
        LiteBox liteBox = new LiteBox(_liteBritePalette);
        
      }
        // Your code goes here.
  
//}



    /**
    * This is called a mainline.  When you type "java LiteBrite.App"
    * this method gets called automatically.  Ignore the "String[] args"
    * for now; you won't need it in CS15.  All this method does is
    * call the launch method, which is a JavaFX method that calls the start
    * method above. So if your code is in that start method then it will be
    * executed and run!
    *
    * DO NOT CHANGE THIS CODE!
    */
    public static void main(String[] argv) {
        launch(argv);
    }

}
