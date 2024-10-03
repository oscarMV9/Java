import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String continuar = "si";

        do {
            System.out.println("ingrese una opcion para operar. \n 1: sumar \n 2: restar \n 3: multiplicar \n 4: Dividir \n 5: Potencia \n 6: Raiz cuadrada \n 7: salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    while (continuar.equalsIgnoreCase("si")) {
                        System.out.println("ingrese el primer numero: ");
                        int num1 = scanner.nextInt();
                        System.out.println("ingrese el segundo numero: ");
                        int num2 = scanner.nextInt();
                        int result = num1 + num2;

                        System.out.println("el resultado de la suma es: " + result);
                        System.out.println("desea continuar sumado? si o no: ");
                        scanner.nextLine();
                        continuar = scanner.nextLine();
                    }
                    break;
                case 2:
                    while (continuar.equalsIgnoreCase("si")) {
                        System.out.println("ingrese el primer numero: ");
                        int num1 = scanner.nextInt();
                        System.out.println("ingrese el segundo numero: ");
                        int num2 = scanner.nextInt();
                        int result = num1 - num2;

                        System.out.println("el resultado de la resta es " + result);
                        System.out.println("desea continuar restando? si o no ");
                        scanner.nextLine();
                        continuar = scanner.nextLine();
                    }
                    break;
                case 3:
                    while (continuar.equalsIgnoreCase("si")) {
                        System.out.println("ingrese el primer numero: ");
                        int num1 = scanner.nextInt();
                        System.out.println("ingrese el segundo numero: ");
                        int num2 = scanner.nextInt();
                        int result = num1 * num2;

                        System.out.println("el resultado de la multiplicacion es: " + result);
                        System.out.println("desea hacer otra multiplicacion? si o no ");
                        scanner.nextLine();
                        continuar = scanner.nextLine();
                    }
                    break;
                case 4:
                    while (continuar.equalsIgnoreCase("si")) {
                        System.out.println("ingrese el primer numero: ");
                        int num1 = scanner.nextInt();
                        System.out.println("ingrese el segundo numero: ");
                        int num2 = scanner.nextInt();


                        if (num2 == 0 ) {
                            System.out.println("no se puede dividir por cero pendejo");
                        } else {
                            int result = num1 / num2;
                            System.out.println("el resultado de la division es: " + result);
                        }

                        System.out.println("desea hacer otra division? si o no ");
                        scanner.nextLine();
                        continuar = scanner.nextLine();
                    }break;
                case 5:
                    while (continuar.equalsIgnoreCase("si")) {
                        System.out.println("ingrese el primer numero: ");
                        int num1 = scanner.nextInt();
                        System.out.println("ingrese el segundo numero: ");
                        int num2 = scanner.nextInt();
                        double result = Math.pow(num1,num2);

                        System.out.println("el resultado de la potencia es: " + result);
                        System.out.println("desea hacer otra operacion? si o no ");
                        scanner.nextLine();
                        continuar = scanner.nextLine();
                    }break;
                case 6:
                    while (continuar.equalsIgnoreCase("si")) {
                        System.out.println("ingrese numero: ");
                        int num = scanner.nextInt();
                        double resultado = Math.sqrt(num);

                        System.out.println("la raiz cuadrada de " + num + " es: " + resultado);
                        System.out.println("desea hacer otra operacion? si/no: ");
                        scanner.nextLine();
                        continuar = scanner.nextLine();
                    } break;
                case 7:
                    break;
                default:
                    System.out.println("ingrese una opcion valida");

            }
            System.out.println("desea segir usando la calculadora? si/no: ");
            scanner.nextLine();
        } while (scanner.nextLine().equalsIgnoreCase("si"));
        System.out.println("Gracias por usar la calculadora.");
        scanner.close();
    }
}
