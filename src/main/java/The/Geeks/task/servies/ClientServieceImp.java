package The.Geeks.task.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import The.Geeks.task.entities.Client;
import The.Geeks.task.models.ClientModel;
import The.Geeks.task.repository.clientRepo;

@Service
public class ClientServieceImp implements ClientServiece {

    @Autowired
    clientRepo clientRepo;

    public List<ClientModel> fetchClients() {
        List<Client> Clients = new ArrayList();
        Clients = clientRepo.findAll();
        List<ClientModel> ClientsModel = new ArrayList();

        for (Client c : Clients) {
            ClientModel clientModel = new ClientModel();
            clientModel.setId(c.getId());
            clientModel.setMobile(c.getMobile());
            clientModel.setLastName(c.getLastName());
            clientModel.setName(c.getName());

            ClientsModel.add(clientModel);

        }

        return ClientsModel;
    }

    public ClientModel createClient(ClientModel clientModel) {
        Client client = new Client();

        client.setId(clientModel.getId());
        client.setName(clientModel.getName());
        client.setMobile(clientModel.getMobile());
        client.setLastName(clientModel.getLastName());


        client = clientRepo.save(client);

        clientModel.setId(client.getId());
        return clientModel;

    }

    public ClientModel updateClient(ClientModel clientModel) {
        Optional<Client> client =clientRepo.findById(clientModel.getId());

        client.get().setId(clientModel.getId());
        client.get().setName(clientModel.getName());
        client.get().setMobile(clientModel.getMobile());
        client.get().setLastName(clientModel.getLastName());

        clientRepo.save(client.get());

        return clientModel;

    }

}
