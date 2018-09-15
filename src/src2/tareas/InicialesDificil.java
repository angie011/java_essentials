package src2.tareas;

import libs.Input;

public class InicialesDificil {

	public static void main(String[] args) {
		Input.print("Nombre completo: ");
		String nombre=Input.get_string();
		
		ImprimirIniciales(nombre);

	}
	
	public static void ImprimirIniciales (String n)
	{
						
		/*	for(int i=0; i<n.length();i++)
			{
				if(n.charAt(i)>= 'A' && n.charAt(i) <= 'Z')
				{
					n.split(" ");
					System.out.print(n.charAt(i));
					
				}
			}	*/	
		
			for(int i=0; i<n.length();i++)
			{
				if(n.charAt(i)>= 'A' && n.charAt(i) <= 'Z')
				{
					n.trim();
					System.out.print(n.charAt(i));
	
				}
			}
		
	}


}
