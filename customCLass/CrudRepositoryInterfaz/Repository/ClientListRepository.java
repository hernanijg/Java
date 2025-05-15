package customCLass.CrudRepositoryInterfaz.Repository;

import customCLass.CrudRepositoryInterfaz.Model.Client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientListRepository implements CrudRepository,
        SortedRepository, PageRepository{

    private List<Client> dataSource;

    public ClientListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Client> list() {
        return dataSource;
    }

    @Override
    public Client byId(Integer id) {
        Client c = null;
        for (Client cli: dataSource) {
            if (cli.getId().equals(id) && cli.getId() != null) {
                c = cli;
                break;
            }
        }

        return c;
    }

    @Override
    public void create(Client client) {
        this.dataSource.add(client);
    }

    @Override
    public void edit(Client client) {
        Client c = this.byId(client.getId());
        c.setName(client.getName());
        c.setLastname(client.getLastname());
    }

    @Override
    public void delete(Client client) {
        Client c = this.byId(client.getId());
        this.dataSource.remove(c);
    }

    @Override
    public List<Client> list(String c, Address address) {

        dataSource.sort((a, b) -> {
                int result = 0;
                if(address == Address.ASC){
                    switch (c) {
                        case "id" -> result = a.getId().compareTo(b.getId());
                        case "name" -> result = a.getName().compareTo(b.getName());
                        case "lastname" -> result = a.getLastname().compareTo(b.getLastname());
                    }
                } else if(address == address.DESC) {
                    switch (c) {
                        case "id" -> result = b.getId().compareTo(a.getId());
                        case "name" -> result = b.getName().compareTo(a.getName());
                        case "lastname" -> result = b.getLastname().compareTo(a.getLastname());
                    }
                }
                return result;
            }
        );

        return dataSource;
    }

    @Override
    public List<Client> list(int from, int to) {
        return dataSource.subList(from, to);
    }
}
