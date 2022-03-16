package in.springbootrest.SpringBootMongoDb.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.springbootrest.SpringBootMongoDb.model.Book;


@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {
  

}
