package decimo;
import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		Aplicacion miAplicacion = new Aplicacion();
		miAplicacion.iniciar();
		
	}
private void iniciar() {
	forma1();
	forma2();
	recorrer();
}


private void recorrer() {
	int arreglosEnteros[]=new int[6];
	
	for(int i = 0; i < arreglosEnteros.length; i++) {
		arreglosEnteros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero, en la pos: "+i));
	}
	String cad="Valores Del Arreglo\n";
	for (int i = 0; i < arreglosEnteros.length; i++) {
		cad+="arreglo ["+i+"] = "+arreglosEnteros[i];
		cad+="\n";
	}
JOptionPane.showMessageDialog(null, cad);

}





private void forma1() {
	String arregloCosas[]; //declaracion del arreglo
	arregloCosas=new String[4];//creacion o construccion del arreglo
	
	arregloCosas[0]="Hola";//inicializacion del arreglo en la posicion 0
	arregloCosas[1]="casa";//inicializacion del arreglo en la posicion 0
	arregloCosas[2]="carro";//inicializacion del arreglo en la posicion 0
	arregloCosas[3]="cama";//inicializacion del arreglo en la posicion 0

	
	System.out.println("Valor del arreglo en la posicion 0 : " +arregloCosas[0]);
	System.out.println("Valor del arreglo en la posicion 1 : " +arregloCosas[1]);
	System.out.println("Valor del arreglo en la posicion 2 : " +arregloCosas[2]);
	System.out.println("Valor del arreglo en la posicion 3 : " +arregloCosas[3]);
}

private void forma2() {
	String arregloColores[]= {"Rojo", "Verde", "Negro", "Blanco", "Naranja"};
	
 arregloColores[3]="gris";
	
	System.out.println("Valor del arreglo en la posicion 0 : " +arregloColores[0]);
	System.out.println("Valor del arreglo en la posicion 1 : " +arregloColores[1]);
	System.out.println("Valor del arreglo en la posicion 2 : " +arregloColores[2]);
	System.out.println("Valor del arreglo en la posicion 3 : " +arregloColores[3]);
	System.out.println("Valor del arreglo en la posicion 4 : " +arregloColores[4]);
}

}
