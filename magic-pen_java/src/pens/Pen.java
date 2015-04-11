package pens;

public abstract class Pen {
    private String color;
    
    protected Pen() {
    	this.color = "Black";
    }
    
    String getText(String text) {
    	return text;
    }
    
    public String getColor() {
    	return this.color;
    }
    
    protected void setColor(String color) {
    	this.color = color;
    }
    
}
