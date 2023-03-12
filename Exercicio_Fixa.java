
public class Exercicio_Fixa {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String prod1 = "Computer";
		String prod2 = "office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double prince1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.23456;
		//System.out.println(nome);
		System.out.printf(prod1  + " Which price is $ %.2f%n",measure);
		System.out.printf(prod2 + ",which price is $ %.2f\n",prince2);
		
		System.out.println("Record:"+ age +" years old, code  "+ code +" and gender:F");
		
		System.out.println("Mause Winth eight decimal places: "+measure);
		System.out.printf("(three decimal places): + %.2f\n",measure );
		
		System.out.printf("US decimal point : + %.3f \n" ,measure );
	
	}

}
