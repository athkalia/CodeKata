package codekata.babylon.com.codekata

interface Checkout {
    /**
     * Scan an individual item.
     */
    fun scan(item: Char)

    /**
     * Calculate the total price of all the items scanned.
     */
    fun total(): Int
}