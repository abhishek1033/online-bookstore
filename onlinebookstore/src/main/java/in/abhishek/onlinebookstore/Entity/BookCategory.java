package in.abhishek.onlinebookstore.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="BOOK_CATEGORY")
@Getter
@Setter
@ToString
public class BookCategory
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer ID;
	
	@Column(name="CATEGORY_NAME")
	private String CATEGORY_NAME;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private Set<Book> book;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getCATEGORY_NAME() {
		return CATEGORY_NAME;
	}

	public void setCATEGORY_NAME(String cATEGORY_NAME) {
		CATEGORY_NAME = cATEGORY_NAME;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}
	
	
}
