package ch.makery.shop.model;
/**
 * Created by Wojtek on 26.03.2017.
 */
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 *
 * @author Marco Jakob
 */
@XmlRootElement(name = "books")

public class BookListWrapper {
    private List<Product> books;

    @XmlElement(name = "book")
    public List<Product> getBooks() {
        return books;
    }

    public void setBooks(List<Product> books) {
        this.books = books;
    }
}
