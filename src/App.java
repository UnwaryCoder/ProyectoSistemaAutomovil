import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        //definir variables, vectores, matriz principal que contiene todos los vehiculos.
        String[] opcionesMenu = {"CATALOGO DE VEHICULOS.", "REALIZAR VENTA DE VEHICULOS.", "MANUAL DE USUARIO", "CREAR PRESUPUESTO", "SALIR"}; int opcionUsuario = 0; Scanner input = new Scanner(System.in); //definir variables y scanner
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
        String[] opcionesDeGama = {"VEHICULOS GAMA ALTA", "VEHICULOS GAMA MEDIA", "VEHICULOS GAMA BAJA", "MOSTRAR TODOS LOS VEHICULOS", "REGRESAR"};
        String[] opcionesGamaAlta = {"MOSTRAR TODOS LOS VEHICULOS DE GAMA ALTA", "MOSTRAR POR TIPO DE VEHICULOS", "MOSTRAR POR CANTIDAD DE CILINDROS", "REGRESAR"};
        int opcionMenu1 = 0, opcionMenuGamaAlta = 0;

        //*texto con aspecto visual para terminal
        System.out.println("----------------------------------------------------------------");
        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
        System.out.println("----------------------------------------------------------------");
        System.out.println("MENU OPCIONES|DIGITE OPCION NUMERICA");
        System.out.println("----------------------------------------------------------------");

        //?imprimir el vector con las opciones del menu principal
        for(int i = 0; i <opcionesMenu.length; i++){
            System.out.println((i+1) + " -> " + opcionesMenu[i]);
        }

        System.out.println("----------------------------------------------------------------");
        System.out.print("->"); opcionUsuario = input.nextInt();

        //!switch del menu principal
        switch(opcionUsuario){
            case 1:
                //? Catalogo de autos -> tipos de gama -> Cilindraje -> tipoDeVehiculo
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                System.out.println("----------------------------------------------------------------");
                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                System.out.println("----------------------------------------------------------------");
                System.out.println("1. CATALOGO DE VEHICULOS | DIGITE OPCION NUMERICA");
                System.out.println("----------------------------------------------------------------");

                for(int i = 0; i<opcionesDeGama.length; i++){
                    System.out.println((i + 1) + " -> " + opcionesDeGama[i]);
                }

                System.out.println("----------------------------------------------------------------");
                System.out.print("->"); opcionMenu1 = input.nextInt();

                //?submenu de catalogo
                switch(opcionMenu1){ //?desplegamos las opciones de gamas(baja, media, alta)
                    case 1:

                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                        System.out.println("----------------------------------------------------------------");
                        System.out.println("1. MENU CATALOGO GAMA ALTA | DIGITE OPCION NUMERICA");
                        System.out.println("----------------------------------------------------------------");

                        for(int i = 0; i<opcionesGamaAlta.length; i++){
                            System.out.println((i+1) + " -> " + opcionesGamaAlta[i]);
                        }

                        System.out.println("----------------------------------------------------------------");
                        System.out.println("->"); opcionMenuGamaAlta = input.nextInt();

                        switch(opcionMenuGamaAlta){
                            case 1:
                                //mostrar todos los vehiculos de gama alta...
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                                System.out.println("----------------------------------------------------------------");
                                System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
                                System.out.println("----------------------------------------------------------------");
                                System.out.println("MOSTRANDO VEHICULOS GAMA ALTA ");
                                System.out.println("----------------------------------------------------------------");

                                //imprimir todos los vehiculos gama alta...
                                for(int i = 0; i < listaVehiculos.length; i++){

                                    if(listaVehiculos[i][2].equals("Alta")){

                                        for(int j = 0; j < listaVehiculos[i].length; j++){

                                            System.out.print(listaVehiculos[i][j] + " | ");
                                        }

                                        System.out.println();
                                    }
                                }
                                break;

                            case 2: break;
                            case 3: break;
                            case 4: break;
                            default: break;
                        }
                        break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    default: break;
                }

                break;
        } //switch para todos los posibles casos


        input.close(); //cerrando objeto tipo Scanner.
    }
}
