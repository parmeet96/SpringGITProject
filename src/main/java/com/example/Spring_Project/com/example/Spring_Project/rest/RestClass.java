package com.example.Spring_Project.com.example.Spring_Project.rest;


import com.example.Spring_Project.com.example.Spring_Project.interfaces.UserRepository;
import com.example.Spring_Project.com.example.Spring_Project.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/hello")
@RestController
public class RestClass
{

    private final UserRepository userRepository;

    public RestClass(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String returnString()
    {
        return "working";
    }

    @RequestMapping(value ="/getAllItem", method = RequestMethod.GET)
    public List <Item> getAllItem()
    {
        System.out.println("Inside the getAllUser method");
        return userRepository.findAll();
    }


//    @RequestMapping(value="/{ItemId}",method = RequestMethod.GET )
//    public Item getItem(@PathVariable String itemName)
//    {
//        System.out.println("Inside the getItem method with ItemName "+itemName);
//        return userRepository.find
//    }

    @RequestMapping(value="/add" ,method = RequestMethod.POST  )
    public Item addUser(@RequestBody Item item)
    {
        System.out.println("Inside the addUser "+item.toString());
        return userRepository.save(item);

    }
}
