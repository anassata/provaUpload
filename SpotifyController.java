package com.spotify.spotifyapp.controller;

import com.spotify.spotifyapp.configuration.AuthConfiguration;
import com.spotify.spotifyapp.model.Modello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.michaelthelin.spotify.SpotifyApi;
import se.michaelthelin.spotify.model_objects.specification.Artist;
import se.michaelthelin.spotify.model_objects.specification.Paging;
import se.michaelthelin.spotify.model_objects.specification.Track;
import se.michaelthelin.spotify.requests.data.personalization.simplified.GetUsersTopArtistsRequest;
import se.michaelthelin.spotify.requests.data.personalization.simplified.GetUsersTopTracksRequest;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class SpotifyController {



    @RequestMapping(path = "/printFile", method = POST, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public  ResponseEntity<byte[]> saveEmployee(@ModelAttribute Modello model) throws IOException {
        return ResponseEntity.ok(model.getMulti().getBytes());
    }
}
