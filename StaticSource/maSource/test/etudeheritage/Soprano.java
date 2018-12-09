package test.etudeheritage;
public class Soprano extends Singer {
    public  void sing(String argString) {
        System.out.println("Singing in extended class avec argument : " + argString);
    }    
    public  void sing() {
        System.out.println("Singing in extended class sans argument");
    }
	@Override
	public void typeChanson() {
		System.out.println("Chancon de type Soprano");
	}
}

