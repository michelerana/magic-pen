import pens.MagicPen;
import pens.NormalPen;
import pens.Person;

public class Program {
	public static void main(String[] args){
		Person george = new Person("George");
		NormalPen bic = new NormalPen();
		MagicPen montblanc = new MagicPen("Java is a wonderful language");
		
		bic.getColor();
		bic.setColor("blue");
		bic.getColor();
		
		System.out.println(montblanc.getColor());
		if(MagicPen.isMagicOn()) System.out.println("true");
		System.out.println(montblanc.getText("Programming Language"));
		
		MagicPen.toggleMagic();
		
		if(!MagicPen.isMagicOn()) System.out.println("false");
		System.out.println(montblanc.getText("Programming Language"));
		
		george.getName();
		george.setName("Eric Arthur");
		george.write(bic, "1984");
		george.write(montblanc, "Big Brother is watching you");
	}
}