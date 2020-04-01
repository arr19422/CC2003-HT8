import java.io.File;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Bienvenido al programa de centro comercial");
		boolean flag = true;
		while(flag) {
			System.out.println("Por favor, ingrese el numero de la implementacion a utilizar: ");
			System.out.println("1.PriorityQueue (JFC)");
			System.out.println("2.VectorHeap");
			int valor = ingreso.nextInt();
			if (valor == 1) {
				try {
					String directorioNuevo = System.getProperty("user.dir");
		            Scanner inputScan = new Scanner(new File(directorioNuevo + "\\clientes.txt"));
		            while (inputScan.hasNextLine()) {
		                String line = inputScan.nextLine();		                
		            }
		            inputScan.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
				flag = false;
			} else if (valor == 2) {
				try {
					String directorioNuevo = System.getProperty("user.dir");
		            Scanner inputScan = new Scanner(new File(directorioNuevo + "\\clientes.txt"));
		            while (inputScan.hasNextLine()) {
		                String line = inputScan.nextLine();	                
		            }
		            inputScan.close();
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
				flag = false;
			} else {
				System.out.println("Error, ingrese una opcion valida");
			}
		}			
	}
}
