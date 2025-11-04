package com.example.phonenumber.Service;

import com.example.phonenumber.Model.User;
import com.example.phonenumber.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

   public List<User> getAllList()
    {
        return repo.findAll();
    }

  public User save(User user)
  {
        return repo.save(user);
  }

  public void delete(String id)
  {
      repo.deleteById(id);
  }


  public User update(User user)
  {
      return repo.save(user);
  }
}
