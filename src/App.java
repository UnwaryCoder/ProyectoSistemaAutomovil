import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        //! definir variables, vectores, matriz principal que contiene todos los vehiculos.
        String[] opcionesMenuPrincipal = {"CATALOGO DE VEHICULOS.", "REALIZAR VENTA DE VEHICULOS.", "MANUAL DE USUARIO", "SALIR"}; int opcionUsuario = 0; Scanner input = new Scanner(System.in); //definir variables y scanner
        String[][] listaVehiculos = {
            {"Toyota", "Corolla", "Media", "Carro Sencillo", "4"},
            {"Ford", "F-150", "Alta", "Camioneta", "6"},
            {"Nissan", "March", "Baja", "Carro Sencillo", "4"},
            {"Chevrolet", "Silverado", "Alta", "Camioneta", "8"},
            {"Hyundai", "Elantra", "Media", "Carro Sencillo", "4"},
            {"Honda", "CR-V", "Media", "SUV", "4"},
            {"Jeep", "Wrangler", "Alta", "SUV", "6"},
            {"Subaru", "Outback", "Media", "SUV", "4"},
            {"Volkswagen", "Jetta", "Media", "Carro Sencillo", "4"},
            {"Dodge", "Charger", "Alta", "Carro Deportivo", "6"},
            {"BMW", "Serie 3", "Alta", "Carro Deportivo", "4"},
            {"Audi", "Q5", "Alta", "SUV", "4"},
            {"Kia", "Sportage", "Media", "SUV", "4"},
            {"Mercedes-Benz", "Clase C", "Alta", "Carro Deportivo", "4"},
            {"Tesla", "Model Y", "Alta", "SUV", "Eléctrico"},
            {"Mitsubishi", "Mirage", "Baja", "Carro Sencillo", "3"},
            {"Fiat", "500X", "Media", "SUV Compacto", "4"},
            {"GMC", "Sierra", "Alta", "Camioneta", "8"},
            {"Ram", "1500", "Alta", "Camioneta", "8"},
            {"Mazda", "CX-5", "Media", "SUV", "4"},
            {"Toyota", "Hilux", "Alta", "Camioneta", "6"},
            {"Ford", "EcoSport", "Baja", "SUV Compacto", "4"},
            {"Suzuki", "Vitara", "Baja", "SUV Compacto", "4"},
            {"Chevrolet", "Spark", "Baja", "Carro Sencillo", "4"},
            {"Honda", "Civic", "Media", "Carro Sencillo", "4"},
            {"Hyundai", "Tucson", "Media", "SUV Compacto", "4"},
            {"Nissan", "Frontier", "Media", "Camioneta", "4"},
            {"Jeep", "Grand Cherokee", "Alta", "SUV", "6"},
            {"Volkswagen", "Tiguan", "Media", "SUV Compacto", "4"},
            {"Kia", "Rio", "Baja", "Carro Sencillo", "4"}
        };
        String[] opcionesMenu1_1 = {"MOSTRAR VEHICULOS POR GAMA", "MOSTRAR VEHICULOS POR CATEGORIA", "MOSTRAR VEHICULOS POR CILINDRAJE", "MOSTRAR TODOS LOS VEHICULOS", "REGRESAR"};
        String[] opcionesMenu1_2 = {"MOSTRAR TODOS LOS VEHICULOS DE GAMA ALTA", "MOSTRAR TODOS LOS VEHICULOS DE GAMA MEDIA", "MOSTRAR TODOS LOS VEHICULOS DE GAMA BAJA", "REGRESAR"};
        int opcionMenu1_1 = 0, opcionMenuGamaAlta = 0, auxMenuPrincipal = 1;

        do{ //? do while para el menu principal, se va a repetir hasta que el usuario seleccione la opcion de salir.

        //! texto con aspecto visual para terminal, se va a repetir bastante para cada ventana del programa...
        System.out.println("----------------------------------------------------------------");
        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
        System.out.println("----------------------------------------------------------------");
        System.out.println("MENU OPCIONES|DIGITE OPCION NUMERICA");
        System.out.println("----------------------------------------------------------------");

        //? imprimir el vector con las opciones del menu principal, las opciones de las ventanas, se representan en vectores para facilitar su manejo.
        //? de modo que si hay modificaciones, no afecta el ciclo, el codigo se adapta a las modificaciones.
        for(int i = 0; i <opcionesMenuPrincipal.length; i++){
            System.out.println((i+1) + " -> " + opcionesMenuPrincipal[i]);
        }

        System.out.println("----------------------------------------------------------------");
        System.out.print("->"); opcionUsuario = input.nextInt();

        //! switch del menu principal
        switch(opcionUsuario){
            case 1:
                //? 1. Catalogo de autos -> tipos de gama -> Cilindraje -> tipoDeVehiculo
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                System.out.println("----------------------------------------------------------------");
                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                System.out.println("----------------------------------------------------------------");
                System.out.println("1. CATALOGO DE VEHICULOS | DIGITE OPCION NUMERICA");
                System.out.println("----------------------------------------------------------------");

                for(int i = 0; i<opcionesMenu1_1.length; i++){
                    System.out.println((i + 1) + " -> " + opcionesMenu1_1[i]);
                }

                System.out.println("----------------------------------------------------------------");
                System.out.print("->"); opcionMenu1_1 = input.nextInt(); //? leemos la opcion del menu 1.1

                //! switch para menu 1.1
                switch(opcionMenu1_1){ //?desplegamos las opciones de catalogo (1.mostrar vehiculos por gama, 2.categoria, 3.cilindraje, 4.todos los vehiculos o 5.regresar)
                    case 1: //? mostrar vehiculos por gama...

                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("1. MENU CATALOGO | DIGITE OPCION NUMERICA");
                        System.out.println("----------------------------------------------------------------");

                        for(int i = 0; i<opcionesMenu1_2.length; i++){
                            System.out.println((i+1) + " -> " + opcionesMenu1_2[i]);
                        }

                        System.out.println("----------------------------------------------------------------");
                        System.out.print("->"); opcionMenuGamaAlta = input.nextInt();

                        //! switch para menu 1.2 filtrado por gama.
                        switch(opcionMenuGamaAlta){
                            case 1: //? mostrar todos los vehiculos de gama alta...

                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("MOSTRANDO VEHICULOS GAMA ALTA | DIGITE OPCION NUMERICA"); //1System.out.println();
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("| ID  | Marca            | Modelo           | Gama    | Tipo                | Cilindraje/Tipo Motor |");
                                System.out.println("|---------------------------------------------------------------------------------------------------|");

                                //? imprimir todos los vehiculos gama alta...
                                int contador = 1; // Inicializa el contador de filas
                                for (int i = 0; i < listaVehiculos.length; i++) {
                                    if (listaVehiculos[i][2].equals("Alta")){

                                        //? imprimir por secciones, tabulaciones para dar formato de tabla, ver archivo notas1.txt
                                        System.out.printf("| %-3d | %-15s | %-15s | %-7s | %-20s | %-22s |\n",
                                                          contador,
                                                          listaVehiculos[i][0], // Marca
                                                          listaVehiculos[i][1], // Modelo
                                                          listaVehiculos[i][2], // Gama
                                                          listaVehiculos[i][3], // Tipo
                                                          listaVehiculos[i][4]); // Cilindraje o Tipo Motor
                                        contador++;

                                    }
                                }

                                System.out.println("|---------------------------------------------------------------------------------------------------|");
                                System.out.println("\nPRESIONE ENTER PARA CONTINUAR");
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.print("->"); // DESPUES IMPLEMENTAR EL DO WHILE PARA QUE AQUI CIERRE...

                            break;

                            case 2: //? mostrar todos los vehiculos de gama media...

                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("MOSTRANDO VEHICULOS GAMA MEDIA | DIGITE OPCION NUMERICA"); //1System.out.println();
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("| ID  | Marca            | Modelo           | Gama    | Tipo                | Cilindraje/Tipo Motor |");
                                System.out.println("|---------------------------------------------------------------------------------------------------|");

                                //? imprimir todos los vehiculos gama media...
                                int contador2 = 1; // Inicializa el contador de filas
                                for (int i = 0; i < listaVehiculos.length; i++) {
                                    if (listaVehiculos[i][2].equals("Media")){

                                        //? imprimir por secciones, tabulaciones para dar formato de tabla, ver archivo notas1.txt
                                        System.out.printf("| %-3d | %-15s | %-15s | %-7s | %-20s | %-22s |\n",
                                                          contador2,
                                                          listaVehiculos[i][0], // Marca
                                                          listaVehiculos[i][1], // Modelo
                                                          listaVehiculos[i][2], // Gama
                                                          listaVehiculos[i][3], // Tipo
                                                          listaVehiculos[i][4]); // Cilindraje o Tipo Motor
                                        contador2++;

                                    }
                                }
                                System.out.println("|---------------------------------------------------------------------------------------------------|");
                                System.out.println("\nPRESIONE ENTER PARA CONTINUAR");
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.print("->"); // DESPUES IMPLEMENTAR EL DO WHILE PARA QUE AQUI CIERRE...

                            break;

                            case 3: //? mostrar todos los vehiculos de gama baja...

                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("MOSTRANDO VEHICULOS GAMA BAJA | DIGITE OPCION NUMERICA"); //1System.out.println();
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("| ID  | Marca            | Modelo           | Gama    | Tipo                | Cilindraje/Tipo Motor |");
                                System.out.println("|---------------------------------------------------------------------------------------------------|");

                                //? imprimir todos los vehiculos gama baja...
                                int contador3 = 1; // Inicializa el contador de filas
                                for (int i = 0; i < listaVehiculos.length; i++) {
                                    if (listaVehiculos[i][2].equals("Baja")){

                                        //? imprimir por secciones, tabulaciones para dar formato de tabla, ver archivo notas1.txt
                                        System.out.printf("| %-3d | %-15s | %-15s | %-7s | %-20s | %-22s |\n",
                                                          contador3,
                                                          listaVehiculos[i][0], // Marca
                                                          listaVehiculos[i][1], // Modelo
                                                          listaVehiculos[i][2], // Gama
                                                          listaVehiculos[i][3], // Tipo
                                                          listaVehiculos[i][4]); // Cilindraje o Tipo Motor
                                        contador3++;

                                    }
                                }

                                System.out.println("|---------------------------------------------------------------------------------------------------|");
                                System.out.println("\nPRESIONE ENTER PARA CONTINUAR");
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.print("->"); // DESPUES IMPLEMENTAR EL DO WHILE PARA QUE AQUI CIERRE...

                            break;
                            case 4: //regresar al menu anterior...

                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Limpia la pantalla

                                System.out.println("----------------------------------------------------------------");
                                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                System.out.println("----------------------------------------------------------------");
                                System.out.println("1.1 REGRESAR AL MENU ANTERIOR | SEPA LA BOLA QUE PONER AQUI");
                                System.out.println("----------------------------------------------------------------");
                                System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                System.out.println("----------------------------------------------------------------");
                                System.out.print("->");

                            break;

                            default: //? si el usuario no selecciona una opcion valida, se le indica que la opcion no es correcta.

                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.println("OPCION NO VALIDA, PRESIONE ENTER PARA CONTINUAR"); //1System.out.println();
                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                System.out.print("->"); // DESPUES IMPLEMENTAR EL DO WHILE PARA QUE AQUI CIERRE...

                            break;
                        }

                    break;

                    case 2: //? mostrar vehiculos por categoria...

                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


                    break;
                    case 3: break;
                    case 4: break;
                    default: break;
                }

            break;

            case 4: //? salir del programa...

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("SALIDA DEL PROGRAMA | DIGITE OPCION NUMERICA"); //1System.out.println();
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.println("PRESIONE ENTER PARA CONTINUAR...");
                System.out.println("-----------------------------------------------------------------------------------------------------");
                System.out.print("->");

                input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.
                auxMenuPrincipal = 0; //? se asigna 0 a la variable para salir del do while, ya que el usuario selecciono la opcion de salir.

                break;

                default: //? si el usuario no selecciona una opcion valida, se le indica que la opcion no es correcta.

                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.println("NUMERO FUERA DE RANGO | PRESIONE ENTER PARA CONTINUAR...."); //1System.out.println();
                    System.out.println("\n-----------------------------------------------------------------------------------------------------");
                    System.out.print("->");

                    input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                    input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.

                break;
        } //switch para todos los posibles casos

        }while(auxMenuPrincipal != 0); //? ciclo while, mientras auxMenuPrincipal sea diferente de 0, se va a repetir el ciclo.
        input.close(); //?cerrando objeto tipo Scanner.
    }
}
