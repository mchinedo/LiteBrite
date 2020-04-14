package LiteBrite;

import javafx.scene.paint.*;
import cs015.prj.LiteBriteSupport.*;

public class LitePeg {
	private LitePeg _peg;
	private Color _color;

	private LitePosition p;
	
	
	public LitePeg() {
	
	}
	
	public void setColor(Color _color) {
		this._color = _color;
	}
	
	public javafx.scene.paint.Color getColor() {
		return _color;
	}
		
	public void setPosition(LitePosition p) {
		this.p = p;
	}
	
	public LitePosition getPosition() {
		return p;
		
	}
}


