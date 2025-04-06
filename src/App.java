import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        //! definir variables, vectores, matriz principal que contiene todos los vehiculos.
        String[] opcionesMenuPrincipal = {"CATALOGO DE VEHICULOS.", "REALIZAR VENTA DE VEHICULOS.", "MANUAL DE USUARIO", "SALIR"}; int opcionUsuario = 0; Scanner input = new Scanner(System.in); //definir variables y scanner
        String[][] listaVehiculos = {
            {"1", "Toyota", "Corolla", "Media", "Carro Sencillo", "4", "$300,000"},
            {"2", "Ford", "F-150", "Alta", "Camioneta", "6", "$750,000"},
            {"3", "Nissan", "March", "Baja", "Carro Sencillo", "4", "$180,000"},
            {"4", "Chevrolet", "Silverado", "Alta", "Camioneta", "8", "$800,000"},
            {"5", "Hyundai", "Elantra", "Media", "Carro Sencillo", "4", "$320,000"},
            {"6", "Honda", "CR-V", "Media", "SUV", "4", "$450,000"},
            {"7", "Jeep", "Wrangler", "Alta", "SUV", "6", "$900,000"},
            {"8", "Subaru", "Outback", "Media", "SUV", "4", "$400,000"},
            {"9", "Volkswagen", "Jetta", "Media", "Carro Sencillo", "4", "$310,000"},
            {"10", "Dodge", "Charger", "Alta", "Carro Deportivo", "6", "$1,200,000"},
            {"11", "BMW", "Serie 3", "Alta", "Carro Deportivo", "4", "$1,500,000"},
            {"12", "Audi", "Q5", "Alta", "SUV", "4", "$1,000,000"},
            {"13", "Kia", "Sportage", "Media", "SUV", "4", "$450,000"},
            {"14", "Mercedes-Benz", "Clase C", "Alta", "Carro Deportivo", "4", "$1,600,000"},
            {"15", "Tesla", "Model Y", "Alta", "SUV", "Eléctrico", "$1,300,000"},
            {"16", "Mitsubishi", "Mirage", "Baja", "Carro Sencillo", "3", "$170,000"},
            {"17", "Fiat", "500X", "Media", "SUV Compacto", "4", "$350,000"},
            {"18", "GMC", "Sierra", "Alta", "Camioneta", "8", "$850,000"},
            {"19", "Ram", "1500", "Alta", "Camioneta", "8", "$880,000"},
            {"20", "Mazda", "CX-5", "Media", "SUV", "4", "$420,000"},
            {"21", "Toyota", "Hilux", "Alta", "Camioneta", "6", "$780,000"},
            {"22", "Ford", "EcoSport", "Baja", "SUV Compacto", "4", "$230,000"},
            {"23", "Suzuki", "Vitara", "Baja", "SUV Compacto", "4", "$240,000"},
            {"24", "Chevrolet", "Spark", "Baja", "Carro Sencillo", "4", "$150,000"},
            {"25", "Honda", "Civic", "Media", "Carro Sencillo", "4", "$340,000"},
            {"26", "Hyundai", "Tucson", "Media", "SUV Compacto", "4", "$380,000"},
            {"27", "Nissan", "Frontier", "Media", "Camioneta", "4", "$470,000"},
            {"28", "Jeep", "Grand Cherokee", "Alta", "SUV", "6", "$950,000"},
            {"29", "Volkswagen", "Tiguan", "Media", "SUV Compacto", "4", "$370,000"},
            {"30", "Kia", "Rio", "Baja", "Carro Sencillo", "4", "$190,000"}
        };
        String[] opcionesMenu1_1 = {"MOSTRAR VEHICULOS POR GAMA", "MOSTRAR VEHICULOS POR CATEGORIA", "MOSTRAR VEHICULOS POR CILINDRAJE", "MOSTRAR TODOS LOS VEHICULOS", "REGRESAR"};
        String[] opcionesMenu1_2 = {"MOSTRAR TODOS LOS VEHICULOS DE GAMA ALTA", "MOSTRAR TODOS LOS VEHICULOS DE GAMA MEDIA", "MOSTRAR TODOS LOS VEHICULOS DE GAMA BAJA", "REGRESAR"};
        int opcionMenu1_1 = 0, opcionMenuGamas = 0, auxMenuPrincipal = 1, auxMenuGamas = 0, auxMenuGamas2 = 0;

        do{ //? do while para el menu principal, se va a repetir hasta que el usuario seleccione la opcion de salir.
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

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
            do{

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            switch(opcionUsuario){
                case 1:
                    //? 1. Catalogo de autos -> tipos de gama -> Cilindraje -> tipoDeVehiculo
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("----------------------------------------------------------------");
                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("MENU CATALOGO DE VEHICULOS | DIGITE OPCION NUMERICA");
                    System.out.println("----------------------------------------------------------------");

                    for(int i = 0; i<opcionesMenu1_1.length; i++){
                        System.out.println((i + 1) + " -> " + opcionesMenu1_1[i]);
                    }

                    System.out.println("----------------------------------------------------------------");
                    System.out.print("->"); opcionMenu1_1 = input.nextInt(); //? leemos la opcion del menu 1.1

                    //! switch para menu 1.1 menu catalogo de vehiculos.
                    do{
                    switch(opcionMenu1_1){ //?desplegamos las opciones de catalogo (1.mostrar vehiculos por gama, 2.categoria, 3.cilindraje, 4.todos los vehiculos o 5.regresar)
                        case 1: //? mostrar vehiculos por gama...

                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("MENU CATALOGO POR GAMAS | DIGITE OPCION NUMERICA");
                            System.out.println("----------------------------------------------------------------");

                            for(int i = 0; i<opcionesMenu1_2.length; i++){
                                System.out.println((i+1) + " -> " + opcionesMenu1_2[i]);
                            }

                            System.out.println("----------------------------------------------------------------");
                            System.out.print("->"); opcionMenuGamas = input.nextInt();

                            //! switch para menu 1.2 filtrado por gamas, menu de gamas
                            switch(opcionMenuGamas){
                                case 1: //? mostrar todos los vehiculos de gama alta...

                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO VEHICULOS GAMA ALTA | DIGITE OPCION NUMERICA"); //1System.out.println();
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    //? imprimir todos los vehiculos gama alta...
                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][3].equals("Alta")) { // Verificar si la columna "Gama" es "Alta"
                                            System.out.printf("| %2s | %-16s | %-16s | %-6s | %-16s | %-10s | %-10s |\n",
                                                listaVehiculos[i][0], // ID
                                                listaVehiculos[i][1], // Marca
                                                listaVehiculos[i][2], // Modelo
                                                listaVehiculos[i][3], // Gama
                                                listaVehiculos[i][4], // Tipo
                                                listaVehiculos[i][5], // Cilindraje
                                                listaVehiculos[i][6]  // Precio
                                            );
                                        }
                                    }

                                    System.out.println("|---------------------------------------------------------------------------------------------------|");
                                    System.out.println("\nPRESIONE ENTER PARA CONTINUAR");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.print("->"); // DESPUES IMPLEMENTAR EL DO WHILE PARA QUE AQUI CIERRE...

                                    input.nextLine();
                                    input.nextLine();

                                    auxMenuGamas = 1;
                                    auxMenuGamas2 = 1;
                                break;

                                case 2: //? mostrar todos los vehiculos de gama media...

                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO VEHICULOS GAMA ALTA | DIGITE OPCION NUMERICA"); //1System.out.println();
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    //? imprimir todos los vehiculos gama media...
                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][3].equals("Media")) { // Verificar si la columna "Gama" es "Media"
                                            System.out.printf("| %2s | %-16s | %-16s | %-6s | %-16s | %-10s | %-10s |\n",
                                                listaVehiculos[i][0], // ID
                                                listaVehiculos[i][1], // Marca
                                                listaVehiculos[i][2], // Modelo
                                                listaVehiculos[i][3], // Gama
                                                listaVehiculos[i][4], // Tipo
                                                listaVehiculos[i][5], // Cilindraje
                                                listaVehiculos[i][6]  // Precio
                                            );
                                        }
                                    }

                                    System.out.println("|---------------------------------------------------------------------------------------------------|");
                                    System.out.println("\nPRESIONE ENTER PARA CONTINUAR");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.print("->"); // DESPUES IMPLEMENTAR EL DO WHILE PARA QUE AQUI CIERRE...

                                    input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                                    input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.

                                    auxMenuGamas = 1; //? se asigna 0 a la variable para salir del do while, ya que el usuario selecciono la opcion de salir.
                                    auxMenuGamas2 = 1;

                                break;

                                case 3: //? mostrar todos los vehiculos de gama baja...

                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO VEHICULOS GAMA ALTA | DIGITE OPCION NUMERICA"); //1System.out.println();
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    //? imprimir todos los vehiculos gama baja...
                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][3].equals("Baja")) { // Verifica si la columna "Gama" es "Baja"
                                            System.out.printf("| %2s | %-16s | %-16s | %-6s | %-16s | %-10s | %-10s |\n",
                                                listaVehiculos[i][0], // ID
                                                listaVehiculos[i][1], // Marca
                                                listaVehiculos[i][2], // Modelo
                                                listaVehiculos[i][3], // Gama
                                                listaVehiculos[i][4], // Tipo
                                                listaVehiculos[i][5], // Cilindraje
                                                listaVehiculos[i][6]  // Precio
                                            );
                                        }
                                    }

                                    System.out.println("|---------------------------------------------------------------------------------------------------|");
                                    System.out.println("\nPRESIONE ENTER PARA CONTINUAR");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.print("->"); // DESPUES IMPLEMENTAR EL DO WHILE PARA QUE AQUI CIERRE...

                                    input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                                    input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.

                                    auxMenuGamas = 1; //? se asigna 0 a la variable para salir del do while, ya que el usuario selecciono la opcion de salir.
                                    auxMenuGamas2 = 1;

                                break;

                                case 4: //? regresar al menu anterior -> Menu Catalogo

                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Limpia la pantalla

                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("1.1 REGRESAR AL MENU ANTERIOR | SEPA LA BOLA QUE PONER AQUI");
                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                    System.out.println("----------------------------------------------------------------");
                                    System.out.print("->");

                                    input.nextLine();
                                    input.nextLine();

                                    auxMenuGamas = 1;
                                    auxMenuGamas2 = 0;

                                break;

                                default: //? default y repetir el menu.

                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("OPCION NO VALIDA, PRESIONE ENTER PARA CONTINUAR"); //1System.out.println();
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.print("->"); // DESPUES IMPLEMENTAR EL DO WHILE PARA QUE AQUI CIERRE...

                                    input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                                    input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.

                                    auxMenuGamas2 = 1;
                                break;
                            }

                        break;

                        case 2: //? mostrar vehiculos por categoria...

                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();


                        break;

                        case 3: break;
                        case 4: break;

                        case 5: //? regresar al menu anterior...

                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Limpia la pantalla

                            System.out.println("----------------------------------------------------------------");
                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("REGRESAR AL MENU ANTERIOR | REGRESANDO AL MENU PRINCIPAL");
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                            System.out.println("----------------------------------------------------------------");
                            System.out.print("->");

                            input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                            input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.
                            auxMenuGamas = 0; //? se asigna 0 a la variable para salir del do while, ya que el usuario selecciono la opcion de salir.
                        break;

                        default: //? si el usuario no selecciona una opcion valida, se le indica que la opcion no es correcta.

                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                            System.out.println("-----------------------------------------------------------------------------------------------------");
                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                            System.out.println("-----------------------------------------------------------------------------------------------------");
                            System.out.println("OPCION NO VALIDA, PRESIONE ENTER PARA CONTINUAR"); //1System.out.println();
                            System.out.println("-----------------------------------------------------------------------------------------------------");
                            System.out.print("->"); // DESPUES IMPLEMENTAR EL DO WHILE PARA QUE AQUI CIERRE...

                            input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                            input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.
                            auxMenuGamas = 1;

                        break;
                    }

                    }while(auxMenuGamas2 != 0); //? ciclo while, mientras auxMenuGamas sea diferente de 0, se va a repetir el ciclo.

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
            }
        }while(auxMenuGamas != 0); //? ciclo while, mientras auxMenuGamas sea diferente de 0, se va a repetir el ciclo. //switch para todos los posibles casos

        }while(auxMenuPrincipal != 0); //? ciclo while, mientras auxMenuPrincipal sea diferente de 0, se va a repetir el ciclo.
        input.close(); //?cerrando objeto tipo Scanner.
    }
}
