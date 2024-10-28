package entities;

import lombok.Getter;
import lombok.Setter;
import model.iEtudiant;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

@Getter @Setter
public class Etudiant extends UnicastRemoteObject implements iEtudiant {

    private Long id;
    private double note1;
    private double note2;
    private double note3;

    public Etudiant() throws RemoteException {
        super();
    }

    public Etudiant(Long id, double note1, double note2, double note3) throws RemoteException {
        super();
        this.id = id;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
    }

    @Override
    public double moyenne(Long id) throws RemoteException {

        List<Etudiant> etudiantList = List.of(
                new Etudiant(1L, 17, 19, 20),
                new Etudiant(2L, 19, 18, 16)
        );

        double var = 0.0;
        for (Etudiant etudiant : etudiantList) {
            if (etudiant.id.equals(id)) {
                var = (etudiant.note1 + etudiant.note2 + etudiant.note3) / 3;
                break;
            }
        }
        return var;
    }
}
