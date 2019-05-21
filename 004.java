int adjacentElementsProduct(int[] inputArray) {
    Integer maxProduct = null;
    
    int limitPosition = inputArray.length-1;
    int productElements;
    for ( int i = 0; i < limitPosition; ){
        productElements = inputArray[ i ]*inputArray[ ++i ];
        if ( maxProduct == null || productElements > maxProduct ){
            maxProduct = productElements;
        }
    }
    
    System.out.println( "adjacentElementsProduct(inputArray) = " + maxProduct );
    
    return maxProduct;
}
