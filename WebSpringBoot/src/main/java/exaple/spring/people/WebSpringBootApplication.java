package exaple.spring.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.apache.log4j.Logger;
@SpringBootApplication(scanBasePackages={"exaple.spring.people"})
@EntityScan(basePackages= {"exaple.spring.people.entity"})
public class WebSpringBootApplication /* extends WebSecurityConfigurerAdapter */ {

	// log4j
static Logger log = Logger.getLogger(WebSpringBootApplication.class);
	
	public static void main(String[] args) {
		
	    log.info("check infor");
	    log.debug("check debug");
	    log.error("check error");
		
		
		SpringApplication.run(WebSpringBootApplication.class, args);
	}
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().
	 * formLogin().loginPage("/login").defaultSuccessUrl("/").failureUrl(
	 * "/login?e=error").permitAll().and().logout().permitAll(); }
	 * 
	 * @Override public void configure(WebSecurity web) throws Exception {
	 * web.ignoring().antMatchers("/fonts/**","/images/**","/vendor/**"); }
	 * 
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception {
	 * auth.inMemoryAuthentication().withUser("admin").password("123").roles("ADMIN"
	 * ); }
	 */
	 

}

