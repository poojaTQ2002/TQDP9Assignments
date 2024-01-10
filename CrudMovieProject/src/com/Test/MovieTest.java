package com.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.dao.MovieDaoImpl;
import com.pojo.Movie;

public class MovieTest {

	public static void main(String[] args) {

		int mid;
		String mname;
		double mprice;
		Scanner sc = new Scanner(System.in);
		int choice;
		char ch;
		Movie movie=null;
		MovieDaoImpl mdao = new MovieDaoImpl();
		List<Movie> mlist = new ArrayList<Movie>();
		
		do {
		System.out.println("---Movie Tikcet----");
		System.out.println("--------------------------");
		System.out.println("1.add Movie");
		System.out.println("2.update Movie");
		System.out.println("3.delete Movie");
		System.out.println("4.show Movie list");
		System.out.println("5.search Movie by id");
		System.out.println("--------------------------");

		System.out.println("Enter your choice");
		choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("---add Movie---");
			System.out.println("how many Movie you want to add in list?");
			int num = sc.nextInt();
			for (int i = 1; i <= num; i++) {
				System.out.println("Enter Movie id:");
				mid = sc.nextInt();
				System.out.println("Enter Movie name:");
				mname = sc.next();
				System.out.println("Enter Movie price:");
				mprice = sc.nextDouble();
				movie = new Movie(mid, mname, mprice);
				mdao.addMovie(movie);
			}
			break;
		case 2:
			System.out.println("---Update Movie---");
				System.out.println("Enter Movie id:");
				mid = sc.nextInt();
				System.out.println("Enter Movie name:");
				mname = sc.next();
				System.out.println("Enter Movie price:");
				mprice = sc.nextDouble();
				movie = new Movie(mid, mname, mprice);
				mdao.updateMovie(movie);
			
			break;
		case 3:
			System.out.println("---Delete Movie---");
			System.out.println("Enter Employee id:");
			mid=sc.nextInt();
			mdao.deleteMovie(mid);
			break;
		case 4:
			System.out.println("---Show Movie---");
			mlist=mdao.showMovieList();
			
			if(!mlist.isEmpty()) {
				System.out.println("Movie List");
				for(Movie m1:mlist) {
					System.out.println(m1);
				}
			}
			else {
				System.out.println("no list found");
			}
			break;
		case 5:
			System.out.println("---Search Movie---");
			System.out.println("Enter Movie id:");
			mid = sc.nextInt();
			movie=mdao.searchMovieById(mid);
			if(movie!=null) {
				System.out.println(movie);
			}
			else {
				System.out.println("Movie not present");
			}
			break;
		}
		System.out.println("do u want to continue??");
		ch = sc.next().charAt(0);
	} while (ch == 'y' || ch == 'Y');
	}

}


