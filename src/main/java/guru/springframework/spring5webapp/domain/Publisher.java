package guru.springframework.spring5webapp.domain;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Name;
    private String Address1;
    private String City;
    private String State;
    private String Zip;

    /**
     * 
     */
    public Publisher() {
    }

    /**
     * @param id
     * @param name
     * @param address1
     * @param city
     * @param state
     * @param zip
     */
    public Publisher(String name, String address1, String city, String state, String zip) {
        Name = name;
        Address1 = address1;
        City = city;
        State = state;
        Zip = zip;
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
        result = prime * result + ((Address1 == null) ? 0 : Address1.hashCode());
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
        Publisher other = (Publisher) obj;
        if (Address1 == null) {
            if (other.Address1 != null)
                return false;
        } else if (!Address1.equals(other.Address1))
            return false;
        return true;
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
    public void setId(Long id) {
        Id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return Address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        Address1 = address1;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return City;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        City = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return State;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        State = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return Zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        Zip = zip;
    }


    

}