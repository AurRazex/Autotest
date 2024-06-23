import Unit_Test.Lesson4.Book;
import Unit_Test.Lesson4.BookRepository;
import Unit_Test.Lesson4.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BookServiceTest {

    @Test
    public void testFindBookById() {

        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findById("15")).thenReturn(new Book("15", "Adventure Electronics", "Evgeniy Veltistov"));
        BookService bookService = new BookService(mockRepository);
        Book result = bookService.findBookById("15");
        assertEquals("Adventure Electronics", result.getTitle());
        assertEquals("Evgeniy Veltistov", result.getAuthor());
    }


    @Test
    public void testFindAllBooks() {

        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findAll()).thenReturn(List.of(new Book("15", "Adventure Electronics", "Evgeniy Veltistov")));
        BookService bookService = new BookService(mockRepository);
        List<Book> result = bookService.findAllBooks();
        assertEquals(1, result.size());
        assertEquals("Adventure Electronics", result.get(0).getTitle());
        assertEquals("Evgeniy Veltistov", result.get(0).getAuthor());

    }
}