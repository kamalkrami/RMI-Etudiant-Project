package net.kamal;

import model.iEtudiant;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientMain {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        String url = "rmi://localhost:1099/etu";
        iEtudiant stub = (iEtudiant) Naming.lookup(url);
        System.out.println("Moyenne = "+ String.format("%.2f",stub.moyenne(1L)));
    }
}