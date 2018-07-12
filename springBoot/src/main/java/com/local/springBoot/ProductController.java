package com.local.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    
    @RequestMapping(value = "/save", method = RequestMethod.POST,headers = {"content-type=application/json"})
    public String save(@RequestBody Items item) {
    	System.out.println("P**********"+item.getitemImage());
        productRepository.save(item);
      return "Inserted Successfully"+item.getId();
    }
    @RequestMapping(value = "/getProduct/{id}", method = RequestMethod.GET)
    public Object getAllUserSettings(@PathVariable String id) {
    	Items product = productRepository.findOne(id);
        if (product != null) {
            return product;
        } else {
            return "User not found.";
        }
    }
//    public Product getProduct(@PathParam("productName") String productName) {
//        return productRepository.findOne(productName);
//    }
//    
}