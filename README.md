

# Getting Started 
```
to run the application you need to run this command in terminal :

docker-compose up --build 
```

### Use Postmen
```
now you need to open posten and put this url : 

Http Method : mast be a GET requst 

URL : http://localhost:8000/api/v1/convertLetters

now you need to add your characters in the query params like : 

 - hi
 - abc
 
 the Key in the must be  : word
 
 you can look also in the class 'natoWordRunner.java' you have some examples ther for the values
 
 
For exaple : 
URL : http://localhost:8000/api/v1/convertLetters?word=abfghd
your result should be : Alpha Bravo Foxtrot Golf Hotel Delta
```





