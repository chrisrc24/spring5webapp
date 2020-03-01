package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

@Entity
public class Author{
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long Id;

    private String FirstName;
    private String LastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> Books = new HashSet<>();

    public Author() {
    }

    public Author(String _firstName, String _lastName) {
        this.FirstName = _firstName;
        this.LastName = _lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(final String _firstName) {
        this.FirstName = _firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(final String _lastName) {
        this.LastName = _lastName;
    }

    /**
     * @return the books
     */
    public Set<Book> getBooks() {
        return Books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(final Set<Book> _books) {
        this.Books = _books;
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
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Author other = (Author) obj;
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
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Author [Books=" + Books + ", FirstName=" + FirstName + ", Id=" + Id + ", LastName=" + LastName + "]";
    }



}