package ibs.hilton.ase.Controller;

import ibs.hilton.ase.Domain.HumanDoman;
import ibs.hilton.ase.Service.HumanDomainService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HumanDomainController {

    @Autowired
    HumanDomainService humanDomainService;

    @PostMapping("/addGuest")
    public String GuestAddController(@RequestBody HumanDoman humanDoman){
        return humanDomainService.saveGuest(humanDoman);

    }
    @PostMapping("/verifyPersonal")
    public String personalVerifyController(@RequestBody HumanDoman humanDoman){
        String loginName=humanDoman.getName();
        String loginPassword=humanDoman.getPassword();
        String loginRole=humanDoman.getRole();
        boolean status=humanDomainService.verifyGuest(loginName,loginPassword,loginRole);
        if(status=true)
            return "verified";
        else return "not verified";
    }
    @GetMapping("/getRegisteredUsers")
    public List<HumanDoman> getRegisteredUsersController(){
        return humanDomainService.getRegisteredUsersService();
    }
 }
