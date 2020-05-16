package in.abhishek.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.abhishek.onlinebookstore.Entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategories" , path="book-category")
public interface bookCategoryRepository extends JpaRepository<BookCategory, Integer>
{

}
