package com.example.demo.user;



import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserComponent {


    @Bean(name = "userCommandLineRunner")
    CommandLineRunner userCommandLineRunner(UserRepository userRepository){

            return args -> {
                if (userRepository.count() == 0) { // Sprawdź czy tabela jest pusta
                    UserF u1 = new UserF
                            ("admin@wp.pl",
                                    "haslo1"
                            );
                    userRepository.save(u1);

                    UserF u2 = new UserF
                            ("it1@wp.pl",
                                    "haslo2"
                            );
                    userRepository.save(u2);

                    UserF u3 = new UserF
                            ("it2@wp.pl",
                                    "haslo3"
                            );
                    userRepository.save(u3);
                }

        };
    }
}
