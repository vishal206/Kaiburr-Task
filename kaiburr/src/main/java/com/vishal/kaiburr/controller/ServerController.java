package com.vishal.kaiburr.controller;

import com.vishal.kaiburr.ServerRepository;
import com.vishal.kaiburr.model.ServerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class ServerController {

    @Autowired
    ServerRepository serverRepo;

//    @GetMapping("/server")
//    public List<ServerModel> getServer(){
//        return serverRepo.findAll();
//    }

    @GetMapping("/server")
    public ResponseEntity<?> getServerById(@RequestParam Optional<String> id,Optional<String> name){
        String paramValueId=id.orElse("");
        String paramValueName=name.orElse("");
        if(!paramValueId.equals("")){
            Optional<ServerModel> serverModelOptional=serverRepo.findById(paramValueId);
            if(serverModelOptional.isEmpty()){
                System.out.println("its empty!");
                return new ResponseEntity<String>("Server not found!", HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<Optional<ServerModel>>(serverModelOptional,HttpStatus.OK);
        }if(!paramValueName.equals("")){
            Optional<ServerModel> serverModelOptional=serverRepo.findByName(paramValueName);
            if(serverModelOptional.isEmpty()){
                System.out.println("its empty!!");
                return new ResponseEntity<String>("Server not found!", HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<Optional<ServerModel>>(serverModelOptional,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<List<ServerModel>>(serverRepo.findAll(),HttpStatus.OK);
        }
    }

    @DeleteMapping("/server")
    public HashMap<String,String> deleteServer(@RequestParam String id){
        serverRepo.deleteById(id);

        HashMap<String,String> resMap=new HashMap<>();
        resMap.put("ResponseMessage","Server object deleted Successfully");
        resMap.put("id",id);
        return resMap;

    }
    @PutMapping("/server")
    public ServerModel updateServer(@RequestBody ServerModel serverModel){
        return serverRepo.save(serverModel);
    }
    @PostMapping("/server")
    public ServerModel addServer(@RequestBody ServerModel serverModel){

        return serverRepo.save(serverModel);
    }
}
