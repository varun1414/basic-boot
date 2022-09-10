# basic-boot
Basic boot application to handle reviews for hotels

## About the app architecture:

Microservices:
1. Hotel
2. User
3. Reviews

DBMS: MySql

Junit Tests:
1. Two Junit test cases for the controller of the Hotel. ( To display the concept )
2. Run the services on specified ports

Steps to run:
1. Unzip the project
2. run the 

# Functionalites and the cUrls for the REST endpoints:

1. Add new hotel:
curl --location --request POST 'localhost:8000/hotel/add' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":6,
    "name":"t3aj",
    "city":"panjim",
    "dateAvailable" : "09/09/2022",
    "roomsRequired":2,
    "star":5,
    "cost":12,
    "facility":{
        "id":10,
        "wifi":true
    }

}'

2. Update hotel:
curl --location --request PUT 'localhost:8000/hotel/update/6' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"taj",
    "city":"panjim",
    "dateAvailable" : "09/09/2022",
    "roomsRequired":2,
    "star":5,
    "cost":12,
    "facility":{
        "id":0,
        "wifi":true
    }

}'

3. Delete Hotel
curl --location --request DELETE 'localhost:8000/hotel/delete/6' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":1,
    "name":"taj",
    "city":"panjim",
    "dateAvailable" : "09/09/2022",
    "roomsRequired":2,
    "star":5,
    "cost":12,
    "facility":{
        "id":0,
        "wifi":true
    }

}'

4. Search Hotel ( query parameters include: city, date, rooms, stars, facilities(array) ) - reresponse in sorted order:

curl --location --request GET 'localhost:8000/hotel/search?city=panjim'

5. Add User
curl --location --request POST 'localhost:8080/user/add' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":1,
    "name":"tom",
    "city":"delhi"
}
'
6. Update user
curl --location --request PUT 'localhost:8080/user/update/5' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name":"pom",
    "city":"mumbai"
}
'
7. Add review
curl --location --request POST 'localhost:8888/review/add' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":33,
    "comment":"very nice",
    "rating":"2",
    "hotel":{
        "id":6
    },
    "user":{
        "id":1
    }
}'

8. Search Review ( query parameters include : hotelName, city, gender, rating):

curl --location --request GET 'localhost:8888/review/search?hotelName=taj&city=pune' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":9031,
    "comment":"very nice",
    "rating":"2",
    "hotel":{
        "id":123111
    },
    "user":{
        "id":15112111
    }
}'
