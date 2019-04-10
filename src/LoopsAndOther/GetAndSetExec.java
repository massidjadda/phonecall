package LoopsAndOther;

public class GetAndSetExec {
	public static void main(String[] args) {
		
		GetAndSet getandset = new GetAndSet ();
		getandset.setname("Boualem Boukacem");
		getandset.setage(55);
		getandset.setgpa(1.5);
		System.out.println(getandset.getname()+" is "+getandset.getage()+" and has a gpa of "+getandset.getgpa());
				

	}
}
