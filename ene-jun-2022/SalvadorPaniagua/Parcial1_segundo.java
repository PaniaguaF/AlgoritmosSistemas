
package algoritmos.pkg2022;


import java.util.Scanner;
import java.util.Arrays;
public class Parcial1_segundo {

  
public static void main(String Args[]) {
		Scanner sJ = new Scanner(System.in);
		int n;
		System.out.println("numero de LAS SUPER peliculas: ");
	n=sJ.nextInt();

		int a[] = new int [n];
		String nom[] = new String[n];

		for(int i=0; i<a.length;i++) {
		System.out.println(" horas y minutos");
		a[i] = sJ.nextInt();
		}

		a = mergeSort(a);

		for(int i:a) {
			System.out.println("peliculas por horas: "+i);
		}
	}

	public static int [] mergeSort(int[] a) {
		if(a.length==1) {
			return a;
			}
		int middle = a.length/2;
		int []left= Arrays.copyOfRange(a,0,middle);
		int []right= Arrays.copyOfRange(a,middle,a.length);

		left = mergeSort(left);
		right = mergeSort(right);

		int []newArr = merge(left, right);
		return newArr;
	}

	public static int[] merge(int[] left, int[] right) {
		int [] resultado = new int[left.length+right.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				resultado[k] = left[i];
				i++;
			}
			else {
				resultado[k] =right[j];
				j++;
			}
			k++;
		}

		while(i<left.length) {
			resultado[k] = left[i];
			k++;
			i++;
		}
		while(j<right.length) {
			resultado[k] = left[j];
			k++;
			j++;
		}
		return resultado;
	}
}  



















