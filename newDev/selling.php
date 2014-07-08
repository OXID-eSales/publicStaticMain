<?php

namespace newDev;

/**
 * Add class comment
 */
class selling
{
    /**
     * @var article
     */
    private $_oArticle = null;

    /**
     * @var int
     */
    public $amount = null;

    /**
     * @param article $oArticle
     * @param int     $iAmount
     */
    public function __construct( $oArticle, $iAmount )
    {
        $this->_oArticle = $oArticle;
        $this->amount = $iAmount;
    }

    /**
     * Get the
     *
     * @return int
     */
    public function getAmount()
    {
        return $this->amount;
    }

    /**
     * Get the
     *
     * @return article
     */
    public function getArticle()
    {
        return $this->_oArticle;
    }

}

/**
 * Add class comment
 */
class customer
{
    /**
     * @var selling
     */
    private $oSelling = null;

    public static function getBill( $sName, $aSellings )
    {
        $fTotal = 0.0;
        $sMessage = 'Bill for the customer ' . $sName . "\n\n";

        /** @var $oSelling selling */
        foreach( $aSellings as $oSelling ) {
            $sMessage .= $oSelling->amount . ' x ' . $oSelling->getArticle()->getName() .
                         ' a ' . $oSelling->getArticle()->getPrice() .
                         ' = ' . $oSelling->amount * $oSelling->getArticle()->getPrice() . "\n";
            $fSubTotal = $oSelling->amount * $oSelling->getArticle()->getPrice();
            if ( 20 <= $oSelling->amount ) {
                switch ( $oSelling->getArticle()->getMarginType() ) {
                    case article::MARGIN_TYPE_A:
                        $sMessage .= 'Sales discount ( 5% ): -' . ( $oSelling->amount * $oSelling->getArticle()->getPrice() * 5 ) / 100 . "\n";
                        $fSubTotal -= ( $oSelling->amount * $oSelling->getArticle()->getPrice() * 5 ) / 100;
                        break;
                    case article::MARGIN_TYPE_B:
                        $sMessage .= 'Sales discount ( 10% ): -' . ( $oSelling->amount * $oSelling->getArticle()->getPrice() * 10 ) / 100 . "\n";
                        $fSubTotal -= ( $oSelling->amount * $oSelling->getArticle()->getPrice() * 10 ) / 100;
                        break;
                    case article::MARGIN_TYPE_C:
                        $sMessage .= 'Sales discount ( 20% ): -' . ( $oSelling->amount * $oSelling->getArticle()->getPrice() * 20 ) / 100 . "\n";
                        $fSubTotal -= ( $oSelling->amount * $oSelling->getArticle()->getPrice() * 20 ) / 100;
                        break;
                }
            }
            $fTotal += $fSubTotal;
        }

        $sMessage .= "\n\nInvoice total: $fTotal\n\n";

        return $sMessage;
    }

    /**
     * @return article
     */
    private function _getArticleFromSelling()
    {
        return $this->oSelling->getArticle();
    }
}
