package com.marolix.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	private class DbProduct {
		String prodName;
		Float price;
		Integer quantityAvailable;
		Float discount;

		public DbProduct() {
		}

		public DbProduct(String prodName, Float price, Integer quantityAvailable, Float discount) {
			super();
			this.prodName = prodName;
			this.price = price;
			this.quantityAvailable = quantityAvailable;
			this.discount = discount;
		}

		@Override
		public String toString() {
			return "DbProduct [prodName=" + prodName + ", price=" + price + ", quantityAvailable=" + quantityAvailable
					+ ", discount=" + discount + "]";
		}

	}

	private class CartProduct {
		String prodName;
		Float price;

		public CartProduct() {
		}

		public CartProduct(String prodName, Float price) {
			super();
			this.prodName = prodName;
			this.price = price;
		}

		@Override
		public String toString() {
			return "CartProduct [prodName=" + prodName + ", price=" + price + "]";
		}

	}

	public static List<Integer> intList() {
		return Arrays.asList(1, 2, 3, 4, 5, 6);
	}

	public static List<DbProduct> dbProductList() {

		MapDemo md = new MapDemo();
//		 prodName,  price,  quantityAvailable, Float discount
		DbProduct d1 = md.new DbProduct("boost", 12f, 1, 10f);
		DbProduct d2 = md.new DbProduct("boost1", 10f, 1, 10f);
		DbProduct d3 = md.new DbProduct("boost2", 100f, 1, 10f);
		DbProduct d4 = md.new DbProduct("boost3", 60f, 1, 10f);
		DbProduct d5 = md.new DbProduct("boost4", 208f, 1, 10f);
		return Arrays.asList(d1, d2, d3, d4, d5);
	}

	public static void main(String[] args) {

		List<Integer> intList = intList();

		Stream<Integer> s1 = intList.stream();
		Stream<Integer> s2 = s1.map(i -> i * i);// 1 4 9 16 25 36
		// s1.forEach(t -> System.out.println(t));
		s2.forEach(r -> System.out.println(r));
		// 1 1 1 2 2 2
		intList.stream().forEach(System.out::println);

		//
		List<DbProduct> products = dbProductList();
		System.out.println(products);
		products.stream().map(t -> {

			MapDemo m = new MapDemo();
			MapDemo.CartProduct c = m.new CartProduct();
			c.price = t.price;
			c.prodName = t.prodName;
			return c;
		}).forEach(t -> System.out.println(t));
	}

}
