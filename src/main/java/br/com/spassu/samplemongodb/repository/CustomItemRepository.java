package br.com.spassu.samplemongodb.repository;

public interface CustomItemRepository {
	
	void updateItemQuantity(String itemName, float newQuantity);

}
