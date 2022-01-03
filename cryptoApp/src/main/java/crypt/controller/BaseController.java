package crypt.controller;

import crypt.entities.Portfolio;
import crypt.services.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BaseController {
    @Autowired
    CryptoService cryptoService;

    @GetMapping("/getUser/{id}")
    public ResponseEntity<Portfolio> getPortfolio(@PathVariable int id){
        Portfolio portfolio =  cryptoService.getPortfolio(id);
        if(portfolio== null){
            return new ResponseEntity("Portfolio not found", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(portfolio);
    }
}
