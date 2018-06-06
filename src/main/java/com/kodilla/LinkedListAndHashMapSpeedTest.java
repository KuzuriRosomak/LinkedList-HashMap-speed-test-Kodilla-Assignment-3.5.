package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;


class Book
{
	private String author;
	private String title;
	
	public Book(String author, String title)
	{
		this.author = author;
		this.title = title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	@Override
	public int hashCode()
	{
		return (author.length() + title.length() * 333);
	}
	
	@Override
	public boolean equals(Object o)
	{
		Book e = (Book) o;
		return (author.equals(e.getAuthor())) && (title.equals(e.getTitle()));
	}
	
	@Override
	public String toString()
	{
		return author + ", " + "\"" + title + "\"\n";
	}
}


class Tester
{
	public static void main(String[] args)
	{
		String capitalAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String smallAlphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
		Random nameGenerator = new Random();
		String space = " ";
		String radomizeText1 = "Davo";
		String radomizeText2 = "Ilb";
		String radomizeText3 = "Jarts";
		String radomizeText4 = "Sark";
		String radomizeText5 = "Verti";
		String radomizeText6 = "Marlp";
		String radomizeName1 = "a";
		String radomizeName2 = "b";
		String radomizeName3 = "c";
		String radomizeName4 = "d";
		String radomizeName5 = "e";
		String radomizeName6 = "f";
		
		long begin1 = System.currentTimeMillis();
		long begin2 = System.nanoTime();
		
		LinkedList<Book> listOfBooks = new LinkedList<Book>();
		for(int i = 0; i < 7000000; i++)
		{
			radomizeName1 = (String.valueOf(capitalAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName2 = (String.valueOf(smallAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName3 = (String.valueOf(capitalAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName4 = (String.valueOf(smallAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName5 = (String.valueOf(capitalAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName6 = (String.valueOf(smallAlphabet.charAt(nameGenerator.nextInt(36))));
			
			Book book = new Book(radomizeName1 + radomizeName4 + radomizeText1 + space + radomizeText2 + radomizeName3 + radomizeName5 + radomizeName2, radomizeName3 + radomizeText3 + space + radomizeText4 + radomizeName4 + space + radomizeName5 + radomizeText5 + radomizeText6 + radomizeName6);
			
			listOfBooks.add(book);
		}
		
		long end1 = System.currentTimeMillis();
		long end2 = System.nanoTime();
		System.out.println("Linkedlist contains " + listOfBooks.size() + " elements.");
		System.out.println("Creating LinkedList with " + listOfBooks.size() + " elements took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		Book bookTemporaryLinkedList1 = listOfBooks.get(0);
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("Getting first element took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		listOfBooks.remove(bookTemporaryLinkedList1);
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("Linkedlist contains " + listOfBooks.size() + " elements.");
		System.out.println("Removing first element took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		Book bookTemporaryLinkedList2 = listOfBooks.get(listOfBooks.size()-1);
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("Getting last element took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		listOfBooks.remove(bookTemporaryLinkedList2);
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("Linkedlist contains " + listOfBooks.size() + " elements.");
		System.out.println("Removing last element took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		listOfBooks.add(0, (new Book("Michael " + "Fletcher", "Odys and something something")));
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("Linkedlist contains " + listOfBooks.size() + " elements.");
		System.out.println("Adding element on first position took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		listOfBooks.add(new Book("Anna " + "Tristian", "Really boring story"));
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("Linkedlist contains " + listOfBooks.size() + " elements.");
		System.out.println("Adding element on last position took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		
		HashMap<Integer, Book> booksAsHashMap = new HashMap<Integer, Book>();
		for(int n = 0; n < 7000000; n++)
		{
			radomizeName1 = (String.valueOf(capitalAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName2 = (String.valueOf(smallAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName3 = (String.valueOf(capitalAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName4 = (String.valueOf(smallAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName5 = (String.valueOf(capitalAlphabet.charAt(nameGenerator.nextInt(36))));
			radomizeName6 = (String.valueOf(smallAlphabet.charAt(nameGenerator.nextInt(36))));
			
			Book book = new Book(radomizeName1 + radomizeName4 + radomizeText1 + space + radomizeText2 + radomizeName3 + radomizeName5 + radomizeName2, radomizeName3 + radomizeText3 + space + radomizeText4 + radomizeName4 + space + radomizeName5 + radomizeText5 + radomizeText6 + radomizeName6);
			
			booksAsHashMap.put(n, book);
		}
		
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("HashMap contains " + booksAsHashMap.size() + " entries.");
		System.out.println("Creating HashMap with " + booksAsHashMap.size() + " entries took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		int randomNumberToSearch = nameGenerator.nextInt(7000000);
		booksAsHashMap.get(randomNumberToSearch);
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("Getting entry number " + randomNumberToSearch + " took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		booksAsHashMap.remove(randomNumberToSearch);
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("HashMap contains " + booksAsHashMap.size() + " entries.");
		System.out.println("Removing entry number " + randomNumberToSearch + " took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		int randomNumberToSearch2 = nameGenerator.nextInt(7000000);
		booksAsHashMap.get(randomNumberToSearch2);
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("Getting entry number " + randomNumberToSearch2 + " took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		booksAsHashMap.remove(randomNumberToSearch2);
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("HashMap contains " + booksAsHashMap.size() + " entries.");
		System.out.println("Removing entry number " + randomNumberToSearch2 + " took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		Integer randomNumberToPut1 = nameGenerator.nextInt(200000000);
		booksAsHashMap.put(randomNumberToPut1, new Book("Michael " + "Fletcher", "Odys and something something"));
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("HashMap contains " + booksAsHashMap.size() + " entries.");
		System.out.println("Adding entry took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
		
		begin1 = System.currentTimeMillis();
		begin2 = System.nanoTime();
		Integer randomNumberToPut2 = nameGenerator.nextInt(200000000);
		booksAsHashMap.put(randomNumberToPut2, new Book("Anna " + "Tristian", "Really boring story"));
		end1 = System.currentTimeMillis();
		end2 = System.nanoTime();
		System.out.println("HashMap contains " + booksAsHashMap.size() + " entries.");
		System.out.println("Adding entry took: " + "\n" + (end1 - begin1) + "ms" + "\n" + (end2 - begin2) + "ns");
		System.out.println();
	}
}