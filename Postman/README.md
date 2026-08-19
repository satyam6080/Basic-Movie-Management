# Postman API Testing

This folder contains the Postman collection used to test the Movie Management REST API.

## Base URL

http://localhost:8080

## APIs

### Get All Movies

GET `/movie`

### Get Movie By ID

GET `/movie/{id}`

Example:

`GET /movie/1`

### Search Movie By Name

GET `/movie/search?name=KGF`

### Add Movie

POST `/movie`

Request Body:

```json
{
  "id": 5,
  "name": "RRR",
  "genre": "Action",
  "rating": 9.0,
  "year": 2022,
  "language": "Telugu"
}
