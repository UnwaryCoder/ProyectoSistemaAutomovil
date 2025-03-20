import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] opcionesMenu = {"CATALOGO DE VEHICULOS.", "REALIZAR VENTA DE VEHICULOS.", "MANUAL DE USUARIO", "CREAR PRESUPUESTO", "SALIR"}; int opcionUsuario = 0; Scanner input = new Scanner(System.in); //definir variables y scanner

        //*visual para terminal
        System.out.println("----------------------------------------------------------------");
        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
        System.out.println("----------------------------------------------------------------");
        System.out.println("MENU OPCIONES|DIGITE OPCION NUMERICA");
        System.out.println("----------------------------------------------------------------");

        for(int i = 0; i <opcionesMenu.length; i++){
            System.out.println((i+1) + " -> " + opcionesMenu[i]);
        }

         System.out.println("----------------------------------------------------------------");
        System.out.print("->"); opcionUsuario = input.nextInt();
        System.out.println();

        switch(opcionUsuario){
            case 1:
            String[][] opciones = {
                {"1", "VEHICULOS GAMA ALTA"},
                {"2", "VEHICULOS GAMA MEDIA"},
                {"3", "VEHICULOS GAMA BAJA"}
            };


            System.out.println("----------------------------------------------------------------");
            System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
            System.out.println("----------------------------------------------------------------");
            System.out.println("1. CATALOGO DE VEHICULOS | DIGITE OPCION NUMERICA");
            System.out.println("----------------------------------------------------------------");
            break;
        } //switch para todos los posibles casos


        input.close(); //cerrando objeto tipo Scanner.
    }
}
