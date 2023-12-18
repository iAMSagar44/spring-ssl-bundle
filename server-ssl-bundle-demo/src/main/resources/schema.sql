DROP TABLE IF EXISTS movies;

-- Create the Movies table
CREATE TABLE movies (
                        id INT PRIMARY KEY,
                        title VARCHAR(100),
                        directorName VARCHAR(100),
                        releaseDate DATE
);

-- Insert records of famous Sci-fi movies
INSERT INTO movies (id, title, directorName, releaseDate)
VALUES
    (1, 'Blade Runner', 'Ridley Scott', '1982-06-25'),
    (2, 'Dune', 'Denis Villeneuve', '2021-10-22'),
    (3, 'Alien', 'Ridley Scott', '1979-05-25'),
    (4, 'Inception', 'Christopher Nolan', '2010-07-16'),
    (5, 'The Terminator', 'James Cameron', '1984-10-26');