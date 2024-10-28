package model;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface iEtudiant extends Remote {
    public double moyenne(Long id) throws RemoteException;
}
