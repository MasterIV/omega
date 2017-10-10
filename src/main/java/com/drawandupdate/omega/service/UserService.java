package com.drawandupdate.omega.service;

import com.drawandupdate.omega.Repository.UserRepository;
import com.drawandupdate.omega.UserException;
import com.drawandupdate.omega.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;
    @Autowired
    private AuthenticationManager authenticationManager;

    private void validate(String name, String pass) {
        if(StringUtils.isEmpty(name) || name.length() < 4)
            throw new UserException("Username needs to contain at least 4 Characters.");
        if(StringUtils.isEmpty(pass) || pass.length() < 5)
            throw new UserException("Password needs to contain at least 5 Characters.");
        if(repository.findByUsername(name) != null)
            throw new UserException("Username is already in use.");
    }

    public User register(String name, String pass) {
        validate(name, pass);
        User user = new User(name, encoder.encode(pass));
        return repository.save(user);
    }

    public void login(User user, String pass) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user, pass, user.getAuthorities());
        authenticationManager.authenticate(token);
        SecurityContextHolder.getContext().setAuthentication(token);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        return repository.findByUsername(login);
    }
}
