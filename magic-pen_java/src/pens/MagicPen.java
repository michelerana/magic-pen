package pens;

public class MagicPen extends Pen {
    
	private String magicText;
    
    private static boolean magicOn;
    
    public MagicPen(String magicText) {
    	this.magicText = magicText;
    	magicOn = true;
    }
    
    public static void toggleMagic() {
    	magicOn = !magicOn;
    }
    
    public static boolean isMagicOn() {
    	return magicOn;
    }
    
    public String getText(String text) {
    	if(magicOn) return this.magicText;
    	else return text;
    }

}
