package The.Geeks.task.servies;

import java.util.List;

import org.springframework.stereotype.Service;

import The.Geeks.task.models.ClientModel;

@Service
public interface ClientServiece {
    public List<ClientModel> fetchClients();
    
    public ClientModel createClient(ClientModel clientModel);

        
}
