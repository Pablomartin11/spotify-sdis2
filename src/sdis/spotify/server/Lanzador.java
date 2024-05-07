package sdis.spotify.server;

public class Lanzador {
    public static void main(String [] args){
        try{
            // Declaracion de objetos remotos

            // Accedemos a una referencia al registro (rmiregistry) local
            java.rmi.registry.Registry registro = java.rmi.registry.LocateRegistry.getRegistry("localhost");

            // Bindear objetos remotos a registry

        } catch (Exception e){
            System.err.println("Excepción del servidor: "+e.toString());
            e.printStackTrace();
        }
    }
}