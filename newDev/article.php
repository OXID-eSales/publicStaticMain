<?php

namespace newDev;

/**
 * Add class comment
 */
class article
{
    /**
     * Define the margin types
     * TYPE A =  5% off
     * TYPE B = 10% off
     * TYPE_C = 20% off
     */
    const MARGIN_TYPE_A = 1;
    const MARGIN_TYPE_B = 2;
    const MARGIN_TYPE_C = 3;

    /**
     * @var float
     */
    public $_fPrice = false;

    /**
     * @var int
     */
    private $_iMarginType = null;

    /**
     * @param string $sName
     * @param float  $fPrice
     */
    public function __construct( $sName, $fPrice, $iMarginType )
    {
    $this->_sName = $sName;
    $this->_fPrice = $fPrice;
    $this->_iMarginType = $iMarginType;
    }

    /**
     * Get the
     *
     * @return int
     */
    public function getPrice()
    {
        return $this->_fPrice;
    }

    /**
     * Get the
     *
     * @return null
     */
    public function getMarginType()
    {
        return $this->_iMarginType;
    }

    /**
     * Get the
     *
     * @return null
     */
    public function getName()
    {
        return $this->_sName;
    }

}
