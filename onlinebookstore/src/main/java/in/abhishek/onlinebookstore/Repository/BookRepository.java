package in.abhishek.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhishek.onlinebookstore.Entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> 
{

}
