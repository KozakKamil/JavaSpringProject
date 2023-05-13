package pl.opole.uni.springWebApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.opole.uni.springWebApp.models.UserAcount;
import pl.opole.uni.springWebApp.repositories.IUserAcountRepository;

@Service
public class UserAcountService extends MainService<UserAcount, IUserAcountRepository> implements UserDetailsService {
  @Autowired
  IUserAcountRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    // TODO Auto-generated method stub
    return userRepository.findByUsername(username);
  }

  public void saveUser (UserAcount user) {
    userRepository.save(user);
  }

}
