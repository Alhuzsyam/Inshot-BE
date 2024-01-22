# Inshot-BE

This is CRUD Using Spring boot Framework and implement myBatis as ORM
First clone the Repo using git clone command
after that u can impot the sql file to your local computer and edit the sql connection at properties file

# How To Use API
<b> Insert data to database </b>
Methode | #Post 
--- | ---
Path | http://localhost:8080/api/employee/insert

# Body:
`{
        "name": "Alhuzwiri ",
        "phone": "083XXXXXXX",
        "position": "UX Designer",
        "email": "example@hotmail.com"
}`


<b> Edit data </b>
Methode | #Put 
--- | ---
Path | http://localhost:8080/api/employee/update

# Body :

`{
        "Id":29,
        "name": "Alhuzwiri ",
        "phone": "083XXXXXXX",
        "position": "UX Designer",
        "email": "example@hotmail.com"
}`

<b> Get All data </b>
Methode | #GET 
--- | ---
Path | http://localhost:8080/api/employee/getall

<b> Delete data by ID </b>
Methode | #Delete
http://localhost:8080/api/employee/delete/19

