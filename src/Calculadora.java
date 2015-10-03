import java.util.Scanner;
public class Calculadora {

	public static void menu(Scanner scn) {
		int menu1 = 0;
		int num1=0, num2=0;
		do{
			System.out.println("////////////MENU////////////");
			System.out.println("1.- Sumar dos números");
			System.out.println("2.- Restar dos números");
			System.out.println("3.- Multiplicar dos números");
			System.out.println("4.- Dividir dos números");
			System.out.println("5.- Mostrar el Mayor de dos numeros");
			System.out.println("6.- Calcular Porcentaje");
			System.out.println("0.- Salir del programa");
			System.out.println("////////////////////////////");
			menu1 = scn.nextInt();
			switch (menu1) {
			case 1:
				suma(scn, num1, num2);
				break;
				
			case 2:
				resta(scn, num1, num2);
				break;
				
			case 3:
				mult(scn, num1, num2);
				break;
				
			case 4:
				div(scn, num1, num2);
				break;
			case 5:
				mayor(scn, num1, num2);
				break;
			case 6:
				porc(scn, num1, num2);
				break;
				
			case 0:
				salir(scn, num1);
				break;

			default:
				System.out.println("-----------------------------------");
				System.out.println("Opción inválida; ingrese de nuevo.");
				break;
			}
		}while (menu1 != 0);
	};
	
	public static void suma(Scanner scn, int num1, int num2) {
		System.out.println("-----------------------------");
		System.out.println("Ingrese el Primer Sumando:");
		num1 = scn.nextInt();
		System.out.println("Ingrese el Segundo Sumando:");
		num2 = scn.nextInt();
		int suma = num1+num2;
		System.out.println("El Total de la Suma es: " + suma);
		System.out.println("-----------------------------");
	};
	
	public static void resta(Scanner scn, int num1, int num2) {
		System.out.println("-----------------------------");
		System.out.println("Ingrese el Minuendo:");
		num1 = scn.nextInt();
		System.out.println("Ingrese el Sustraendo:");
		num2 = scn.nextInt();
		int resta = num1-num2;
		System.out.println("El Resto es: " + resta);
		System.out.println("-----------------------------");
	};
	
	public static void mult(Scanner scn, int num1, int num2) {
		System.out.println("-----------------------------");
		System.out.println("Ingrese el Primer Factor: ");
		num1 = scn.nextInt();
		System.out.println("Ingrese el Segundo Factor: ");
		num2 = scn.nextInt();
		int producto = num1*num2;
		System.out.println("El Producto de los Factores es: " + producto);
		System.out.println("-----------------------------");
	};
	
	public static void div(Scanner scn, int num1, int num2) {
		System.out.println("-----------------------------");
		System.out.println("Ingrese el Dividendo: ");
		num1 = scn.nextInt();
		System.out.println("Ingrese el Divisor: ");
		num2 = scn.nextInt();
		float cociente = (float) num1/num2;
		System.out.println("El Cociente de la division es: " + cociente);
		System.out.println("-----------------------------");
	};
	 public static void mayor(Scanner scn,int num1, int num2){
		System.out.println("-----------------------------");
        System.out.println("Ingrese un Número: ");
        num1=scn.nextInt();
        System.out.println("Ingrese otro Número: ");
        num2=scn.nextInt();
        int max=0;
        if(num1>num2){
            max=num1;
        }
        if(num2>num1){
            max=num2;
        }
        System.out.println("El Número Mayor es: "+max);
        System.out.println("-----------------------------");
     }
     public static void porc(Scanner scn,int num1, int num2){
    	 System.out.println("-----------------------------");
        System.out.println("Ingrese el Número: ");
        num1=scn.nextInt();
        System.out.println("Ingrese Porcentaje a Calcular: ");
        num2=scn.nextInt();
        double porciento=(double)(num1*num2/100);
        System.out.println("El "+num2+"% de "+num1+ " es: "+porciento);
        System.out.println("-----------------------------");
     };
	public static void salir(Scanner scn, int num1) {
		System.out.println("¿De verdad quiere salir?(1.SI/2.NO)");
		num1 = scn.nextInt();
		while (num1>2 || num1<1){
			System.out.println("Opción inválida, ingrese de nuevo");
			num1 = scn.nextInt();
		}
		if (num1 == 1){
			System.out.println("Hasta Luego...");
		}
		if (num1 == 2){
			System.out.println("-----------------------------");
			menu(scn);
		}
	};
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		menu(scn);
	}

}

	


