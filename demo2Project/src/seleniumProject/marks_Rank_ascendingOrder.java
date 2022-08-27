package seleniumProject;

public class marks_Rank_ascendingOrder {
	
	public static void main(String[] args) {
		
		int[] Marks	   = {98, 99, 56, 78, 89, 45, 87};
		int rank=1;
		int x;
		System.out.println("Rank and marks before arrangement");
		System.out.println("RANK        Marks");
		for (int i = 0; i < Marks.length; i++) {
			System.out.println(rank++ +"             "+Marks[i]);
		}
		System.out.println("Rank and marks after arrangement");
		
		System.out.println("RANK        Marks");
		
		for (int i = 0; i < Marks.length; i++) {
			
			
				for (int k = i+1; k < Marks.length; k++) {
					if (Marks[i]>Marks[k]) {
					   x=Marks[i];
					   Marks[i]=Marks[k];
					   Marks[k]=x;
					}
					
				}
				
				System.out.println(rank++ +"             "+Marks[i]);
		}		
	}
  }	


	


