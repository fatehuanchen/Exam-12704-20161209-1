package Sushu;


public class Sushu 
{

	public static void main( String[] args )
	{
		int count=0;
		int[] array = new int[100];
		for(int i=101;i<=200;i++){
			if(Check(i))
			{
				array[count] = i;
				count++;
			}
		}

		System.out.print("101-200�乲��"+count+"������,�ֱ���:");

		for(int j =0;j<count-1;j++)
			System.out.print(array[j]+",");
		System.out.println(array[count-1]);
	}

	public static boolean Check(int x){


		for(int i=2;i<x;i++){


			if(x%i==0){
				return false;
			}
		}
          return true;
	}



}

