package oxidesales;

public class article
{
    /**
     * Define the margin types
     * TYPE A =  5% off
     * TYPE B = 10% off
     * TYPE_C = 20% off
     */
    public static final int MARGIN_TYPE_A = 1;
    public static final int MARGIN_TYPE_B = 2;
    public static final int MARGIN_TYPE_C = 3;

    
    public String _sName = null;
    public Double _fPrice = 0.0;
    private Integer _iMarginType = null;

    /**
     * @param string $sName
     * @param float  $fPrice
     */
    public article(String sName, Double fPrice, Integer iMarginType )
    {
    	this._sName = sName;
    	this._fPrice = fPrice;
    	this._iMarginType = iMarginType;
    }

    /**
     * Get the
     * @return 
     *
     * @return int
     */
    public Double getPrice()
    {
        return this._fPrice;
    }

    /**
     * Get the
     *
     * @return null
     */
    public Integer getMarginType()
    {
        return this._iMarginType;
    }

    /**
     * Get the
     *
     * @return null
     */
    public String getName()
    {
        return this._sName;
    }

}
