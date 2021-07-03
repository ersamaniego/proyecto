package com.example.usuarios;

import com.example.usuarios.model.User;
import com.example.usuarios.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
	}

//	@Bean
//	@Autowired
//	CommandLineRunner runner(UserRepository userRepository) {
//		return (args) -> {
//
//			long count = userRepository.count();
//
//			if (count == 0) {
//
//				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//
//				try {
//					User user1 = new User();
//					user1.setName("Eliseo");
//					user1.setUsername("liseokpo");
//					user1.setEmail("samaniegoeliseo@gmail.com");
//					user1.setPhone("1150546474");
//					Date date = df.parse("01/07/2021");
//					user1.setCreatedAt(date);
//
//					User user2 = new User();
//					user2.setName("Zacarías");
//					user2.setUsername("zacmaster");
//					user2.setEmail("zac@gmail.com");
//					user2.setPhone("11223322");
//					user2.setWebsite("zac.samaniego");
//					Date date2 = df.parse("11/07/2020");
//					user2.setCreatedAt(date2);
//
//					userRepository.save(user1);
//					userRepository.save(user2);
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//			}
//		};
//	}
}
