# BookStore
BOOKSTORE

Services prepared like below;
 

SignUp;

http://localhost:8080/api/v1/users/signup
{
  "name":"user1",
  "password":"password",
  "email":"email1@email.aaa",
  "role":"ADMIN"
}

The user is registered as uniq via email and password. I think I could not produce password hashing and jwt token generation due to the firewall of the institution I work for, but I still added the courses I studied. 
Try to add same user
 
LOGIN:

http://localhost:8080/api/v1/users/login

{
  
  "email":"email1@email.aaa",
  "password":"password"
}

 
TRY to login with not exist user
 

NEW BOOK;
http://localhost:8080/api/v1/books/newbook
{
    "isbn":"isbn",
    "title":"Book1",
    "author":"Author1",
    "price":"55",
    "stockQuantity":"2",
    "role":"ADMIN"
}
 
Try to add new book not ADMIN
 
getByIsbn:
http://localhost:8080/api/v1/books/bookbyisbn
{
  "isbn":"isbn"
}
 

Book update:
http://localhost:8080/api/v1/books/update
{
    "bookId":1,
    "isbn":"isbn3",
    "title":"Book",
    "author":"Test Author",
    "price":"100",
    "stockQuantity":"3",
    "role":"ADMIN"
}
 
ADMIN olayman bir kullanıcı ile update yapıldığında;
 

NEW ORDER;
http://localhost:8080/api/v1/orders/neworder
{
  "bookList":[
  {"isbn":"isbn1","title":"Book1","author":"author1","price":55,"stockQuantity":2}
  ],
  "totalPrice":55,
  "totalQuantity":2,
  "userId":1
} 

DELETE BOOK
http://localhost:8080/api/v1/books/delete
{
    "isbn":"isbn"
}
 

OrderByUserId;
http://localhost:8080/api/v1/orders/orderbyıd
{
  "userId":1
}
