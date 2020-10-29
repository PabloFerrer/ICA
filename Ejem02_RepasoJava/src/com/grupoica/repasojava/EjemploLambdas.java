package com.grupoica.repasojava;

public class EjemploLambdas {
	//Una interfaz es funcional cuando SOLO tiene un metodo
	interface NuestraFun{
		float operacion(float v, float w);
	}
	
	public static float sumar(float x, float y) {
		return x+y;
	}
	public static float[] sumarArrays(float[] arr_1, float[] arr_2) {
		float[] arrRes = new float[arr_1.length];
		for (int i = 0 ; i<arrRes.length && i < arr_2.length;i++) {
			arrRes[i] = arr_1[i] + arr_2[i];
		}
		return arrRes;
	}
	
	public static float[] operarArrays(float[] arr_1, float[] arr_2,NuestraFun funCallback) {
		float[] arrRes = new float[arr_1.length];
		for (int i = 0 ; i<arrRes.length && i < arr_2.length;i++) {
			arrRes[i] = funCallback.operacion(arr_1[i], arr_2[i]);
		}
		return arrRes;
	}
	public static void ejecutarLambdas() {
		float[] a = {1,2,3,4};
		float[] b = {5,6,7,8};
		float[] result = sumarArrays(a, b);
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		System.out.println(" ");
		float[] r2 = operarArrays(a,b, EjemploLambdas::sumar);
		float[] mult = operarArrays(a, b ,(float x, float y)-> {
			System.out.println("Multiplicando " + x + " * " + y + " = " + x*y);
			return x*y;
		});
	}
}
