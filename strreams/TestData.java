package com.strreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestData {

	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 90, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruits;
	}
	public static void printFruits(List<Fruit> fruits) {
		fruits.stream().forEach(System.out::println);
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Tom", "Anand", "Very nice article on budget"));
		newsList.add(new News(2, "Ivan", "Bipin", "Good budget description"));
		newsList.add(new News(1, "Tom", "Narang", "How can you write such an article?"));
		newsList.add(new News(2, "Jerry", "Mitul", "I agree with you!!"));
		newsList.add(new News(2, "James", "Anand", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Sara", "Daji", "Good article"));
		return newsList;
	}
	public static void printNews(List<News> newsList) {
		newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Anand", "Pune"), 2016, 10000));
		transactions.add(new Transaction(new Trader("Neeraja", "Indore"), 2015, 25000));
		transactions.add(new Transaction(new Trader("Yog", "Mumbai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000));
		transactions.add(new Transaction(new Trader("Komal", "Pune"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Ishwar", "Indore"), 2016, 12000));
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		transactions.stream().forEach(System.out::println);		
	}
	public static void main(String args[]){
		System.out.println("Fruits with Calories less then 100");
		TestData.getAllFruits().stream().filter(Fruit->Fruit.getCalories()<100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("Grouping fruits with same color");
		Map<String,List<Fruit>> fmap=TestData.getAllFruits().stream().collect(Collectors.groupingBy(Fruit::getColor));
		System.out.println(fmap);
		
		
		System.out.println("Grouping fruits with red color only");
		TestData.getAllFruits().stream().filter(Fruit->Fruit.getColor().equals("Red")).sorted(Comparator.comparing(Fruit::getPrice).reversed()).forEach(System.out::println);
		
		
		System.out.println("News ID with maximum no of comments");
		Map<Integer, Long> counted = TestData.getAllNews().stream()
	            .collect(Collectors.groupingBy((News::getNewsId), Collectors.counting()));
		System.out.println(counted);
		
		
		System.out.println("No of comments by users");
		Map<Object, Long> counts =
			    TestData.getAllNews().stream().collect(Collectors.groupingBy(News::getNewsId, Collectors.counting()));		
		System.out.println(counts);
		System.out.println(counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey());
		
		
		System.out.println("All transaction in year 2016");
		TestData.getAllTransactions().stream().filter(Transaction->Transaction.getYear()==2016).sorted(Comparator.comparing(Transaction::getValue).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		
		
		System.out.println("unique cities from traders");
		TestData.getAllTransactions().stream().distinct().map(Transaction->Transaction.getTrader().getCity()).forEach(System.out::println);
	}
}
