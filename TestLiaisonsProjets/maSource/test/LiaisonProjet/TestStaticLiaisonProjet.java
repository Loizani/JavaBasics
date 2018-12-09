package test.LiaisonProjet;
import test.PassageByReference.ThisEtStaticStudy;


public class TestStaticLiaisonProjet {
	
	//@SuppressWarnings("static-access")
	
	public static void main(String argv[]) {		
		ThisEtStaticStudy.displayStaticMethod(" : class TestStaticLiaisonProjet ThisEtStaticStudy.displayStaticMethod");		
		ThisEtStaticStudy obj = new ThisEtStaticStudy();
		obj.displayInstanceMethod(" : class TestStaticLiaisonProjet obj.displayInstanceMethod");
		obj.displayStaticMethod(" : class TestStaticLiaisonProjet  obj.displayStaticMethod");			
	}
}
