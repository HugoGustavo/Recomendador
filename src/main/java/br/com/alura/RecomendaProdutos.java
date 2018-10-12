package br.com.alura;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaProdutos {

	public static void main(String[] args) throws IOException, TasteException {
		DataModel produtos = new Recomendador().getModelosDeProdutos();

	    Recommender recommender = new RecomendadorBuilder().buildRecommender(produtos);
	    
	    System.out.println("Usuario 1");
	    List<RecommendedItem> recommendations = recommender.recommend(1,4);
	    for (RecommendedItem recommendation : recommendations) {
	      System.out.println(recommendation);
	    }
	    
	    System.out.println("Usuario 3");
	    recommendations = recommender.recommend(3,4);
	    for (RecommendedItem recommendation : recommendations) {
	      System.out.println(recommendation);
	    }
	    
	    System.out.println("Usuario 4");
	    recommendations = recommender.recommend(4,4);
	    for (RecommendedItem recommendation : recommendations) {
	      System.out.println(recommendation);
	    }
	}

}
