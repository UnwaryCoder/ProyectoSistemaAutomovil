import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] opcionesMenu = {"opcion1", "opcion2", "opcion3", "opcion4"}; int opcionUsuario = 0; Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------");
        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
        System.out.println("----------------------------------------------------------------");
        System.out.println("MENU OPCIONES|DIGITE OPCION NUMERICA");

        for(int i = 0; i < opcionesMenu.length; i++) System.out.println((i+1) + " -> " + opcionesMenu[i]);
        
    }
}
