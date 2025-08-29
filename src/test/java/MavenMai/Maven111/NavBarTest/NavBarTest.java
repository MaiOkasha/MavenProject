package MavenMai.Maven111.NavBarTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import MavenProject.Maven111.Pages.GridPage;
import MavenProject.Maven111.Pages.ListPage;

public class NavBarTest extends TestBase {
	private ListPage listPage;
	private GridPage gridPage;

	@BeforeClass
	public void init() {
		listPage = new ListPage(driver);
		gridPage = new GridPage(driver);
	}

	@Test(priority = 1)
	public void testSelectFromList() {
		listPage.navigateToList();
		listPage.selectListItem();
		Assert.assertTrue(listPage.isListItemActive(), "List item 'Dapibus ac facilisis in' is not active.");
	}

	@Test(priority = 2)
	public void testSelectFromGrid() {
		gridPage.navigateToGrid();
		gridPage.selectGridItem();
		Assert.assertTrue(gridPage.isGridItemActive(), "Grid item 'Three' is not active.");
	}
}