package in.abhishek.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.abhishek.onlinebookstore.Entity.Book;

@CrossOrigin("*") //you can put * instead of this
public interface BookRepository extends JpaRepository<Book, Integer> 
{

}
