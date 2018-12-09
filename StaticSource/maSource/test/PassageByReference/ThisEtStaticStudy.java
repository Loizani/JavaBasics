package test.PassageByReference;

public class ThisEtStaticStudy {



	public  void main(String[] argTab) {
		ThisEtStaticStudy obj = new ThisEtStaticStudy();
	
		displayStaticMethod("appliqué tel quel, SANS obj instancié");		
		obj.displayStaticMethod("appliqué PAR obj instancié (obj.displayStaticMethod)");
		//this.displayStaticMethod("appliqué PAR this  (this.displayStaticMethod)");
		
		//displayInstanceMethod("appliqué PAR obj instancié (obj.displayInstanceMethod)");
		obj.displayInstanceMethod("appliqué PAR obj instancié (obj.displayInstanceMethod)");		
		//this.displayInstanceMethod("appliqué PAR this (this.displayInstanceMethod)");

	}

	public void displayInstanceMethod(String strLog) {
		System.out.println("displayInstanceMethod " + strLog);
	}

	public static void displayStaticMethod(String strLog) {
		System.out.println("displayStaticMethod " + strLog);
	}

	public  void otherDisplayInstanceMethod(String strLog) {
		this.displayInstanceMethod("appliqué PAR this (this.displayInstanceMethod)");
		System.out.println("otherDisplayInstanceMethod " + strLog);
	}
}
