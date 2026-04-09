# WhatsApp Chatbot Backend

## Features
- REST API (/webhook)
- JSON message handling
- Predefined replies (Hi → Hello, Bye → Goodbye)

## Tech Stack
- Java
- Spring Boot

## API Testing (Postman)

### Endpoint:
POST http://localhost:8080/webhook

### Request Body:
{
  "message": "Hi"
}

### Response:
Hello
