

public class IntroJava {


	public static void main(String[] args) {
			System.out.println("Hola mundo");
			repetirMensaje(5);
	}

	public static void repetirMensaje(int veces){
			String mensajeFun = "Variable local de la funcion";
			for(int i = 0; i<veces;i++){
				String texto = mensajeFun + " " + i;
				System.out.println("<p>" + texto + "</p>");
			}
		System.out.println("<p>" + mensajeFun + "</p>");
		}
		
}