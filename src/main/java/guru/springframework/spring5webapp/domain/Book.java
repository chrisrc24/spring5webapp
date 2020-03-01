package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinTable(name= "author_book"
                , joinColumns = @JoinColumn(name="book_id")
                , inverseJoinColumns = @JoinColumn(name="author_id"))
    private Long Id;
    private String Title;
    private String Isbn;

    @ManyToMany
    @JoinTable(name="author_book")
    private Set<Author> authors = new HashSet<>();
    
    public Book() {
    }

    /**
     * @param title
     * @param isbn
     */
    public Book(String _title, String _isbn) {
        Title = _title;
        Isbn = _isbn;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(final String _title) {
        Title = _title;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return Isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(final String _isbn) {
        Isbn = _isbn;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return Id;
    }

    /**
     * @param id the id to set
     */
    public void setId(final Long id) {
        Id = id;
    }

    /**
     * @return the authors
     */
    public Set<Author> getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(final Set<Author> authors) {
        this.authors = authors;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Book other = (Book) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Book [Id=" + Id + ", Isbn=" + Isbn + ", Title=" + Title + ", authors=" + authors + "]";
    }

}