package com.example.hibernate;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages={"com.example.hibernate"})
@EntityScan(basePackages= {"com.example.hibernate.entity"})
public class WebBaseFuntionApplication/* extends WebSecurityConfigurerAdapter */{

	public static void main(String[] args) {
		SpringApplication.run(WebBaseFuntionApplication.class, args);
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

