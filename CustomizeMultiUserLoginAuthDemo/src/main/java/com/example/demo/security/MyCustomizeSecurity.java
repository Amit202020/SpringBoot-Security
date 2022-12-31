package com.example.demo.security;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyCustomizeSecurity {
	
	/*@Bean
	@Order(SecurityProperties.BASIC_AUTH_ORDER)
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		/*http.authorizeRequests().antMatchers("/allEmp").authenticated()
		.antMatchers("/hello").permitAll()
		.and().formLogin()
		.and().httpBasic();
		return http.build();*/
		
		/*http.authorizeRequests().anyRequest().denyAll()
		.and().formLogin()
		.and().httpBasic();
		return http.build();*/
		
		/*http.authorizeRequests().anyRequest().permitAll()
		.and().formLogin()
		.and().httpBasic();
		return http.build();*/
	//}


		@Bean
		public InMemoryUserDetailsManager userDetailsService(){
		
			    UserDetails admin=User.withDefaultPasswordEncoder()
		           .username("admin")
			       .password("Welcome1")
			       .authorities("admin")
			       .build();
		        UserDetails user=User.withDefaultPasswordEncoder()
		           .username("user")
			       .password("Welcome1")
			       .authorities("read")
			       .build();
		        
			return new InMemoryUserDetailsManager(admin,user);
		}




}
