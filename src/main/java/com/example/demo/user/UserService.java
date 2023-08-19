package com.example.demo.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    //met. znajduje usera o wskazanym mail-u
//    public void getUser(String email){
//        boolean exists=userRepository.existsByEmail(email);
//        if(!exists){
//            throw new IllegalStateException(
//                    "wniosek with this id is not exists");
//        }
//        userRepository.findByEmail(email);
//    }

}
