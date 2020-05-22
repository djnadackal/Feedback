package ibs.hilton.ase.Service;

import ibs.hilton.ase.Domain.HumanDoman;
import ibs.hilton.ase.Repository.HumanDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HumanDomainService {

    @Autowired
    HumanDomainRepository humanDomainRepository;


    public String saveGuest(HumanDoman humanDoman){
        humanDomainRepository.save(humanDoman);
       return "Guest Added" ;
    }
    public boolean verifyGuest(String loginName,String loginPassword,String loginRole){
        boolean status;
        Optional<HumanDoman> humanDomainArrayList=humanDomainRepository.findByName(loginName);
        if(humanDomainArrayList.isPresent())
            {

                String guestRole=humanDomainArrayList.get().getRole();
                String guestName=humanDomainArrayList.get().getName();
                String guestPassword=humanDomainArrayList.get().getPassword();
                if(guestName.equals(loginName)&&guestPassword.equals(loginPassword)&&guestRole.equals(loginRole)){
                   status=true;
                }
                else status=false;
            }
        else status=false;
        return  status;
    }
    public List<HumanDoman> getRegisteredUsersService(){
        return humanDomainRepository.findAll();
    }



}
