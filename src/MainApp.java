import oxidesales.article;
import oxidesales.customer;
import oxidesales.selling;

public class MainApp {

	public static void main(String[] args) {

		String sName = "me@myself";

		article oArticle1 = new article( "art1", 0.12, article.MARGIN_TYPE_A );
		selling oSelling1 = new selling( oArticle1, 30 );

		article oArticle2 = new article( "art2", 1.28, article.MARGIN_TYPE_B);
		selling oSelling2 = new selling( oArticle2, 20 );

		article oArticle3 = new article( "art3", 0.55, article.MARGIN_TYPE_C );
		selling oSelling3 = new selling( oArticle3, 25 );

		article oArticle4 = new article( "art4", 0.10, article.MARGIN_TYPE_A );
		selling oSelling4 = new selling( oArticle4, 10 );
		
		selling sellings[] = {oSelling1, oSelling2, oSelling3, oSelling4};
		String sBill = customer.getBill( sName, sellings);

		System.out.println(sBill);

	}

}
