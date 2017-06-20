package com.debbeca.sparktest;
import static spark.Spark.*;

public class SparkJob {

	public static void main(String args[]){
		
		 get("/hello", (req, res) -> "Hello World");
		
	}
}
