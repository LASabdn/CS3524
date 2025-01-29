package shared;
//can I push?
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    private UpperCaseServer server;

    public RMIClient() {}

    public void startClient() throws RemoteException, NotBoundException{
        Registry registry = LocateRegistry.getRegistry("localhost",1099);
        server = (UpperCaseServer) registry.lookup("Server");
    }

    public String toUpperCase(String argument) throws RemoteException{
        return server.toUpperCase(argument);
    }
}