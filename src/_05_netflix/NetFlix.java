package _05_netflix;

public class NetFlix {
public static void main(String[] args) {
	Movie StarWars = new Movie("Star Wars", 10);
	Movie Marvel = new Movie("Marvel", 8);
	Movie NationalG = new Movie("Nat Geo", 7);
	Movie DC = new Movie("DC Comics", 5);
	Movie SharkT = new Movie("Shark Tank", 9);
	NetflixQueue que = new NetflixQueue();
	StarWars.getTicketPrice();
	que.addMovie(StarWars);
	que.addMovie(SharkT);
	que.addMovie(DC);
	que.addMovie(NationalG);
	que.addMovie(Marvel);
	que.printMovies();
	Movie best = que.getBestMovie();
	System.out.println("The best movie is " + best);
	que.sortMoviesByRating();
	Movie seconds = que.getMovie(1);
	System.out.println("The second best movie is " + seconds);
	
	
	

	
}
}
