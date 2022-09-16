package The.Geeks.task.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import The.Geeks.task.models.ProductModel;
import The.Geeks.task.models.UserModel;
import The.Geeks.task.servies.ClientServieceImp;
import The.Geeks.task.servies.ProductServiesImp;

@RestController
@RequestMapping("/api/v1")

public class ClientController {
    @Autowired
    ClientServieceImp clientServieceImp;
    @RequestMapping(value = "/fetchClients", method = RequestMethod.GET)
    public Object fetchClients() {

        return clientServieceImp.fetchClients();

    }
    
    @RequestMapping(value = "/createClient", method = RequestMethod.POST)
    public Object createClient(@RequestBody UserModel clientModel) {

        return clientServieceImp.createClient(clientModel);

    }

    @RequestMapping(value = "/updateClient", method = RequestMethod.POST)
    public Object updateClient(@RequestBody UserModel clientModel) {

        return clientServieceImp.updateClient(clientModel);

    }
}
