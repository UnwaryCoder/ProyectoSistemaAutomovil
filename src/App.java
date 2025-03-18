import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] opcionesMenu = {"opcion1", "opcion2", "opcion3", "opcion4"}; int opcionUsuario = 0; Scanner input = new Scanner(System.in); //definir variables y scanner

        //*visual para terminal
        System.out.println("----------------------------------------------------------------");
        System.out.println("SISTEMA GESTION AUTOMOVILES | Universidad Tecnologica de Tijuana");
        System.out.println("----------------------------------------------------------------");
        System.out.println("MENU OPCIONES|DIGITE OPCION NUMERICA");
        System.out.println("----------------------------------------------------------------");

        for(int i = 0; i < opcionesMenu.length; i++) System.out.println((i+1) + " -> " + opcionesMenu[i]); System.out.println("----------------------------------------------------------------");
        System.out.print("->"); opcionUsuario = input.nextInt();

        switch(opcionUsuario){} //switch para todos los posibles casos


        input.close(); //cerrando objeto tipo Scanner.
    }
}
