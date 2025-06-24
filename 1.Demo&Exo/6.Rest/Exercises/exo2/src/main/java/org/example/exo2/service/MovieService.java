package org.example.exo2.service;

import org.example.exo2.dto.MovieReceiveDto;
import org.example.exo2.dto.MovieReceiveDto;
import org.example.exo2.dto.MovieResponseDto;
import org.example.exo2.entity.Director;
import org.example.exo2.entity.Movie;
import org.example.exo2.entity.Movie;
import org.example.exo2.exception.NotFoundException;
import org.example.exo2.repository.DirectorRepository;
import org.example.exo2.repository.MovieRepository;
import org.example.exo2.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {


    private final MovieRepository movieRepository;
    private final DirectorRepository directorRepository;

    public MovieService(MovieRepository movieRepository, DirectorRepository directorRepository){
        this.movieRepository = movieRepository;
        this.directorRepository = directorRepository;
    }

    public MovieResponseDto create (MovieReceiveDto movieReceiveDto, long directorId){
        Director director = directorRepository.findById(directorId).orElseThrow(NotFoundException::new) ;
        movieReceiveDto.setDirector(director);
        director.getMovies().add(movieReceiveDto.dtoToEntity());
        return movieRepository.save(movieReceiveDto.dtoToEntity()).entityToDto();
    }

    public MovieResponseDto get(long id){
        return movieRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<MovieResponseDto> get(){
        return movieRepository.findAll().stream().map(Movie::entityToDto).toList();
    }

    public MovieResponseDto update(long id, MovieReceiveDto movieReceiveDto){
        Movie movieFound = movieRepository.findById(id).orElseThrow(NotFoundException::new);
        Movie movieGet = movieReceiveDto.dtoToEntity();
        movieFound.setName(movieGet.getName());
        movieFound.setReleasedate(movieGet.getReleasedate());
        movieFound.setDescription(movieGet.getDescription());
        movieFound.setDuration(movieGet.getDuration());
        movieFound.setGenre(movieGet.getGenre());

        return movieRepository.save(movieFound).entityToDto();
    }

    public void delete(long id){
     movieRepository.deleteById(id);
    }

    public List<MovieResponseDto> get_by_director(long directorId){
        List<MovieResponseDto> directormovies = new ArrayList<>();
        for (Movie m : movieRepository.findAll()){
            if (directorId == m.getDirector().getDirectorId()){
                directormovies.add(m.entityToDto());
            }
        }
        return directormovies;
    }







}
