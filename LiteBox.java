package LiteBrite;

import cs015.prj.LiteBriteSupport.*;
import javafx.scene.paint.Color;
/**
 * I'm a header comment, fill me in!
 */
public class LiteBox extends cs015.prj.LiteBriteSupport.LiteBoxSupport {
    private ColorPalette _liteBritePalette;
    private LitePosition position;
    private javafx.scene.paint.Color _color;
    private ColorButton newColor;
    
  /**
   * This is the constructor for a LiteBox.  Note that
   * this constructor receives a parameter of type ColorPalette.
   */

    public LiteBox(ColorPalette newPalette) {
      _liteBritePalette = newPalette;
    }


    /**
     * This method is called when the grid is clicked.
     * You will never have to call this method yourself.
     * The LitePosition passed in corresponds to the position
     * clicked. Implement this method to make a LitePeg show up!
     */



    public void insertLitePeg(cs015.prj.LiteBriteSupport.LitePosition position){
  
    	System.out.println("Yay!");
    	cs015.prj.LiteBriteSupport.LitePeg _peg = new cs015.prj.LiteBriteSupport.LitePeg();
    	 _color = _liteBritePalette.getColor();
         _peg.setColor(_color);
         _peg.setPosition(position);
    	
    }
}





