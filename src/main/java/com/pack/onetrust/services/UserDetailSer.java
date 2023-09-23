package com.pack.onetrust.services;

import com.pack.onetrust.models.User;
import com.pack.onetrust.repos.UserRepository;
import com.pack.onetrust.security.UserDet;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailSer implements UserDetailsService {
    private UserRepository userRepository;
    public UserDetailSer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);
        if (user.isEmpty()) {
            throw new UsernameNotFoundException("User not found!");
        }
        return new UserDet(user.get());
    }
}
