package customCLass.CrudRepositoryInterfaz.Model;

import java.util.Comparator;

public class ClientPremium extends Client implements Comparator<ClientPremium>{
    public ClientPremium(String name, String lastname) {
        super(name, lastname);
    }

    @Override
    public int compare(ClientPremium o1, ClientPremium o2) {
        return 0;
    }
}
