URL For Order Service

URL Insert Order : http://localhost:8081/order-service/postOrder
Body : 
{
  "customerName": "Pavan Kumar",
  "orderDate": "2014-01-01T23:28:56.782Z",
  "shippingAddress": "Ang Mo Kio",
  "totalVal": 200,
  "orderItems": [
    {
      "productCode": "Product Code3",
      "productName": "Product Name3",
      "quantity": 3
    },
    {
      "productCode": "Product Code4",
      "productName": "Product Name4",
      "quantity": 4
    }
  ]
}


URL Get Orders : http://localhost:8081/order-service/getOrders
