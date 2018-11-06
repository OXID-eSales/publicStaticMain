package oxidesales;

public class customer {

    private selling oSelling = null;

    public static String getBill(String sName, selling[] aSellings )
    {
        Double fTotal = 0.0;
        String sMessage = "Bill for the customer " + sName + "\n\n";

        for(selling oSelling: aSellings) {
            sMessage += oSelling.amount + " x " + oSelling.getArticle().getName() +
                         " a " + oSelling.getArticle().getPrice() +
                         " = " + oSelling.amount * oSelling.getArticle().getPrice() + "\n";
            Double fSubTotal = oSelling.amount * oSelling.getArticle().getPrice();
            if ( 20 <= oSelling.amount ) {
                switch ( oSelling.getArticle().getMarginType() ) {
                    case article.MARGIN_TYPE_A:
                        sMessage += "Sales discount ( 5% ): -" + ( oSelling.amount * oSelling.getArticle().getPrice() * 5 ) / 100 + "\n";
                        fSubTotal -= ( oSelling.amount * oSelling.getArticle().getPrice() * 5 ) / 100;
                        break;
                    case article.MARGIN_TYPE_B:
                        sMessage += "Sales discount ( 10% ): -" + ( oSelling.amount * oSelling.getArticle().getPrice() * 10 ) / 100 + "\n";
                        fSubTotal -= ( oSelling.amount * oSelling.getArticle().getPrice() * 10 ) / 100;
                        break;
                    case article.MARGIN_TYPE_C:
                        sMessage += "Sales discount ( 20% ): -" + ( oSelling.amount * oSelling.getArticle().getPrice() * 20 ) / 100 + "\n";
                        fSubTotal -= ( oSelling.amount * oSelling.getArticle().getPrice() * 20 ) / 100;
                        break;
                }
            }
            fTotal += fSubTotal;
        }

        sMessage += "\n\nInvoice total: " + fTotal + "\n\n";

        return sMessage;
    }

    /**
     * @return article
     */
    private article _getArticleFromSelling()
    {
        return this.oSelling.getArticle();
    }

}
