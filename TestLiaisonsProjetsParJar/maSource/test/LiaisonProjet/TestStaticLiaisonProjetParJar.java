package test.LiaisonProjet;
import test.PassageByReference.ThisEtStaticStudy;


public class TestStaticLiaisonProjetParJar {
	
	//@SuppressWarnings("static-access")
	
	public static void main(String argv[]) {		
		ThisEtStaticStudy.displayStaticMethod(" : class TestStaticLiaisonProjetParJar ThisEtStaticStudy.displayStaticMethod");		
		ThisEtStaticStudy obj = new ThisEtStaticStudy();
		obj.displayInstanceMethod(" : class TestStaticLiaisonProjetParJar obj.displayInstanceMethod");
		obj.displayStaticMethod(" : class TestStaticLiaisonProjetParJar  obj.displayStaticMethod");		
		
	}
}
