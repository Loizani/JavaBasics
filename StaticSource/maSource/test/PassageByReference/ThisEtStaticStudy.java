package test.PassageByReference;

public class ThisEtStaticStudy {



	public  void main(String[] argTab) {
		ThisEtStaticStudy obj = new ThisEtStaticStudy();
	
		displayStaticMethod("appliqu� tel quel, SANS obj instanci�");		
		obj.displayStaticMethod("appliqu� PAR obj instanci� (obj.displayStaticMethod)");
		//this.displayStaticMethod("appliqu� PAR this  (this.displayStaticMethod)");
		
		//displayInstanceMethod("appliqu� PAR obj instanci� (obj.displayInstanceMethod)");
		obj.displayInstanceMethod("appliqu� PAR obj instanci� (obj.displayInstanceMethod)");		
		//this.displayInstanceMethod("appliqu� PAR this (this.displayInstanceMethod)");

	}

	public void displayInstanceMethod(String strLog) {
		System.out.println("displayInstanceMethod " + strLog);
	}

	public static void displayStaticMethod(String strLog) {
		System.out.println("displayStaticMethod " + strLog);
	}

	public  void otherDisplayInstanceMethod(String strLog) {
		this.displayInstanceMethod("appliqu� PAR this (this.displayInstanceMethod)");
		System.out.println("otherDisplayInstanceMethod " + strLog);
	}
}
