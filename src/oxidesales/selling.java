package oxidesales;

public class selling
{
    private article _oArticle = null;
    public Integer amount = null;

    /**
     * @param article oArticle
     * @param int     iAmount
     */
    public selling(article oArticle, Integer iAmount )
    {
        this._oArticle = oArticle;
        this.amount = iAmount;
    }

    /**
     * Get the
     *
     * @return int
     */
    public Integer getAmount()
    {
        return this.amount;
    }

    /**
     * Get the
     *
     * @return article
     */
    public article getArticle()
    {
        return this._oArticle;
    }

}
