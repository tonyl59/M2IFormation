package org.example.exo2.service;

import org.example.exo2.dto.MovieReceiveDto;
import org.example.exo2.dto.MovieReceiveDto;
import org.example.exo2.entity.Movie;
import org.example.exo2.entity.Movie;
import org.example.exo2.exception.NotFoundException;
import org.example.exo2.repository.MovieRepository;
import org.example.exo2.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {


    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public Movie create (MovieReceiveDto movieReceiveDto){
        return movieRepository.save(movieReceiveDto.dtoToEntity());
    }

    public Movie get(long id){
        return movieRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public List<Movie> get(){
        return movieRepository.findAll().stream().toList();
    }

    public Movie update(long id, MovieReceiveDto movieReceiveDto){
        Movie movieFound = movieRepository.findById(id).orElseThrow(NotFoundException::new);
        Movie movieGet = movieReceiveDto.dtoToEntity();
        movieFound.setName(movieGet.getName());
        movieFound.setReleasedate(movieGet.getReleasedate());
        movieFound.setDescription(movieGet.getDescription());
        movieFound.setDuration(movieGet.getDuration());
        movieFound.setGenre(movieGet.getGenre());

        return movieRepository.save(movieFound);
    }

    public void delete(long id){
     movieRepository.deleteById(id);
    }

    public List<Movie> get_by_director(String lastname, String firstname){
        List<Movie> directormovies = new ArrayList<>();
        String m_last;
        String m_first;
        for (Movie m : movieRepository.findAll()){
            String m_lastname = m.getDirector().getLastname();
            String m_firstname = m.getDirector().getFirstname();
            if (lastname.equals(m_lastname) && firstname.equals(m_firstname)){
                directormovies.add(m);
            }
        }
        return directormovies;
    }







}
