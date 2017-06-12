package controllers;

import play.mvc.Controller;
import play.mvc.Result;

//BRONZE
//TODO Add a Play Again button to the pages that end the game. It should go to the start page.
//TODO Add a New Player button to the pages that end the game. It should go to the welcome page.
//TODO Add a text box to the welcome page for the player to enter their name
//TODO Inside the start method store the player name in session
//TODO On the game end pages change "The end." to say "The end for #playerName#."
//TODO Add an additional step in the northern route in between England and the current end page
//TODO  In this middle step allow the player to continue north or return south
//TODO  Make up your own description for this page. G rated please.

//SILVER
//TODO Make the player lose one crew member due to injury on each turn.
//TODO   HINT: Store the number of able bodied crew in session
//TODO If the able bodied crew count drops below 5 before the game ends go to a
//TODO   "Took refuge on an island" end page
//TODO Get awesome G rated non-offensive pictures from the internet or elsewhere
//TODO   to add to each screen.
//TODO Store these pictures in the public/images folder

//GOLD
//TODO Make the western route have a "Meeting with Santa" page that
//TODO   the player has a 50% chance of seeing
//TODO Use the random user API to get names for the crew members at the start of the game
//TODO On each screen show the list of able bodied crew and announce
//TODO   the name of the injured crew person
//TODO Consolidate the end game pages into a single page to reduce duplicate code
//TODO Add an Easter Egg (Google or use search engine of your choice for "Easter Egg Game"
//TODO   if an explanation is needed)


public class GameController extends Controller
{
    public Result welcome()
    {
        return ok(views.html.welcome.render());
    }

    public Result start()
    {
        return ok(views.html.start.render());
    }

    public Result goEastFromEngland()
    {
        return ok(views.html.eastfromengland.render());
    }

    public Result goNorthFromEngland()
    {
        return ok(views.html.northfromengland.render());
    }

    public Result goWestFromEngland()
    {
        return ok(views.html.westfromengland.render());
    }

    public Result eastEnd()
    {
        return ok(views.html.eastend.render());
    }

    public Result westEnd()
    {
        return ok(views.html.westend.render());
    }

    public Result homePort()
    {
        return ok(views.html.homeport.render());
    }

    public Result kittens()
    {
        return ok(views.html.kittens.render());
    }
}
