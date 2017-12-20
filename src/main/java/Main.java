import CRUD.AuthorBean;
import CRUD.ControllerDao;
import CRUD.ControllerDao;
import CRUD.ReaderBean;
import Dao.SectionDao;
import Entity.*;

import java.text.SimpleDateFormat;
import java.util.List;

public class Main {
    public static void main(final String[] args) throws Exception {
        /*ControllerDao<Author_db> a1 =  new ControllerDao<Author_db>();
        AuthorBean ssd = new AuthorBean();
        List<Author_db> au = ssd.getAuthorById(25);;
        for(int i = 0; i<au.size(); i++){
            System.out.printf(au.get(i).getName());
        }*/

        /*AuthorBean a1 = new AuthorBean();
        Author_db author_db = new Author_db();
        author_db.setIdAuthor(57);
        author_db.setName("Иван");
        author_db.setMiddlename("Петрович");
        author_db.setSurname("Чумаков");
        author_db.setYearofbirth("1736");
        a1.updateAuthor(author_db);*/

        /*SectionDao s1 = new SectionDao();
        List<Section_db> section_dbs = s1.getAllSections();
        for(int i = 0; i<section_dbs.size(); i++){
            System.out.printf(section_dbs.get(i).getType());
        }*/



        /*ManagerDao<Section_db> s1 = new ManagerDao<Section_db>();
        Section_db section =  new Section_db();
        section.setType("Зарубежнаяllljjj");
        s1.add(section);*/
        /*ManagerDao<Book_db> b1 =  new ManagerDao<Book_db>();
        Book_db book = new Book_db();
        book.setName("Буратино");
        book.setSectionByIdSection(section);
        //book.setIdSection(4);
        book.setSize("233");
        book.setYearofwriting("1232");
        b1.add(book);*/
        /*ManagerDao<Authorsbook_db> ab1 = new ManagerDao<Authorsbook_db>();
        Authorsbook_db authorsbook_db = new Authorsbook_db();
        authorsbook_db.setIdAuthor(3);
        authorsbook_db.setIdBook(15);
        ab1.add(authorsbook_db);*/
    }
}