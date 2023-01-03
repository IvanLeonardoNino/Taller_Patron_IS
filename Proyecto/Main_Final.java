package Proyecto;

import java.util.Scanner;

public class Main_Final {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        boolean continuar = true;

        while (continuar) {

            System.out.println("");
            System.out.println("Elige una opción:");
            System.out.println("1. Crear un estado del personaje");
            System.out.println("2. Mostrar lista de estados guardados");
            System.out.println("3. Recuperar estado del personaje");
            System.out.println("4. Mostrar el estado recuperado");
            System.out.println("5. Salir");
            System.out.print("¿Que opción elige?: ");
            int opcion = scanner.nextInt();
            System.out.println(" ");

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la vida del personaje: ");
                    originator.setVida(scanner.nextInt());
                    System.out.print("Ingresa el nivel del personaje: ");
                    originator.setNivel(scanner.nextInt());
                    System.out.print("Ingresa la coordenada X del personaje: ");
                    int coordenadaX = scanner.nextInt();
                    System.out.print("Ingresa la coordenada Y del personaje: ");
                    int coordenadaY = scanner.nextInt();
                    System.out.print("Ingresa la coordenada Z del personaje: ");
                    int coordenadaZ = scanner.nextInt();
                    originator.setCoordenadas(coordenadaX, coordenadaY, coordenadaZ);
                    System.out.print("Ingresa el último objeto utilizado por el personaje: ");
                    originator.setUltimoObjeto(scanner.next());
                    scanner.nextLine();
                    System.out.println("Nuevo estado del personaje creado");
                    caretaker.addMemento(originator.saveStateToMemento());
                    break;
                case 2:
                    for (int i = 0; i < caretaker.getMementosCount(); i++) {
                        System.out.println("Estado " + (i + 1));
                        originator.getStateFromMemento(caretaker.getMemento(i));
                        System.out.println("Vida: " + originator.getVida());
                        System.out.println("Nivel: " + originator.getNivel());
                        System.out.println("Coordenada X: " + originator.getCoordenadaX());
                        System.out.println("Coordenada Y: " + originator.getCoordenadaY());
                        System.out.println("Coordenada Z: " + originator.getCoordenadaZ());
                        System.out.println("Último objeto utilizado: " + originator.getUltimoObjeto());
                        System.out.println(" ");
                        scanner.nextLine();
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el estado del personaje a recuperar:");
                    originator.getStateFromMemento(caretaker.getMemento(scanner.nextInt() - 1));
                    System.out.println("Estado recuperado");
                    scanner.nextLine();
                    break;
                case 4:
                    // Muestra el memento recuperado
                    System.out.println("Estado recuperado: ");
                    System.out.println("Vida: " + originator.getVida());
                    System.out.println("Nivel: " + originator.getNivel());
                    System.out.println("Coordenada X: " + originator.getCoordenadaX());
                    System.out.println("Coordenada Y: " + originator.getCoordenadaY());
                    System.out.println("Coordenada Z: " + originator.getCoordenadaZ());
                    System.out.println("Último objeto utilizado: " + originator.getUltimoObjeto());
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        }
        scanner.close();
    }

}
