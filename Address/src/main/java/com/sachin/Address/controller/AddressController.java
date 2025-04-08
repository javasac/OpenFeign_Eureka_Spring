package com.sachin.Address.controller;
import com.sachin.Address.model.Address;
import com.sachin.Address.repos.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AddressController
{
    @Autowired
    private AddressRepository addRepo;

    @GetMapping("/allAddress")
    public List<Address> allAddress()
    {
        return addRepo.findAll();
    }

    @PutMapping("/update")
    public Address update(@RequestBody Address add)
    {
        addRepo.save(add);
        return add;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteAddress(@PathVariable int id)
    {
        addRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/address/find/{id}")
    public Address findAddress(@PathVariable int id)
    {
        return addRepo.findById(id).orElse(null);
    }

    @PostMapping("/save")
    @ResponseBody
    public Address saveAddress(@RequestBody Address add)
    {
        addRepo.save(add);
        return add;
    }
}

