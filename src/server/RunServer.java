package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import shared.UpperCaseServer;
public class RunServer {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        UpperCaseServer server = new ServerImpl();
        Registry registry = LocateRegistry.createRegistry(1099); //port:1099
        registry.bind("Server", server);
        System.out.println("Server started.");
    }
}
