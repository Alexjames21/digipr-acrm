
package rocks.process.moviereview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/top_movies")
    public class TopMoviesController {

    @GetMapping
    public String getTopMovieView() { return "top_movies.html"; }

    @GetMapping("/godfather")
    public String getGodfatherReviewView() {
        return "godfather.html";
    }

    @GetMapping("/it")
    public String getGodfatherReviewView() {
        return "it.html";
    }

    @GetMapping("/starwars")
    public String getGodfatherReviewView() {
        return "starwarsix.html";
    }

    @GetMapping("/tenet")
    public String getGodfatherReviewView() {
        return "tenet";
    }

    @GetMapping("/createGodfather")
    public String getGodfatherReviewView() {
        return "review_form_godfather.html";
    }

    @GetMapping("/createIt")
    public String getItReviewView() {
        return "review_form_it.html";
    }

    @GetMapping("/createStarWars")
    public String getStarWarsReviewView() {
        return "review_form_starwars.html";
    }

    @GetMapping("/createTenet")
    public String getTenetReviewView() {
        return "review_form_tenet.html";
    }

}