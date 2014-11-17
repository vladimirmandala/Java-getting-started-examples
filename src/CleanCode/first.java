package CleanCode;

public class first {

	/*
	public static String testtableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
		WikiPage wikipage = pageData.getWikiPage();
		StringBuffer buffer = new StringBuffer();
		if (pageData.hasAttribute("Test")){
		  if (includeSuiteSetup){
		     WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, wikiPage);
			if (suiteSetup !=null){
				WikiPagePath pagePath = suiteSetup.getPageCrawler().getPullPath(suiteSetup);
				String pagePathName = PathParser.render(pagePath);
				buffer.append("!include - setup .")
					  .append(pagePathName)
					  .append("/n");
			}
		  }
		  WikiPage setup = PageCrawlerImpl.getInheritedPage("SetUp",wikipage);
		  if (suiteTearDown != null){
			WikiPagePath pagePath = suiteTearDown.getPageCrawler().getFullPath(suiteTearDown);
			String pagePathName = PathParser.render(patePath);
			buffer.append("include - teardown .")
				  .append(pagePathName)
				  .append("\n");
		  }
		 }
		}
		 pageData.setContent(buffer.toString());
		 return pageData.getHTML();
		}
}

public static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) throws Exception {
boolean isTestPage = pageData.hasAttribute("Test");
if (isTestPage) {
  WikiPage testPage = pageData.getWikiPage();
  StringBuffer newPageContent = new StringBuffer();
  includeSetupPages(testPage, newPageContent, isSuite);
  newPageContent.append(pageData.getContent());
  includeTeardownPages(testPage,newPageContent, isSuite);
  pageData.setContent(newPageContent.toString());
 }
 return pageData.getHtml();
}

public static String renderPageWithSetupsAndTeardowns(PageData pageData, boolean isSuite) throws Exception {
if (isTestPage(pageData))
	includeSetupAndTeardownPages(pageData, isSuite);
return pageData.getHtml();
}
*/
}