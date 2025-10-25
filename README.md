# spring-boot-demo
Demo project with Spring Boot, REST endpoints and Student objects


# Spring Boot Demo

Αυτό είναι ένα demo project με Spring Boot και REST endpoints.

# Περιεχόμενο

- **HelloController**: `/hello` → "Hello", `/bye` → "Bye"
- **FruitController**: `/fruits` → λίστα φρούτων, `/askFruit/{name}` → επιστρέφει αγαπημένο φρούτο
- **StudentController**: `/student` → επιστρέφει ένα αντικείμενο Student ως String
- Χρήση @RestController, @GetMapping, @PathVariable

# Εκτέλεση

1. Άνοιξε το project στο Eclipse ή άλλο IDE
2. Τρέξε την κλάση `DemoApplication.java`
3. Άνοιξε browser ή Postman και δοκίμασε:
   - `http://localhost:8080/hello`
   - `http://localhost:8080/bye`
   - `http://localhost:8080/fruits`
   - `http://localhost:8080/askFruit/Μήλο`
   - `http://localhost:8080/student`
