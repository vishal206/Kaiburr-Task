package com.vishal.kaiburr;

import com.vishal.kaiburr.model.ServerModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ServerRepository extends MongoRepository<ServerModel,String> {

    Optional<ServerModel> findByName(String name);
}
