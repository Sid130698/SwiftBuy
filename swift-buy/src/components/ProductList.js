import React from 'react';
const productList =[
    "Product 1",
    "Product 2",
    "Product 3"
]
let products = 
    productList.map(product=><li>{product}</li>);


function ProductList(){
    return(
        <>
        <ul>{products}</ul>
        </>
    )
}
export default ProductList;