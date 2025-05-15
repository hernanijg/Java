package customCLass.CrudRepositoryInterfaz.Repository;

import customCLass.CrudRepositoryInterfaz.Model.Client;

import java.util.List;

public interface PageRepository {
    List<Client> list(int from, int to);
}
