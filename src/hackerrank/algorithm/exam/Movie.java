package hackerrank.algorithm.exam;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;

public class Movie {
	
	private final int movieId;
	private final float rating;
	private List<Movie> similarMovies;
	
	public Movie(int movieId,float rating) {
		// TODO Auto-generated constructor stub
		
		this.movieId = movieId;
		this.rating = rating;
		similarMovies = new ArrayList<Movie>();
		
	}

	public List<Movie> getSimilarMovies() {
		return similarMovies;
	}

	public void setSimilarMovies(List<Movie> similarMovies) {
		this.similarMovies = similarMovies;
	}

	public int getMovieId() {
		return movieId;
	}

	public float getRating() {
		return rating;
	}
	
	
	  public static Set<Movie> getMovieRecommendations(Movie movie, int numTopRatedSimilarMovies) {
	        // Implement me
		  
		  	List<Movie> movies = movie.getSimilarMovies();
		  	float[] topRatedOnes = new float[numTopRatedSimilarMovies];
		  	List<Movie> list = new ArrayList<Movie>();
		  	
		  	
		  	list = getRatingsForMovie(movie, new ArrayList<Movie>(),numTopRatedSimilarMovies);
		  	
		  	Set<Movie> ans = new LinkedHashSet();
		  	for(int i=1;i<=numTopRatedSimilarMovies;i++) {
		  		
		  		ans.add(list.get(list.size()-i));
		  		
		  		
		  	}
/*		 
		  	for(Movie m : ans) {
		  		
		  		System.out.print(m.getMovieId()+" ----> "+m.getRating());
		  		System.out.println();
		  	}
		  	*/
		  	
		  	return ans;
	    }
	  		
	  	
	  public static List<Movie> getRatingsForMovie(Movie movie,List<Movie> list,int num) {
		  
		  if(movie.getSimilarMovies()==null)
			  return list;
		  
		  if(!list.contains(movie))
		 list.add(movie);
		
		 
		 List<Movie> m = movie.getSimilarMovies();
		 for(Movie mov : m){
			 
			 getRatingsForMovie(mov, list,num);
		 }
		  
		 
		  
		 Collections.sort(list, new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o1.getRating()>o2.getRating()?1:-1;
			}
			 
			 
		 
		 });
		  return list;
		  
		  
	  }

	  	public static void main(String[] args) {
			
	  		Movie mov1 = new Movie(1, 4.30f);
	  		Movie mov2 = new Movie(2, 2.30f);
	  		Movie mov3 = new Movie(3, 1.80f);
	  		Movie mov4 = new Movie(4, 4.00f);
	  		
	  		List list = new ArrayList<Movie>();
	  		list.add(mov2);
	  		list.add(mov3);
	  		mov1.setSimilarMovies(list);
	  		list = new ArrayList<Movie>();
	  		list.add(mov4);
	  		mov2.setSimilarMovies(list);
	  		mov3.setSimilarMovies(list);
	  		
	  		
	  		
	  		Set<Movie> ans = getMovieRecommendations(mov1, 3);
		  	
	  		
		}
}


class SortMap implements Comparator<Movie> {
	
	Map<Movie, Float> mov;
	public SortMap(Map<Movie, Float> mov) {
		// TODO Auto-generated constructor stub
		
		this.mov = mov;
	}
	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		
		System.out.print(mov.get(o1));
		return mov.get(o1)>mov.get(o2)?1:-1;
	}
	
	
	}