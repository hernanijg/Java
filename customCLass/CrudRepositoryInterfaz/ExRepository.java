package customCLass.CrudRepositoryInterfaz;

import customCLass.CrudRepositoryInterfaz.Model.Client;
import customCLass.CrudRepositoryInterfaz.Repository.*;

import java.util.List;

public class ExRepository {
    public static void main(String[] args) {
        CrudRepository repo = new ClientListRepository();
        repo.create(new Client("Jhon", "Doe"));
        repo.create(new Client("Jose", "Doe"));
        repo.create(new Client("Adria", "Doe"));
        repo.create(new Client("Mauro", "Doe"));

        List<Client> clients = repo.list();
        clients.forEach(System.out::println);

        System.out.println("===== Page =====");
        List<Client> pagRepo = ((PageRepository)repo).list(1, 3);
        pagRepo.forEach(System.out::println);

        System.out.println("===== Sort =====");
        List<Client> sortRepo = ((SortedRepository)repo).list("name", Address.ASC);
        sortRepo.forEach(System.out::println);

        System.out.println("===== Edit =====");
        Client cEdit = new Client("Bea", "Mena");
        cEdit.setId(2);
        repo.edit(cEdit);

        Client bea = repo.byId(2);
        //System.out.println(bea);
        List<Client> clients2 = repo.list();
        clients2.forEach(System.out::println);

        System.out.println("===== Delete =====");
        repo.delete(bea);
        repo.list().forEach(System.out::println);

    }
}
