package com.sachin.Address.repos;
import com.sachin.Address.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer>
{
}
