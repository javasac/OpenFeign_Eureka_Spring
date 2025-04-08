package com.sachin.OpenFeign.client;
import com.sachin.OpenFeign.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@FeignClient("Address")
@Component
public interface AddressClient
{
    @RequestMapping("/allAddress")
    public List<Address> getAllAddress();
}
