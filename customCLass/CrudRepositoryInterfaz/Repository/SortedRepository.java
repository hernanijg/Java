package customCLass.CrudRepositoryInterfaz.Repository;

import customCLass.CrudRepositoryInterfaz.Model.Client;

import java.util.List;

public interface SortedRepository {
    List<Client> list(String c, Address address);

}
