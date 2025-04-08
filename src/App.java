import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        //! definir variables, vectores, matriz principal que contiene todos los vehiculos.
        String[] opcionesMenuPrincipal = {"CATALOGO DE VEHICULOS.", "REALIZAR VENTA DE VEHICULOS.", "MANUAL DE USUARIO", "SALIR"}; int opcionUsuario = 0; Scanner input = new Scanner(System.in); //definir variables y scanner
        String[][] listaVehiculos = {
            {"1", "Toyota", "Corolla", "Media", "SEDAN", "4", "$300,000"},
            {"2", "Ford", "F-150", "Alta", "PICK UP", "6", "$750,000"},
            {"3", "Nissan", "March", "Baja", "SEDAN", "4", "$180,000"},
            {"4", "Chevrolet", "Silverado", "Alta", "PICK UP", "8", "$800,000"},
            {"5", "Hyundai", "Elantra", "Media", "SEDAN", "4", "$320,000"},
            {"6", "Honda", "CR-V", "Media", "SUV", "4", "$450,000"},
            {"7", "Jeep", "Wrangler", "Alta", "SUV", "6", "$900,000"},
            {"8", "Subaru", "Outback", "Media", "SUV", "4", "$400,000"},
            {"9", "Volkswagen", "Jetta", "Media", "SEDAN", "4", "$310,000"},
            {"10", "Dodge", "Charger", "Alta", "DEPORTIVO", "6", "$1,200,000"},
            {"11", "BMW", "Serie 3", "Alta", "DEPORTIVO", "4", "$1,500,000"},
            {"12", "Audi", "Q5", "Alta", "SUV", "4", "$1,000,000"},
            {"13", "Kia", "Sportage", "Media", "SUV", "4", "$450,000"},
            {"14", "Mercedes-Benz", "Clase C", "Alta", "DEPORTIVO", "4", "$1,600,000"},
            {"15", "Tesla", "Model Y", "Alta", "SUV", "Eléctrico", "$1,300,000"},
            {"16", "Mitsubishi", "Mirage", "Baja", "SEDAN", "3", "$170,000"},
            {"17", "Fiat", "500X", "Media", "SUV", "4", "$350,000"},
            {"18", "GMC", "Sierra", "Alta", "PICK UP", "8", "$850,000"},
            {"19", "Ram", "1500", "Alta", "PICK UP", "8", "$880,000"},
            {"20", "Mazda", "CX-5", "Media", "SUV", "4", "$420,000"},
            {"21", "Toyota", "Hilux", "Alta", "PICK UP", "6", "$780,000"},
            {"22", "Ford", "EcoSport", "Baja", "SUV", "4", "$230,000"},
            {"23", "Suzuki", "Vitara", "Baja", "SUV", "4", "$240,000"},
            {"24", "Chevrolet", "Spark", "Baja", "SEDAN", "4", "$150,000"},
            {"25", "Honda", "Civic", "Media", "SEDAN", "4", "$340,000"},
            {"26", "Hyundai", "Tucson", "Media", "SUV", "4", "$380,000"},
            {"27", "Nissan", "Frontier", "Media", "PICK UP", "4", "$470,000"},
            {"28", "Jeep", "Grand Cherokee", "Alta", "SUV", "6", "$950,000"},
            {"29", "Volkswagen", "Tiguan", "Media", "SUV", "4", "$370,000"},
            {"30", "Kia", "Rio", "Baja", "SEDAN", "4", "$190,000"}
        };
        String[] opcionesMenu1_1 = {"MOSTRAR VEHICULOS POR GAMA", "MOSTRAR VEHICULOS POR CATEGORIA", "MOSTRAR VEHICULOS POR CILINDRAJE", "MOSTRAR TODOS LOS VEHICULOS", "REGRESAR"};
        String[] opcionesMenu1_2 = {"MOSTRAR TODOS LOS VEHICULOS DE GAMA ALTA", "MOSTRAR TODOS LOS VEHICULOS DE GAMA MEDIA", "MOSTRAR TODOS LOS VEHICULOS DE GAMA BAJA", "REGRESAR"};
        String[] opcionesMenu1_3 = {"SEDAN", "DEPORTIVO", "PICKUP", "SUV", "REGRESAR"};
        String[] opcionesMenu1_4 = {"4 CILINDROS", "6 CILINDROS", "8 CILINDROS", "REGRESAR"};
        String[] opcionesMenu2 = {"REALIZAR VENTA DE VEHICULOS", "REALIZAR PRESUPUESTO DE VEHICULOS", "REGRESAR AL MENU ANTERIOR"};
        String[] opcionesMenu2_1 = {"RELIZAR VENTA DE VEHICULO DE CONTADO", "REALIZAR VENTA DE VEHICULO A CREDITO", "REGRESAR AL MENU ANTERIOR"};
        int[] opcionesMeses = {6, 12, 24, 36};
        int opcionMenu1_1 = 0, opcionMenuGamas = 0, auxMenuPrincipal = 1, auxMenuGamas = 0, auxMenuGamas2 = 0, opcionMenuCategorias = 0, opcionMenuCilindraje = 0, opcionMenuVentas = 0, opcionMenu2_1 = 0, idVehiculo, opcionPago, iteradorWhile = 0, opcionMeses = 0;
        String nombreCliente = "", contactoCliente = "";
        double pagoCliente, precioVehiculo, precioConDescuento, cambioCliente = 0, engancheVehiculo, pagoPorMes;

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
            System.out.print("-> "); opcionUsuario = input.nextInt();

            //! switch del menu principal
            do{

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            switch(opcionUsuario){
                case 1: //? 1. Catalogo de autos -> tipos de gama -> Cilindraje -> tipoDeVehiculo

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
                    System.out.print("-> "); opcionMenu1_1 = input.nextInt(); //? leemos la opcion del menu 1.1

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

                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("FILTRADO POR CATEGORIA DE VEHICULOS | SELECCIONE OPCION NUMERICA");
                            System.out.println("--------------------------------------------------------------------");

                            for(int i = 0; i<opcionesMenu1_3.length; i++){
                                System.out.println((i+1) + " -> " + opcionesMenu1_3[i]);
                            }

                            System.out.println("--------------------------------------------------------------------");
                            System.out.print("->"); opcionMenuCategorias = input.nextInt();

                            //! switch para menu 1.3 filtrado por categorias, menu de categorias.
                            switch(opcionMenuCategorias){
                                case 1: //? mostrar todos los vehiculos de tipo sedan...
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO TODOS LOS VEHICULOS TIPO SEDAN | MENU CATEGORIAS");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][4].equals("SEDAN")) { // Verificar si la columna "Tipo" es "SEDAN"
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
                                    System.out.print("->");

                                    input.nextLine();
                                    input.nextLine();

                                    auxMenuGamas = 1;
                                    auxMenuGamas2 = 1;


                                break;

                                case 2: //? mostrar todos los vehiculos de tipo deportivo...
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO TODOS LOS VEHICULOS TIPO DEPORTIVO | MENU CATEGORIAS");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][4].equals("DEPORTIVO")) { // Verificar si la columna "Tipo" es "DEPORTIVO"
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
                                    System.out.print("->");

                                    input.nextLine();
                                    input.nextLine();

                                    auxMenuGamas = 1;
                                    auxMenuGamas2 = 1;

                                break;

                                case 3: //? mostrar todos los vehiculos de tipo pickup...
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO TODOS LOS VEHICULOS TIPO PICKUP | MENU CATEGORIAS");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][4].equals("PICK UP")) { // Verificar si la columna "Tipo" es "PICK UP"
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
                                    System.out.print("->");

                                    input.nextLine();
                                    input.nextLine();

                                    auxMenuGamas = 1;
                                    auxMenuGamas2 = 1;

                                break;

                                case 4: //? mostrar todos los vehiculos de tipo SUV...
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO TODOS LOS VEHICULOS TIPO SUV | MENU CATEGORIAS");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][4].equals("SUV")) { // Verificar si la columna "Tipo" es "SUV"
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
                                    System.out.print("->");

                                    input.nextLine();
                                    input.nextLine();

                                    auxMenuGamas = 1;
                                    auxMenuGamas2 = 1;

                                break;

                                case 5: //? regresar al menu anterior -> Menu Catalogo

                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Limpia la pantalla

                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("REGRESAR AL MENU ANTERIOR | MENU CATEGORIAS");
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
                                    System.out.println("OPCION NO VALIDA, PRESIONE ENTER PARA CONTINUAR");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.print("->");

                                    input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                                    input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.

                                    auxMenuGamas2 = 1;

                                break;
                            }

                        break;

                        case 3: //? Mostrar vehiculos por cilindraje

                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("FILTRADO POR CILINDRAJE DE VEHICULOS | SELECCIONE OPCION NUMERICA");
                            System.out.println("--------------------------------------------------------------------");

                            for(int i = 0; i<opcionesMenu1_4.length; i++){
                                System.out.println((i+1) + " -> " + opcionesMenu1_4[i]);
                            }

                            System.out.println("--------------------------------------------------------------------");
                            System.out.print("->"); opcionMenuCilindraje = input.nextInt();

                            //! switch para menu 1.4 filtrado por cilindraje, menu de cilindraje.
                            switch(opcionMenuCilindraje){
                                case 1: //? mostrar todos los vehiculos de 4 cilindros.
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO TODOS LOS VEHICULOS DE 4 CILINDROS | MENU CILINDRAJE");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][5].equals("4")) { // Verificar si la columna "Cilindraje" es "4"
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
                                    System.out.print("->");

                                    input.nextLine();
                                    input.nextLine();

                                    auxMenuGamas = 1;
                                    auxMenuGamas2 = 1;

                                break;

                                case 2: //? mostrar todos los vehiculos de 6 cilindros.
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO TODOS LOS VEHICULOS DE 6 CILINDROS | MENU CILINDRAJE");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][5].equals("6")) { // Verificar si la columna "Cilindraje" es "6"
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
                                    System.out.print("->");

                                    input.nextLine();
                                    input.nextLine();

                                    auxMenuGamas = 1;
                                    auxMenuGamas2 = 1;

                                break;

                                case 3: //? mostrar todos los vehiculos de 8 cilindros.
                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("-----------------------------------------------------------------------------------------------------");
                                    System.out.println("MOSTRANDO TODOS LOS VEHICULOS DE 8 CILINDROS | MENU CILINDRAJE");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                    System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                    System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                    for (int i = 0; i < listaVehiculos.length; i++) {
                                        if (listaVehiculos[i][5].equals("8")) { // Verificar si la columna "Cilindraje" es "8"
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
                                    System.out.print("->");

                                    input.nextLine();
                                    input.nextLine();

                                    auxMenuGamas = 1;
                                    auxMenuGamas2 = 1;

                                break;

                                case 4: //? regresar al menu anterior -> Menu catalogo.

                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Limpia la pantalla

                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                    System.out.println("----------------------------------------------------------------");
                                    System.out.println("REGRESAR AL MENU ANTERIOR | MENU CILINDRAJE");
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
                            }


                        break;
                        case 4: //? Mostrar todos los vehiculos.
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("LISTA DE VEHICULOS EN CATALOGO | DIGITE OPCION NUMERICA");
                            //System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                            System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                            for (int i = 0; i < listaVehiculos.length; i++) { // Recorre las filas
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

                            System.out.println("|-----------------------------------------------------------------------------------------------------------------------------------|");
                            System.out.println("\nPRESIONE ENTER PARA CONTINUAR");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("->");

                            input.nextLine();
                            input.nextLine();

                            auxMenuGamas = 1;

                        break;
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

                case 2: //? realizar venta de vehiculo, primero haremos la pre ventana, que es conocer la informacion del cliente.

                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    //? pedimos informacion del cliente para su factura o presupuesto.
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("MENU VENTAS | DIGITE INFORMACION DEL CLIENTE");
                    System.out.println("----------------------------------------------------------------");

                    input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                    System.out.print("NOMBRE COMPLETO           -> ");
                    nombreCliente = input.nextLine(); //input.nextLine();

                    System.out.print("CONTACTO (NUMERO O EMAIL) -> ");
                    contactoCliente = input.nextLine();

                    System.out.println("\nINFORMACION GUARDADA | PRESIONE ENTER PARA CONTINUAR...");
                    System.out.println("----------------------------------------------------------------");
                    System.out.print("-> "); input.nextLine();

                    //? procedemos a desplegar el menu de ventas
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("----------------------------------------------------------------");
                    System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("MENU VENTAS | DIGITE OPCION NUMERICA");
                    System.out.println("----------------------------------------------------------------");

                    for(int i = 0; i<opcionesMenu2.length; i++){
                        System.out.println((i+1) + " -> " + opcionesMenu2[i]);
                    }

                    System.out.println("----------------------------------------------------------------");
                    System.out.print("-> "); opcionMenuVentas = input.nextInt();

                    //! switch de menu ventas.
                    switch(opcionMenuVentas){
                            case 1: //? realizar venta de vehiculo...
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                System.out.println("----------------------------------------------------------------");
                                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                System.out.println("----------------------------------------------------------------");
                                System.out.println("MENU VENTA VEHICULO | DIGITE OPCION NUMERICA");
                                System.out.println("----------------------------------------------------------------");

                                for(int i = 0; i<opcionesMenu2_1.length; i++){
                                    System.out.println((i+1) + " -> " + opcionesMenu2_1[i]);
                                }

                                System.out.println("----------------------------------------------------------------");
                                System.out.print("-> "); opcionMenu2_1 = input.nextInt();

                                //! switch para menu 2.1, venta de vehiculo, a pagos o a credito.
                                switch(opcionMenu2_1){
                                    case 1: //? venta de contado, se le otorga un descuento de 10 al cliente.
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                        //? pedimos el ID del vehiculo que se va a vender.
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("MENU VENTA VEHICULO PAGO DE CONTADO | DIGITE ID DE VEHICULO");
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.print("-> "); idVehiculo = input.nextInt();

                                        idVehiculo = idVehiculo - 1; //? restamos 1 al ID, ya que el ID empieza en 0.

                                        System.out.println("\nINFORMACION GUARDADA | PRESIONE ENTER PARA CONTINUAR...");
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.print("-> "); input.nextLine();

                                        //? teniendo el ID, procesamos a pedir informacion de pago.
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.println("DETALLES DEL CLIENTE:");
                                        System.out.println("\nNOMBRE DEL CLIENTE -> " + nombreCliente);
                                        System.out.println("CONTACTO DEL CLIENTE -> " + contactoCliente);
                                        System.out.println("-----------------------------------------------------------------------------------------------------");

                                        System.out.println("\nMENU VENTA VEHICULO PAGO DE CONTADO | INFORMACION DEL VEHICULO DE ID = [" + idVehiculo + "]");
                                        System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                        System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                        System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                        //? imprimir el vehiculo segun el ID, como solo es un vehiculo, no necesitamos ciclos, porque conocemos el valor de la fila, y las columnas.
                                        System.out.printf("| %2s | %-16s | %-16s | %-6s | %-16s | %-10s | %-10s |\n",
                                            listaVehiculos[idVehiculo][0], // ID
                                            listaVehiculos[idVehiculo][1], // Marca
                                            listaVehiculos[idVehiculo][2], // Modelo
                                            listaVehiculos[idVehiculo][3], // Gama
                                            listaVehiculos[idVehiculo][4], // Tipo
                                            listaVehiculos[idVehiculo][5], // Cilindraje
                                            listaVehiculos[idVehiculo][6]  // Precio
                                        );
                                        System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                        //? quitar el simbolo de $ y la coma, para convertir a double.
                                        precioVehiculo = Double.parseDouble(listaVehiculos[idVehiculo][6].replace("$", "").replace(",", ""));

                                        //? calcular descuento del 10% al precio del vehiculo por pagar de contado.
                                        precioConDescuento = precioVehiculo * 0.10;
                                        precioConDescuento = precioVehiculo - precioConDescuento;

                                        System.out.println("\nPRECIO ORIGINAL -> $" + precioVehiculo + " DLLS");
                                        System.out.println("DESCUENTO DEL 10% -> $" + precioConDescuento + " DLLS");
                                        System.out.println("-----------------------------------------------------------------------------------------------------");

                                        //? metodo de pago, aca se evaluara con condicional, solo seran dos opciones, quiza 3
                                        System.out.println("DIGITE SU METODO DE PAGO | OPCION NUMERICA");
                                        System.out.println("\n1 -> EFECTIVO");
                                        System.out.println("2 -> TARJETA DE CREDITO/DEBITO");
                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.print("-> "); opcionPago = input.nextInt();

                                        if (opcionPago == 1) { //? pago en efectivo.
                                            System.out.print("\nDIGITE SU MONTO DE PAGO -> "); pagoCliente = input.nextDouble();

                                            //? calcular cambio, si el pago es mayor al precio del vehiculo.
                                            if(pagoCliente >= precioConDescuento){

                                                cambioCliente = pagoCliente - precioConDescuento;
                                                System.out.println("SU CAMBIO ES -> $" + cambioCliente + " DLLS");
                                                System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                                System.out.print("-> ");

                                                input.nextLine();
                                                input.nextLine();

                                            } else{ //? si el pago es menor al precio del vehiculo.
                                                System.out.println("SU PAGO ES INSUFICIENTE, PRESIONE ENTER PARA CONTINUAR...");
                                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                                System.out.print("-> ");

                                                input.nextLine();
                                                input.nextLine();

                                            }

                                            //? ACA LA FACTURA.
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("FACTURA DE COMPRA AUTOMOVIL | COMPRA EFECTUADA CON EXITO");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                            System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                            System.out.printf("| %2s | %-16s | %-16s | %-6s | %-16s | %-10s | %-10s |\n",
                                            listaVehiculos[idVehiculo][0], // ID
                                            listaVehiculos[idVehiculo][1], // Marca
                                            listaVehiculos[idVehiculo][2], // Modelo
                                            listaVehiculos[idVehiculo][3], // Gama
                                            listaVehiculos[idVehiculo][4], // Tipo
                                            listaVehiculos[idVehiculo][5], // Cilindraje
                                            listaVehiculos[idVehiculo][6]  // Precio
                                            );
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            System.out.println("\nINFORMACION DE PAGO");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("METODO DE PAGO -> EFECTIVO");
                                            System.out.println("MONTO DE PAGO -> $" + pagoCliente + " DLLS");
                                            System.out.println("SALDO SOBRANTE -> $" + cambioCliente + " DLLS");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            System.out.println("\nINFORMACION DEL CLIENTE");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("NOMBRE DEL CLIENTE -> " + nombreCliente);
                                            System.out.println("CONTACTO DEL CLIENTE -> " + contactoCliente);
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("GRACIAS POR CONFIAR EN NUESTRO SISTEMA | UNIVERSIDAD TECNOLOGICA DE TIJUANA");
                                            System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.print("-> ");

                                            input.nextLine();
                                            input.nextLine();

                                        }

                                        if(opcionPago == 2){ //? pago con tarjeta de credito o debito.
                                            System.out.print("\nDIGITE SU MONTO DE PAGO -> "); pagoCliente = input.nextDouble();
                                            System.out.println("\nPAGO EXITOSO, PRESIONE ENTER PARA CONTINUAR...");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.print("-> ");
                                            input.nextLine();
                                            input.nextLine();

                                            //? ACA LA FACTURA.
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("FACTURA DE COMPRA AUTOMOVIL | COMPRA EFECTUADA CON EXITO");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("\nINFORMACION DE COMPRA");

                                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                            System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                            System.out.printf("| %2s | %-16s | %-16s | %-6s | %-16s | %-10s | %-10s |\n",
                                            listaVehiculos[idVehiculo][0], // ID
                                            listaVehiculos[idVehiculo][1], // Marca
                                            listaVehiculos[idVehiculo][2], // Modelo
                                            listaVehiculos[idVehiculo][3], // Gama
                                            listaVehiculos[idVehiculo][4], // Tipo
                                            listaVehiculos[idVehiculo][5], // Cilindraje
                                            listaVehiculos[idVehiculo][6]  // Precio
                                            );
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            System.out.println("\nINFORMACION DE PAGO");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("METODO DE PAGO   -> TARJETA DE CREDITO/DEBITO");
                                            System.out.println("TARJETA DE CLIENTE -> " + pagoCliente);
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            System.out.println("\nINFORMACION DEL CLIENTE");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("NOMBRE DEL CLIENTE -> " + nombreCliente);
                                            System.out.println("CONTACTO DEL CLIENTE -> " + contactoCliente);
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("GRACIAS POR CONFIAR EN NUESTRO SISTEMA | UNIVERSIDAD TECNOLOGICA DE TIJUANA");
                                            System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.print("-> ");

                                            input.nextLine();
                                            input.nextLine();

                                        }

                                        if (opcionPago != 1 && opcionPago != 2) { //? DEFAULT PERO EN CONDICIONALES.
                                            System.out.println("\nERROR, OPCION NO VALIDA, PRESIONE ENTER PARA CONTINUAR...");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.print("-> ");

                                            input.nextLine();
                                            input.nextLine();
                                        }

                                    break;

                                    case 2: //? venta a credito, tambien conocido como a plazos.
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                        //? pedimos el ID del vehiculo que se va a vender.
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("MENU VENTA VEHICULO PAGO A PLAZOS | DIGITE ID DE VEHICULO");
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.print("-> "); idVehiculo = input.nextInt();

                                        idVehiculo = idVehiculo - 1; //? restamos 1 al ID, ya que el ID empieza en 0.

                                        System.out.println("\nINFORMACION GUARDADA | PRESIONE ENTER PARA CONTINUAR...");
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.print("-> "); input.nextLine();

                                        //? procedemos a calcular lo necesario para el pago a plazos.
                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.println("DETALLES DEL CLIENTE:");
                                        System.out.println("\nNOMBRE DEL CLIENTE -> " + nombreCliente);
                                        System.out.println("CONTACTO DEL CLIENTE -> " + contactoCliente);
                                        System.out.println("-----------------------------------------------------------------------------------------------------");

                                        System.out.println("\nMENU VENTA VEHICULO PAGO A PLAZOS | INFORMACION DEL VEHICULO DE ID = [" + idVehiculo + "]");
                                        System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                        System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                        System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                        //? imprimir el vehiculo segun el ID, como solo es un vehiculo, no necesitamos ciclos, porque conocemos el valor de la fila, y las columnas.
                                        System.out.printf("| %2s | %-16s | %-16s | %-6s | %-16s | %-10s | %-10s |\n",
                                            listaVehiculos[idVehiculo][0], // ID
                                            listaVehiculos[idVehiculo][1], // Marca
                                            listaVehiculos[idVehiculo][2], // Modelo
                                            listaVehiculos[idVehiculo][3], // Gama
                                            listaVehiculos[idVehiculo][4], // Tipo
                                            listaVehiculos[idVehiculo][5], // Cilindraje
                                            listaVehiculos[idVehiculo][6]  // Precio
                                        );
                                        System.out.println("-----------------------------------------------------------------------------------------------------");

                                        //? quitar el simbolo de $ y la coma, para convertir a double el precio de vehiculo.
                                        precioVehiculo = Double.parseDouble(listaVehiculos[idVehiculo][6].replace("$", "").replace(",", ""));

                                        //? calcular enganche teniendo el precio, el enganche sera del 30% del precio del vehiculo.
                                        engancheVehiculo = precioVehiculo * 0.30;
                                        //engancheVehiculo = precioVehiculo - engancheVehiculo;

                                        System.out.println("\nPRECIO ORIGINAL -> " + listaVehiculos[idVehiculo][6] + " DLLS | SU ENGANCHE ES DE [$" + engancheVehiculo + " DLLS]");
                                        System.out.println("\nSELECCIONE LOS MESES A PAGAR | OPCION NUMERICA");

                                        System.out.println();
                                        while (iteradorWhile <= 2){
                                            System.out.println(iteradorWhile + 1 + " -> " + opcionesMeses[iteradorWhile] + " meses");

                                            iteradorWhile++;
                                        } iteradorWhile = 0; //? reiniciamos el iterador para que vuelva a empezar desde 0.

                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.print("-> "); opcionMeses = input.nextInt();

                                        if(opcionMeses!=1 && opcionMeses!=2 && opcionMeses!=3){ //? si el usuario no selecciona una opcion valida, se le indica que la opcion no es correcta.
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("OPCION NO VALIDA, PRESIONE ENTER PARA CONTINUAR"); //1System.out.println();
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.print("->");

                                            input.nextLine();
                                            input.nextLine();
                                            break;

                                        }

                                        System.out.println("\nSELECCIONE SU METODO DE PAGO | OPCION NUMERICA");
                                        System.out.println("\n1 -> EFECTIVO");
                                        System.out.println("2 -> TARJETA DE CREDITO/DEBITO");
                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.print("-> "); opcionPago = input.nextInt();

                                        if (opcionPago != 1 && opcionPago != 2) { //? DEFAULT PERO EN CONDICIONALES.
                                            System.out.println("\nERROR, OPCION NO VALIDA, PRESIONE ENTER PARA CONTINUAR...");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.print("-> ");

                                            input.nextLine();
                                            input.nextLine();
                                        }

                                        if (opcionPago == 1) { //? pago en efectivo.
                                            System.out.print("\nDIGITE SU MONTO DE PAGO PARA ENGANCHE -> "); pagoCliente = input.nextDouble();

                                            //? calcular cambio, si el pago es mayor al precio del vehiculo.
                                            if(pagoCliente >= engancheVehiculo){

                                                cambioCliente = pagoCliente - engancheVehiculo;
                                                System.out.println("SU CAMBIO ES -> $" + cambioCliente + " DLLS");
                                                System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                                System.out.print("-> ");

                                                input.nextLine();
                                                input.nextLine();

                                            } else{ //? si el pago es menor al precio del vehiculo.
                                                System.out.println("SU PAGO ES INSUFICIENTE, PRESIONE ENTER PARA CONTINUAR...");
                                                System.out.println("-----------------------------------------------------------------------------------------------------");
                                                System.out.print("-> ");

                                                input.nextLine();
                                                input.nextLine();

                                            }

                                            //? ACA LA FACTURA.
                                            pagoPorMes = (precioVehiculo - engancheVehiculo) / opcionesMeses[opcionMeses - 1]; //? pago por mes, el saldo restante dividido entre los meses a pagar.
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("FACTURA DE COMPRA AUTOMOVIL | COMPRA EFECTUADA CON EXITO");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                            System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                            System.out.printf("| %2s | %-16s | %-16s | %-6s | %-16s | %-10s | %-10s |\n",
                                            listaVehiculos[idVehiculo][0], // ID
                                            listaVehiculos[idVehiculo][1], // Marca
                                            listaVehiculos[idVehiculo][2], // Modelo
                                            listaVehiculos[idVehiculo][3], // Gama
                                            listaVehiculos[idVehiculo][4], // Tipo
                                            listaVehiculos[idVehiculo][5], // Cilindraje
                                            listaVehiculos[idVehiculo][6]  // Precio
                                            );
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            System.out.println("\nINFORMACION DE PAGO");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("METODO DE PAGO -> EFECTIVO");
                                            System.out.println("MONTO DE PAGO -> $" + pagoCliente + " DLLS");
                                            System.out.println("SALDO SOBRANTE -> $" + cambioCliente + " DLLS");

                                            System.out.println("\nSU COMPRA ES A PLAZOS DE -> " + opcionesMeses[opcionMeses - 1] + " MESES");
                                            System.out.println("SU ENGANCHE ES DE -> $" + engancheVehiculo + " DLLS");
                                            System.out.println("SU SALDO RESTANTE ES DE -> $" + (precioVehiculo - engancheVehiculo) + " DLLS");
                                            System.out.println("SU SALDO RESTANTE A PAGAR POR MES ES DE -> $" + pagoPorMes + " DLLS");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            System.out.println("\nINFORMACION DEL CLIENTE");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("NOMBRE DEL CLIENTE -> " + nombreCliente);
                                            System.out.println("CONTACTO DEL CLIENTE -> " + contactoCliente);
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("GRACIAS POR CONFIAR EN NUESTRO SISTEMA | UNIVERSIDAD TECNOLOGICA DE TIJUANA");
                                            System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.print("-> ");

                                            input.nextLine();
                                            input.nextLine();

                                        }

                                        if(opcionPago == 2){ //? pago con tarjeta de credito o debito.
                                            System.out.print("\nDIGITE SU TARJETA DE CREDITO/DEBITO -> "); pagoCliente = input.nextDouble();

                                            System.out.println("\nPAGO EXITOSO, PRESIONE ENTER PARA CONTINUAR...");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            //? ACA LA FACTURA.
                                            pagoPorMes = (precioVehiculo - engancheVehiculo) / opcionesMeses[opcionMeses - 1]; //? pago por mes, el saldo restante dividido entre los meses a pagar.
                                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("FACTURA DE COMPRA AUTOMOVIL | COMPRA EFECTUADA CON EXITO");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("\nINFORMACION DE COMPRA");

                                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");
                                            System.out.println("| ID | Marca            | Modelo           | Gama   | Tipo             | Cilindraje | Precio     |");
                                            System.out.println("+----+------------------+------------------+--------+------------------+------------+------------+");

                                            System.out.printf("| %2s | %-16s | %-16s | %-6s | %-16s | %-10s | %-10s |\n",
                                            listaVehiculos[idVehiculo][0], // ID
                                            listaVehiculos[idVehiculo][1], // Marca
                                            listaVehiculos[idVehiculo][2], // Modelo
                                            listaVehiculos[idVehiculo][3], // Gama
                                            listaVehiculos[idVehiculo][4], // Tipo
                                            listaVehiculos[idVehiculo][5], // Cilindraje
                                            listaVehiculos[idVehiculo][6]  // Precio
                                            );
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            System.out.println("\nINFORMACION DE PAGO");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("METODO DE PAGO -> TARJETA DE CREDITO/DEBITO");
                                            System.out.println("TARJETA DE CLIENTE -> *" + ((int)pagoCliente % 10000)); //? solo se muestran los ultimos 4 digitos de la tarjeta.

                                            System.out.println("\nSU COMPRA ES A PLAZOS DE -> " + opcionesMeses[opcionMeses - 1] + " MESES");
                                            System.out.println("SU ENGANCHE ES DE -> $" + engancheVehiculo + " DLLS");
                                            System.out.println("SU SALDO RESTANTE ES DE -> $" + (precioVehiculo - engancheVehiculo) + " DLLS");
                                            System.out.println("SU SALDO RESTANTE A PAGAR POR MES ES DE -> $" + pagoPorMes + " DLLS");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");

                                            System.out.println("\nINFORMACION DEL CLIENTE");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("NOMBRE DEL CLIENTE -> " + nombreCliente);
                                            System.out.println("CONTACTO DEL CLIENTE -> " + contactoCliente);
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.println("GRACIAS POR CONFIAR EN NUESTRO SISTEMA | UNIVERSIDAD TECNOLOGICA DE TIJUANA");
                                            System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                            System.out.println("-----------------------------------------------------------------------------------------------------");
                                            System.out.print("-> ");

                                            input.nextLine();
                                            input.nextLine();

                                        }



                                    break;

                                    case 3: //? regresar al menu anterior -> Menu Ventas.

                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Limpia la pantalla

                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("REGRESAR AL MENU ANTERIOR | MENU VENTAS");
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                        System.out.println("----------------------------------------------------------------");
                                        System.out.print("-> ");

                                        input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                                        input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.

                                    break;

                                    default: //? si el usuario no selecciona una opcion valida, se le indica que la opcion no es correcta.

                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.println("OPCION NO VALIDA, PRESIONE ENTER PARA CONTINUAR"); //1System.out.println();
                                        System.out.println("-----------------------------------------------------------------------------------------------------");
                                        System.out.print("->");

                                        input.nextLine();
                                        input.nextLine();

                                    break;
                                }

                            break;

                            case 2: //? crear presupuesto...

                            break;

                            case 3: //? regresar al menu anterior...

                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Limpia la pantalla

                                System.out.println("----------------------------------------------------------------");
                                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                System.out.println("----------------------------------------------------------------");
                                System.out.println("REGRESAR AL MENU ANTERIOR | MENU VENTAS");
                                System.out.println("----------------------------------------------------------------");
                                System.out.println("\nPRESIONE ENTER PARA CONTINUAR...");
                                System.out.println("----------------------------------------------------------------");
                                System.out.print("->");

                                input.nextLine(); //? limpiar el buffer de entrada, ya que el usuario selecciono una opcion no valida.
                                input.nextLine(); //? se lee el enter para continuar, ya que el programa se va a cerrar.

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

                                break;
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
            }
        }while(auxMenuGamas != 0); //? ciclo while, mientras auxMenuGamas sea diferente de 0, se va a repetir el ciclo. //switch para todos los posibles casos
        }while(auxMenuPrincipal != 0); //? ciclo while, mientras auxMenuPrincipal sea diferente de 0, se va a repetir el ciclo.
        input.close(); //?cerrando objeto tipo Scanner.
    }
}
