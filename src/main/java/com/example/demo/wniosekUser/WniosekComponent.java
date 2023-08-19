package com.example.demo.wniosekUser;



import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class WniosekComponent {

    @Bean(name = "wniosekCommandLineRunner")

    CommandLineRunner wniosekCommandLineRunner(WniosekRepository repository){



            return args -> {
                if (repository.count() == 0) { // Sprawdź czy tabela jest pusta
                    Wniosek w1 = new Wniosek
                            ("ABC",
                                    50, 5000,
                                    5, 15,
                                    50, 3
                            );
                    repository.save(w1);

                    Wniosek w2 = new Wniosek(
                            "ABC",
                            500, 5000,
                            15, 15,
                            170, 3
                    );
                    repository.save(w2);

                    Wniosek w3 = new Wniosek(
                            "ABC",
                            5000, 5000,
                            30, 15,
                            200, 3
                    );
                    repository.save(w3);
                }
        };
    }
}
