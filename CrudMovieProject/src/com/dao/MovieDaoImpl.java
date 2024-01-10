package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.pojo.Movie;


public class MovieDaoImpl implements MovieDao
{
	List<Movie> mlist=null;
	Movie mobj=null;
	
	public MovieDaoImpl() 
	{
		mlist=new ArrayList<Movie>();
	}

	@Override
	public void addMovie(Movie movie)
	{
		mlist.add(movie);
		
	}

	@Override
	public void updateMovie(Movie movie)
	{
		for(int i=0;i<mlist.size();i++)
		{
			if(mlist.get(i).getMid()==movie.getMid())
			{
				mlist.set(i, movie);
				System.out.println("Movie Update Succesfully");
				break;
			}
		}
		
	}

	@Override
	public void deleteMovie(int mid) 
	{
       mobj=searchMovieById(mid);
		
		if(mobj!=null) {
			for(int i=0;i<mlist.size();i++) {
				if(mid==mlist.get(i).getMid()) {
					mlist.remove(i);
					System.out.println("Movie deleted");
				}
			}
		}
		else {
			System.out.println("Movie record not found");
		}
		
	}

	@Override
	public List<Movie> showMovieList()
	{
		return mlist;
	}

	@Override
	public Movie searchMovieById(int mid)
	{
		mobj=null;
		for(int i=0;i<mlist.size();i++) {
			if(mid==mlist.get(i).getMid()) {
				System.out.println("id:"+mid);
				mobj=mlist.get(i);
				break;
			}
		}
		return mobj;
	}

}

