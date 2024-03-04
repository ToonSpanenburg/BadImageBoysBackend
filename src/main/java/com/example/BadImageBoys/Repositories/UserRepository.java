package com.example.BadImageBoys.Repositories;

import com.example.BadImageBoys.Models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User, Long>
{
}
