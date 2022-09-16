package The.Geeks.task.servies;

import java.util.List;

import org.springframework.stereotype.Service;

import The.Geeks.task.models.UserModel;

@Service
public interface ClientServiece {
    public List<UserModel> fetchClients();
    
    public UserModel createClient(UserModel clientModel);

        
}
