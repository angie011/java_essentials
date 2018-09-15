package src1.tareas;

import libs.Input;

public class MarioDificil {

	public static void main(String[] args) {
		int a=get_height();	
		set_numeral(a);

	}

	public static int get_height()
	{
		int h;
		do
		{
			System.out.print("Altura: ");
			h = Input.get_int();
		}
		while (h <= 0);
		return h;
	}	




	public static void set_numeral(int a)
	{
		int espacios=0;
		int numeral=0;

		espacios=a-1; 

		for (int i=0;i<a;i++)
		{
			//Pintar espacios
			for(int j=0;j<espacios;j++)
			{
				System.out.print(" ");	

			}


			//Pintar numeral			
			numeral=a-espacios;		
			paint_numeral(numeral);
			System.out.print(" "+" ");
			paint_numeral(numeral);

			System.out.println();
			espacios=espacios-1;			
		}		

	} //End  set_numeral


	public static void paint_numeral(int num)
	{
		for(int b=0;b<num;b++)
		{
			System.out.print("#");
		}
	}


}
