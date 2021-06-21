public class MovieUtils {
	// Return the movie with the given id if found, null otherwise.
	public static Movie findMovieById(List<Movie> movies, int id) {
		
		if(movies==null)
			return null;
		
		Movie a= null;
		
		
		
		if(movies.empty())
		return null;
		movies.findFirst();
		while(!movies.last()) {
			
			if(movies.retrieve().id==id) {
				a=movies.retrieve();
				return a;}
			movies.findNext();
		}
		if(movies.retrieve().id==id) {
			a=movies.retrieve();
			return a;}
		return null;
	}
	// Return the list of movies having a given title. If none is found, empty list is returned.
	public static List<Movie> findMovieByTitle(List<Movie> movies, String title) {
		
		
		List<Movie> list = new LinkedList<Movie>();
		if(movies==null)
			return list;
		
		if(movies.empty())
			return list;
		
		movies.findFirst();
		while(!movies.last()) {
			if(movies.retrieve().title.equals(title)) {
		     list.insert(movies.retrieve());
	}
			movies.findNext();
			
		}  if(movies.retrieve().title.equals(title)) 
		     list.insert(movies.retrieve());
		return list;}
	// Return the list of movies of a given genre. If none is found, empty list is returned.
	public static List<Movie> findMoviesByGenre(List<Movie> movies, String genre) {
		
		
		
		
		List<Movie> list = new LinkedList<Movie>();
		if(movies==null)
			return list;
		
		
		if(movies.empty())
			return list;
		
		movies.findFirst();
		while(!movies.last()) {
			Movie ger=  movies.retrieve();
			ger.genres.findFirst();
		while(!ger.genres.last()) {
			if(ger.genres.retrieve().equals(genre)) 
		     list.insert(ger);
	                               
			ger.genres.findNext(); }
		
		if(ger.genres.retrieve().equals(genre))
		     list.insert(ger); 
		
		movies.findNext();           }
		
		Movie ger=  movies.retrieve();
		ger.genres.findFirst();
		while(!ger.genres.last()) {
			if(ger.genres.retrieve().equals(genre)) 
			     list.insert(ger);
		                               
				ger.genres.findNext();
			
		}
		if(ger.genres.retrieve().equals(genre))
		     list.insert(ger); 
		
		
		
		return list;
		}
	// Return the list of movies of given genres (a movie must have all genres to be in the list). If none is found, empty list is returned. Assume genres is not empty.
	public static List<Movie> findMoviesByGenres(List<Movie> movies, List<String> genres) {
	
		
		List<Movie> list = new LinkedList<Movie>();
		if(movies==null)
			return list;
		
		if(genres==null)
			return list;
	
		int count=1;
		int count2=0;
		genres.findFirst();
		while(!genres.last()) {
			count++;
			genres.findNext();
		}
		
		
		if(movies.empty())
			return list;
		
		movies.findFirst();
		while(!movies.last()) {
			Movie ger1=  movies.retrieve();
			ger1.genres.findFirst();
			count2=0;
			while(!ger1.genres.last()) {
				
				genres.findFirst();
				while(!genres.last()) {
		 if(ger1.genres.retrieve().equals(genres.retrieve()))
				 count2++;
		 genres.findNext();
		}
				 if(ger1.genres.retrieve().equals(genres.retrieve()))
					 count2++;
				 
					 
				ger1.genres.findNext();	}
			
			
			
			genres.findFirst();
			while(!genres.last()) {
	 if(ger1.genres.retrieve().equals(genres.retrieve()))
			 count2++;
	 genres.findNext();
	}
			 if(ger1.genres.retrieve().equals(genres.retrieve()))
				 count2++;
			
			 if(count==count2)
				 list.insert(ger1);
			 movies.findNext();
			 	}
		Movie ger1=  movies.retrieve();
		ger1.genres.findFirst();
		count2=0;
		while(!ger1.genres.last()) {
			
			genres.findFirst();
			while(!genres.last()) {
	 if(ger1.genres.retrieve().equals(genres.retrieve()))
			 count2++;
	 genres.findNext();
	}
			 if(ger1.genres.retrieve().equals(genres.retrieve()))
				 count2++;
			 
				 
			ger1.genres.findNext();	}
		
		
		
		genres.findFirst();
		while(!genres.last()) {
 if(ger1.genres.retrieve().equals(genres.retrieve()))
		 count2++;
 genres.findNext();
}
		 if(ger1.genres.retrieve().equals(genres.retrieve()))
			 count2++;
		
		 if(count==count2)
			 list.insert(ger1);
		
		return list;
} 
             } 
