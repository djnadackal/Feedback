package ibs.hilton.ase.Repository;

import ibs.hilton.ase.Domain.HumanDoman;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HumanDomainRepository extends MongoRepository<HumanDoman,Integer> {
    @Query("{'name':?0}")
    public Optional<HumanDoman> findByName(String loginName);

}
