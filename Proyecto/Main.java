package Proyecto;

public class Main {
    public static void main(String[] args) {

        //Primero se crea una instancia del Originator y se establece su estado

        Originator originator = new Originator();
        originator.setVida(100);
        originator.setNivel(1);
        originator.setCoordenadas(0, 0, 0);
        originator.setUltimoObjeto("Espada");

        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");

        System.out.println("Se crea una instancia de Originator y establece su estado");
        System.out.println("Vida: " + originator.getVida());
        System.out.println("Nivel: " + originator.getNivel());
        System.out.println("Coordenadas: (" + originator.getCoordenadaX() + ", " + originator.getCoordenadaY() + ", " + originator.getCoordenadaZ() +")");
        System.out.println("Último objeto: " + originator.getUltimoObjeto());
        System.out.println("Despues el Originator crea un memento y lo agregue al caretaker");

        System.out.println("---------------------------------------------------------");

        //Despues el Originator crea un memento y lo agregue al caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.saveStateToMemento());

        //Se modifica el estado del originator

        originator.setVida(50);
        originator.setNivel(2);
        originator.setCoordenadas(5, 5, 10);
        originator.setUltimoObjeto("Arco");

        System.out.println("---------------------------------------------------------");

        System.out.println("Se modifica el estado del originator");
        System.out.println("Vida: " + originator.getVida());
        System.out.println("Nivel: " + originator.getNivel());
        System.out.println("Coordenadas: (" + originator.getCoordenadaX() + ", " + originator.getCoordenadaY() + ", " + originator.getCoordenadaZ() +")");
        System.out.println("Último objeto: " + originator.getUltimoObjeto());

        System.out.println("---------------------------------------------------------");

        // Vuelve a crear un memento y lo agrega al caretaker
        caretaker.addMemento(originator.saveStateToMemento());

        // Recupera el primero memento del caretaker y se lo da al originator
        originator.getStateFromMemento(caretaker.getMemento(0));

        System.out.println("---------------------------------------------------------");

        System.out.println("Recupera el primero memento del caretaker y se lo da al originator");

        System.out.println("---------------------------------------------------------");

        // Imprime el estado del originator
        System.out.println("Vida: " + originator.getVida());
        System.out.println("Nivel: " + originator.getNivel());
        System.out.println("Coordenadas: (" + originator.getCoordenadaX() + ", " + originator.getCoordenadaY() + ", " + originator.getCoordenadaZ() +")");
        System.out.println("Último objeto: " + originator.getUltimoObjeto());
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
    }
}
