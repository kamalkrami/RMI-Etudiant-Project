package net.kamal;

import entities.Etudiant;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerMain {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(1099);
        String url = "rmi://localhost:1099/etu";
        Naming.rebind(url,new Etudiant());
        System.out.println("Server On !!!");
    }
}