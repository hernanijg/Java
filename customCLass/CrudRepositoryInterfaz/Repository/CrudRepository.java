package customCLass.CrudRepositoryInterfaz.Repository;

import customCLass.CrudRepositoryInterfaz.Model.Client;

import java.util.List;

public interface CrudRepository {
    List<Client> list();
    Client byId(Integer id);
    void create(Client client);
    void edit(Client client);
    void delete(Client client);

}
