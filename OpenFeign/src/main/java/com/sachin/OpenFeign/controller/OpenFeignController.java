package com.sachin.OpenFeign.controller;
import com.sachin.OpenFeign.client.AddressClient;
import com.sachin.OpenFeign.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class OpenFeignController
{
    @Autowired
    private AddressClient addressClient;

    @GetMapping("/allAddress")
    public List<Address> getAddressObj()
    {
        System.out.println("in Open Feign Client");
        return addressClient.getAllAddress();
    }
}
