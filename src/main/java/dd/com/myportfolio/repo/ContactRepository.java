package dd.com.myportfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dd.com.myportfolio.entity.ContactInfo;

@Repository
public interface ContactRepository extends JpaRepository<ContactInfo, Long>{

}
