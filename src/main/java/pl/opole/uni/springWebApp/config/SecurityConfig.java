package pl.opole.uni.springWebApp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.opole.uni.springWebApp.controllers.AcountController;
import pl.opole.uni.springWebApp.models.UserAcount;
import pl.opole.uni.springWebApp.services.UserAcountService;

@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  UserAcountService userAcountService;

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception
  {
    auth.userDetailsService(userAcountService);
  }

  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception
  {
    httpSecurity
      .httpBasic()
      .and()
      .csrf().disable()
      .authorizeRequests()
      .antMatchers(HttpMethod.GET,"/Product").permitAll();
  }

  @Bean
  public PasswordEncoder passwordEncoder()
  {
    return new BCryptPasswordEncoder();
  }

	@EventListener(ApplicationReadyEvent.class)
	public void establishUsers()
	{
    //userAcountService.saveUser(new UserAcount("michal", passwordEncoder().encode("michal"), "ROLE_USER"));
    //userAcountService.saveUser(new UserAcount("admin", passwordEncoder().encode("admin"), "ROLE_ADMIN"));
    //userAcountService.saveUser(new UserAcount("jan", passwordEncoder().encode("jan"), "ROLE_MODERATOR"));
    //userAcountService.saveUser(new UserAcount("kuba", passwordEncoder().encode("kuba"), "ROLE_USER"));
	}

//  @Override
//  protected void configure(HttpSecurity http) throws Exception {
//    http
//      .authorizeRequests()
//      .anyRequest().authenticated()
//      .and()
//      .httpBasic();
//  }
//
//
//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    //jak pobrać użytkowników i ich dodać?
//
//    auth.inMemoryAuthentication()
//      .withUser("kamil@example.org")
//      .password("{noop}xxx")
//      .roles("USER")
//      .and()
//      .withUser("admin")
//      .password("{noop}xxx")
//      .roles("ADMIN");
//  }
}
