package example;

public class class1 {
 static void intcrease(int[] array){
	for(int i = 0; i < array.length; i++){
		array[i]++;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a [] = {1, 2, 3, 4, 5};

intcrease(a);

for(int i = 0; i < a.length; i++){
	System.out.print(a[i] + " ");
}
	}

}
