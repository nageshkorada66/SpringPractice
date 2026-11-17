package com.flm.config;

import java.net.Authenticator;

import org.jspecify.annotations.Nullable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		
		@Nullable
		String pwd1 = passwordEncoder.encode("secret");
		String pwd2 = passwordEncoder.encode("malathi");
		
		System.out.println(pwd1);
		System.out.println(pwd2);
		
		UserDetails user1 = User.builder()
								.username("nagesh")
								.password(pwd1)
								.build();
		
		UserDetails user2 = User.builder()
								.username("malathi")
								.password(pwd2)
								.build();
		
		return new InMemoryUserDetailsManager(user1,user2);
	}

	@Bean
	public SecurityFilterChain httSecurityFilterChain(HttpSecurity httpSecurity){
		
		return httpSecurity
				.authorizeHttpRequests(
						auth ->  auth.requestMatchers("/hi","/bye")
									 .authenticated()
									 .requestMatchers("/open")
									 .permitAll()
									 .requestMatchers("/noAccess")
									 .denyAll()
						
						)
					.formLogin(Customizer.withDefaults())
					.httpBasic(Customizer.withDefaults())
					.build();
	}
}
