package LiteBrite;

import cs015.prj.LiteBriteSupport.*;
/**
 * Don't worry about the 'extends' stuff.
 * Pretend this says 'public class ColorPalette',
 * just like the class declarations shown in lecture.
 *
 * Class comments go here.
 */
public class ColorPalette extends cs015.prj.LiteBriteSupport.ColorPaletteSupport {
    private cs015.prj.LiteBriteSupport.ColorButton _colorButton;
    public javafx.scene.paint.Color _color;
    // Instance variable declarations go here.


    public ColorPalette() {

        // This adds a white ColorButton to the ColorPalette.
        // You may add up to ten ColorButtons to the ColorPalette.
        _colorButton = new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.WHITE);
        _colorButton = new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.PURPLE);
        _colorButton = new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.MAGENTA);
        _colorButton = new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.DEEPPINK);
        _colorButton = new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.LEMONCHIFFON);
        _colorButton=  new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.PERU);
        _colorButton = new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.CORAL);
        _colorButton = new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.TURQUOISE);
        _colorButton = new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.CYAN);
        _colorButton = new cs015.prj.LiteBriteSupport.ColorButton(this, javafx.scene.paint.Color.DEEPSKYBLUE);



        }

 public void setColor(javafx.scene.paint.Color newColor){
      _color = newColor;
 }

   public javafx.scene.paint.Color getColor(){
   return _color;
   }



}
