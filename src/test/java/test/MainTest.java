package test;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.pojo.PageInfo;
import com.service.PeopleService;
import com.service.impl.PagePeopleServiceImpl;

public class MainTest {

	public MainTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testSql() {
		try {
			PeopleService peopleService = new PagePeopleServiceImpl();
			int pageSize = 2;
			int pageNum = 1;

			PageInfo showPage = peopleService.showPage(pageSize, pageNum);
			System.out.println(showPage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testRowBounds() {
		try {
			PeopleService peopleService = new PagePeopleServiceImpl();
			int pageSize = 2;
			int pageNum = 1;

			PageInfo showPage = peopleService.showPage1(pageSize, pageNum);
			System.out.println(showPage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
