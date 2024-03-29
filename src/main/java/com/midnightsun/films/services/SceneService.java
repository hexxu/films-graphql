package com.midnightsun.films.services;

import com.midnightsun.films.Utils;
import com.midnightsun.films.models.Scene;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SceneService {
    @Autowired
    private Utils repo;

    public Set<Scene> getScenesInFilm(String parentFilm) {
        return repo.getScenesByFilm().get(parentFilm);
    }
}
