package server;
//can I push?
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import shared.UpperCaseServer;

public class ServerImpl implements UpperCaseServer{

    public ServerImpl() throws RemoteException{
        UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public String toUpperCase(String str) throws RemoteException {
        return str.toUpperCase();
    }
}
