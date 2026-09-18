# Many-To-Many-UniDirectional

This project demonstrates a **Many-to-Many Unidirectional relationship** using Spring Boot, JPA, and MySQL.

## Project Structure
- `Actor.java` – Entity class for actors
- `Movie.java` – Entity class for movies
- `MovieRepository.java` – JPA repository for movies
- `MovieService.java` – Service interface
- `MovieServiceImpl.java` – Service implementation
- `MyRunner.java` – Runner class to insert sample data

## How to Run
1. Configure your MySQL database in `application.properties`.
2. Run the Spring Boot application.
3. Check the tables `movie`, `actor`, and `movie_actor` in MySQL.

## Example
When the application runs, it saves a movie with actors:
- Movie: Sholay (2019)
- Actors: AB, DD

The join table `movie_actor` links movies and actors.
