package The.Geeks.task.servies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import The.Geeks.task.entities.User;
import The.Geeks.task.models.UserModel;
import The.Geeks.task.repository.UserRepo;

@Service
public class ClientServieceImp implements ClientServiece {

    @Autowired
    UserRepo clientRepo;

    public List<UserModel> fetchClients() {
        List<User> Clients = new ArrayList();
        Clients = clientRepo.findAll();
        List<UserModel> ClientsModel = new ArrayList();

        for (User c : Clients) {
            UserModel clientModel = new UserModel();
            clientModel.setId(c.getId());
            clientModel.setMobile(c.getMobile());
            clientModel.setLastName(c.getLastName());
            clientModel.setName(c.getName());

            ClientsModel.add(clientModel);

        }

        return ClientsModel;
    }

    public UserModel createClient(UserModel clientModel) {
        User client = new User();

        client.setId(clientModel.getId());
        client.setName(clientModel.getName());
        client.setMobile(clientModel.getMobile());
        client.setLastName(clientModel.getLastName());


        client = clientRepo.save(client);

        clientModel.setId(client.getId());
        return clientModel;

    }

    public UserModel updateClient(UserModel clientModel) {
        Optional<User> client =clientRepo.findById(clientModel.getId());

        client.get().setId(clientModel.getId());
        client.get().setName(clientModel.getName());
        client.get().setMobile(clientModel.getMobile());
        client.get().setLastName(clientModel.getLastName());

        clientRepo.save(client.get());

        return clientModel;

    }

}
