package pl.opole.uni.springWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.opole.uni.springWebApp.models.UserAcount;

@Repository
public interface IUserAcountRepository extends JpaRepository<UserAcount, Long> {
  UserAcount findByUsername(String username);
}
